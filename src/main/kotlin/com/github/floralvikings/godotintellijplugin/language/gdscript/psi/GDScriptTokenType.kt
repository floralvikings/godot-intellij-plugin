package com.github.floralvikings.godotintellijplugin.language.gdscript.psi

import com.github.floralvikings.godotintellijplugin.language.gdscript.GDScriptLanguage
import com.intellij.psi.tree.IElementType

class GDScriptTokenType(debugName: String) : IElementType(debugName, GDScriptLanguage.INSTANCE) {
    override fun toString(): String = "GDScriptTokenType.${super.toString()}"
}