package com.github.floralvikings.godotea.language.gdscript.util

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptVarStatement
import com.intellij.psi.util.childrenOfType

fun GDScriptFunctionDeclaration.getVariableDeclarations(): List<GDScriptVarStatement> {
    return block.childrenOfType<GDScriptVarStatement>()
}