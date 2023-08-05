package com.github.floralvikings.godotea.language.gdscript.formatting

class IfStatementFormattingTest : GDScriptFormattingTestBase() {
    
    fun test_new_line_after_if_statement() = doInsertTextTest("\n")

    fun test_new_line_after_complete_if_statement() = doInsertTextTest("\n")

    fun test_third_new_line_after_if_statement_indent() = doInsertTextTest("\n")

    fun test_third_new_line_after_complete_if_statement_dedent() = doInsertTextTest("\n")
    
    fun test_new_line_before_complete_if_statement() = doInsertTextTest("\n")
    
    fun test_new_line_in_complete_if_statement() = doInsertTextTest("\n")
}