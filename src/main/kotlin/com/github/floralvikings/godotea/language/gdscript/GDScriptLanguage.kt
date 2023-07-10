package com.github.floralvikings.godotea.language.gdscript

import com.intellij.lang.Language

class GDScriptLanguage private constructor() : Language("GDScript") {
    companion object {
        val INSTANCE = GDScriptLanguage()
    }

}