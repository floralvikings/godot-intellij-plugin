package com.github.floralvikings.godotintellijplugin.language.gdscript.parser

import com.intellij.lang.PsiBuilder
import com.intellij.lang.PsiParser
import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.util.Key
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap


@Suppress("ACCIDENTAL_OVERRIDE")
class GDScriptParserUtil : GeneratedParserUtilBase() {
    class ParserState(private val builder: PsiBuilder) {
        private val tokIndentCache: Int2IntOpenHashMap = Int2IntOpenHashMap()
        var currentIndent = 0

        private fun getPrecedingWhiteSpace(): String {
            var wsOffset = 0
            while (builder.rawLookup(wsOffset - 1) === TokenType.WHITE_SPACE) --wsOffset
            val wsStart = builder.rawTokenTypeStart(wsOffset)
            return builder.originalText.subSequence(wsStart, builder.currentOffset).toString()
        }

        fun getTokenIndent(): Int {
            val tokStart = builder.currentOffset
            if (tokIndentCache.containsKey(tokStart)) {
                return tokIndentCache.get(tokStart)
            }
            val ws = getPrecedingWhiteSpace()
            val indent = ws.length
            tokIndentCache.put(tokStart, indent)
            return indent
        }

    }

    companion object {
        private val log = Logger.getInstance(GDScriptParserUtil::class.java)

        val PARSER_STATE_KEY: Key<ParserState> = Key("parser-state")

        private fun getParserState(builder: PsiBuilder): ParserState? {
            return builder.getUserData(PARSER_STATE_KEY)
        }

        @JvmStatic
        fun indented(builder: PsiBuilder, level: Int, parser: Parser): Boolean {
            val state = getParserState(builder) ?: return false
            val tokIndent: Int = state.getTokenIndent()
            log.warn("Indenting section to $tokIndent; current indent: ${state.currentIndent}")
            if (tokIndent > state.currentIndent) {
                val prevIndent: Int = state.currentIndent
                state.currentIndent = tokIndent
                log.warn("Indentation changed from $prevIndent to $tokIndent")
                log.warn("Parsing with $parser")
                val result = parser.parse(builder, level + 1)
                log.warn("Indentation changed from ${state.currentIndent} to $prevIndent")
                state.currentIndent = prevIndent
                return result
            }
            return false
        }

        @JvmStatic
        fun indEq(builder: PsiBuilder, level: Int): Boolean {
            val state = getParserState(builder) ?: return false
            return state.getTokenIndent() == state.currentIndent
        }

        @JvmStatic
        fun indLt(builder: PsiBuilder?, level: Int): Boolean {
            val state = getParserState(builder!!)
            val tokenIndent = state!!.getTokenIndent()
            return tokenIndent >= 0 && tokenIndent < state.currentIndent
        }

        @JvmStatic
        fun indGt(builder: PsiBuilder?, level: Int): Boolean {
            val state = getParserState(builder!!)
            return state!!.getTokenIndent() > state.currentIndent
        }

        @JvmStatic
        fun indNone(builder: PsiBuilder?, level: Int): Boolean {
            val state = getParserState(builder!!)
            return state!!.getTokenIndent() == -1
        }

        @JvmStatic
        fun indOpt(builder: PsiBuilder?, level: Int): Boolean {
            val state = getParserState(builder!!)
            val tokInd = state!!.getTokenIndent()
            return tokInd == -1 || tokInd > state.currentIndent
        }


        @JvmStatic
        fun adapt_builder_(
            root: IElementType?,
            builder: PsiBuilder?,
            parser: PsiParser?,
            extendsSets: Array<TokenSet?>?
        ): PsiBuilder? {
            log.warn("Adapting PSI Builder to track parser state")
            val psiBuilder = GeneratedParserUtilBase.adapt_builder_(root, builder, parser, extendsSets)
            val state = ParserState(psiBuilder)
            psiBuilder.putUserData(PARSER_STATE_KEY, state)
            return psiBuilder
        }
    }
}