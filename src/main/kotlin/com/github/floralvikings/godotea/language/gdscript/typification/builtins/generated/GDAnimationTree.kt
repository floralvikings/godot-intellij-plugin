
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimationTree: GDType("AnimationTree", {

"active"(GDbool)
"advance_expression_base_node"(GDNodePath)
"anim_player"(GDNodePath)
"audio_max_polyphony"(GDint)
"process_callback"(GDAnimationProcessCallback)
"root_motion_track"(GDNodePath)
"tree_root"(GDAnimationNode)
constructor { }

func("_post_process_key_value") {
returns(GDVariant)
"animation"(GDAnimation)
"track"(GDint)
"value"(GDVariant)
"object"(GDObject)
"object_idx"(GDint)
}

func("advance") {
returns(GDvoid)
"delta"(GDfloat)
}

func("get_root_motion_position") {
returns(GDVector3)

}

func("get_root_motion_position_accumulator") {
returns(GDVector3)

}

func("get_root_motion_rotation") {
returns(GDQuaternion)

}

func("get_root_motion_rotation_accumulator") {
returns(GDQuaternion)

}

func("get_root_motion_scale") {
returns(GDVector3)

}

func("get_root_motion_scale_accumulator") {
returns(GDVector3)

}
}){

}