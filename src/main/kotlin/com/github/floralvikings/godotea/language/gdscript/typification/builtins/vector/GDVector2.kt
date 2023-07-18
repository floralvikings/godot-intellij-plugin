package com.github.floralvikings.godotea.language.gdscript.typification.builtins.vector

import com.github.floralvikings.godotea.language.gdscript.typification.builtins.basic.GDFloat
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.basic.GDInt
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDScriptType

object GDVector2: GDScriptType("Vector2", {
    "x"(GDFloat)
    "y"(GDFloat)

    constructor { }
    constructor { "from"(GDVector2) }
    constructor { "from"(GDVector2i) }
    constructor {
        "x"(GDInt)
        "y"(GDInt)
    }

    func("abs", GDVector2)
})
