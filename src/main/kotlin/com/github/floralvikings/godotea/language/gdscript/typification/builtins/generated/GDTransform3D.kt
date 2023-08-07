
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTransform3D: GDType("Transform3D", {

"basis"(GDBasis)
"origin"(GDVector3)

constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"basis"(GDBasis)
"origin"(GDVector3)
}

constructor {
"from"(GDProjection)
}

constructor {
"x_axis"(GDVector3)
"y_axis"(GDVector3)
"z_axis"(GDVector3)
"origin"(GDVector3)
}

func("affine_inverse") {
returns(GDSameType)

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
"target"(GDVector3)
"up"(GDVector3)
"use_model_front"(GDbool)
}

func("orthonormalized") {
returns(GDSameType)

}

func("rotated") {
returns(GDSameType)
"axis"(GDVector3)
"angle"(GDfloat)
}

func("rotated_local") {
returns(GDSameType)
"axis"(GDVector3)
"angle"(GDfloat)
}

func("scaled") {
returns(GDSameType)
"scale"(GDVector3)
}

func("scaled_local") {
returns(GDSameType)
"scale"(GDVector3)
}

func("translated") {
returns(GDSameType)
"offset"(GDVector3)
}

func("translated_local") {
returns(GDSameType)
"offset"(GDVector3)
}
}){

}