@file:JvmName("GDScriptUtil")

package com.github.floralvikings.godotea.language.gdscript.util

import com.github.floralvikings.godotea.language.gdscript.psi.*
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.util.childrenOfType
import com.intellij.psi.util.elementType

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
    nextNonWhitespaceSibling.elementType == GDScriptTypes.CALL

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

fun GDScriptFile.getTopLevelVarDeclarations(): List<GDScriptClassVarDeclaration> = childrenOfType()

fun GDScriptFile.getTopLevelFunctionDeclarations(): List<GDScriptFunctionDeclaration> = childrenOfType()

fun GDScriptFile.findTopLevelVarNamed(name: String): GDScriptClassVarDeclaration? =
    childrenOfType<GDScriptClassVarDeclaration>().firstOrNull { it.classVarName.text == name }

fun GDScriptFunctionDeclaration.getVariableDeclarations(): List<GDScriptVarStatement> {
    return block.childrenOfType<GDScriptVarStatement>()
}
