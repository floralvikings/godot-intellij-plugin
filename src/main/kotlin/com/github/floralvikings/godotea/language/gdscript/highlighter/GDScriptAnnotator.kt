package com.github.floralvikings.godotea.language.gdscript.highlighter

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes.ID
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType

class GDScriptAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        val isIdentifier = element.elementType == ID
        if (isIdentifier) {
            annotateIdentifier(element, holder)
        }
    }

    private fun annotateIdentifier(element: PsiElement, holder: AnnotationHolder) {
        when(element.parent.elementType) {

        }
    }
}