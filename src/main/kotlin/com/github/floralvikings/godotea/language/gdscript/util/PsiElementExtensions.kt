@file:JvmName("GDScriptUtil")

package com.github.floralvikings.godotea.language.gdscript.util

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiWhiteSpace

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

val PsiElement.containingFunctionDeclaration: GDScriptFunctionDeclaration?
    get() {
        var current = parent
        while(current != null) {
            if(current is GDScriptFunctionDeclaration) {
                return current
            }
            current = current.parent
        }
        return null
    }
