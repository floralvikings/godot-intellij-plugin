package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.github.floralvikings.godotea.language.gdscript.util.containingFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.util.nextNonWhitespaceSibling
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.TokenType
import com.intellij.psi.formatter.common.AbstractBlock
import com.intellij.psi.util.elementType

private val log = Logger.getInstance(GDScriptBlock::class.java)

open class GDScriptBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    val spacingBuilder: SpacingBuilder,
    private val indent: Indent = Indent.getNoneIndent()
) : AbstractBlock(node, wrap, alignment) {

    final override fun getSpacing(child1: Block?, child2: Block): Spacing? =
        spacingBuilder.getSpacing(this, child1, child2)

    final override fun isLeaf(): Boolean = myNode.firstChildNode == null

    final override fun getIndent(): Indent = indent

    final override fun buildChildren(): MutableList<Block> {
        val blocks: MutableList<Block> = ArrayList()
        var child = myNode.firstChildNode
        while (child != null) {
            val elementType = child.elementType
            if (elementType !== TokenType.WHITE_SPACE && elementType !== GDScriptTypes.LINE_BREAK) {
                val block = when {
                    elementType == TokenType.ERROR_ELEMENT -> GDScriptErrorBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )
                    elementType == GDScriptTypes.FUNCTION_DECLARATION -> GDScriptFunctionDeclarationBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )
                    elementType == GDScriptTypes.BLOCK -> GDScriptBlockBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )
                    elementType == GDScriptTypes.INNER_CLASS_DECLARATION -> GDScriptClassDeclarationBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )
                    elementType == GDScriptTypes.CLASS_BLOCK -> GDScriptClassBodyBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )
                    elementType == GDScriptTypes.IF_STATEMENT -> GDScriptIfStatementBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )
                    elementType == GDScriptTypes.ELSE_STATEMENT -> GDScriptElseStatementBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )
                    elementType == GDScriptTypes.ELIF_STATEMENT -> GDScriptElifStatementBlock(
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

    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        log.debug("Retrieving GDScriptBlock(${node.elementType}) child attributes")
        return super.getChildAttributes(newChildIndex)
    }

    override fun isIncomplete(): Boolean {
        val incomplete = super.isIncomplete()
        log.debug("Incomplete GDScriptBlock(${node.elementType}): $incomplete")
        return incomplete
    }

    fun getPostBlockChildAttributes(blockBeforeNewChild: GDScriptBlock): ChildAttributes {
        val prevPsi = blockBeforeNewChild.node.psi
        val containingFunctionDeclaration = prevPsi.containingFunctionDeclaration 
            ?: return ChildAttributes(Indent.getNormalIndent(), null)
        val afterParent = containingFunctionDeclaration.nextNonWhitespaceSibling
        val afterAfterParent = afterParent?.nextNonWhitespaceSibling
        val afterThat = afterAfterParent?.nextNonWhitespaceSibling
        val attributes: ChildAttributes =
            if (afterParent?.elementType == GDScriptTypes.LINE_BREAK
                && afterAfterParent?.elementType == GDScriptTypes.LINE_BREAK
                && afterThat?.elementType == GDScriptTypes.LINE_BREAK
            ) {
                ChildAttributes(Indent.getNoneIndent(), null)
            } else {
                ChildAttributes(Indent.getNormalIndent(), null)
            }
        return attributes
    }
}

