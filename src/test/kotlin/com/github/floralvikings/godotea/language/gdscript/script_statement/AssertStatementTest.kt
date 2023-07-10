package com.github.floralvikings.godotea.language.gdscript.script_statement

import com.github.floralvikings.godotea.language.gdscript.GDScriptParsingTestCase

class AssertStatementTest : GDScriptParsingTestCase("script_statement/assert_statement") {
    fun test_assert_statement_no_message() = doTest(true, true)
    fun test_assert_statement_with_message() = doTest(true, true)
}
