package com.github.floralvikings.godotintellijplugin.language.gdscript.top_level_declaration

import com.github.floralvikings.godotintellijplugin.language.gdscript.GDScriptParsingTestCase

class ExtendsDeclarationStatementTest :
    GDScriptParsingTestCase("top_level_declaration/extends_declaration") {
    fun test_extends_declaration() = doTest(true, true)
}
