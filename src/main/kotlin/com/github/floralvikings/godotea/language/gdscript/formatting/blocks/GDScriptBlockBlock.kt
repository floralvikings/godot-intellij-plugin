package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.formatting.Alignment
import com.intellij.formatting.ChildAttributes
import com.intellij.formatting.Indent
import com.intellij.formatting.SpacingBuilder
import com.intellij.formatting.Wrap
import com.intellij.lang.ASTNode
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.TokenType

class GDScriptBlockBlock(node: ASTNode, wrap: Wrap?, alignment: Alignment?, spacingBuilder: SpacingBuilder) :
    GDScriptBlock(node, wrap, alignment, spacingBuilder, Indent.getNoneIndent()) {
    private val log = Logger.getInstance(GDScriptBlockBlock::class.java)
    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        log.debug("Retrieving GDScriptBlockBlock child attributes: $newChildIndex")
        return ChildAttributes(Indent.getNoneIndent(), Alignment.createAlignment())
    }
}
