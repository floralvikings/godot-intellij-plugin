package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.intellij.formatting.Alignment
import com.intellij.formatting.Indent
import com.intellij.formatting.SpacingBuilder
import com.intellij.formatting.Wrap
import com.intellij.lang.ASTNode
import com.intellij.openapi.diagnostic.Logger

class GDScriptClassBodyBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    spacingBuilder: SpacingBuilder,
    indent: Indent = Indent.getNormalIndent()
) : GDScriptBlock(node, wrap, alignment, spacingBuilder, indent) {
    private val log = Logger.getInstance(GDScriptClassBodyBlock::class.java)
}