package com.github.floralvikings.godotea.language.gdscript.lexer

import grammars._GDScriptLexer
import com.intellij.lexer.FlexAdapter

class GDScriptLexerAdapter : FlexAdapter(_GDScriptLexer(null))
