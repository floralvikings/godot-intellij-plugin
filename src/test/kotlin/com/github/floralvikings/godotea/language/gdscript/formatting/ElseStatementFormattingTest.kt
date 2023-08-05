package com.github.floralvikings.godotea.language.gdscript.formatting

class ElseStatementFormattingTest : GDScriptFormattingTestBase() {

    fun test_dedent_after_else() = doInsertTextTest("\n")
    
    fun test_dedent_after_third_line_break() = doInsertTextTest("\n")

    fun test_new_line_after_else_statement() = doInsertTextTest("\n")

    fun test_new_line_after_complete_else_statement() = doInsertTextTest("\n")

    fun test_new_line_after_unindented_else_statement() = doInsertTextTest("\n")
    
    fun test_new_line_before_complete_else_statement() = doInsertTextTest("\n")
}