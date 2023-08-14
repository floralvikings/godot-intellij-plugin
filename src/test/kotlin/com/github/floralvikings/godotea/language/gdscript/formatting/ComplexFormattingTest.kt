package com.github.floralvikings.godotea.language.gdscript.formatting

class ComplexFormattingTest : GDScriptFormattingTestBase() {
    fun test_enter_after_statement_in_if_block() = doInsertTextTest("\n")
}