package com.github.floralvikings.godotea.language.gdscript.typification

data class GDScriptConstructor(val parameters: List<GDScriptParameter> = emptyList()) {
    constructor(vararg params: GDScriptParameter): this(params.toList())
}
