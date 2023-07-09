package com.github.floralvikings.godotintellijplugin.language.gdscript

import com.github.floralvikings.godotintellijplugin.language.gdscript.parser.GDScriptParserDefinition
import com.intellij.testFramework.ParsingTestCase

abstract class GDScriptParsingTestCase(val dataPath: String) : ParsingTestCase(dataPath, "gd", GDScriptParserDefinition()){
    override fun getTestDataPath(): String = "src/test/resources/gdscript"

    override fun skipSpaces(): Boolean = false

    override fun includeRanges(): Boolean = true
}