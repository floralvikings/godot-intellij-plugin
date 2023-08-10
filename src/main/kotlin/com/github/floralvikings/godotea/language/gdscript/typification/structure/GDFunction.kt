package com.github.floralvikings.godotea.language.gdscript.typification.structure

import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDvoid

open class GDFunction(
    val name: String,
    val parameters: List<GDParameter>,
    val returnType: String = GDvoid.name
) : GDDeclaration {
    constructor(function: GDFunction) : this(function.name, function.parameters, function.returnType)

    constructor(name: String, configure: FunctionBuilder.() -> Unit)
            : this(FunctionBuilder(name).apply(configure).build())

    override fun toString(): String {
        return "GDScriptFunction(name='$name', parameters=$parameters, returnType=$returnType)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GDFunction) return false

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
