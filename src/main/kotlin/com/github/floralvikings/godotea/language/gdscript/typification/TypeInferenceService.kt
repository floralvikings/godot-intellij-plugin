package com.github.floralvikings.godotea.language.gdscript.typification

import com.github.floralvikings.godotea.language.gdscript.psi.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDSameType
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDUnknownType
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDType
import com.github.floralvikings.godotea.language.gdscript.util.findTopLevelFunctionsNamed
import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import java.util.*

@Service(Service.Level.PROJECT)
class TypeInferenceService(private val project: Project) {

    fun inferType(psiElement: PsiElement): GDType {
        return when (psiElement) {
            is GDScriptDotQualifiedExpression -> inferDotQualifiedExpressionType(psiElement)
            is GDScriptClassVarDeclaration -> inferClassVarDeclarationType(psiElement)
            is GDScriptVarStatement -> inferLocalVarDeclarationType(psiElement)
            is GDScriptInvocationExpression -> inferPrimaryInvocationType(psiElement)
            else -> GDUnknownType
        }
    }

    fun inferDotQualifiedExpressionType(
        expression: GDScriptDotQualifiedExpression,
        index: Int = expression.children.lastIndex
    ): GDType {
        val rootObjectType = when (val rootObjectElement = expression.firstChild) {
            is GDScriptInvocationExpression -> inferPrimaryInvocationType(rootObjectElement)
            is GDScriptId -> inferPrimaryIdType(rootObjectElement)
            else -> GDUnknownType
        }
        var currentType: GDType = rootObjectType
        var currentIndex = 1
        while (currentType != GDUnknownType && currentIndex <= index) {
            val currentElement = expression.children[currentIndex]
            currentType = if (currentElement is GDScriptInvocationExpression) {
                val returnType = currentType.functions.firstOrNull { it.name == currentElement.id.text }?.returnType
                if (returnType == GDSameType) {
                    return inferDotQualifiedExpressionType(expression, index - 2)
                }
                returnType ?: GDUnknownType
            } else {
                currentType.fields.firstOrNull { it.name == currentElement.text }?.type ?: GDUnknownType
            }
            currentIndex++
        }
        return currentType
    }

    fun inferExplicitlyDeclaredType(type: GDScriptType): GDType {
        val builtInType = GDScriptBuiltIns.types[type.text]
        if (builtInType != null) {
            return builtInType
        }
        // TODO Declared types
        TODO("Not yet implemented")
    }

    fun inferClassVarDeclarationType(declaration: GDScriptClassVarDeclaration): GDType {
        if (declaration.type != null) {
            return inferExplicitlyDeclaredType(declaration.type!!)
        }

        if (declaration.expression != null) {
            return inferType(declaration.expression!!)
        }
        // TODO Might be a good idea to check assignments
        return GDUnknownType
    }

    fun inferLocalVarDeclarationType(declaration: GDScriptVarStatement): GDType {
        if(declaration.type != null) {
            return inferExplicitlyDeclaredType(declaration.type!!)
        }

        if(declaration.expression != null) {
            return inferType(declaration.expression!!)
        }
        // TODO Might be a good idea to check assignments
        return GDUnknownType
    }

    private fun inferFunctionDeclarationReturnType(
        declaredFunctions: List<GDScriptFunctionDeclaration>,
        invocation: GDScriptInvocationExpression
    ): GDType {
        val overload = when (declaredFunctions.size) {
            0 -> null
            1 -> declaredFunctions[0]
            // TODO filter based on parameter types
            else -> declaredFunctions.firstOrNull { it.functionParameterList.size == invocation.call.expressionList.size }
        } ?: return GDUnknownType

        val functionReturnType = overload.functionReturnType
        if(functionReturnType != null) {
            return inferExplicitlyDeclaredType(functionReturnType.type)
        }

        // TODO Inspect return statements and infer type from them
        return GDUnknownType
    }

    fun inferPrimaryInvocationType(invocation: GDScriptInvocationExpression): GDType {
        val functionName = invocation.id.text

        val builtInType = GDScriptBuiltIns.types[functionName]
        if (builtInType != null) {
            return builtInType
        }

        val builtInFunction = GDScriptBuiltIns.functions.firstOrNull { it.name == functionName }
        if (builtInFunction != null) {
            return builtInFunction.returnType
        }

        val declaredFunctions = (invocation.containingFile as GDScriptFile).findTopLevelFunctionsNamed(functionName)
        if (declaredFunctions.isNotEmpty()) {
            return inferFunctionDeclarationReturnType(declaredFunctions, invocation)
        }

        // TODO Declared constructors
        TODO("Not implemented")
    }

    fun inferPrimaryIdType(id: GDScriptId): GDType {
        // TODO Built-in constants/fields

        val declaration = id.reference.resolve()
        if (declaration != null) {
            return inferType(declaration)
        }
        TODO("Not implemented")
    }
}