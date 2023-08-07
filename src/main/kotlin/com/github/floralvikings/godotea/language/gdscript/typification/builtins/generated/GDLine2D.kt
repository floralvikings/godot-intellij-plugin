
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDLine2D: GDType("Line2D", {

"antialiased"(GDbool)
"begin_cap_mode"(GDLineCapMode)
"default_color"(GDColor)
"end_cap_mode"(GDLineCapMode)
"gradient"(GDGradient)
"joint_mode"(GDLineJointMode)
"points"(GDPackedVector2Array)
"round_precision"(GDint)
"sharp_limit"(GDfloat)
"texture"(GDTexture2D)
"texture_mode"(GDLineTextureMode)
"width"(GDfloat)
"width_curve"(GDCurve)
constructor { }

func("add_point") {
returns(GDvoid)
"position"(GDVector2)
"index"(GDint)
}

func("clear_points") {
returns(GDvoid)

}

func("get_point_count") {
returns(GDint)

}

func("get_point_position") {
returns(GDVector2)
"index"(GDint)
}

func("remove_point") {
returns(GDvoid)
"index"(GDint)
}

func("set_point_position") {
returns(GDvoid)
"index"(GDint)
"position"(GDVector2)
}
}){

}