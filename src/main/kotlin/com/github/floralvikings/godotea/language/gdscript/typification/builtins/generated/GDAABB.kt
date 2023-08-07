
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAABB: GDType("AABB", {

"end"(GDVector3)
"position"(GDVector3)
"size"(GDVector3)

constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"position"(GDVector3)
"size"(GDVector3)
}

func("abs") {
returns(GDSameType)

}

func("encloses") {
returns(GDbool)
"with"(GDSameType)
}

func("expand") {
returns(GDSameType)
"to_point"(GDVector3)
}

func("get_center") {
returns(GDVector3)

}

func("get_endpoint") {
returns(GDVector3)
"idx"(GDint)
}

func("get_longest_axis") {
returns(GDVector3)

}

func("get_longest_axis_index") {
returns(GDint)

}

func("get_longest_axis_size") {
returns(GDfloat)

}

func("get_shortest_axis") {
returns(GDVector3)

}

func("get_shortest_axis_index") {
returns(GDint)

}

func("get_shortest_axis_size") {
returns(GDfloat)

}

func("get_support") {
returns(GDVector3)
"dir"(GDVector3)
}

func("get_volume") {
returns(GDfloat)

}

func("grow") {
returns(GDSameType)
"by"(GDfloat)
}

func("has_point") {
returns(GDbool)
"point"(GDVector3)
}

func("has_surface") {
returns(GDbool)

}

func("has_volume") {
returns(GDbool)

}

func("intersection") {
returns(GDSameType)
"with"(GDSameType)
}

func("intersects") {
returns(GDbool)
"with"(GDSameType)
}

func("intersects_plane") {
returns(GDbool)
"plane"(GDPlane)
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
"aabb"(GDSameType)
}

func("is_finite") {
returns(GDbool)

}

func("merge") {
returns(GDSameType)
"with"(GDSameType)
}
}){

}