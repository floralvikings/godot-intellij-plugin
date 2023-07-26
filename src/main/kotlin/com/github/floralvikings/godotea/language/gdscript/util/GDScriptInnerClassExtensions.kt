package com.github.floralvikings.godotea.language.gdscript.util

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptInnerClassDeclaration
import com.intellij.psi.util.childrenOfType

val GDScriptInnerClassDeclaration.varDeclarations: List<GDScriptClassVarDeclaration>
    get() = classBlock.childrenOfType()

val GDScriptInnerClassDeclaration.functionDeclarations: List<GDScriptFunctionDeclaration>
    get() = classBlock.childrenOfType<GDScriptFunctionDeclaration>()
