
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsDirectBodyState3D: GDType("PhysicsDirectBodyState3D", {

"angular_velocity"(GDVector3)
"center_of_mass"(GDVector3)
"center_of_mass_local"(GDVector3)
"inverse_inertia"(GDVector3)
"inverse_inertia_tensor"(GDBasis)
"inverse_mass"(GDfloat)
"linear_velocity"(GDVector3)
"principal_inertia_axes"(GDBasis)
"sleeping"(GDbool)
"step"(GDfloat)
"total_angular_damp"(GDfloat)
"total_gravity"(GDVector3)
"total_linear_damp"(GDfloat)
"transform"(GDTransform3D)
constructor { }

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

func("get_constant_force") {
returns(GDVector3)

}

func("get_constant_torque") {
returns(GDVector3)

}

func("get_contact_collider") {
returns(GDRID)
"contact_idx"(GDint)
}

func("get_contact_collider_id") {
returns(GDint)
"contact_idx"(GDint)
}

func("get_contact_collider_object") {
returns(GDObject)
"contact_idx"(GDint)
}

func("get_contact_collider_position") {
returns(GDVector3)
"contact_idx"(GDint)
}

func("get_contact_collider_shape") {
returns(GDint)
"contact_idx"(GDint)
}

func("get_contact_collider_velocity_at_position") {
returns(GDVector3)
"contact_idx"(GDint)
}

func("get_contact_count") {
returns(GDint)

}

func("get_contact_impulse") {
returns(GDVector3)
"contact_idx"(GDint)
}

func("get_contact_local_normal") {
returns(GDVector3)
"contact_idx"(GDint)
}

func("get_contact_local_position") {
returns(GDVector3)
"contact_idx"(GDint)
}

func("get_contact_local_shape") {
returns(GDint)
"contact_idx"(GDint)
}

func("get_contact_local_velocity_at_position") {
returns(GDVector3)
"contact_idx"(GDint)
}

func("get_space_state") {
returns(GDPhysicsDirectSpaceState3D)

}

func("get_velocity_at_local_position") {
returns(GDVector3)
"local_position"(GDVector3)
}

func("integrate_forces") {
returns(GDvoid)

}

func("set_constant_force") {
returns(GDvoid)
"force"(GDVector3)
}

func("set_constant_torque") {
returns(GDvoid)
"torque"(GDVector3)
}
}){

}