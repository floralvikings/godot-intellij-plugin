
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDXRPose: GDType("XRPose", {

"angular_velocity"(GDVector3)
"has_tracking_data"(GDbool)
"linear_velocity"(GDVector3)
"name"(GDStringName)
"tracking_confidence"(GDTrackingConfidence)
"transform"(GDTransform3D)
constructor { }

func("get_adjusted_transform") {
returns(GDTransform3D)

}
}){

}