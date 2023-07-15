package com.github.floralvikings.godotea.language.gdscript.psi

import com.github.floralvikings.godotea.language.gdscript.reference.GDScriptIDReference
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference

class GDScriptImplPsiUtil {
    companion object {
        private val log = Logger.getInstance(GDScriptImplPsiUtil::class.java)

        @JvmStatic
        fun GDScriptClassVarDeclaration.getName(): String? {
            return classVarName.identifier.text
        }

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
        fun GDScriptClassVarDeclaration.getNameIdentifier(): PsiElement = classVarName.identifier

        @JvmStatic
        fun GDScriptClassVarDeclaration.getDeclaringElement(): PsiElement = this

        @JvmStatic
        fun GDScriptClassVarDeclaration.getRangeInDeclaringElement(): TextRange = classVarName.textRange

        @JvmStatic
        fun GDScriptId.getReference(): PsiReference {
            return GDScriptIDReference(this)
        }
    }
}
