package com.github.floralvikings.godotea.language.gdscript

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassNameDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFile
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptInnerClassDeclaration
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil


class GDScriptUtil {
    companion object {
        @JvmStatic
        fun findClassNames(project: Project): List<String?> {
            val gdScriptFiles = FileTypeIndex.getFiles(GDScriptFileType.INSTANCE, GlobalSearchScope.allScope(project))
                .mapNotNull { PsiManager.getInstance(project).findFile(it) as GDScriptFile? }
            val declaredClassNames = gdScriptFiles
                .mapNotNull { PsiTreeUtil.getChildrenOfType(it, GDScriptClassNameDeclaration::class.java) }
                .flatMap { it.toList() }
                .map { it.className }
            val innerClassNames = gdScriptFiles
                .mapNotNull { PsiTreeUtil.getChildrenOfType(it, GDScriptInnerClassDeclaration::class.java) }
                .flatMap { it.toList() }
                .map { it.className }
            return declaredClassNames + innerClassNames
        }
    }
}