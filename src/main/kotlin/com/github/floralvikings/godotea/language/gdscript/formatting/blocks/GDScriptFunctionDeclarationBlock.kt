package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.TokenType

class GDScriptFunctionDeclarationBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    spacingBuilder: SpacingBuilder
) : GDScriptBlock(node, wrap, alignment, spacingBuilder) {
    private val log = Logger.getInstance(GDScriptFunctionDeclarationBlock::class.java)
    
    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        log.warn("Retrieving GDScriptFunctionDeclarationBlock child attributes")
        if (newChildIndex > 0) {
            val prevBlock = this.subBlocks[newChildIndex - 1] as GDScriptBlock
            val prevType = prevBlock.node.elementType
            if (prevType == GDScriptTypes.FUNCTION_RETURN_TYPE || prevType == GDScriptTypes.COLON) {
                return ChildAttributes(Indent.getNormalIndent(), null)
            } else if (prevType == TokenType.ERROR_ELEMENT) {
                // If text immediately preceding previous node is two blank lines, don't indent
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

        val incomplete = lastBlock.node?.elementType != GDScriptTypes.BLOCK

        log.warn("Incomplete GDScriptFunctionDeclarationBlock: $incomplete")
        return incomplete
    }
}