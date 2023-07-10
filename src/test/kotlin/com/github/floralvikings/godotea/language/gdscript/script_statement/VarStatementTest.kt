package com.github.floralvikings.godotea.language.gdscript.script_statement

import com.github.floralvikings.godotea.language.gdscript.GDScriptParsingTestCase

class VarStatementTest : GDScriptParsingTestCase("script_statement/var_statement") {
    fun test_var_statement_assign() = doTest(true, true)
    fun test_var_statement_assign_inferred() = doTest(true, true)
    fun test_var_statement_no_assign() = doTest(true, true)
    fun test_var_statement_typed_assign() = doTest(true, true)
    fun test_var_statement_typed_no_assign() = doTest(true, true)
}
