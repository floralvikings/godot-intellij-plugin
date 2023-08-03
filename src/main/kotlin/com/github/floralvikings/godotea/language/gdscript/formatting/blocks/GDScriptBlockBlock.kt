package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.formatting.Alignment
import com.intellij.formatting.Indent
import com.intellij.formatting.SpacingBuilder
import com.intellij.formatting.Wrap
import com.intellij.lang.ASTNode
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.util.elementType

class GDScriptBlockBlock(node: ASTNode, wrap: Wrap?, alignment: Alignment?, spacingBuilder: SpacingBuilder) :
    GDScriptBlock(node, wrap, alignment, spacingBuilder, Indent.getNormalIndent()) {
    private val log = Logger.getInstance(GDScriptBlockBlock::class.java)
        
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
        log.warn("Incomplete GDScriptBlockBlock: $incomplete")
        return incomplete
    }
}