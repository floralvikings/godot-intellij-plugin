package com.github.floralvikings.godotea.language.gdscript.formatting

class ElifStatementFormattingTest : GDScriptFormattingTestBase() {
    fun test_dedent_after_elif() = doInsertTextTest("\n")
    
    fun test_dedent_after_third_line_break() = doInsertTextTest("\n")
    
    fun test_new_line_after_elif_statement() = doInsertTextTest("\n")
    
    fun test_new_line_after_complete_elif_statement() = doInsertTextTest("\n")

    fun test_new_line_after_unindented_elif_statement() = doInsertTextTest("\n")
    
    fun test_new_line_before_complete_elif_statement() = doInsertTextTest("\n")
}