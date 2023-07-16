package com.github.floralvikings.godotea.language.gdscript.reference

import com.github.floralvikings.godotea.language.gdscript.findClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptId
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptImplPsiUtil
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.diagnostic.debug
import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import com.intellij.psi.util.CachedValueProvider
import com.intellij.psi.util.CachedValuesManager
import com.intellij.refactoring.suggested.startOffset

class GDScriptIDReference(private val id: GDScriptId) : PsiReferenceBase<GDScriptId>(id, id.textRange) {
    override fun resolve(): PsiElement? {
        return CachedValuesManager.getCachedValue(id, GDScriptIDReferenceCachedValueProvider(id))
    }

    override fun isReferenceTo(element: PsiElement): Boolean {
        return resolve() == element
    }

    override fun getRangeInElement(): TextRange {
        return id.textRange.shiftLeft(id.startOffset)
    }

    class GDScriptIDReferenceCachedValueProvider(val id: GDScriptId) : CachedValueProvider<PsiElement?> {
        private val log = Logger.getInstance(GDScriptIDReferenceCachedValueProvider::class.java)
        override fun compute(): CachedValueProvider.Result<PsiElement?> {
            return CachedValueProvider.Result.create(resolve(), id.containingFile)
        }

        fun resolve(): PsiElement? {
            log.debug { "Resolving $id" }
            return resolveClassVar()
        }

        private fun resolveClassVar(): PsiElement? {
            return findClassVarDeclaration(id.containingFile, id.text)
        }
    }
}