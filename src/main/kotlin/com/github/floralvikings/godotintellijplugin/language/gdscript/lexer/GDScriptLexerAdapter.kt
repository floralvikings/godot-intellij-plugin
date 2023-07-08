package com.github.floralvikings.godotintellijplugin.language.gdscript.lexer

import com.github.floralvikings.godotintellijplugin.language.gdscript._GDScriptLexer
import com.intellij.lexer.FlexAdapter

class GDScriptLexerAdapter : FlexAdapter(_GDScriptLexer(null))
