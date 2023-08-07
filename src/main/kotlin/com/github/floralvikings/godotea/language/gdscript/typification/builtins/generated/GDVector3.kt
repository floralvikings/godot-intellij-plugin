
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVector3: GDType("Vector3", {

"x"(GDfloat)
"y"(GDfloat)
"z"(GDfloat)

constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"from"(GDVector3i)
}

constructor {
"x"(GDfloat)
"y"(GDfloat)
"z"(GDfloat)
}

func("abs") {
returns(GDSameType)

}

func("angle_to") {
returns(GDfloat)
"to"(GDSameType)
}

func("bezier_derivative") {
returns(GDSameType)
"control_1"(GDSameType)
"control_2"(GDSameType)
"end"(GDSameType)
"t"(GDfloat)
}

func("bezier_interpolate") {
returns(GDSameType)
"control_1"(GDSameType)
"control_2"(GDSameType)
"end"(GDSameType)
"t"(GDfloat)
}

func("bounce") {
returns(GDSameType)
"n"(GDSameType)
}

func("ceil") {
returns(GDSameType)

}

func("clamp") {
returns(GDSameType)
"min"(GDSameType)
"max"(GDSameType)
}

func("cross") {
returns(GDSameType)
"with"(GDSameType)
}

func("cubic_interpolate") {
returns(GDSameType)
"b"(GDSameType)
"pre_a"(GDSameType)
"post_b"(GDSameType)
"weight"(GDfloat)
}

func("cubic_interpolate_in_time") {
returns(GDSameType)
"b"(GDSameType)
"pre_a"(GDSameType)
"post_b"(GDSameType)
"weight"(GDfloat)
"b_t"(GDfloat)
"pre_a_t"(GDfloat)
"post_b_t"(GDfloat)
}

func("direction_to") {
returns(GDSameType)
"to"(GDSameType)
}

func("distance_squared_to") {
returns(GDfloat)
"to"(GDSameType)
}

func("distance_to") {
returns(GDfloat)
"to"(GDSameType)
}

func("dot") {
returns(GDfloat)
"with"(GDSameType)
}

func("floor") {
returns(GDSameType)

}

func("inverse") {
returns(GDSameType)

}

func("is_equal_approx") {
returns(GDbool)
"to"(GDSameType)
}

func("is_finite") {
returns(GDbool)

}

func("is_normalized") {
returns(GDbool)

}

func("is_zero_approx") {
returns(GDbool)

}

func("length") {
returns(GDfloat)

}

func("length_squared") {
returns(GDfloat)

}

func("lerp") {
returns(GDSameType)
"to"(GDSameType)
"weight"(GDfloat)
}

func("limit_length") {
returns(GDSameType)
"length"(GDfloat)
}

func("max_axis_index") {
returns(GDint)

}

func("min_axis_index") {
returns(GDint)

}

func("move_toward") {
returns(GDSameType)
"to"(GDSameType)
"delta"(GDfloat)
}

func("normalized") {
returns(GDSameType)

}

func("octahedron_decode") {
returns(GDSameType)
"uv"(GDVector2)
}

func("octahedron_encode") {
returns(GDVector2)

}

func("outer") {
returns(GDBasis)
"with"(GDSameType)
}

func("posmod") {
returns(GDSameType)
"mod"(GDfloat)
}

func("posmodv") {
returns(GDSameType)
"modv"(GDSameType)
}

func("project") {
returns(GDSameType)
"b"(GDSameType)
}

func("reflect") {
returns(GDSameType)
"n"(GDSameType)
}

func("rotated") {
returns(GDSameType)
"axis"(GDSameType)
"angle"(GDfloat)
}

func("round") {
returns(GDSameType)

}

func("sign") {
returns(GDSameType)

}

func("signed_angle_to") {
returns(GDfloat)
"to"(GDSameType)
"axis"(GDSameType)
}

func("slerp") {
returns(GDSameType)
"to"(GDSameType)
"weight"(GDfloat)
}

func("slide") {
returns(GDSameType)
"n"(GDSameType)
}

func("snapped") {
returns(GDSameType)
"step"(GDSameType)
}
}){

}