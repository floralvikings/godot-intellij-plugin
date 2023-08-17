package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.intellij.formatting.Alignment
import com.intellij.formatting.ChildAttributes
import com.intellij.formatting.Indent
import com.intellij.formatting.SpacingBuilder
import com.intellij.formatting.Wrap
import com.intellij.lang.ASTNode
import com.intellij.openapi.diagnostic.Logger

class GDScriptFileBlock(node: ASTNode, wrap: Wrap?, alignment: Alignment?, spacingBuilder: SpacingBuilder) :
    GDScriptBlock(node, wrap, alignment, spacingBuilder, Indent.getNormalIndent()) {
        
    private val log = Logger.getInstance(GDScriptFileBlock::class.java)
    
    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        log.debug("Retrieving GDScriptFileBlock child attributes")
        if(newChildIndex <= 0) {
            return ChildAttributes(Indent.getNoneIndent(), Alignment.createAlignment())
        }
        val prevBlock = subBlocks[newChildIndex - 1]
        if(prevBlock != null) {
            return prevBlock.getChildAttributes(prevBlock.subBlocks.size)
        }
        return ChildAttributes(Indent.getNoneIndent(), Alignment.createAlignment())
    }
}
