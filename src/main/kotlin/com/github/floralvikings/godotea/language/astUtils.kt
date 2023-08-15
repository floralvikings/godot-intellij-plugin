package com.github.floralvikings.godotea.language

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.github.floralvikings.godotea.language.gdscript.util.nextNonWhitespaceSibling
import com.intellij.formatting.ASTBlock
import com.intellij.lang.ASTNode
import com.intellij.psi.TokenType
import com.intellij.psi.impl.source.tree.TreeUtil
import com.intellij.psi.util.elementType

inline fun <reified T : Any> Any?.safeAs(): T? = this as? T

val ASTNode.lastNonWhitespaceChildNode: ASTNode?
    get() {
        var last = lastChildNode
        while(last != null && last.elementType == TokenType.WHITE_SPACE) {
            last = last.treePrev
        }
        return last
    }

val ASTNode.treePrevNonLineBreak: ASTNode?
    get() {
        var prev = treePrev
        while(prev != null) {
            if(prev.elementType != GDScriptTypes.LINE_BREAK) {
                return prev
            }
            prev = prev.treePrev
        }
        return null
    }

fun ASTBlock.requireNode() = node ?: error("ASTBlock.getNode() returned null")

fun ASTNode.children() = generateSequence(firstChildNode) { node -> node.treeNext }

fun ASTNode.siblings(forward: Boolean = true): Sequence<ASTNode> {
    if (forward) {
        return generateSequence(treeNext) { it.treeNext }
    } else {
        return generateSequence(treePrev) { it.treePrev }
    }
}

fun ASTNode.parents() = generateSequence(treeParent) { node -> node.treeParent }

fun ASTNode.leaves(forward: Boolean = true): Sequence<ASTNode> {
    if (forward) {
        return generateSequence(TreeUtil.nextLeaf(this)) { TreeUtil.nextLeaf(it) }
    } else {
        return generateSequence(TreeUtil.prevLeaf(this)) { TreeUtil.prevLeaf(it) }
    }
}

fun ASTNode.countFollowingNewlines(): Int {
    var count = 0
    var current = psi.nextNonWhitespaceSibling
    while(current?.elementType == GDScriptTypes.LINE_BREAK) {
        count++
        current = current?.nextNonWhitespaceSibling
    }
    return count
}
