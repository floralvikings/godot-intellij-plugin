
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGeneric6DOFJoint3D: GDType("Generic6DOFJoint3D", {

"angular_limit_x/damping"(GDfloat)
"angular_limit_x/enabled"(GDbool)
"angular_limit_x/erp"(GDfloat)
"angular_limit_x/force_limit"(GDfloat)
"angular_limit_x/lower_angle"(GDfloat)
"angular_limit_x/restitution"(GDfloat)
"angular_limit_x/softness"(GDfloat)
"angular_limit_x/upper_angle"(GDfloat)
"angular_limit_y/damping"(GDfloat)
"angular_limit_y/enabled"(GDbool)
"angular_limit_y/erp"(GDfloat)
"angular_limit_y/force_limit"(GDfloat)
"angular_limit_y/lower_angle"(GDfloat)
"angular_limit_y/restitution"(GDfloat)
"angular_limit_y/softness"(GDfloat)
"angular_limit_y/upper_angle"(GDfloat)
"angular_limit_z/damping"(GDfloat)
"angular_limit_z/enabled"(GDbool)
"angular_limit_z/erp"(GDfloat)
"angular_limit_z/force_limit"(GDfloat)
"angular_limit_z/lower_angle"(GDfloat)
"angular_limit_z/restitution"(GDfloat)
"angular_limit_z/softness"(GDfloat)
"angular_limit_z/upper_angle"(GDfloat)
"angular_motor_x/enabled"(GDbool)
"angular_motor_x/force_limit"(GDfloat)
"angular_motor_x/target_velocity"(GDfloat)
"angular_motor_y/enabled"(GDbool)
"angular_motor_y/force_limit"(GDfloat)
"angular_motor_y/target_velocity"(GDfloat)
"angular_motor_z/enabled"(GDbool)
"angular_motor_z/force_limit"(GDfloat)
"angular_motor_z/target_velocity"(GDfloat)
"angular_spring_x/damping"(GDfloat)
"angular_spring_x/enabled"(GDbool)
"angular_spring_x/equilibrium_point"(GDfloat)
"angular_spring_x/stiffness"(GDfloat)
"angular_spring_y/damping"(GDfloat)
"angular_spring_y/enabled"(GDbool)
"angular_spring_y/equilibrium_point"(GDfloat)
"angular_spring_y/stiffness"(GDfloat)
"angular_spring_z/damping"(GDfloat)
"angular_spring_z/enabled"(GDbool)
"angular_spring_z/equilibrium_point"(GDfloat)
"angular_spring_z/stiffness"(GDfloat)
"linear_limit_x/damping"(GDfloat)
"linear_limit_x/enabled"(GDbool)
"linear_limit_x/lower_distance"(GDfloat)
"linear_limit_x/restitution"(GDfloat)
"linear_limit_x/softness"(GDfloat)
"linear_limit_x/upper_distance"(GDfloat)
"linear_limit_y/damping"(GDfloat)
"linear_limit_y/enabled"(GDbool)
"linear_limit_y/lower_distance"(GDfloat)
"linear_limit_y/restitution"(GDfloat)
"linear_limit_y/softness"(GDfloat)
"linear_limit_y/upper_distance"(GDfloat)
"linear_limit_z/damping"(GDfloat)
"linear_limit_z/enabled"(GDbool)
"linear_limit_z/lower_distance"(GDfloat)
"linear_limit_z/restitution"(GDfloat)
"linear_limit_z/softness"(GDfloat)
"linear_limit_z/upper_distance"(GDfloat)
"linear_motor_x/enabled"(GDbool)
"linear_motor_x/force_limit"(GDfloat)
"linear_motor_x/target_velocity"(GDfloat)
"linear_motor_y/enabled"(GDbool)
"linear_motor_y/force_limit"(GDfloat)
"linear_motor_y/target_velocity"(GDfloat)
"linear_motor_z/enabled"(GDbool)
"linear_motor_z/force_limit"(GDfloat)
"linear_motor_z/target_velocity"(GDfloat)
"linear_spring_x/damping"(GDfloat)
"linear_spring_x/enabled"(GDbool)
"linear_spring_x/equilibrium_point"(GDfloat)
"linear_spring_x/stiffness"(GDfloat)
"linear_spring_y/damping"(GDfloat)
"linear_spring_y/enabled"(GDbool)
"linear_spring_y/equilibrium_point"(GDfloat)
"linear_spring_y/stiffness"(GDfloat)
"linear_spring_z/damping"(GDfloat)
"linear_spring_z/enabled"(GDbool)
"linear_spring_z/equilibrium_point"(GDfloat)
"linear_spring_z/stiffness"(GDfloat)
constructor { }

func("get_flag_x") {
returns(GDbool)
"flag"(GDFlag)
}

func("get_flag_y") {
returns(GDbool)
"flag"(GDFlag)
}

func("get_flag_z") {
returns(GDbool)
"flag"(GDFlag)
}

func("get_param_x") {
returns(GDfloat)
"param"(GDParam)
}

func("get_param_y") {
returns(GDfloat)
"param"(GDParam)
}

func("get_param_z") {
returns(GDfloat)
"param"(GDParam)
}

func("set_flag_x") {
returns(GDvoid)
"flag"(GDFlag)
"value"(GDbool)
}

func("set_flag_y") {
returns(GDvoid)
"flag"(GDFlag)
"value"(GDbool)
}

func("set_flag_z") {
returns(GDvoid)
"flag"(GDFlag)
"value"(GDbool)
}

func("set_param_x") {
returns(GDvoid)
"param"(GDParam)
"value"(GDfloat)
}

func("set_param_y") {
returns(GDvoid)
"param"(GDParam)
"value"(GDfloat)
}

func("set_param_z") {
returns(GDvoid)
"param"(GDParam)
"value"(GDfloat)
}
}){

}