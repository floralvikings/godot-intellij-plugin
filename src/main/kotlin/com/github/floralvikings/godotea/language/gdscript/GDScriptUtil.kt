@file:JvmName("GDScriptUtil")

package com.github.floralvikings.godotea.language.gdscript

import com.github.floralvikings.godotea.language.gdscript.psi.*
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.childrenOfType
import com.intellij.psi.util.elementType

private val log = Logger.getInstance("com.github.floralvikings.godotea.language.gdscript.GDScriptUtil")

fun findFunctionDeclaration(file: PsiFile, functionName: String): GDScriptFunctionDeclaration? {
    return PsiTreeUtil.getChildrenOfType(file, GDScriptFunctionDeclaration::class.java)
        ?.asSequence()
        ?.filter { it.functionName.text == functionName }
        ?.firstOrNull()
}

fun findClassVarDeclaration(file: PsiFile, classVarName: String): GDScriptClassVarDeclaration? {
    return PsiTreeUtil.getChildrenOfType(file, GDScriptClassVarDeclaration::class.java)
        ?.asSequence()
        ?.filter { it.classVarName.text == classVarName }
        ?.firstOrNull()
}

fun findDeclaration(id: GDScriptId): PsiElement? {
    if (id.prevSibling.elementType == GDScriptTypes.DOT) {
        log.warn("Cannot find declaration of ${id.text} as it is a member of an object")
        return null
    }
    var current = id.parent
    while(current != null) {
        if(current is GDScriptBlock && current.parent is GDScriptFunctionDeclaration) {
            val varStatements = current.childrenOfType<GDScriptVarStatement>()
            val localVarDeclaration = varStatements
                .firstOrNull { it.localVarName.text == id.text}
            if(localVarDeclaration != null) {
                return localVarDeclaration
            }
        } else if (current is GDScriptFunctionDeclaration) {
            val parameterDeclaration = current.functionParameterList
                .firstOrNull { it.parameterName.text == id.text}
            if(parameterDeclaration != null) {
                return parameterDeclaration
            }
        } else if(current is GDScriptBlock && current.parent is GDScriptInnerClassDeclaration) {
            val varStatements = current.childrenOfType<GDScriptClassVarDeclaration>()
            val classVarDeclaration = varStatements
                .firstOrNull { it.classVarName.text == id.text}
            if(classVarDeclaration != null) {
                return classVarDeclaration
            }
        } else if(current is PsiFile) {
            val varStatements = current.childrenOfType<GDScriptClassVarDeclaration>()
            val classVarDeclaration = varStatements
                .firstOrNull { it.classVarName.text == id.text}
            if(classVarDeclaration != null) {
                return classVarDeclaration
            }
        }
        current = current.parent
    }
    log.warn("Cannot find declaration of ${id.text}")
    return null
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

val PsiElement.containingClass: GDScriptInnerClassDeclaration?
    get() {
        var current: PsiElement? = this.parent
        while (current != null) {
            if (current is GDScriptInnerClassDeclaration) {
                return current
            }
            current = current.parent
        }
        return null
    }

