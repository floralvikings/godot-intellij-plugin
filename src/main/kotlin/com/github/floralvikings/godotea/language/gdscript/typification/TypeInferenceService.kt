package com.github.floralvikings.godotea.language.gdscript.typification

import com.github.floralvikings.godotea.language.gdscript.psi.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDSameType
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDUnknownType
import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.util.*
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
            is GDScriptIdExpression -> inferPrimaryIdType(psiElement.id)
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
        val typeName = type.text
        return inferTypeFromName(typeName)
    }

    fun inferTypeFromName(typeName: String): GDType {
        val builtInType = GDScriptBuiltIns.types[typeName]
        if (builtInType != null) {
            return builtInType
        }
        // TODO Declared types
        return GDUnknownType
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

        val gdScriptFile = invocation.containingFile as GDScriptFile
        val declaredFunctions = gdScriptFile.findTopLevelFunctionsNamed(functionName)
        if (declaredFunctions.isNotEmpty()) {
            return inferFunctionDeclarationReturnType(declaredFunctions, invocation)
        }

        val localMatchingInnerClass = gdScriptFile.findInnerClassDeclaration(functionName)
        if(localMatchingInnerClass != null) {
            return inferInnerClassDeclarationType(localMatchingInnerClass)
        }

        // TODO non-local declared classes

        return GDUnknownType
    }

    private fun inferInnerClassDeclarationType(innerClass: GDScriptInnerClassDeclaration): GDType {
        val functions = innerClass.functionDeclarations
            .filter { it.functionName.text != "_init" }
            .map(this::createGDFunctionFromDeclaration)
        val constructors = innerClass.functionDeclarations
            .filter { it.functionName.text == "_init" }
            .map(this::createGDConstructorFromDeclaration)
        val fields = innerClass.varDeclarations.map(this::createGDFieldFromDeclaration)
        val superType = getTypeFromExtendsDeclaration(innerClass.extendsDeclaration)

        return GDType(innerClass.id.text, constructors, fields, functions, superType)
    }

    private fun getTypeFromExtendsDeclaration(declaration: GDScriptExtendsDeclaration?): GDType? {
        if(declaration == null) {
            return null
        }
        val typeName = if(declaration.type == null) {
            declaration.string!!.text
        } else {
            declaration.type!!.text
        }
        return inferTypeFromName(typeName)
    }

    private fun createGDFunctionFromDeclaration(declaration: GDScriptFunctionDeclaration): GDFunction {
        return GDFunction(declaration.functionName.text) {
            declaration.functionParameterList.forEach { param ->
                if(param.type != null) {
                    param.parameterName.text(inferExplicitlyDeclaredType(param.type!!))
                } else if(param.expression != null) {
                    param.parameterName.text()
                } else {
                    param.parameterName.text()
                }
            }
            // TODO Return type
        }
    }

    fun inferPrimaryIdType(id: GDScriptId): GDType {
        val declaration = id.reference.resolve()
        if (declaration != null) {
            return inferType(declaration)
        }

        // TODO Built-in constants/fields
        return GDUnknownType
    }

    private fun createGDConstructorFromDeclaration(declaration: GDScriptFunctionDeclaration): GDConstructor {
        val parameters = declaration.functionParameterList.map {param ->
            val type = if(param.type != null) {
                inferExplicitlyDeclaredType(param.type!!)
            } else {
                GDUnknownType
            }
            GDParameter(param.parameterName.text, type)
        }
        return GDConstructor(parameters)
    }

    private fun createGDFieldFromDeclaration(declaration: GDScriptClassVarDeclaration): GDField {
        val type = inferClassVarDeclarationType(declaration)
        return GDField(declaration.classVarName.text, type)
    }
}