package com.github.floralvikings.godotea.language.gdscript.highlighter

import com.github.floralvikings.godotea.language.gdscript.lexer.GDScriptLexerAdapter
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
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
        val keywords = setOf(
            VAR, CONST, CLASS, ENUM, FUNC, IF, ELIF, ELSE, FOR, WHILE, CONTINUE, PASS, RETURN, MATCH, ASSERT, AWAIT,
            BREAKPOINT,
            GDScriptTypes.CLASS_NAME, EXTENDS, SUPER, SELF, SIGNAL, STATIC, SET, GET, TRUE, FALSE, NULL, AND, OR, NOT,
            INT, FLOAT, BOOL, VOID, IN, IS, AS
        )
        val stringLiterals = setOf(
            DOUBLE_QUOTED_STRING, SINGLE_QUOTED_STRING, MULTILINE_DOUBLE_QUOTED_STRING, MULTILINE_SINGLE_QUOTED_STRING
        )
        val numberLiterals = setOf(
            REAL_NUMBER, BINARY_NUMBER, HEXADECIMAL_NUMBER
        )
        val annotations = setOf(
            AT_EXPORT, AT_EXPORT_CATEGORY, AT_EXPORT_COLOR_NO_ALPHA, AT_EXPORT_DIR, AT_EXPORT_ENUM,
            AT_EXPORT_EXP_EASING, AT_EXPORT_FILE, AT_EXPORT_FLAGS, AT_EXPORT_FLAGS_2D_NAVIGATION,
            AT_EXPORT_FLAGS_2D_PHYSICS, AT_EXPORT_FLAGS_2D_RENDER, AT_EXPORT_FLAGS_3D_NAVIGATION,
            AT_EXPORT_FLAGS_3D_PHYSICS, AT_EXPORT_FLAGS_3D_RENDER, AT_EXPORT_FLAGS_AVOIDANCE, AT_EXPORT_GLOBAL_DIR,
            AT_EXPORT_GLOBAL_FILE, AT_EXPORT_GROUP, AT_EXPORT_MULTILINE, AT_EXPORT_NODE_PATH, AT_EXPORT_PLACEHOLDER,
            AT_EXPORT_RANGE, AT_EXPORT_SUBGROUP, AT_ICON, AT_ONREADY, AT_RPC, AT_STATIC_UNLOAD, AT_TOOL,
            AT_WARNING_IGNORE
        )
        return when (tokenType) {
            in keywords -> KEYWORD_KEYS
            in stringLiterals -> STRING_LITERAL_KEYS
            in numberLiterals -> NUMBER_LITERAL_KEYS
            in annotations    -> ANNOTATION_KEYS
            LINE_COMMENT -> LINE_COMMENT_KEYS
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
        val ANNOTATION_KEY = createTextAttributesKey("GDSCRIPT_ANNOTATION", DefaultLanguageHighlighterColors.METADATA)
        val FUNCTION_DECLARATION = createTextAttributesKey("GDSCRIPT_FUNCTION_DECLARATION", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION)
        val CLASS_NAME = createTextAttributesKey("GDSCRIPT_CLASS_DECLARATION", DefaultLanguageHighlighterColors.CLASS_NAME)
        val BAD_CHARACTER_KEY = createTextAttributesKey("GDSCRIPT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        val KEYWORD_KEYS = arrayOf(KEYWORD_KEY)
        val LINE_COMMENT_KEYS = arrayOf(LINE_COMMENT_KEY)
        val STRING_LITERAL_KEYS = arrayOf(STRING_LITERAL_KEY)
        val NUMBER_LITERAL_KEYS = arrayOf(NUMBER_LITERAL_KEY)
        val BAD_CHARACTER_KEYS = arrayOf(BAD_CHARACTER_KEY)
        val ANNOTATION_KEYS = arrayOf(ANNOTATION_KEY)
        val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }
}