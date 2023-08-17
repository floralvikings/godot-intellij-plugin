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

class GDScriptElifStatementBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    spacingBuilder: SpacingBuilder
) : GDScriptBlock(node, wrap, alignment, spacingBuilder) {
  private val log = Logger.getInstance(GDScriptElifStatementBlock::class.java)
  override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
    log.debug("Retrieving GDScriptElifBlock child attributes")
    if (newChildIndex <= 0) {
      return ChildAttributes(Indent.getNoneIndent(), Alignment.createAlignment())
    }
    val prevBlock = subBlocks[newChildIndex - 1] as GDScriptBlock
    if (prevBlock.node.elementType == GDScriptTypes.COLON ||
      prevBlock.node.elementType == GDScriptTypes.FUNCTION_RETURN_TYPE ||
      prevBlock.node.elementType == TokenType.ERROR_ELEMENT
    ) {
      return ChildAttributes(Indent.getNormalIndent(), Alignment.createAlignment())
    } 

    return ChildAttributes(Indent.getNormalIndent(), Alignment.createAlignment())
  }
}
