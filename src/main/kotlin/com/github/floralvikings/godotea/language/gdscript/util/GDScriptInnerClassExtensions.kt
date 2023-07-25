package com.github.floralvikings.godotea.language.gdscript.util

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptInnerClassDeclaration
import com.intellij.psi.util.childrenOfType

fun GDScriptInnerClassDeclaration.getVarDeclarations(): List<GDScriptClassVarDeclaration> = classBlock.childrenOfType()

fun GDScriptInnerClassDeclaration.getFunctionDeclarations(): List<GDScriptFunctionDeclaration> =
    classBlock.childrenOfType()