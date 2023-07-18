package com.github.floralvikings.godotea.language.gdscript.typification.structure

import com.github.floralvikings.godotea.language.gdscript.typification.builtins.basic.GDVoid

open class GDScriptFunction(
    val name: String,
    val parameters: List<GDScriptParameter>,
    val returnType: GDScriptType = GDVoid
) {
    constructor(function: GDScriptFunction) : this(function.name, function.parameters, function.returnType)

    constructor(
        name: String,
        configure: FunctionBuilder.() -> Unit
    ) : this(
        FunctionBuilder(name, GDVoid).apply(configure).build()
    )

    constructor(name: String, returnType: GDScriptType = GDVoid, vararg params: GDScriptParameter) : this(
        name,
        params.toList(),
        returnType
    )

    override fun toString(): String {
        return "GDScriptFunction(name='$name', parameters=$parameters, returnType=$returnType)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GDScriptFunction) return false

        if (name != other.name) return false
        if (parameters != other.parameters) return false
        return returnType == other.returnType
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + parameters.hashCode()
        result = 31 * result + returnType.hashCode()
        return result
    }
}
