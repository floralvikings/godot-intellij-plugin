package com.github.floralvikings.godotea.language.gdscript.top_level_declaration

import com.github.floralvikings.godotea.language.gdscript.GDScriptParsingTestCase

class InnerClassDeclarationTest :
    GDScriptParsingTestCase("top_level_declaration/inner_class_declaration") {
    fun test_inner_class() = doTest(true, true)
    fun test_inner_class_extends() = doTest(true, true)
    fun test_inner_class_with_function() = doTest(true, true)
    fun test_inner_class_with_outer_class() = doTest(true, true)
}
