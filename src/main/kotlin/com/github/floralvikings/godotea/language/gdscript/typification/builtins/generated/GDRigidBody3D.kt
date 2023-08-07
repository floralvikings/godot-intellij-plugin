
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRigidBody3D: GDType("RigidBody3D", {

"angular_damp"(GDfloat)
"angular_damp_mode"(GDDampMode)
"angular_velocity"(GDVector3)
"can_sleep"(GDbool)
"center_of_mass"(GDVector3)
"center_of_mass_mode"(GDCenterOfMassMode)
"constant_force"(GDVector3)
"constant_torque"(GDVector3)
"contact_monitor"(GDbool)
"continuous_cd"(GDbool)
"custom_integrator"(GDbool)
"freeze"(GDbool)
"freeze_mode"(GDFreezeMode)
"gravity_scale"(GDfloat)
"inertia"(GDVector3)
"linear_damp"(GDfloat)
"linear_damp_mode"(GDDampMode)
"linear_velocity"(GDVector3)
"lock_rotation"(GDbool)
"mass"(GDfloat)
"max_contacts_reported"(GDint)
"physics_material_override"(GDPhysicsMaterial)
"sleeping"(GDbool)
constructor { }

func("_integrate_forces") {
returns(GDvoid)
"state"(GDPhysicsDirectBodyState3D)
}

func("add_constant_central_force") {
returns(GDvoid)
"force"(GDVector3)
}

func("add_constant_force") {
returns(GDvoid)
"force"(GDVector3)
"position"(GDVector3)
}

func("add_constant_torque") {
returns(GDvoid)
"torque"(GDVector3)
}

func("apply_central_force") {
returns(GDvoid)
"force"(GDVector3)
}

func("apply_central_impulse") {
returns(GDvoid)
"impulse"(GDVector3)
}

func("apply_force") {
returns(GDvoid)
"force"(GDVector3)
"position"(GDVector3)
}

func("apply_impulse") {
returns(GDvoid)
"impulse"(GDVector3)
"position"(GDVector3)
}

func("apply_torque") {
returns(GDvoid)
"torque"(GDVector3)
}

func("apply_torque_impulse") {
returns(GDvoid)
"impulse"(GDVector3)
}

func("get_colliding_bodies") {
returns(GDTypedArray(GDNode3D::class))

}

func("get_contact_count") {
returns(GDint)

}

func("get_inverse_inertia_tensor") {
returns(GDBasis)

}

func("set_axis_velocity") {
returns(GDvoid)
"axis_velocity"(GDVector3)
}
}){

}