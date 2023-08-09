package com.github.floralvikings.godotea.language.gdscript.typification.builtins.vector

import com.github.floralvikings.godotea.language.gdscript.typification.builtins.basic.GDFloat
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDType

object GDVector2: GDType("Vector2", {
    "x"(GDFloat.name)
    "y"(GDFloat.name)

    constructor { }
    constructor { "from"("Vector2") }
    constructor { "from"("Vector2i") }
    constructor {
        "x"("float")
        "y"("float")
    }

    func("abs") { returns("Vector2") }
})
