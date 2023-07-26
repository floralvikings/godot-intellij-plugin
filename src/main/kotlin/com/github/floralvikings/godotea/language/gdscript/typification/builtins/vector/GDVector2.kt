package com.github.floralvikings.godotea.language.gdscript.typification.builtins.vector

import com.github.floralvikings.godotea.language.gdscript.typification.builtins.basic.GDFloat
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.basic.GDInt
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDSameType
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDType

object GDVector2: GDType("Vector2", {
    "x"(GDFloat)
    "y"(GDFloat)

    constructor { }
    constructor { "from"(GDSameType) }
    constructor { "from"(GDVector2i) }
    constructor {
        "x"(GDInt)
        "y"(GDInt)
    }

    func("abs") { returns(GDSameType) }
})
