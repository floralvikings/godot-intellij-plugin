package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.psi.TokenType
import com.intellij.psi.formatter.common.AbstractBlock


open class GDScriptBlock(node: ASTNode, wrap: Wrap?, alignment: Alignment?, val spacingBuilder: SpacingBuilder) :
    AbstractBlock(node, wrap, alignment) {

    override fun getSpacing(child1: Block?, child2: Block): Spacing? = spacingBuilder.getSpacing(this, child1, child2)

    override fun isLeaf(): Boolean = myNode.firstChildNode == null

    override fun getIndent(): Indent? = Indent.getNoneIndent()

    override fun buildChildren(): MutableList<Block> {
        val blocks: MutableList<Block> = ArrayList()
        var child = myNode.firstChildNode
        while (child != null) {
            if (child.elementType !== TokenType.WHITE_SPACE) {
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
}

class GDScriptFunctionDeclarationBlock(
    node: ASTNode,
    wrap: Wrap?,
    alignment: Alignment?,
    spacingBuilder: SpacingBuilder
) : GDScriptBlock(node, wrap, alignment, spacingBuilder)

class GDScriptFunctionBodyBlock(node: ASTNode, wrap: Wrap?, alignment: Alignment?, spacingBuilder: SpacingBuilder) :
    GDScriptBlock(node, wrap, alignment, spacingBuilder) {
    override fun getIndent(): Indent? {
        return Indent.getNormalIndent()
    }
}
