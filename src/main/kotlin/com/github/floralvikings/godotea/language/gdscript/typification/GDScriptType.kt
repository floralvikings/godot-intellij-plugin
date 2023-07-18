package com.github.floralvikings.godotea.language.gdscript.typification

data class GDScriptType(
    val name: String,
    val constructors: List<GDScriptConstructor> = listOf(GDScriptConstructor()),
    val fields: List<GDScriptField> = emptyList(),
    val functions: List<GDScriptFunction> = emptyList(),
    val superType: GDScriptType? = null
)
