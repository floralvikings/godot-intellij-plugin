package com.github.floralvikings.godotea.language.gdscript.formatting

class FunctionDeclarationFormattingTest : GDScriptFormattingTestBase() {

    fun test_new_line_after_function_declaration() = doInsertTextTest("\n")
    
    fun test_new_line_after_function_body_eof() = doInsertTextTest("\n")

    fun test_new_line_before_function_body() = doInsertTextTest("\n")

    fun test_new_line_in_function_body() = doInsertTextTest("\n")

    fun test_second_new_line_after_function_declaration_indent() = doInsertTextTest("\n")

    fun test_third_new_line_after_function_declaration_indent() = doInsertTextTest("\n")
}
