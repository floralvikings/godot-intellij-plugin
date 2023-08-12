package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.TokenType

class GDScriptClassDeclarationBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    spacingBuilder: SpacingBuilder,
    indent: Indent = Indent.getNoneIndent()
) : GDScriptBlock(node, wrap, alignment, spacingBuilder, indent) {
    private val log = Logger.getInstance(GDScriptClassDeclarationBlock::class.java)

    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        log.debug("Retrieving GDScriptClassDeclarationBlock child attributes")
        if (newChildIndex > 0) {
            val prevBlock = this.subBlocks[newChildIndex - 1] as GDScriptBlock
            val prevType = prevBlock.node.elementType
            if (prevType == GDScriptTypes.COLON) {
                return ChildAttributes(Indent.getNormalIndent(), null)
            } else if (prevType == TokenType.ERROR_ELEMENT) {
                return getPostBlockChildAttributes(prevBlock)
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

        val incomplete = lastBlock.node?.elementType != GDScriptTypes.CLASS_BLOCK

        log.debug("Incomplete GDScriptClassDeclarationBlock: $incomplete")
        return incomplete
    }
}