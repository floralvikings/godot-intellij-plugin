package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.github.floralvikings.godotea.language.gdscript.util.nextNonWhitespaceSibling
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.TokenType
import com.intellij.psi.formatter.common.AbstractBlock
import com.intellij.psi.util.elementType


open class GDScriptBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    val spacingBuilder: SpacingBuilder,
    private val indent: Indent = Indent.getNoneIndent()
) :
    AbstractBlock(node, wrap, alignment) {

    final override fun getSpacing(child1: Block?, child2: Block): Spacing? =
        spacingBuilder.getSpacing(this, child1, child2)

    final override fun isLeaf(): Boolean = myNode.firstChildNode == null

    final override fun getIndent(): Indent = indent

    final override fun buildChildren(): MutableList<Block> {
        val blocks: MutableList<Block> = ArrayList()
        var child = myNode.firstChildNode
        while (child != null) {
            if (child.elementType !== TokenType.WHITE_SPACE && child.elementType !== GDScriptTypes.LINE_BREAK) {
                val block = when (child.elementType) {
                    GDScriptTypes.FUNCTION_DECLARATION -> GDScriptFunctionDeclarationBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )

                    GDScriptTypes.BLOCK -> GDScriptFunctionBodyBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )

                    else -> GDScriptBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )
                }
                blocks.add(block)
            }
            child = child.treeNext
        }
        return blocks
    }

    override fun isIncomplete(): Boolean {
        val psi = node.psi
        if(psi.elementType == TokenType.ERROR_ELEMENT) {
            return true
        }
        return super.isIncomplete()
    }

    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        val isErrored = node.psi.elementType == TokenType.ERROR_ELEMENT
        if(isErrored) {
            // Determine if end of function declaration
            val previous = node.psi.prevSibling
            if(previous.elementType == GDScriptTypes.LINE_BREAK) {
                // We're on a new line
                val secondPrevious = previous.prevSibling
                if(secondPrevious?.elementType in listOf(GDScriptTypes.COLON, GDScriptTypes.FUNCTION_RETURN_TYPE)) {
                    // We're after a colon or return type; we should indent
                    return ChildAttributes(Indent.getNormalIndent(), null)
                }
            }
        }
        return super.getChildAttributes(newChildIndex)
    }
}

class GDScriptFunctionDeclarationBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    spacingBuilder: SpacingBuilder
) : GDScriptBlock(node, wrap, alignment, spacingBuilder) {
    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        if (newChildIndex > 0) {
            val prevBlock = this.subBlocks[newChildIndex - 1] as GDScriptBlock
            val prevType = prevBlock.node.elementType
            if (prevType == GDScriptTypes.FUNCTION_RETURN_TYPE || prevType == GDScriptTypes.COLON) {
                return ChildAttributes(Indent.getNormalIndent(), null)
            }
        }
        return super.getChildAttributes(newChildIndex)
    }
}

class GDScriptFunctionBodyBlock(node: ASTNode, wrap: Wrap?, alignment: Alignment?, spacingBuilder: SpacingBuilder) :
    GDScriptBlock(node, wrap, alignment, spacingBuilder, Indent.getNormalIndent()) {
    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        return ChildAttributes(Indent.getNoneIndent(), null)
    }

    override fun isIncomplete(): Boolean {
        val psi = node.psi
        val declaration = psi.parent
        val nextSibling = declaration.nextNonWhitespaceSibling
        if(nextSibling.elementType == GDScriptTypes.LINE_BREAK) {
            val nextNextSibling = nextSibling?.nextNonWhitespaceSibling
            return if(nextNextSibling != null) {
                nextNextSibling.elementType != GDScriptTypes.LINE_BREAK
            } else {
                true
            }
        }
        return super.isIncomplete()
    }
}
