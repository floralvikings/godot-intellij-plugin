package com.github.floralvikings.godotea.language.gdscript.highlighter

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassNameDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptInvocationExpression
import com.github.floralvikings.godotea.language.gdscript.typification.TypeInferenceService
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.components.service
import com.intellij.psi.PsiElement

class GDScriptAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element is GDScriptFunctionDeclaration) {
            annotateFunctionDeclarationName(element, holder)
        } else if (element is GDScriptClassNameDeclaration) {
            annotateClassNameDeclaration(element, holder)
        } else if (element is GDScriptInvocationExpression) {
            annotateInvocationExpression(element, holder)
        }
    }

    private fun annotateClassNameDeclaration(element: GDScriptClassNameDeclaration, holder: AnnotationHolder) {
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(element.id.textRange)
            .textAttributes(GDScriptSyntaxHighlighter.CLASS_NAME)
            .create()
    }

    private fun annotateFunctionDeclarationName(element: GDScriptFunctionDeclaration, holder: AnnotationHolder) {
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(element.functionName.textRange)
            .textAttributes(GDScriptSyntaxHighlighter.FUNCTION_DECLARATION)
            .create()
    }

    private fun annotateInvocationExpression(element: GDScriptInvocationExpression, holder: AnnotationHolder) {
        val typeInferenceService = element.project.service<TypeInferenceService>()
        val isBuiltIn = typeInferenceService.globalFunctions.any { element.id.text == it.name } 
        if(isBuiltIn) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element.id.textRange)
                .textAttributes(GDScriptSyntaxHighlighter.BUILT_IN_FUNCTION)
                .create()
        }

        val isConstructor = typeInferenceService.typeNames.contains(element.id.text)
        if(isConstructor) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element.id.textRange)
                .textAttributes(GDScriptSyntaxHighlighter.BUILT_IN_CLASS)
                .create()
        }
    }
}