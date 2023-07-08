package com.github.floralvikings.godotintellijplugin.language.gdscript

class ClassVarDeclarationStatementTest : GDScriptParsingTestCase("top_level_declaration/class_var_declaration") {
    fun test_annotated_class_var_declaration_statement() = doTest(true, true)
    fun test_block_set_get_class_var_declaration_statement() = doTest(true, true);
    fun test_multiple_class_var_declaration_statements() = doTest(true, true)
    fun test_newline_annotated_class_var_declaration_statement() = doTest(true, true)
    fun test_set_get_class_var_declaration_statement() = doTest(true, true)
    fun test_simple_class_var_declaration_statement() = doTest(true, true)
    fun test_string_literal_class_var_declaration_statement() = doTest(true, true)
    fun test_typed_class_var_declaration_statement() = doTest(true, true)
}