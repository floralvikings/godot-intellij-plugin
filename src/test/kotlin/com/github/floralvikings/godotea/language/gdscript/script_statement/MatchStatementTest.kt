package com.github.floralvikings.godotea.language.gdscript.script_statement

import com.github.floralvikings.godotea.language.gdscript.GDScriptParsingTestCase

class MatchStatementTest : GDScriptParsingTestCase("script_statement/match_statement") {
    fun test_array_pattern_match_statement() = doTest(true, true)
    fun test_array_pattern_match_statement_inline() = doTest(true, true)
    fun test_binding_pattern_match_statement() = doTest(true, true)
    fun test_binding_pattern_match_statement_inline() = doTest(true, true)
    fun test_constant_pattern_match_statement() = doTest(true, true)
    fun test_constant_pattern_match_statement_inline() = doTest(true, true)
    fun test_dictionary_pattern_match_statement() = doTest(true, true)
    fun test_dictionary_pattern_match_statement_inline() = doTest(true, true)
    fun test_multiple_pattern_match_statement() = doTest(true, true)
    fun test_multiple_pattern_match_statement_inline() = doTest(true, true)
    fun test_variable_pattern_match_statement() = doTest(true, true)
    fun test_variable_pattern_match_statement_inline() = doTest(true, true)
    fun test_wildcard_pattern_match_statement() = doTest(true, true)
    fun test_wildcard_pattern_match_statement_inline() = doTest(true, true)
}

