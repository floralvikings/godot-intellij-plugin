
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCurve: GDType("Curve", {

"bake_resolution"(GDint)
"max_value"(GDfloat)
"min_value"(GDfloat)
"point_count"(GDint)
constructor { }

func("add_point") {
returns(GDint)
"position"(GDVector2)
"left_tangent"(GDfloat)
"right_tangent"(GDfloat)
"left_mode"(GDTangentMode)
"right_mode"(GDTangentMode)
}

func("bake") {
returns(GDvoid)

}

func("clean_dupes") {
returns(GDvoid)

}

func("clear_points") {
returns(GDvoid)

}

func("get_point_left_mode") {
returns(GDTangentMode)
"index"(GDint)
}

func("get_point_left_tangent") {
returns(GDfloat)
"index"(GDint)
}

func("get_point_position") {
returns(GDVector2)
"index"(GDint)
}

func("get_point_right_mode") {
returns(GDTangentMode)
"index"(GDint)
}

func("get_point_right_tangent") {
returns(GDfloat)
"index"(GDint)
}

func("remove_point") {
returns(GDvoid)
"index"(GDint)
}

func("sample") {
returns(GDfloat)
"offset"(GDfloat)
}

func("sample_baked") {
returns(GDfloat)
"offset"(GDfloat)
}

func("set_point_left_mode") {
returns(GDvoid)
"index"(GDint)
"mode"(GDTangentMode)
}

func("set_point_left_tangent") {
returns(GDvoid)
"index"(GDint)
"tangent"(GDfloat)
}

func("set_point_offset") {
returns(GDint)
"index"(GDint)
"offset"(GDfloat)
}

func("set_point_right_mode") {
returns(GDvoid)
"index"(GDint)
"mode"(GDTangentMode)
}

func("set_point_right_tangent") {
returns(GDvoid)
"index"(GDint)
"tangent"(GDfloat)
}

func("set_point_value") {
returns(GDvoid)
"index"(GDint)
"y"(GDfloat)
}
}){

}