
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNode2D: GDType("Node2D", {

"global_position"(GDVector2)
"global_rotation"(GDfloat)
"global_rotation_degrees"(GDfloat)
"global_scale"(GDVector2)
"global_skew"(GDfloat)
"global_transform"(GDTransform2D)
"position"(GDVector2)
"rotation"(GDfloat)
"rotation_degrees"(GDfloat)
"scale"(GDVector2)
"skew"(GDfloat)
"transform"(GDTransform2D)
constructor { }

func("apply_scale") {
returns(GDvoid)
"ratio"(GDVector2)
}

func("get_angle_to") {
returns(GDfloat)
"point"(GDVector2)
}

func("get_relative_transform_to_parent") {
returns(GDTransform2D)
"parent"(GDNode)
}

func("global_translate") {
returns(GDvoid)
"offset"(GDVector2)
}

func("look_at") {
returns(GDvoid)
"point"(GDVector2)
}

func("move_local_x") {
returns(GDvoid)
"delta"(GDfloat)
"scaled"(GDbool)
}

func("move_local_y") {
returns(GDvoid)
"delta"(GDfloat)
"scaled"(GDbool)
}

func("rotate") {
returns(GDvoid)
"radians"(GDfloat)
}

func("to_global") {
returns(GDVector2)
"local_point"(GDVector2)
}

func("to_local") {
returns(GDVector2)
"global_point"(GDVector2)
}

func("translate") {
returns(GDvoid)
"offset"(GDVector2)
}
}){

}