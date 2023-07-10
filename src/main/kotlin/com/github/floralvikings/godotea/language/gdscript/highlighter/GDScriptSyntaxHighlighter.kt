package com.github.floralvikings.godotea.language.gdscript.highlighter

import com.github.floralvikings.godotea.language.gdscript.lexer.GDScriptLexerAdapter
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType.BAD_CHARACTER
import com.intellij.psi.tree.IElementType

class GDScriptSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = GDScriptLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when (tokenType) {
            VAR, CONST, ENUM, FUNC, IF, ELIF, ELSE, FOR, WHILE, MATCH, RETURN, CLASS_NAME, EXTENDS, SIGNAL, PASS, AWAIT,
                SUPER
                -> KEYWORD_KEYS
            LINE_COMMENT -> LINE_COMMENT_KEYS
            DOUBLE_QUOTED_STRING -> STRING_LITERAL_KEYS
            REAL_NUMBER, BINARY_NUMBER, HEXADECIMAL_NUMBER -> NUMBER_LITERAL_KEYS
            BAD_CHARACTER -> BAD_CHARACTER_KEYS
            else -> EMPTY_KEYS
        }
    }

    companion object {
        val KEYWORD_KEY = createTextAttributesKey("GDSCRIPT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val LINE_COMMENT_KEY =
            createTextAttributesKey("GDSCRIPT_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val STRING_LITERAL_KEY =
            createTextAttributesKey("GDSCRIPT_STRING_LITERAL", DefaultLanguageHighlighterColors.STRING)
        val NUMBER_LITERAL_KEY =
            createTextAttributesKey("GDSCRIPT_NUMBER_LITERAL", DefaultLanguageHighlighterColors.NUMBER)
        val BAD_CHARACTER_KEY = createTextAttributesKey("GDSCRIPT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        val KEYWORD_KEYS = arrayOf(KEYWORD_KEY)
        val LINE_COMMENT_KEYS = arrayOf(LINE_COMMENT_KEY)
        val STRING_LITERAL_KEYS = arrayOf(STRING_LITERAL_KEY)
        val NUMBER_LITERAL_KEYS = arrayOf(NUMBER_LITERAL_KEY)
        val BAD_CHARACTER_KEYS = arrayOf(BAD_CHARACTER_KEY)
        val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }
}