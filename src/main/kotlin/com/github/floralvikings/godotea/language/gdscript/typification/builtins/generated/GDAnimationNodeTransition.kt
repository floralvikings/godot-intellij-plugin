
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimationNodeTransition: GDType("AnimationNodeTransition", {

"allow_transition_to_self"(GDbool)
"input_count"(GDint)
"xfade_curve"(GDCurve)
"xfade_time"(GDfloat)
constructor { }

func("is_input_reset") {
returns(GDbool)
"input"(GDint)
}

func("is_input_set_as_auto_advance") {
returns(GDbool)
"input"(GDint)
}

func("set_input_as_auto_advance") {
returns(GDvoid)
"input"(GDint)
"enable"(GDbool)
}

func("set_input_reset") {
returns(GDvoid)
"input"(GDint)
"enable"(GDbool)
}
}){

}