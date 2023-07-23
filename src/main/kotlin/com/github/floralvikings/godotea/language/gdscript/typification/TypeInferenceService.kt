package com.github.floralvikings.godotea.language.gdscript.typification

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptExpression
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptId
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptInvocationExpression
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptType
import com.github.floralvikings.godotea.language.gdscript.typification.GDScriptBuiltIns
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDUnknownType
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDType
import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement

@Service(Service.Level.PROJECT)
class TypeInferenceService(private val project: Project) {

    fun inferType(psiElement: PsiElement): GDType {
        return when(psiElement) {
            is GDScriptId -> inferType(psiElement)
            is GDScriptType -> inferType(psiElement)
            is GDScriptClassVarDeclaration -> inferType(psiElement)
            is GDScriptInvocationExpression -> inferType(psiElement)
            is GDScriptExpression -> inferType(psiElement)
            else -> GDUnknownType
        }
    }

    fun inferType(id: GDScriptId): GDType {
        if(id.parent::class == GDScriptExpression::class) {
            val expression = id.parent as GDScriptExpression
            return inferType(expression.idList, expression.idList.indexOf(id))
        }
        return GDUnknownType
    }

    fun inferType(idList: List<GDScriptId>, index: Int = idList.lastIndex): GDType {
        val primary = idList.firstOrNull() ?: return GDUnknownType
        val primaryDeclaration = primary.reference?.resolve() ?: return GDUnknownType
        var currentType = inferType(primaryDeclaration)
        for(i in 1 .. index) {
            val currentId = idList[i]
            val matchedField = currentType.fields.firstOrNull { it.name == currentId.text }
            if (matchedField != null) {
                currentType = matchedField.type ?: GDUnknownType
            }
        }
        return currentType
    }

    fun inferType(type: GDScriptType): GDType {
        if (GDScriptBuiltIns.types.containsKey(type.text)) {
            val builtInType = GDScriptBuiltIns.types[type.text]
            if (builtInType != null) {
                return builtInType
            }
        }
        // TODO Resolve project types
        return GDUnknownType
    }

    fun inferType(classVarDeclaration: GDScriptClassVarDeclaration): GDType {
        // Resolve declared type
        if(classVarDeclaration.type != null) {
            return inferType(classVarDeclaration.type!!)
        }
        if(classVarDeclaration.expression != null) {
            return inferType(classVarDeclaration.expression!! as PsiElement)
        }
        return GDUnknownType
    }

    fun inferType(expression: GDScriptExpression): GDType {
        if(expression.idList.isNotEmpty()) {
            return inferType(expression.idList)
        }
        // TODO function invocation inference?
        // TODO Other types of expressions?
        return GDUnknownType
    }

    fun inferType(invocationExpression: GDScriptInvocationExpression): GDType {
        if(invocationExpression.parent !is GDScriptExpression) {
            // Top-level function or constructor
            val builtInConstructor = GDScriptBuiltIns.types[invocationExpression.id.text]
            if(builtInConstructor != null) {
                return builtInConstructor
            }

            val builtInFunction = GDScriptBuiltIns.functions.firstOrNull { it.name == invocationExpression.id.text }
            if(builtInFunction != null) {
                return builtInFunction.returnType
            }
        }
        // TODO Declared constructors
        // TODO Declared functions
        return GDUnknownType
    }
}