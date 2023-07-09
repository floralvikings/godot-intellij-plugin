package com.github.floralvikings.godotintellijplugin.language.gdscript

import com.github.floralvikings.godotintellijplugin.GDScriptParsingTestCase

class ExtendsDeclarationStatementTest :
    GDScriptParsingTestCase("top_level_declaration/extends_declaration") {
    fun test_extends_declaration() = doTest(true, true)
}