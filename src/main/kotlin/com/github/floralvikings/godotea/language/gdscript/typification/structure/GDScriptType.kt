package com.github.floralvikings.godotea.language.gdscript.typification.structure

open class GDScriptType(
    val name: String,
    val constructors: List<GDScriptConstructor> = listOf(GDScriptConstructor()),
    val fields: List<GDScriptField> = emptyList(),
    val functions: List<GDScriptFunction> = emptyList(),
    val superType: GDScriptType? = null
) {
    constructor(type: GDScriptType): this(type.name, type.constructors, type.fields, type.functions, type.superType)
    constructor(name: String, configure: TypeBuilder.() -> Unit): this(TypeBuilder(name).apply(configure).build())
    override fun toString(): String =
        "GDScriptType(name='$name', constructors=$constructors, fields=$fields, functions=$functions, superType=$superType)"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GDScriptType) return false

        if (name != other.name) return false
        if (constructors != other.constructors) return false
        if (fields != other.fields) return false
        if (functions != other.functions) return false
        return superType == other.superType
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + constructors.hashCode()
        result = 31 * result + fields.hashCode()
        result = 31 * result + functions.hashCode()
        result = 31 * result + (superType?.hashCode() ?: 0)
        return result
    }
}
