package com.github.floralvikings.godotea.language.gdscript.parser.script_statement

import com.github.floralvikings.godotea.language.gdscript.GDScriptParsingTestCase

class ForStatementTest : GDScriptParsingTestCase("script_statement/for_statement") {
    fun test_for_statement() = doTest(true, true)
    fun test_for_statement_inline() = doTest(true, true)
}

