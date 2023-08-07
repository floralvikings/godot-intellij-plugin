
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRandomNumberGenerator: GDType("RandomNumberGenerator", {

"seed"(GDint)
"state"(GDint)
constructor { }

func("randf") {
returns(GDfloat)

}

func("randf_range") {
returns(GDfloat)
"from"(GDfloat)
"to"(GDfloat)
}

func("randfn") {
returns(GDfloat)
"mean"(GDfloat)
"deviation"(GDfloat)
}

func("randi") {
returns(GDint)

}

func("randi_range") {
returns(GDint)
"from"(GDint)
"to"(GDint)
}

func("randomize") {
returns(GDvoid)

}
}){

}