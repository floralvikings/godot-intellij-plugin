package com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder

import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDType

object GDUnknownType: GDType("<UNKNOWN>") {
    override fun toString(): String = "GDUnknownType"
}
