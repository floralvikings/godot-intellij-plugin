package com.github.floralvikings.godotea.language.gdscript.util

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFile
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptInnerClassDeclaration
import com.intellij.psi.util.childrenOfType

val GDScriptFile.topLevelVarDeclarations: List<GDScriptClassVarDeclaration>
    get() = childrenOfType()

val GDScriptFile.topLevelFunctionDeclarations: List<GDScriptFunctionDeclaration>
    get() = childrenOfType()

val GDScriptFile.innerClassDeclarations: List<GDScriptInnerClassDeclaration>
    get() = childrenOfType()

fun GDScriptFile.findTopLevelVarNamed(name: String): GDScriptClassVarDeclaration? =
    childrenOfType<GDScriptClassVarDeclaration>().firstOrNull { it.classVarName.text == name }

fun GDScriptFile.findTopLevelFunctionsNamed(name: String): List<GDScriptFunctionDeclaration> =
    childrenOfType<GDScriptFunctionDeclaration>().filter { it.functionName.text == name }

fun GDScriptFile.findInnerClassDeclaration(name: String): GDScriptInnerClassDeclaration? =
    innerClassDeclarations.firstOrNull { it.id.text == name }