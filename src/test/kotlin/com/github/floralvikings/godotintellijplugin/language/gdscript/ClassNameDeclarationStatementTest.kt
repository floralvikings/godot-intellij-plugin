package com.github.floralvikings.godotintellijplugin.language.gdscript

class ClassNameDeclarationStatementTest :
    GDScriptParsingTestCase("top_level_declaration/class_name_declaration") {
    fun test_class_name_declaration() = doTest(true, true)
}