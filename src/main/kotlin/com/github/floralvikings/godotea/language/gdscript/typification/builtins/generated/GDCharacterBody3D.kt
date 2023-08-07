
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCharacterBody3D: GDType("CharacterBody3D", {

"floor_block_on_wall"(GDbool)
"floor_constant_speed"(GDbool)
"floor_max_angle"(GDfloat)
"floor_snap_length"(GDfloat)
"floor_stop_on_slope"(GDbool)
"max_slides"(GDint)
"motion_mode"(GDMotionMode)
"platform_floor_layers"(GDint)
"platform_on_leave"(GDPlatformOnLeave)
"platform_wall_layers"(GDint)
"safe_margin"(GDfloat)
"slide_on_ceiling"(GDbool)
"up_direction"(GDVector3)
"velocity"(GDVector3)
"wall_min_slide_angle"(GDfloat)
constructor { }

func("apply_floor_snap") {
returns(GDvoid)

}

func("get_floor_angle") {
returns(GDfloat)
"up_direction"(GDVector3)
}

func("get_floor_normal") {
returns(GDVector3)

}

func("get_last_motion") {
returns(GDVector3)

}

func("get_last_slide_collision") {
returns(GDKinematicCollision3D)

}

func("get_platform_angular_velocity") {
returns(GDVector3)

}

func("get_platform_velocity") {
returns(GDVector3)

}

func("get_position_delta") {
returns(GDVector3)

}

func("get_real_velocity") {
returns(GDVector3)

}

func("get_slide_collision") {
returns(GDKinematicCollision3D)
"slide_idx"(GDint)
}

func("get_slide_collision_count") {
returns(GDint)

}

func("get_wall_normal") {
returns(GDVector3)

}

func("is_on_ceiling") {
returns(GDbool)

}

func("is_on_ceiling_only") {
returns(GDbool)

}

func("is_on_floor") {
returns(GDbool)

}

func("is_on_floor_only") {
returns(GDbool)

}

func("is_on_wall") {
returns(GDbool)

}

func("is_on_wall_only") {
returns(GDbool)

}

func("move_and_slide") {
returns(GDbool)

}
}){

}