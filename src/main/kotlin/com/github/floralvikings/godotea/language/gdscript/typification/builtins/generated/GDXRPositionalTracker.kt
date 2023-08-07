
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDXRPositionalTracker: GDType("XRPositionalTracker", {

"description"(GDString)
"hand"(GDTrackerHand)
"name"(GDStringName)
"profile"(GDString)
"type"(GDTrackerType)
constructor { }

func("get_input") {
returns(GDVariant)
"name"(GDStringName)
}

func("get_pose") {
returns(GDXRPose)
"name"(GDStringName)
}

func("has_pose") {
returns(GDbool)
"name"(GDStringName)
}

func("invalidate_pose") {
returns(GDvoid)
"name"(GDStringName)
}

func("set_input") {
returns(GDvoid)
"name"(GDStringName)
"value"(GDVariant)
}

func("set_pose") {
returns(GDvoid)
"name"(GDStringName)
"transform"(GDTransform3D)
"linear_velocity"(GDVector3)
"angular_velocity"(GDVector3)
"tracking_confidence"(GDTrackingConfidence)
}
}){

}