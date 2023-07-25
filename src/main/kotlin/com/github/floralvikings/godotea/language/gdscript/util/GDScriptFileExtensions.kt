package com.github.floralvikings.godotea.language.gdscript.util

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFile
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.intellij.psi.util.childrenOfType

fun GDScriptFile.getTopLevelVarDeclarations(): List<GDScriptClassVarDeclaration> = childrenOfType()

fun GDScriptFile.getTopLevelFunctionDeclarations(): List<GDScriptFunctionDeclaration> = childrenOfType()

fun GDScriptFile.findTopLevelVarNamed(name: String): GDScriptClassVarDeclaration? =
    childrenOfType<GDScriptClassVarDeclaration>().firstOrNull { it.classVarName.text == name }