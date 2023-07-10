package com.github.floralvikings.godotea.language.gdscript.top_level_declaration

import com.github.floralvikings.godotea.language.gdscript.GDScriptParsingTestCase

class TopLevelAnnotationStatementTest :
    GDScriptParsingTestCase("top_level_declaration/top_level_annotation_declaration") {
    fun test_parameterized_top_level_annotation() = doTest(true, true)
    fun test_simple_top_level_annotation() = doTest(true, true)
    fun test_top_level_annotation_with_class_declaration() = doTest(true, true)
}
