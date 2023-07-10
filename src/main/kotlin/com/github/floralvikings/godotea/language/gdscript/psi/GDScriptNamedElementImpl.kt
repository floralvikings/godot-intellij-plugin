package com.github.floralvikings.godotea.language.gdscript.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement

class GDScriptNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), GDScriptNamedElement {
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        TODO("Not yet implemented")
    }
}