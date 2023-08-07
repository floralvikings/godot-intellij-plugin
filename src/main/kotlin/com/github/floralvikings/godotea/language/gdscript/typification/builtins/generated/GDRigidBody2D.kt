
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRigidBody2D: GDType("RigidBody2D", {

"angular_damp"(GDfloat)
"angular_damp_mode"(GDDampMode)
"angular_velocity"(GDfloat)
"can_sleep"(GDbool)
"center_of_mass"(GDVector2)
"center_of_mass_mode"(GDCenterOfMassMode)
"constant_force"(GDVector2)
"constant_torque"(GDfloat)
"contact_monitor"(GDbool)
"continuous_cd"(GDCCDMode)
"custom_integrator"(GDbool)
"freeze"(GDbool)
"freeze_mode"(GDFreezeMode)
"gravity_scale"(GDfloat)
"inertia"(GDfloat)
"linear_damp"(GDfloat)
"linear_damp_mode"(GDDampMode)
"linear_velocity"(GDVector2)
"lock_rotation"(GDbool)
"mass"(GDfloat)
"max_contacts_reported"(GDint)
"physics_material_override"(GDPhysicsMaterial)
"sleeping"(GDbool)
constructor { }

func("_integrate_forces") {
returns(GDvoid)
"state"(GDPhysicsDirectBodyState2D)
}

func("add_constant_central_force") {
returns(GDvoid)
"force"(GDVector2)
}

func("add_constant_force") {
returns(GDvoid)
"force"(GDVector2)
"position"(GDVector2)
}

func("add_constant_torque") {
returns(GDvoid)
"torque"(GDfloat)
}

func("apply_central_force") {
returns(GDvoid)
"force"(GDVector2)
}

func("apply_central_impulse") {
returns(GDvoid)
"impulse"(GDVector2)
}

func("apply_force") {
returns(GDvoid)
"force"(GDVector2)
"position"(GDVector2)
}

func("apply_impulse") {
returns(GDvoid)
"impulse"(GDVector2)
"position"(GDVector2)
}

func("apply_torque") {
returns(GDvoid)
"torque"(GDfloat)
}

func("apply_torque_impulse") {
returns(GDvoid)
"torque"(GDfloat)
}

func("get_colliding_bodies") {
returns(GDTypedArray(GDNode2D::class))

}

func("get_contact_count") {
returns(GDint)

}

func("set_axis_velocity") {
returns(GDvoid)
"axis_velocity"(GDVector2)
}
}){

}