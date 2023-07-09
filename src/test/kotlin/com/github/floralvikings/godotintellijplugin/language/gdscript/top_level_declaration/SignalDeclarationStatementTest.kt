package com.github.floralvikings.godotintellijplugin.language.gdscript.top_level_declaration

import com.github.floralvikings.godotintellijplugin.language.gdscript.GDScriptParsingTestCase

class SignalDeclarationStatementTest : GDScriptParsingTestCase("top_level_declaration/signal_declaration") {
    fun test_parameterized_signal_declaration() = doTest(true, true)
    fun test_simple_signal_declaration() = doTest(true, true)
}
