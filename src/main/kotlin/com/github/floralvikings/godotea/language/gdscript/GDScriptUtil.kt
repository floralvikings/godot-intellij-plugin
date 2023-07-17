@file:JvmName("GDScriptUtil")

package com.github.floralvikings.godotea.language.gdscript

import com.github.floralvikings.godotea.language.gdscript.psi.*
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.util.childrenOfType
import com.intellij.psi.util.elementType

private val log = Logger.getInstance("com.github.floralvikings.godotea.language.gdscript.GDScriptUtil")

fun findDeclaration(id: GDScriptId): PsiElement? {
    return if (id.isMember()) {
        null
    } else if (id.isFunctionName()) {
        resolveFunctionDeclaration(id)
    } else {
        resolveVarDeclaration(id)
    }
}

private fun resolveFunctionDeclaration(id: GDScriptId): PsiElement? {
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
            if(topLevelFunctionDeclaration != null) {
                return topLevelFunctionDeclaration
            }
        }
    }
    return null
}

private fun resolveVarDeclaration(id: GDScriptId): PsiElement? {
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

private fun GDScriptId.isMember() =
    prevNonWhitespaceSibling.elementType == GDScriptTypes.DOT

private fun GDScriptId.isFunctionName() =
    nextNonWhitespaceSibling.elementType == GDScriptTypes.L_PAREN

