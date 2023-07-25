package com.github.floralvikings.godotea.language.gdscript.util

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptId
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptInnerClassDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptInvocationExpression
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType

fun GDScriptId.isMember() =
    prevNonWhitespaceSibling.elementType == GDScriptTypes.DOT

fun GDScriptId.isFunctionName() =
    parent is GDScriptInvocationExpression && nextNonWhitespaceSibling.elementType == GDScriptTypes.CALL

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