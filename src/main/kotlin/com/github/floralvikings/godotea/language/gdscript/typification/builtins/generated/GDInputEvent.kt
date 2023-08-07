
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDInputEvent: GDType("InputEvent", {

"device"(GDint)
constructor { }

func("accumulate") {
returns(GDbool)
"with_event"(GDSameType)
}

func("as_text") {
returns(GDString)

}

func("get_action_strength") {
returns(GDfloat)
"action"(GDStringName)
"exact_match"(GDbool)
}

func("is_action") {
returns(GDbool)
"action"(GDStringName)
"exact_match"(GDbool)
}

func("is_action_pressed") {
returns(GDbool)
"action"(GDStringName)
"allow_echo"(GDbool)
"exact_match"(GDbool)
}

func("is_action_released") {
returns(GDbool)
"action"(GDStringName)
"exact_match"(GDbool)
}

func("is_action_type") {
returns(GDbool)

}

func("is_canceled") {
returns(GDbool)

}

func("is_echo") {
returns(GDbool)

}

func("is_match") {
returns(GDbool)
"event"(GDSameType)
"exact_match"(GDbool)
}

func("is_pressed") {
returns(GDbool)

}

func("is_released") {
returns(GDbool)

}

func("xformed_by") {
returns(GDSameType)
"xform"(GDTransform2D)
"local_ofs"(GDVector2)
}
}){

}