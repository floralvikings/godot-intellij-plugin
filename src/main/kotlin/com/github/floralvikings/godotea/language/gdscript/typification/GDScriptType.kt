package com.github.floralvikings.godotea.language.gdscript.typification

data class GDScriptType(
    val name: String,
    val variables: List<GDScriptVariable> = emptyList(),
    val functions: List<GDScriptFunction> = emptyList(),
    val superType: GDScriptType? = null
) {
    companion object {
        val VOID = GDScriptType("void")
    }
}
