package com.github.floralvikings.godotea.language.gdscript.reference

import com.github.floralvikings.godotea.language.gdscript.findClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptId
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptImplPsiUtil
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.*

class GDScriptIDReference(private val id: GDScriptId) : PsiReferenceBase<GDScriptId>(id, id.textRange), PsiPolyVariantReference{
    private val log = Logger.getInstance(GDScriptImplPsiUtil::class.java)

    override fun resolve(): PsiElement? {
        log.warn("Resolving $id")
        return resolveClassVar()
    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val classVar = resolveClassVar()
        if(classVar != null) {
            return PsiElementResolveResult.createResults(classVar)
        }
        return ResolveResult.EMPTY_ARRAY
    }

    override fun isReferenceTo(element: PsiElement): Boolean {
        return resolve() == element
    }

    private fun resolveClassVar(): PsiElement? {
        return findClassVarDeclaration(id.containingFile, id.text)
    }
}