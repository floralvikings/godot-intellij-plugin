package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.TokenType

class GDScriptElseStatementBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    spacingBuilder: SpacingBuilder
) : GDScriptBlock(node, wrap, alignment, spacingBuilder) {
    private val log = Logger.getInstance(GDScriptElseStatementBlock::class.java)

    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        log.warn("Retrieving GDScriptElseStatementBlock child attributes")
        if (newChildIndex > 0) {
            val prevBlock = this.subBlocks[newChildIndex - 1] as GDScriptBlock
            val prevType = prevBlock.node.elementType
            when (prevType) {
                GDScriptTypes.COLON -> return ChildAttributes(Indent.getNormalIndent(), null)
                GDScriptTypes.BLOCK -> return getPostBlockChildAttributes(this)
                TokenType.ERROR_ELEMENT -> return getPostBlockChildAttributes(prevBlock)
            }
        }
        return ChildAttributes(Indent.getNoneIndent(), null)
    }
    override fun isIncomplete(): Boolean {
        val lastOrNull = this.subBlocks.lastOrNull()
        val lastBlock = if (lastOrNull is ASTBlock) {
            lastOrNull
        } else {
            return true
        }

        val incomplete = lastBlock.node?.elementType != GDScriptTypes.BLOCK

        log.warn("Incomplete GDScriptIfStatementBlock: $incomplete")
        return incomplete
    }
}