package com.github.floralvikings.godotea.language.gdscript.psi

import com.github.floralvikings.godotea.language.gdscript.GDScriptLanguage
import com.intellij.psi.tree.IElementType

class GDScriptTokenType(debugName: String) : IElementType(debugName, GDScriptLanguage.INSTANCE) {
    override fun toString(): String = "GDScriptTokenType.${super.toString()}"
}