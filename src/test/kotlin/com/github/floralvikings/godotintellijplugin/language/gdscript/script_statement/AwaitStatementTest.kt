package com.github.floralvikings.godotintellijplugin.language.gdscript.script_statement

import com.github.floralvikings.godotintellijplugin.language.gdscript.GDScriptParsingTestCase

class AwaitStatementTest : GDScriptParsingTestCase("script_statement/await_statement") {
    fun test_signal_await_statement() = doTest(true, true)
    fun test_simple_await_statement() = doTest(true, true)
    fun test_var_assignment_await_statement() = doTest(true, true)
    fun test_var_declaration_await_statement() = doTest(true, true)
}
