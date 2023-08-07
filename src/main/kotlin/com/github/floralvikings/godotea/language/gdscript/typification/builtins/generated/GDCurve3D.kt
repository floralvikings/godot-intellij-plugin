
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCurve3D: GDType("Curve3D", {

"bake_interval"(GDfloat)
"point_count"(GDint)
"up_vector_enabled"(GDbool)
constructor { }

func("add_point") {
returns(GDvoid)
"position"(GDVector3)
"in"(GDVector3)
"out"(GDVector3)
"index"(GDint)
}

func("clear_points") {
returns(GDvoid)

}

func("get_baked_length") {
returns(GDfloat)

}

func("get_baked_points") {
returns(GDPackedVector3Array)

}

func("get_baked_tilts") {
returns(GDPackedFloat32Array)

}

func("get_baked_up_vectors") {
returns(GDPackedVector3Array)

}

func("get_closest_offset") {
returns(GDfloat)
"to_point"(GDVector3)
}

func("get_closest_point") {
returns(GDVector3)
"to_point"(GDVector3)
}

func("get_point_in") {
returns(GDVector3)
"idx"(GDint)
}

func("get_point_out") {
returns(GDVector3)
"idx"(GDint)
}

func("get_point_position") {
returns(GDVector3)
"idx"(GDint)
}

func("get_point_tilt") {
returns(GDfloat)
"idx"(GDint)
}

func("remove_point") {
returns(GDvoid)
"idx"(GDint)
}

func("sample") {
returns(GDVector3)
"idx"(GDint)
"t"(GDfloat)
}

func("sample_baked") {
returns(GDVector3)
"offset"(GDfloat)
"cubic"(GDbool)
}

func("sample_baked_up_vector") {
returns(GDVector3)
"offset"(GDfloat)
"apply_tilt"(GDbool)
}

func("sample_baked_with_rotation") {
returns(GDTransform3D)
"offset"(GDfloat)
"cubic"(GDbool)
"apply_tilt"(GDbool)
}

func("samplef") {
returns(GDVector3)
"fofs"(GDfloat)
}

func("set_point_in") {
returns(GDvoid)
"idx"(GDint)
"position"(GDVector3)
}

func("set_point_out") {
returns(GDvoid)
"idx"(GDint)
"position"(GDVector3)
}

func("set_point_position") {
returns(GDvoid)
"idx"(GDint)
"position"(GDVector3)
}

func("set_point_tilt") {
returns(GDvoid)
"idx"(GDint)
"tilt"(GDfloat)
}

func("tessellate") {
returns(GDPackedVector3Array)
"max_stages"(GDint)
"tolerance_degrees"(GDfloat)
}

func("tessellate_even_length") {
returns(GDPackedVector3Array)
"max_stages"(GDint)
"tolerance_length"(GDfloat)
}
}){

}