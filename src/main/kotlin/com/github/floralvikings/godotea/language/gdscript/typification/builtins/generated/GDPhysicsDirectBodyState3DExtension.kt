
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsDirectBodyState3DExtension: GDType("PhysicsDirectBodyState3DExtension", {


constructor { }

func("_add_constant_central_force") {
returns(GDvoid)
"force"(GDVector3)
}

func("_add_constant_force") {
returns(GDvoid)
"force"(GDVector3)
"position"(GDVector3)
}

func("_add_constant_torque") {
returns(GDvoid)
"torque"(GDVector3)
}

func("_apply_central_force") {
returns(GDvoid)
"force"(GDVector3)
}

func("_apply_central_impulse") {
returns(GDvoid)
"impulse"(GDVector3)
}

func("_apply_force") {
returns(GDvoid)
"force"(GDVector3)
"position"(GDVector3)
}

func("_apply_impulse") {
returns(GDvoid)
"impulse"(GDVector3)
"position"(GDVector3)
}

func("_apply_torque") {
returns(GDvoid)
"torque"(GDVector3)
}

func("_apply_torque_impulse") {
returns(GDvoid)
"impulse"(GDVector3)
}

func("_get_angular_velocity") {
returns(GDVector3)

}

func("_get_center_of_mass") {
returns(GDVector3)

}

func("_get_center_of_mass_local") {
returns(GDVector3)

}

func("_get_constant_force") {
returns(GDVector3)

}

func("_get_constant_torque") {
returns(GDVector3)

}

func("_get_contact_collider") {
returns(GDRID)
"contact_idx"(GDint)
}

func("_get_contact_collider_id") {
returns(GDint)
"contact_idx"(GDint)
}

func("_get_contact_collider_object") {
returns(GDObject)
"contact_idx"(GDint)
}

func("_get_contact_collider_position") {
returns(GDVector3)
"contact_idx"(GDint)
}

func("_get_contact_collider_shape") {
returns(GDint)
"contact_idx"(GDint)
}

func("_get_contact_collider_velocity_at_position") {
returns(GDVector3)
"contact_idx"(GDint)
}

func("_get_contact_count") {
returns(GDint)

}

func("_get_contact_impulse") {
returns(GDVector3)
"contact_idx"(GDint)
}

func("_get_contact_local_normal") {
returns(GDVector3)
"contact_idx"(GDint)
}

func("_get_contact_local_position") {
returns(GDVector3)
"contact_idx"(GDint)
}

func("_get_contact_local_shape") {
returns(GDint)
"contact_idx"(GDint)
}

func("_get_contact_local_velocity_at_position") {
returns(GDVector3)
"contact_idx"(GDint)
}

func("_get_inverse_inertia") {
returns(GDVector3)

}

func("_get_inverse_inertia_tensor") {
returns(GDBasis)

}

func("_get_inverse_mass") {
returns(GDfloat)

}

func("_get_linear_velocity") {
returns(GDVector3)

}

func("_get_principal_inertia_axes") {
returns(GDBasis)

}

func("_get_space_state") {
returns(GDPhysicsDirectSpaceState3D)

}

func("_get_step") {
returns(GDfloat)

}

func("_get_total_angular_damp") {
returns(GDfloat)

}

func("_get_total_gravity") {
returns(GDVector3)

}

func("_get_total_linear_damp") {
returns(GDfloat)

}

func("_get_transform") {
returns(GDTransform3D)

}

func("_get_velocity_at_local_position") {
returns(GDVector3)
"local_position"(GDVector3)
}

func("_integrate_forces") {
returns(GDvoid)

}

func("_is_sleeping") {
returns(GDbool)

}

func("_set_angular_velocity") {
returns(GDvoid)
"velocity"(GDVector3)
}

func("_set_constant_force") {
returns(GDvoid)
"force"(GDVector3)
}

func("_set_constant_torque") {
returns(GDvoid)
"torque"(GDVector3)
}

func("_set_linear_velocity") {
returns(GDvoid)
"velocity"(GDVector3)
}

func("_set_sleep_state") {
returns(GDvoid)
"enabled"(GDbool)
}

func("_set_transform") {
returns(GDvoid)
"transform"(GDTransform3D)
}
}){

}