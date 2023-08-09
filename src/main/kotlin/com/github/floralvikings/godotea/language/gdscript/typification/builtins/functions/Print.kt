package com.github.floralvikings.godotea.language.gdscript.typification.builtins.functions

import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDvoid
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDFunction

object Print : GDFunction("print", {
    returns(GDvoid.name)
    "args"()
})
