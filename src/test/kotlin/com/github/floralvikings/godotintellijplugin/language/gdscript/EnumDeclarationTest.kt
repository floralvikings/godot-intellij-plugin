package com.github.floralvikings.godotintellijplugin.language.gdscript

class EnumDeclarationTest : GDScriptParsingTestCase("top_level_declaration/enum_declaration") {
    fun test_inline_enum_declaration() = doTest(true, true)
    fun test_inline_enum_with_value_declaration() = doTest(true, true)
    fun test_multiline_enum_declaration() = doTest(true, true)
    fun test_multiline_enum_with_value_declaration() = doTest(true, true)
    fun test_named_enum_declaration() = doTest(true, true)
}