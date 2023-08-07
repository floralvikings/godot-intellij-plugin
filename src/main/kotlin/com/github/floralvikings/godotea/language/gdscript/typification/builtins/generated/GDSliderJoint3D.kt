
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSliderJoint3D: GDType("SliderJoint3D", {

"angular_limit/damping"(GDfloat)
"angular_limit/lower_angle"(GDfloat)
"angular_limit/restitution"(GDfloat)
"angular_limit/softness"(GDfloat)
"angular_limit/upper_angle"(GDfloat)
"angular_motion/damping"(GDfloat)
"angular_motion/restitution"(GDfloat)
"angular_motion/softness"(GDfloat)
"angular_ortho/damping"(GDfloat)
"angular_ortho/restitution"(GDfloat)
"angular_ortho/softness"(GDfloat)
"linear_limit/damping"(GDfloat)
"linear_limit/lower_distance"(GDfloat)
"linear_limit/restitution"(GDfloat)
"linear_limit/softness"(GDfloat)
"linear_limit/upper_distance"(GDfloat)
"linear_motion/damping"(GDfloat)
"linear_motion/restitution"(GDfloat)
"linear_motion/softness"(GDfloat)
"linear_ortho/damping"(GDfloat)
"linear_ortho/restitution"(GDfloat)
"linear_ortho/softness"(GDfloat)
constructor { }

func("get_param") {
returns(GDfloat)
"param"(GDParam)
}

func("set_param") {
returns(GDvoid)
"param"(GDParam)
"value"(GDfloat)
}
}){

}