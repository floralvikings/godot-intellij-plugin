package com.github.floralvikings.godotea.language.gdscript.util

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptScriptStatement
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptVarStatement
import com.intellij.psi.util.childrenOfType

val GDScriptFunctionDeclaration.variableDeclarations: List<GDScriptVarStatement>
    get() = block.childrenOfType<GDScriptScriptStatement>().mapNotNull { it.varStatement }

fun GDScriptFunctionDeclaration.findVariableDeclaration(name: String): GDScriptVarStatement? =
    variableDeclarations.firstOrNull { it.name == name }