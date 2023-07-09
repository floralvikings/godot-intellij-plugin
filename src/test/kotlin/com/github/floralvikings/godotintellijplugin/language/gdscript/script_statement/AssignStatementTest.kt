package com.github.floralvikings.godotintellijplugin.language.gdscript.script_statement

import com.github.floralvikings.godotintellijplugin.language.gdscript.GDScriptParsingTestCase

class AssignStatementTest : GDScriptParsingTestCase("script_statement/assign_statement") {
    fun test_simple_assign_statement() = doTest(true, true)
}
