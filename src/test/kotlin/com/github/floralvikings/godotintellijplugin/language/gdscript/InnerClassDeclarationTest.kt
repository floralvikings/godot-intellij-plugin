package com.github.floralvikings.godotintellijplugin.language.gdscript

import com.github.floralvikings.godotintellijplugin.GDScriptParsingTestCase

class InnerClassDeclarationTest :
    GDScriptParsingTestCase("top_level_declaration/inner_class_declaration") {
    fun test_inner_class() = doTest(true, true)
    fun test_inner_class_extends() = doTest(true, true)
    fun test_inner_class_inner_extends() = doTest(true, true)
    fun test_inner_class_with_function() = doTest(true, true)
}