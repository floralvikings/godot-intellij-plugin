package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.github.floralvikings.godotea.language.gdscript.util.containingInnerClass
import com.github.floralvikings.godotea.language.gdscript.util.nextNonWhitespaceSibling
import com.github.floralvikings.godotea.language.lastNonWhitespaceChildNode
import com.github.floralvikings.godotea.language.treePrevNonLineBreak
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.util.TextRange
import com.intellij.psi.TokenType
import com.intellij.psi.formatter.common.AbstractBlock
import com.intellij.psi.util.elementType
import com.jetbrains.rd.framework.base.deepClonePolymorphic

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
            if (child.elementType !== TokenType.WHITE_SPACE && child.elementType !== GDScriptTypes.LINE_BREAK) {
                val block = when (child.elementType) {
                    TokenType.ERROR_ELEMENT -> GDScriptErrorBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )
                    
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
                    
                    GDScriptTypes.INNER_CLASS_DECLARATION -> GDScriptClassDeclarationBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )

                    GDScriptTypes.CLASS_BLOCK -> GDScriptClassBodyBlock(
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
        val incomplete = super.isIncomplete()
        log.warn("Incomplete GDScriptBlock(${node.elementType}): $incomplete")
        return incomplete
    }
}

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

class GDScriptFunctionDeclarationBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    spacingBuilder: SpacingBuilder
) : GDScriptBlock(node, wrap, alignment, spacingBuilder) {
    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        log.warn("Retrieving GDScriptFunctionDeclarationBlock child attributes")
        if (newChildIndex > 0) {
            val prevBlock = this.subBlocks[newChildIndex - 1] as GDScriptBlock
            val prevType = prevBlock.node.elementType
            if (prevType == GDScriptTypes.FUNCTION_RETURN_TYPE || prevType == GDScriptTypes.COLON) {
                return ChildAttributes(Indent.getNormalIndent(), null)
            } else if(prevType == TokenType.ERROR_ELEMENT) {
                // If text immediately preceding previous node is two blank lines, don't indent
                val prevPsi = prevBlock.node.psi
                val parent = prevPsi.parent
                val afterParent = parent.nextNonWhitespaceSibling
                val afterAfterParent = afterParent?.nextNonWhitespaceSibling
                val afterThat = afterAfterParent?.nextNonWhitespaceSibling
                if(afterParent?.elementType == GDScriptTypes.LINE_BREAK 
                    && afterAfterParent?.elementType == GDScriptTypes.LINE_BREAK 
                    && afterThat?.elementType == GDScriptTypes.LINE_BREAK
                    ) {
                    return ChildAttributes(Indent.getNoneIndent(), null)
                }
                return ChildAttributes(Indent.getNormalIndent(), null)
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

class GDScriptFunctionBodyBlock(node: ASTNode, wrap: Wrap?, alignment: Alignment?, spacingBuilder: SpacingBuilder) :
    GDScriptBlock(node, wrap, alignment, spacingBuilder, Indent.getNormalIndent()) {
    override fun isIncomplete(): Boolean {
        val psi = node.psi
        val declaration = psi.parent
        val nextSibling = declaration.nextSibling
        var incomplete = false
        if (nextSibling.elementType == GDScriptTypes.LINE_BREAK) {
            val nextNextSibling = nextSibling?.nextSibling
            incomplete = if (nextNextSibling != null) {
                nextNextSibling.elementType != GDScriptTypes.LINE_BREAK
            } else {
                true
            }
        }
        log.warn("Incomplete GDScriptFunctionBodyBlock: $incomplete")
        return incomplete
    }
}

class GDScriptClassDeclarationBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    spacingBuilder: SpacingBuilder,
    indent: Indent = Indent.getNoneIndent()
) : GDScriptBlock(node, wrap, alignment, spacingBuilder, indent) {

    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        log.warn("Retrieving GDScriptClassDeclarationBlock child attributes")
        if (newChildIndex > 0) {
            val prevBlock = this.subBlocks[newChildIndex - 1] as GDScriptBlock
            val prevType = prevBlock.node.elementType
            if (prevType == GDScriptTypes.COLON) {
                return ChildAttributes(Indent.getNormalIndent(), null)
            } else if(prevType == TokenType.ERROR_ELEMENT) {
                // If text immediately preceding previous node is two blank lines, don't indent
                val prevPsi = prevBlock.node.psi
                val parent = prevPsi.parent
                val afterParent = parent.nextNonWhitespaceSibling
                val afterAfterParent = afterParent?.nextNonWhitespaceSibling
                if(afterParent?.elementType == GDScriptTypes.LINE_BREAK && afterAfterParent?.elementType == GDScriptTypes.LINE_BREAK) {
                    return ChildAttributes(Indent.getNoneIndent(), null)
                }
                return ChildAttributes(Indent.getNormalIndent(), null)
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

        log.warn("Incomplete GDScriptClassDeclarationBlock: $incomplete")
        return incomplete
    }
}

class GDScriptClassBodyBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    spacingBuilder: SpacingBuilder,
    indent: Indent = Indent.getNormalIndent()
) : GDScriptBlock(node, wrap, alignment, spacingBuilder, indent) {
    override fun isIncomplete(): Boolean {
        val psi = node.psi
        val declaration = psi.parent
        val nextSibling = declaration.nextSibling
        var incomplete = false
        if (nextSibling.elementType == GDScriptTypes.LINE_BREAK) {
            val nextNextSibling = nextSibling?.nextSibling
            incomplete = if (nextNextSibling != null) {
                nextNextSibling.elementType != GDScriptTypes.LINE_BREAK
            } else {
                true
            }
        }
        log.warn("Incomplete GDScriptClassBodyBlock: $incomplete")
        return incomplete
    }
}
