package com.github.floralvikings.godotea.language.gdscript.typification

data class GDScriptFunction(
    val name: String,
    val parameters: List<GDScriptParameter>,
    val returnType: GDScriptType = GDScriptBuiltIns.VOID
) {
    constructor(name: String, returnType: GDScriptType = GDScriptBuiltIns.VOID, vararg params: GDScriptParameter) : this(
        name,
        params.toList(),
        returnType
    )
}
