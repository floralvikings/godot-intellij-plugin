package com.github.floralvikings.godotea.language.gdscript.navigation

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptId
import com.intellij.navigation.DirectNavigationProvider
import com.intellij.psi.PsiElement

@Suppress("UnstableApiUsage")
class GDScriptIDNavigationProvider : DirectNavigationProvider {
    override fun getNavigationElement(element: PsiElement): PsiElement? {
        if(element !is GDScriptId) return null

        val declaration = element.reference.resolve()

        if(declaration is GDScriptClassVarDeclaration) {
            return declaration.classVarName
        }

        return declaration
    }
}