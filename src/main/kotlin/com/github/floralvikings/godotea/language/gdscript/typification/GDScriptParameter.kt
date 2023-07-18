package com.github.floralvikings.godotea.language.gdscript.typification

data class GDScriptParameter(val name: String, val type: GDScriptType? = null, val vararg: Boolean = false)
