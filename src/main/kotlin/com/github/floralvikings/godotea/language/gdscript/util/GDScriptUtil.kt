@file:JvmName("GDScriptUtil")

package com.github.floralvikings.godotea.language.gdscript.util

import com.github.floralvikings.godotea.language.gdscript.psi.*
import com.github.floralvikings.godotea.language.gdscript.typification.GDScriptBuiltIns
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDUnknownType
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDType
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.util.childrenOfType
import com.intellij.psi.util.elementType

fun resolveReference(id: GDScriptId): PsiElement? {
    return if (id.isMember()) {
        null
    } else if (id.isFunctionName()) {
        resolveFunctionReference(id)
    } else {
        resolveVarReference(id)
    }
}

private fun resolveFunctionReference(id: GDScriptId): PsiElement? {
    var current: PsiElement? = id
    // Search for functions in the same class
    while (current != null) {
        current = current.parent
        if (current is GDScriptClassBlock) {
            val innerClassFunctionDeclaration = current.childrenOfType<GDScriptFunctionDeclaration>()
                .firstOrNull { it.functionName.text == id.text }
            if (innerClassFunctionDeclaration != null) {
                return innerClassFunctionDeclaration
            }
        } else if (current is GDScriptFile) {
            val topLevelFunctionDeclaration = current.childrenOfType<GDScriptFunctionDeclaration>()
                .firstOrNull { it.functionName.text == id.text }
            if (topLevelFunctionDeclaration != null) {
                return topLevelFunctionDeclaration
            }
        }
    }
    return null
}

private fun resolveVarReference(id: GDScriptId): PsiElement? {
    var current: PsiElement? = id
    while (current != null) {
        if (current is GDScriptBlock && current.parent is GDScriptFunctionDeclaration) {
            val varStatements = current.childrenOfType<GDScriptVarStatement>()
            val localVarDeclaration = varStatements
                .firstOrNull { it.localVarName.text == id.text }
            if (localVarDeclaration != null) {
                return localVarDeclaration
            }
        } else if (current is GDScriptFunctionDeclaration) {
            val parameterDeclaration = current.functionParameterList
                .firstOrNull { it.parameterName.text == id.text }
            if (parameterDeclaration != null) {
                return parameterDeclaration
            }
        } else if (current is GDScriptClassBlock && current.parent is GDScriptInnerClassDeclaration) {
            val varStatements = current.childrenOfType<GDScriptClassVarDeclaration>()
            val classVarDeclaration = varStatements
                .firstOrNull { it.classVarName.text == id.text }
            if (classVarDeclaration != null) {
                return classVarDeclaration
            }
        } else if (current is PsiFile) {
            val varStatements = current.childrenOfType<GDScriptClassVarDeclaration>()
            val classVarDeclaration = varStatements
                .firstOrNull { it.classVarName.text == id.text }
            if (classVarDeclaration != null) {
                return classVarDeclaration
            }
        }
        current = current.parent
    }
    return null
}

val PsiElement.prevNonWhitespaceSibling: PsiElement?
    get() {
        var current = prevSibling
        while (current != null && current is PsiWhiteSpace) {
            current = current.prevSibling
        }
        return current
    }

val PsiElement.nextNonWhitespaceSibling: PsiElement?
    get() {
        var current = nextSibling
        while (current != null && current is PsiWhiteSpace) {
            current = current.nextSibling
        }
        return current
    }

fun GDScriptId.isMember() =
    prevNonWhitespaceSibling.elementType == GDScriptTypes.DOT

fun GDScriptId.isFunctionName() =
    nextNonWhitespaceSibling.elementType == GDScriptTypes.L_PAREN

fun GDScriptId.getSurroundingFunction(): GDScriptFunctionDeclaration? {
    var current: PsiElement? = this
    while (current != null && current !is GDScriptFunctionDeclaration) {
        current = current.parent
    }
    return current as? GDScriptFunctionDeclaration
}

fun GDScriptId.getSurroundingClass(): GDScriptInnerClassDeclaration? {
    var current: PsiElement? = this
    while (current != null && current !is GDScriptInnerClassDeclaration) {
        current = current.parent
    }
    return current as? GDScriptInnerClassDeclaration
}

fun GDScriptInnerClassDeclaration.getVarDeclarations(): List<GDScriptClassVarDeclaration> = classBlock.childrenOfType()

fun GDScriptInnerClassDeclaration.getFunctionDeclarations(): List<GDScriptFunctionDeclaration> =
    classBlock.childrenOfType()

fun GDScriptFile.getVarDeclarations(): List<GDScriptClassVarDeclaration> = childrenOfType()

fun GDScriptFile.getFunctionDeclarations(): List<GDScriptFunctionDeclaration> = childrenOfType()



fun GDScriptFunctionDeclaration.getVariableDeclarations(): List<GDScriptVarStatement> {
    return block.childrenOfType<GDScriptVarStatement>()
}

fun GDScriptVarStatement.inferType(): GDType {
    // Short-circuit if we have a declared type; trust it for now
    if (type != null) {
        return type!!.inferType()
    }
    if(expression != null) {
        return expression!!.inferType()
    }
    return GDUnknownType
}

fun GDScriptExpression.inferType(): GDType {
    if(idList.isNotEmpty()) {
        return idList.inferType()
    }
    // TODO function inference
    return GDUnknownType
}

fun List<GDScriptId>.inferType(): GDType {
    var currentType = first().inferType()
    for(i in 1 until size) {
        val currentId = this[i]
        val matchedField = currentType.fields.firstOrNull { it.name == currentId.text }
        if (matchedField != null) {
            currentType = matchedField.type ?: GDUnknownType
        }
    }
    return GDUnknownType
}

fun GDScriptId.inferType(): GDType {
    val declaration = reference.resolve() ?: return GDUnknownType
    return when(declaration) {
        is GDScriptVarStatement -> declaration.inferType()
        else -> GDUnknownType
    }
}

fun GDScriptType.inferType(): GDType {
    if (GDScriptBuiltIns.types.containsKey(text)) {
        val builtInType = GDScriptBuiltIns.types[text]
        if (builtInType != null) {
            return builtInType
        }
    }
    // TODO Resolve project types
    return GDUnknownType
}

