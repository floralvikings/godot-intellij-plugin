package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.intellij.formatting.Alignment
import com.intellij.formatting.Indent
import com.intellij.formatting.SpacingBuilder
import com.intellij.formatting.Wrap
import com.intellij.lang.ASTNode

class GDScriptErrorBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    spacingBuilder: SpacingBuilder,
    indent: Indent = Indent.getNoneIndent()
) : GDScriptBlock(node, wrap, alignment, spacingBuilder, indent) {
    override fun isIncomplete(): Boolean {
        return false
    }
}