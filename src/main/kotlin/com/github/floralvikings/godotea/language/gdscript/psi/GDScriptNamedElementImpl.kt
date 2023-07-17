package com.github.floralvikings.godotea.language.gdscript.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode

abstract class GDScriptNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), GDScriptNamedElement{
}