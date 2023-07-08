package com.github.floralvikings.godotintellijplugin.language.gdscript.psi

import com.intellij.psi.tree.TokenSet

interface GDScriptTokenSets {
    companion object {
        val IDENTIFIERS = TokenSet.create(GDScriptTypes.IDENTIFIER)

        val COMMENTS = TokenSet.create(GDScriptTypes.LINE_COMMENT)
    }
}