package com.github.floralvikings.godotea.language.gdscript.reference

import com.github.floralvikings.godotea.language.gdscript.findFunctionDeclarations
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionName
import com.intellij.openapi.util.TextRange
import com.intellij.psi.*

class GDScriptFunctionReference(element: GDScriptFunctionName, textRange: TextRange) : PsiReferenceBase<GDScriptFunctionName>(element, textRange),
    PsiPolyVariantReference {
    private val functionName = element.text

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        return findFunctionDeclarations(myElement.project, functionName)
            .map { PsiElementResolveResult(it) }
            .toTypedArray()
    }

    override fun resolve(): PsiElement? {
        val resolveResults = multiResolve(false)
        return if (resolveResults.size == 1) {
            resolveResults[0].element
        } else {
            null
        }
    }
}