
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCurve2D: GDType("Curve2D", {

"bake_interval"(GDfloat)
"point_count"(GDint)
constructor { }

func("add_point") {
returns(GDvoid)
"position"(GDVector2)
"in"(GDVector2)
"out"(GDVector2)
"index"(GDint)
}

func("clear_points") {
returns(GDvoid)

}

func("get_baked_length") {
returns(GDfloat)

}

func("get_baked_points") {
returns(GDPackedVector2Array)

}

func("get_closest_offset") {
returns(GDfloat)
"to_point"(GDVector2)
}

func("get_closest_point") {
returns(GDVector2)
"to_point"(GDVector2)
}

func("get_point_in") {
returns(GDVector2)
"idx"(GDint)
}

func("get_point_out") {
returns(GDVector2)
"idx"(GDint)
}

func("get_point_position") {
returns(GDVector2)
"idx"(GDint)
}

func("remove_point") {
returns(GDvoid)
"idx"(GDint)
}

func("sample") {
returns(GDVector2)
"idx"(GDint)
"t"(GDfloat)
}

func("sample_baked") {
returns(GDVector2)
"offset"(GDfloat)
"cubic"(GDbool)
}

func("sample_baked_with_rotation") {
returns(GDTransform2D)
"offset"(GDfloat)
"cubic"(GDbool)
}

func("samplef") {
returns(GDVector2)
"fofs"(GDfloat)
}

func("set_point_in") {
returns(GDvoid)
"idx"(GDint)
"position"(GDVector2)
}

func("set_point_out") {
returns(GDvoid)
"idx"(GDint)
"position"(GDVector2)
}

func("set_point_position") {
returns(GDvoid)
"idx"(GDint)
"position"(GDVector2)
}

func("tessellate") {
returns(GDPackedVector2Array)
"max_stages"(GDint)
"tolerance_degrees"(GDfloat)
}

func("tessellate_even_length") {
returns(GDPackedVector2Array)
"max_stages"(GDint)
"tolerance_length"(GDfloat)
}
}){

}