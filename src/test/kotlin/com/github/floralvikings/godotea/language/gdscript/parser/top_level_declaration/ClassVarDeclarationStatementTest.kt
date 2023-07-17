package com.github.floralvikings.godotea.language.gdscript.parser.top_level_declaration

import com.github.floralvikings.godotea.language.gdscript.GDScriptParsingTestCase

class ClassVarDeclarationStatementTest : GDScriptParsingTestCase("top_level_declaration/class_var_declaration") {
    fun test_annotated_class_var_declaration_statement() = doTest(true, true)
    fun test_block_set_get_class_var_declaration_statement() = doTest(true, true);
    fun test_lambda_class_var_declaration_named() = doTest(true, true)
    fun test_lambda_class_var_declaration_simple() = doTest(true, true)
    fun test_multiple_class_var_declaration_statements() = doTest(true, true)
    fun test_newline_annotated_class_var_declaration_statement() = doTest(true, true)
    fun test_set_get_class_var_declaration_statement() = doTest(true, true)
    fun test_simple_class_var_declaration_statement() = doTest(true, true)
    fun test_string_literal_class_var_declaration_statement() = doTest(true, true)
    fun test_typed_class_var_declaration_statement() = doTest(true, true)
}
