package com.github.floralvikings.godotea.language.gdscript.cache

import com.github.floralvikings.godotea.language.gdscript.util.resolveReference
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptId
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.diagnostic.debug
import com.intellij.psi.PsiElement
import com.intellij.psi.util.CachedValueProvider

class GDScriptIDReferenceResolver(val id: GDScriptId) : CachedValueProvider<PsiElement?> {
    private val log = Logger.getInstance(GDScriptIDReferenceResolver::class.java)

    override fun compute(): CachedValueProvider.Result<PsiElement?> {
        return CachedValueProvider.Result.create(resolve(), id.containingFile)
    }

    fun resolve(): PsiElement? {
        log.debug { "Resolving $id" }
        return resolveReference(id)
    }
}
