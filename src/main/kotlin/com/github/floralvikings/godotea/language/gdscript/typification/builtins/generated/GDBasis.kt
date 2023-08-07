
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDBasis: GDType("Basis", {

"x"(GDVector3)
"y"(GDVector3)
"z"(GDVector3)

constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"axis"(GDVector3)
"angle"(GDfloat)
}

constructor {
"from"(GDQuaternion)
}

constructor {
"x_axis"(GDVector3)
"y_axis"(GDVector3)
"z_axis"(GDVector3)
}

func("determinant") {
returns(GDfloat)

}

func("from_euler") {
returns(GDSameType)
"euler"(GDVector3)
"order"(GDint)
}

func("from_scale") {
returns(GDSameType)
"scale"(GDVector3)
}

func("get_euler") {
returns(GDVector3)
"order"(GDint)
}

func("get_rotation_quaternion") {
returns(GDQuaternion)

}

func("get_scale") {
returns(GDVector3)

}

func("inverse") {
returns(GDSameType)

}

func("is_equal_approx") {
returns(GDbool)
"b"(GDSameType)
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

func("scaled") {
returns(GDSameType)
"scale"(GDVector3)
}

func("slerp") {
returns(GDSameType)
"to"(GDSameType)
"weight"(GDfloat)
}

func("tdotx") {
returns(GDfloat)
"with"(GDVector3)
}

func("tdoty") {
returns(GDfloat)
"with"(GDVector3)
}

func("tdotz") {
returns(GDfloat)
"with"(GDVector3)
}

func("transposed") {
returns(GDSameType)

}
}){

}