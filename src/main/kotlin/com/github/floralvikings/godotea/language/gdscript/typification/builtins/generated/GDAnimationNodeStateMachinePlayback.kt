
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimationNodeStateMachinePlayback: GDType("AnimationNodeStateMachinePlayback", {

"resource_local_to_scene"(GDbool)
constructor { }

func("get_current_length") {
returns(GDfloat)

}

func("get_current_node") {
returns(GDStringName)

}

func("get_current_play_position") {
returns(GDfloat)

}

func("get_fading_from_node") {
returns(GDStringName)

}

func("get_travel_path") {
returns(GDTypedArray(GDStringName::class))

}

func("is_playing") {
returns(GDbool)

}

func("next") {
returns(GDvoid)

}

func("start") {
returns(GDvoid)
"node"(GDStringName)
"reset"(GDbool)
}

func("stop") {
returns(GDvoid)

}

func("travel") {
returns(GDvoid)
"to_node"(GDStringName)
"reset_on_teleport"(GDbool)
}
}){

}