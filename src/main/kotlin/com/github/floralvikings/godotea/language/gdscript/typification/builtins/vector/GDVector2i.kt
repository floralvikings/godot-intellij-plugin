package com.github.floralvikings.godotea.language.gdscript.typification.builtins.vector

import com.github.floralvikings.godotea.language.gdscript.typification.builtins.basic.GDInt
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDSameType
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDType

object GDVector2i: GDType("Vector2i", {
    "x"(GDInt)
    "y"(GDInt)

    constructor {  }
    constructor { "from"(GDSameType) }
    constructor { "from"(GDVector2) }
    constructor {
        "x"(GDInt)
        "y"(GDInt)
    }
})
