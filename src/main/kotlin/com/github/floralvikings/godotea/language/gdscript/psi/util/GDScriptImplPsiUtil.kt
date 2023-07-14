package com.github.floralvikings.godotea.language.gdscript.psi.util

import com.github.floralvikings.godotea.language.gdscript.findFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptElementFactory
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionName
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptId
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.github.floralvikings.godotea.language.gdscript.reference.GDScriptFunctionReference
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import com.intellij.psi.util.elementType

class GDScriptImplPsiUtil {
    companion object {
        @JvmStatic
        fun getName(element: GDScriptFunctionDeclaration): String? {
            return element.functionName.identifier.text
        }

        @JvmStatic
        fun setName(element: GDScriptFunctionDeclaration, newName: String): PsiElement {
            val identifierNode = element.functionName.identifier.node
            if(identifierNode != null) {
                val newIdentifier = GDScriptElementFactory.createIdentifier(element.project, newName)
                element.functionName.node.replaceChild(identifierNode, newIdentifier.node)
            }
            return element
        }

        @JvmStatic
        fun getNameIdentifier(element: GDScriptFunctionDeclaration): PsiElement {
            return element.functionName.identifier
        }

        @JvmStatic
        fun getReference(element: GDScriptFunctionDeclaration): PsiReference? {
            val functionName = element.functionName
            return GDScriptFunctionReference(functionName, functionName.textRange)
        }

        @JvmStatic
        fun getReference(element: GDScriptFunctionName): PsiReference? {
            val declaration = findFunctionDeclaration(element.containingFile, element.text) ?: return null
            val functionName = declaration.functionName
            return GDScriptFunctionReference(functionName, functionName.textRange)
        }

        @JvmStatic
        fun getReferences(id: GDScriptId): Array<PsiReference> {
            return emptyArray()
        }
    }
}
