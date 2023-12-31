package com.github.floralvikings.godotea.language.gdscript.parser.script_statement

import com.github.floralvikings.godotea.language.gdscript.GDScriptParsingTestCase

class IfStatementTest : GDScriptParsingTestCase("script_statement/if_statement") {
    fun test_if_elif_statement() = doTest(true, true)
    fun test_if_elif_statement_inline() = doTest(true, true)
    fun test_if_else_statement() = doTest(true, true)
    fun test_if_else_statement_inline() = doTest(true, true)
    fun test_if_statement_with_comparison() = doTest(true, true)
    fun test_simple_if_statement() = doTest(true, true)
    fun test_simple_if_statement_inline() = doTest(true, true)
    fun test_simple_negated_if_statement() = doTest(true, true)
}
