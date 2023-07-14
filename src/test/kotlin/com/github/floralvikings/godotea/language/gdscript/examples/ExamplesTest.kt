package com.github.floralvikings.godotea.language.gdscript.examples

import com.github.floralvikings.godotea.language.gdscript.GDScriptParsingTestCase

class ExamplesTest : GDScriptParsingTestCase("examples") {
    fun test_array_example() = doTest(true, true)
    fun test_dictionary_example() = doTest(true, true)
    fun test_dictionary_key_addition_example() = doTest(true, true)
    fun test_export_annotation_example() = doTest(true, true);
    fun test_export_annotation_with_constant_argument() = doTest(true, true)
    fun test_gdscript_example() = doTest(true, true)
    fun test_inheritance_example() = doTest(true, true)
    fun test_lambda_example_named() = doTest(true, true)
    fun test_lambda_example_simple() = doTest(true, true)
    fun test_lua_dictionary_example() = doTest(true, true)
    fun test_multiple_annotations_example() = doTest(true, true)
    fun test_onready_var_example() = doTest(true, true)
    fun test_static_function_example() = doTest(true, true)
    fun test_var_declaration_examples() = doTest(true, true)
}