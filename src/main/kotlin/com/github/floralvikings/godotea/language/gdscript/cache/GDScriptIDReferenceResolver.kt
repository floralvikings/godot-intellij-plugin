package com.github.floralvikings.godotea.language.gdscript.cache

import com.github.floralvikings.godotea.language.gdscript.psi.*
import com.github.floralvikings.godotea.language.gdscript.util.isFunctionName
import com.github.floralvikings.godotea.language.gdscript.util.isMember
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.diagnostic.debug
import com.intellij.psi.PsiElement
import com.intellij.psi.util.CachedValueProvider
import com.intellij.psi.util.childrenOfType

class GDScriptIDReferenceResolver(val id: GDScriptId) : CachedValueProvider<PsiElement?> {
    private val log = Logger.getInstance(GDScriptIDReferenceResolver::class.java)

    override fun compute(): CachedValueProvider.Result<PsiElement?> {
        return CachedValueProvider.Result.create(resolve(), id.containingFile)
    }

    fun resolve(): PsiElement? {
        log.debug { "Resolving $id" }
        return resolveReference(id)
    }

    private fun resolveReference(id: GDScriptId): PsiElement? {
        return if (id.isMember()) {
            null
        } else if (id.isFunctionName()) {
            resolveFunctionReference(id)
        } else {
            resolveVarReference(id)
        }
    }

    private fun resolveFunctionReference(id: GDScriptId): PsiElement? {
        var current: PsiElement? = id
        // Search for functions in the same class
        while (current != null) {
            current = current.parent
            if (current is GDScriptClassBlock) {
                val innerClassFunctionDeclaration = current.childrenOfType<GDScriptFunctionDeclaration>()
                    .firstOrNull { it.functionName.text == id.text }
                if (innerClassFunctionDeclaration != null) {
                    return innerClassFunctionDeclaration
                }
            } else if (current is GDScriptFile) {
                val topLevelFunctionDeclaration = current.childrenOfType<GDScriptFunctionDeclaration>()
                    .firstOrNull { it.functionName.text == id.text }
                if (topLevelFunctionDeclaration != null) {
                    return topLevelFunctionDeclaration
                }
            }
        }
        return null
    }

    private fun resolveVarReference(id: GDScriptId): PsiElement? {
        var current: PsiElement? = id
        val idText = id.text
        while (current != null) {
            if (current is GDScriptBlock && current.parent is GDScriptFunctionDeclaration) {
                val varStatements = current.childrenOfType<GDScriptVarStatement>()
                val localVarDeclaration = varStatements
                    .firstOrNull { it.localVarName.text == idText }
                if (localVarDeclaration != null) {
                    return localVarDeclaration
                }
            } else if (current is GDScriptFunctionDeclaration) {
                val parameterDeclaration = current.functionDeclarationParameters?.functionParameterList
                    ?.firstOrNull { it.parameterName.text == idText }
                if (parameterDeclaration != null) {
                    return parameterDeclaration
                }
            } else if (current is GDScriptClassBlock && current.parent is GDScriptInnerClassDeclaration) {
                val varStatements = current.childrenOfType<GDScriptClassVarDeclaration>()
                val classVarDeclaration = varStatements
                    .firstOrNull { it.classVarName.text == idText }
                if (classVarDeclaration != null) {
                    return classVarDeclaration
                }
            } else if (current is GDScriptFile) {
                val varStatements = current.childrenOfType<GDScriptClassVarDeclaration>()
                val classVarDeclaration = varStatements
                    .firstOrNull { it.classVarName.text == idText }
                if (classVarDeclaration != null) {
                    return classVarDeclaration
                }
            }
            current = current.parent
        }
        return null
    }
}
