package com.github.floralvikings.godotea.language.gdscript.util

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptInnerClassDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptScriptStatement
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptVarStatement
import com.intellij.psi.util.childrenOfType

val GDScriptFunctionDeclaration.variableDeclarations: List<GDScriptVarStatement>
    get() = block?.childrenOfType<GDScriptScriptStatement>()?.mapNotNull { it.varStatement } ?: emptyList()

fun GDScriptFunctionDeclaration.findVariableDeclaration(name: String): GDScriptVarStatement? =
    variableDeclarations.firstOrNull { it.name == name }

val  GDScriptFunctionDeclaration.containingInnerClass: GDScriptInnerClassDeclaration?
    get() = parent?.parent as? GDScriptInnerClassDeclaration