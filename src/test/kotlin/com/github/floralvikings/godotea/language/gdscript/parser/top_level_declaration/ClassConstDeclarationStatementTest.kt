package com.github.floralvikings.godotea.language.gdscript.parser.top_level_declaration

import com.github.floralvikings.godotea.language.gdscript.GDScriptParsingTestCase

class ClassConstDeclarationStatementTest : GDScriptParsingTestCase("top_level_declaration/class_const_declaration") {
    fun test_simple_class_constant_declaration_statement() = doTest(true, true)
    fun test_typed_class_constant_declaration_statement() = doTest(true, true)
}
