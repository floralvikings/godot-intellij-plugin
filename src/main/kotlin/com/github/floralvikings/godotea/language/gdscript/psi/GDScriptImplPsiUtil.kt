package com.github.floralvikings.godotea.language.gdscript.psi

import com.github.floralvikings.godotea.language.gdscript.reference.GDScriptIDReference
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.diagnostic.debug
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
class GDScriptImplPsiUtil {
    companion object {
        private val log = Logger.getInstance(GDScriptImplPsiUtil::class.java)

        @JvmStatic
        fun GDScriptClassVarDeclaration.getName(): String? = classVarName.identifier.text

        @JvmStatic
        fun GDScriptClassVarDeclaration.setName(newName: String): PsiElement {
            log.debug("Setting class var declaration name to $newName")
            val identifierNode = classVarName.identifier.node
            if(identifierNode != null) {
                val newIdentifier = GDScriptElementFactory.createIdentifier(project, newName)
                classVarName.node.replaceChild(identifierNode, newIdentifier.node)
            }
            return this
        }

        @JvmStatic
        fun GDScriptClassVarDeclaration.getNameIdentifier(): PsiElement = classVarName

        @JvmStatic
        fun GDScriptClassVarDeclaration.getTextOffset(): Int = classVarName.textOffset

        @JvmStatic
        fun GDScriptVarStatement.getName(): String? = localVarName.identifier.text

        @JvmStatic
        fun GDScriptVarStatement.setName(newName: String): PsiElement {
            log.debug("Setting local var declaration name to $newName")
            val identifierNode = localVarName.identifier.node
            if(identifierNode != null) {
                val newIdentifier = GDScriptElementFactory.createIdentifier(project, newName)
                localVarName.node.replaceChild(identifierNode, newIdentifier.node)
            }
            return this
        }

        @JvmStatic
        fun GDScriptVarStatement.getNameIdentifier(): PsiElement = localVarName

        @JvmStatic
        fun GDScriptVarStatement.getTextOffset(): Int = localVarName.textOffset

        @JvmStatic
        fun GDScriptFunctionParameter.getName(): String? = parameterName.identifier.text

        @JvmStatic
        fun GDScriptFunctionParameter.setName(newName: String): PsiElement {
            log.debug("Setting parameter name to $newName")
            val identifierNode = parameterName.identifier.node
            if(identifierNode != null) {
                val newIdentifier = GDScriptElementFactory.createIdentifier(project, newName)
                parameterName.node.replaceChild(identifierNode, newIdentifier.node)
            }
            return this
        }

        @JvmStatic
        fun GDScriptFunctionParameter.getNameIdentifier(): PsiElement = parameterName

        @JvmStatic
        fun GDScriptFunctionParameter.getTextOffset(): Int = parameterName.textOffset

        @JvmStatic
        fun GDScriptFunctionDeclaration.getName(): String? = functionName.identifier.text

        @JvmStatic
        fun GDScriptFunctionDeclaration.setName(newName: String): PsiElement {
            log.debug{"Setting function name to $newName"}
            val identifierNode = functionName.identifier.node
            if(identifierNode != null) {
                val newIdentifier = GDScriptElementFactory.createIdentifier(project, newName)
                functionName.node.replaceChild(identifierNode, newIdentifier.node)
            }
            return this
        }

        @JvmStatic
        fun GDScriptFunctionDeclaration.getNameIdentifier(): PsiElement = functionName

        @JvmStatic
        fun GDScriptFunctionDeclaration.getTextOffset(): Int = functionName.textOffset

        @JvmStatic
        fun GDScriptId.getReference(): PsiReference = GDScriptIDReference(this)
    }
}
