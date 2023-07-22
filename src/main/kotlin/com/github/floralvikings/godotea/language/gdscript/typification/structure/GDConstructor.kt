package com.github.floralvikings.godotea.language.gdscript.typification.structure

data class GDConstructor(val parameters: List<GDParameter> = emptyList()) : GDDeclaration {
    constructor(vararg params: GDParameter): this(params.toList())
}
