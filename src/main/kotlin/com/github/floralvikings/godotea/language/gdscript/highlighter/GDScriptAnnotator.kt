package com.github.floralvikings.godotea.language.gdscript.highlighter

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes.FUNCTION_DECLARATION
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes.ID
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
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
            FUNCTION_DECLARATION -> annotateFunctionDeclarationName(holder, element)
        }
    }

    private fun annotateFunctionDeclarationName(holder: AnnotationHolder, element: PsiElement) {
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(element.textRange)
            .textAttributes(DefaultLanguageHighlighterColors.FUNCTION_DECLARATION)
            .create()
    }
}