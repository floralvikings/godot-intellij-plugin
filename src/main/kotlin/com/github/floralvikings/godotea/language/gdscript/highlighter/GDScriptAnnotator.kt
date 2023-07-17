package com.github.floralvikings.godotea.language.gdscript.highlighter

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassNameDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionName
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptId
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement

class GDScriptAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element is GDScriptFunctionName) {
            annotateFunctionDeclarationName(element, holder)
        }
        if(element is GDScriptId) {
            annotateId(element, holder)
        }
    }

    private fun annotateId(element: GDScriptId, holder: AnnotationHolder) {
        if(element.parent is GDScriptClassNameDeclaration) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element.textRange)
                .textAttributes(GDScriptSyntaxHighlighter.CLASS_NAME)
                .create()
        }
    }

    private fun annotateFunctionDeclarationName(element: GDScriptFunctionName, holder: AnnotationHolder) {
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(element.textRange)
            .textAttributes(GDScriptSyntaxHighlighter.FUNCTION_DECLARATION)
            .create()
    }
}