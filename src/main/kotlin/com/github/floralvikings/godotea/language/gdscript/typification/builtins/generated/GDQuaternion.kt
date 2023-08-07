
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDQuaternion: GDType("Quaternion", {

"w"(GDfloat)
"x"(GDfloat)
"y"(GDfloat)
"z"(GDfloat)

constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"arc_from"(GDVector3)
"arc_to"(GDVector3)
}

constructor {
"axis"(GDVector3)
"angle"(GDfloat)
}

constructor {
"from"(GDBasis)
}

constructor {
"x"(GDfloat)
"y"(GDfloat)
"z"(GDfloat)
"w"(GDfloat)
}

func("angle_to") {
returns(GDfloat)
"to"(GDSameType)
}

func("dot") {
returns(GDfloat)
"with"(GDSameType)
}

func("exp") {
returns(GDSameType)

}

func("from_euler") {
returns(GDSameType)
"euler"(GDVector3)
}

func("get_angle") {
returns(GDfloat)

}

func("get_axis") {
returns(GDVector3)

}

func("get_euler") {
returns(GDVector3)
"order"(GDint)
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

func("length") {
returns(GDfloat)

}

func("length_squared") {
returns(GDfloat)

}

func("log") {
returns(GDSameType)

}

func("normalized") {
returns(GDSameType)

}

func("slerp") {
returns(GDSameType)
"to"(GDSameType)
"weight"(GDfloat)
}

func("slerpni") {
returns(GDSameType)
"to"(GDSameType)
"weight"(GDfloat)
}

func("spherical_cubic_interpolate") {
returns(GDSameType)
"b"(GDSameType)
"pre_a"(GDSameType)
"post_b"(GDSameType)
"weight"(GDfloat)
}

func("spherical_cubic_interpolate_in_time") {
returns(GDSameType)
"b"(GDSameType)
"pre_a"(GDSameType)
"post_b"(GDSameType)
"weight"(GDfloat)
"b_t"(GDfloat)
"pre_a_t"(GDfloat)
"post_b_t"(GDfloat)
}
}){

}