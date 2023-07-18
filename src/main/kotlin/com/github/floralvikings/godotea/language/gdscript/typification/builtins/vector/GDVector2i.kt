package com.github.floralvikings.godotea.language.gdscript.typification.builtins.vector

import com.github.floralvikings.godotea.language.gdscript.typification.builtins.basic.GDInt
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDScriptType

object GDVector2i: GDScriptType("Vector2i", {
    "x"(GDInt)
    "y"(GDInt)

    constructor {  }
    constructor { "from"(GDVector2i) }
    constructor { "from"(GDVector2) }
    constructor {
        "x"(GDInt)
        "y"(GDInt)
    }
})
