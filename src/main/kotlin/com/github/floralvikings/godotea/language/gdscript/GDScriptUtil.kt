@file:JvmName("GDScriptUtil")
package com.github.floralvikings.godotea.language.gdscript

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFile
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil

fun findFunctionDeclaration(file: PsiFile, functionName: String): GDScriptFunctionDeclaration? {
    return PsiTreeUtil.getChildrenOfType(file, GDScriptFunctionDeclaration::class.java)
        ?.asSequence()
        ?.filter { it.functionName.text == functionName }
        ?.firstOrNull()
}

fun findFunctionDeclarations(project: Project, functionName: String): List<GDScriptFunctionDeclaration> {
    return FileTypeIndex.getFiles(GDScriptFileType.INSTANCE, GlobalSearchScope.allScope(project))
        .asSequence()
        .map { PsiManager.getInstance(project).findFile(it) }
        .filterIsInstance<GDScriptFile>()
        .map { PsiTreeUtil.getChildrenOfType(it, GDScriptFunctionDeclaration::class.java) }
        .filterNotNull()
        .map { array ->
            array.filter { declaration -> declaration.functionName.text == functionName }
        }
        .flatten()
        .toList()
}

fun findFunctionDeclarations(project: Project): List<GDScriptFunctionDeclaration> {
    return FileTypeIndex.getFiles(GDScriptFileType.INSTANCE, GlobalSearchScope.allScope(project))
        .asSequence()
        .map { PsiManager.getInstance(project).findFile(it) }
        .filterIsInstance<GDScriptFile>()
        .map { PsiTreeUtil.getChildrenOfType(it, GDScriptFunctionDeclaration::class.java) }
        .filterNotNull()
        .map { it.toList() }
        .flatten()
        .toList()
}
