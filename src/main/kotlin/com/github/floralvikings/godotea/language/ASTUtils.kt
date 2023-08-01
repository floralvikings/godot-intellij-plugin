package com.github.floralvikings.godotea.language

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.lang.ASTNode
import com.intellij.psi.TokenType

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
