package com.github.floralvikings.godotea.language.gdscript.parser.top_level_declaration

import com.github.floralvikings.godotea.language.gdscript.GDScriptParsingTestCase

class ExtendsDeclarationStatementTest :
    GDScriptParsingTestCase("top_level_declaration/extends_declaration") {
    fun test_extends_declaration() = doTest(true, true)
}
