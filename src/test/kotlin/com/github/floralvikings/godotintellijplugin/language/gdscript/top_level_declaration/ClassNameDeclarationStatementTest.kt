package com.github.floralvikings.godotintellijplugin.language.gdscript.top_level_declaration

import com.github.floralvikings.godotintellijplugin.language.gdscript.GDScriptParsingTestCase

class ClassNameDeclarationStatementTest :
    GDScriptParsingTestCase("top_level_declaration/class_name_declaration") {
    fun test_class_name_declaration() = doTest(true, true)
}
