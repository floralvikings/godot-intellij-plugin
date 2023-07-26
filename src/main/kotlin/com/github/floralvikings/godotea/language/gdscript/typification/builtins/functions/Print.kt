package com.github.floralvikings.godotea.language.gdscript.typification.builtins.functions

import com.github.floralvikings.godotea.language.gdscript.typification.builtins.basic.GDVoid
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDFunction

object Print : GDFunction("print", {
    returns(GDVoid)
    "args"()
})
