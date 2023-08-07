
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVehicleWheel3D: GDType("VehicleWheel3D", {

"brake"(GDfloat)
"damping_compression"(GDfloat)
"damping_relaxation"(GDfloat)
"engine_force"(GDfloat)
"steering"(GDfloat)
"suspension_max_force"(GDfloat)
"suspension_stiffness"(GDfloat)
"suspension_travel"(GDfloat)
"use_as_steering"(GDbool)
"use_as_traction"(GDbool)
"wheel_friction_slip"(GDfloat)
"wheel_radius"(GDfloat)
"wheel_rest_length"(GDfloat)
"wheel_roll_influence"(GDfloat)
constructor { }

func("get_contact_body") {
returns(GDNode3D)

}

func("get_rpm") {
returns(GDfloat)

}

func("get_skidinfo") {
returns(GDfloat)

}

func("is_in_contact") {
returns(GDbool)

}
}){

}