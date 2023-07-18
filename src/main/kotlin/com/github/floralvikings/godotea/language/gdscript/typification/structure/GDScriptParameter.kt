package com.github.floralvikings.godotea.language.gdscript.typification.structure

class GDScriptParameter(val name: String, val type: GDScriptType? = null) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GDScriptParameter) return false

        if (name != other.name) return false
        return type == other.type
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "GDScriptParameter(name='$name', type=${type?.name})"
    }
}
