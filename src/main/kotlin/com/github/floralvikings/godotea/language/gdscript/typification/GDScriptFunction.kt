package com.github.floralvikings.godotea.language.gdscript.typification

data class GDScriptFunction(val name: String, val parameters: List<GDScriptParameter>, val returnType: GDScriptType = GDScriptType.VOID)
