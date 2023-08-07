package com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder

import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDType
import kotlin.reflect.KClass

class GDTypedArray<T : GDType> (val type: KClass<T>) 
    : GDType("${type.simpleName?.replace("^GD", "")}[]")