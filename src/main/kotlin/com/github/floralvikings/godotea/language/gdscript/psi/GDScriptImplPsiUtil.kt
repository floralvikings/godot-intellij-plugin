package com.github.floralvikings.godotea.language.gdscript.psi

import com.github.floralvikings.godotea.language.gdscript.containingClass
import com.github.floralvikings.godotea.language.gdscript.findClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.reference.GDScriptIDReference
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiReference
import com.intellij.psi.ResolveResult
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry
import com.intellij.psi.util.childrenOfType

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
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
        fun GDScriptClassVarDeclaration.getNameIdentifier(): PsiElement = classVarName

        @JvmStatic
        fun GDScriptClassVarDeclaration.getTextOffset(): Int {
            return classVarName.textOffset
        }

        @JvmStatic
        fun GDScriptClassVarDeclaration.getQualifiedName(): String {
            var containingClass = this.containingClass
            var qualifiedName = classVarName.text
            while(containingClass != null) {
                qualifiedName = "${containingClass.id.text}.$qualifiedName"
                containingClass = containingClass.containingClass
            }
            val classNameDeclarations = containingFile.childrenOfType<GDScriptClassNameDeclaration>()
            val rootClassName = if(classNameDeclarations.isNotEmpty()) {
                classNameDeclarations[0].id.text
            } else {
                containingFile.name
            }
            qualifiedName = "$rootClassName.$qualifiedName"
            return qualifiedName
        }

        @JvmStatic
        fun GDScriptId.getReference(): PsiReference {
            return GDScriptIDReference(this)
        }
    }
}
