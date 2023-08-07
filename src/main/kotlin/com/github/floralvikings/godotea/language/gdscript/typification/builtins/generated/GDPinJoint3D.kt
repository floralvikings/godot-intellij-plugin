
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPinJoint3D: GDType("PinJoint3D", {

"params/bias"(GDfloat)
"params/damping"(GDfloat)
"params/impulse_clamp"(GDfloat)
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