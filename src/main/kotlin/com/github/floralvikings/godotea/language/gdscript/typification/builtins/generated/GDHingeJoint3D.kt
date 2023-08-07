
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDHingeJoint3D: GDType("HingeJoint3D", {

"angular_limit/bias"(GDfloat)
"angular_limit/enable"(GDbool)
"angular_limit/lower"(GDfloat)
"angular_limit/relaxation"(GDfloat)
"angular_limit/softness"(GDfloat)
"angular_limit/upper"(GDfloat)
"motor/enable"(GDbool)
"motor/max_impulse"(GDfloat)
"motor/target_velocity"(GDfloat)
"params/bias"(GDfloat)
constructor { }

func("get_flag") {
returns(GDbool)
"flag"(GDFlag)
}

func("get_param") {
returns(GDfloat)
"param"(GDParam)
}

func("set_flag") {
returns(GDvoid)
"flag"(GDFlag)
"enabled"(GDbool)
}

func("set_param") {
returns(GDvoid)
"param"(GDParam)
"value"(GDfloat)
}
}){

}