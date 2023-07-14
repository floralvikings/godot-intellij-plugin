package com.github.floralvikings.godotea.language.gdscript.psi

import com.github.floralvikings.godotea.language.gdscript.GDScriptFileType
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory

class GDScriptElementFactory {
    companion object {
        @JvmStatic
        fun createIdentifier(project: Project, id: String): PsiElement {
            val text = "var $id"
            val gdScriptFile = createFile(project, text)
            val declaration = gdScriptFile.firstChild as GDScriptClassVarDeclaration
            return declaration.id.identifier!!
        }

        @JvmStatic
        fun createFile(project: Project, text: String): GDScriptFile {
            val name = "tmp.gd"
            return PsiFileFactory.getInstance(project)
                .createFileFromText(name, GDScriptFileType.INSTANCE, text) as GDScriptFile
        }
    }
}