package com.github.floralvikings.godotea.language.gdscript.script_statement

import com.github.floralvikings.godotea.language.gdscript.GDScriptParsingTestCase

class ReturnStatementTest : GDScriptParsingTestCase("script_statement/return_statement") {
    fun test_return_statement() = doTest(true, true)
}
