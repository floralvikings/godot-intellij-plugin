
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsDirectBodyState2D: GDType("PhysicsDirectBodyState2D", {

"angular_velocity"(GDfloat)
"center_of_mass"(GDVector2)
"center_of_mass_local"(GDVector2)
"inverse_inertia"(GDfloat)
"inverse_mass"(GDfloat)
"linear_velocity"(GDVector2)
"sleeping"(GDbool)
"step"(GDfloat)
"total_angular_damp"(GDfloat)
"total_gravity"(GDVector2)
"total_linear_damp"(GDfloat)
"transform"(GDTransform2D)
constructor { }

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
"impulse"(GDfloat)
}

func("get_constant_force") {
returns(GDVector2)

}

func("get_constant_torque") {
returns(GDfloat)

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
returns(GDVector2)
"contact_idx"(GDint)
}

func("get_contact_collider_shape") {
returns(GDint)
"contact_idx"(GDint)
}

func("get_contact_collider_velocity_at_position") {
returns(GDVector2)
"contact_idx"(GDint)
}

func("get_contact_count") {
returns(GDint)

}

func("get_contact_impulse") {
returns(GDVector2)
"contact_idx"(GDint)
}

func("get_contact_local_normal") {
returns(GDVector2)
"contact_idx"(GDint)
}

func("get_contact_local_position") {
returns(GDVector2)
"contact_idx"(GDint)
}

func("get_contact_local_shape") {
returns(GDint)
"contact_idx"(GDint)
}

func("get_contact_local_velocity_at_position") {
returns(GDVector2)
"contact_idx"(GDint)
}

func("get_space_state") {
returns(GDPhysicsDirectSpaceState2D)

}

func("get_velocity_at_local_position") {
returns(GDVector2)
"local_position"(GDVector2)
}

func("integrate_forces") {
returns(GDvoid)

}

func("set_constant_force") {
returns(GDvoid)
"force"(GDVector2)
}

func("set_constant_torque") {
returns(GDvoid)
"torque"(GDfloat)
}
}){

}