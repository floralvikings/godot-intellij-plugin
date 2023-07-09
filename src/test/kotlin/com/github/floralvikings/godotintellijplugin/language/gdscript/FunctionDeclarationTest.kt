package com.github.floralvikings.godotintellijplugin.language.gdscript

class FunctionDeclarationTest : GDScriptParsingTestCase("top_level_declaration/function_declaration") {
    fun test_function_declaration_with_parameters() = doTest(true, true)
    fun test_indented_function_declaration() = doTest(true, true);
    fun test_multi_statement_function_declaration() = doTest(true, true)
    fun test_multiple_function_declarations() = doTest(true, true)
    fun test_simple_function_declaration() = doTest(true, true);
}