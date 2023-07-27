package com.github.floralvikings.godotea.language.gdscript.util

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.psi.tree.TokenSet

val ASSIGNMENT_OPERATORS = TokenSet.create(
    GDScriptTypes.EQUAL,
)
