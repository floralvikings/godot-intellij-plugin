
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDXRNode3D: GDType("XRNode3D", {

"pose"(GDStringName)
"tracker"(GDStringName)
constructor { }

func("get_has_tracking_data") {
returns(GDbool)

}

func("get_is_active") {
returns(GDbool)

}

func("get_pose") {
returns(GDXRPose)

}

func("trigger_haptic_pulse") {
returns(GDvoid)
"action_name"(GDString)
"frequency"(GDfloat)
"amplitude"(GDfloat)
"duration_sec"(GDfloat)
"delay_sec"(GDfloat)
}
}){

}