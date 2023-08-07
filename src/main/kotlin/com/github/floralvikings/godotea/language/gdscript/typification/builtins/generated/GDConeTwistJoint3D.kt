
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDConeTwistJoint3D: GDType("ConeTwistJoint3D", {

"bias"(GDfloat)
"relaxation"(GDfloat)
"softness"(GDfloat)
"swing_span"(GDfloat)
"twist_span"(GDfloat)
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