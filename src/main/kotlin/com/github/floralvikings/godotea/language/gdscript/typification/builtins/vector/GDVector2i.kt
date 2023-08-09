package com.github.floralvikings.godotea.language.gdscript.typification.builtins.vector

import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDType

object GDVector2i: GDType("Vector2i", {
    "x"("int")
    "y"("int")

    constructor {  }
    constructor { "from"("Vector2i") }
    constructor { "from"("Vector2") }
    constructor {
        "x"("int")
        "y"("int")
    }
})
