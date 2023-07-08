package com.github.floralvikings.godotintellijplugin.language.gdscript

import com.intellij.lang.Language

class GDScriptLanguage private constructor() : Language("GDScript") {
    companion object {
        val INSTANCE = GDScriptLanguage()
    }

}