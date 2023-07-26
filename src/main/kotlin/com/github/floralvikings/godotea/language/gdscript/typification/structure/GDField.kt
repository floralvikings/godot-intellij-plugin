package com.github.floralvikings.godotea.language.gdscript.typification.structure

class GDField(val name: String, val type: GDType?) : GDDeclaration {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GDField) return false

        if (name != other.name) return false
        return type == other.type
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "GDScriptField(name='$name', type=${type?.name})"
    }
}
