
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPlane: GDType("Plane", {

"d"(GDfloat)
"normal"(GDVector3)
"x"(GDfloat)
"y"(GDfloat)
"z"(GDfloat)

constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"a"(GDfloat)
"b"(GDfloat)
"c"(GDfloat)
"d"(GDfloat)
}

constructor {
"normal"(GDVector3)
}

constructor {
"normal"(GDVector3)
"d"(GDfloat)
}

constructor {
"normal"(GDVector3)
"point"(GDVector3)
}

constructor {
"point1"(GDVector3)
"point2"(GDVector3)
"point3"(GDVector3)
}

func("distance_to") {
returns(GDfloat)
"point"(GDVector3)
}

func("get_center") {
returns(GDVector3)

}

func("has_point") {
returns(GDbool)
"point"(GDVector3)
"tolerance"(GDfloat)
}

func("intersect_3") {
returns(GDVariant)
"b"(GDSameType)
"c"(GDSameType)
}

func("intersects_ray") {
returns(GDVariant)
"from"(GDVector3)
"dir"(GDVector3)
}

func("intersects_segment") {
returns(GDVariant)
"from"(GDVector3)
"to"(GDVector3)
}

func("is_equal_approx") {
returns(GDbool)
"to_plane"(GDSameType)
}

func("is_finite") {
returns(GDbool)

}

func("is_point_over") {
returns(GDbool)
"point"(GDVector3)
}

func("normalized") {
returns(GDSameType)

}

func("project") {
returns(GDVector3)
"point"(GDVector3)
}
}){

}