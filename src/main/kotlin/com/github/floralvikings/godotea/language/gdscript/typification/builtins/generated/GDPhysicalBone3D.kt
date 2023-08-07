
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicalBone3D: GDType("PhysicalBone3D", {

"angular_damp"(GDfloat)
"angular_damp_mode"(GDDampMode)
"angular_velocity"(GDVector3)
"body_offset"(GDTransform3D)
"bounce"(GDfloat)
"can_sleep"(GDbool)
"custom_integrator"(GDbool)
"friction"(GDfloat)
"gravity_scale"(GDfloat)
"joint_offset"(GDTransform3D)
"joint_rotation"(GDVector3)
"joint_type"(GDJointType)
"linear_damp"(GDfloat)
"linear_damp_mode"(GDDampMode)
"linear_velocity"(GDVector3)
"mass"(GDfloat)
constructor { }

func("_integrate_forces") {
returns(GDvoid)
"state"(GDPhysicsDirectBodyState3D)
}

func("apply_central_impulse") {
returns(GDvoid)
"impulse"(GDVector3)
}

func("apply_impulse") {
returns(GDvoid)
"impulse"(GDVector3)
"position"(GDVector3)
}

func("get_bone_id") {
returns(GDint)

}

func("get_simulate_physics") {
returns(GDbool)

}

func("is_simulating_physics") {
returns(GDbool)

}
}){

}