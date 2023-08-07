
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTransform2D: GDType("Transform2D", {

"origin"(GDVector2)
"x"(GDVector2)
"y"(GDVector2)

constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"rotation"(GDfloat)
"position"(GDVector2)
}

constructor {
"rotation"(GDfloat)
"scale"(GDVector2)
"skew"(GDfloat)
"position"(GDVector2)
}

constructor {
"x_axis"(GDVector2)
"y_axis"(GDVector2)
"origin"(GDVector2)
}

func("affine_inverse") {
returns(GDSameType)

}

func("basis_xform") {
returns(GDVector2)
"v"(GDVector2)
}

func("basis_xform_inv") {
returns(GDVector2)
"v"(GDVector2)
}

func("determinant") {
returns(GDfloat)

}

func("get_origin") {
returns(GDVector2)

}

func("get_rotation") {
returns(GDfloat)

}

func("get_scale") {
returns(GDVector2)

}

func("get_skew") {
returns(GDfloat)

}

func("interpolate_with") {
returns(GDSameType)
"xform"(GDSameType)
"weight"(GDfloat)
}

func("inverse") {
returns(GDSameType)

}

func("is_equal_approx") {
returns(GDbool)
"xform"(GDSameType)
}

func("is_finite") {
returns(GDbool)

}

func("looking_at") {
returns(GDSameType)
"target"(GDVector2)
}

func("orthonormalized") {
returns(GDSameType)

}

func("rotated") {
returns(GDSameType)
"angle"(GDfloat)
}

func("rotated_local") {
returns(GDSameType)
"angle"(GDfloat)
}

func("scaled") {
returns(GDSameType)
"scale"(GDVector2)
}

func("scaled_local") {
returns(GDSameType)
"scale"(GDVector2)
}

func("translated") {
returns(GDSameType)
"offset"(GDVector2)
}

func("translated_local") {
returns(GDSameType)
"offset"(GDVector2)
}
}){

}