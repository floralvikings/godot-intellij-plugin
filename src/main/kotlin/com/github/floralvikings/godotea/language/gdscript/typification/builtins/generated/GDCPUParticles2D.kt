
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCPUParticles2D: GDType("CPUParticles2D", {

"amount"(GDint)
"angle_curve"(GDCurve)
"angle_max"(GDfloat)
"angle_min"(GDfloat)
"angular_velocity_curve"(GDCurve)
"angular_velocity_max"(GDfloat)
"angular_velocity_min"(GDfloat)
"anim_offset_curve"(GDCurve)
"anim_offset_max"(GDfloat)
"anim_offset_min"(GDfloat)
"anim_speed_curve"(GDCurve)
"anim_speed_max"(GDfloat)
"anim_speed_min"(GDfloat)
"color"(GDColor)
"color_initial_ramp"(GDGradient)
"color_ramp"(GDGradient)
"damping_curve"(GDCurve)
"damping_max"(GDfloat)
"damping_min"(GDfloat)
"direction"(GDVector2)
"draw_order"(GDDrawOrder)
"emission_colors"(GDPackedColorArray)
"emission_normals"(GDPackedVector2Array)
"emission_points"(GDPackedVector2Array)
"emission_rect_extents"(GDVector2)
"emission_shape"(GDEmissionShape)
"emission_sphere_radius"(GDfloat)
"emitting"(GDbool)
"explosiveness"(GDfloat)
"fixed_fps"(GDint)
"fract_delta"(GDbool)
"gravity"(GDVector2)
"hue_variation_curve"(GDCurve)
"hue_variation_max"(GDfloat)
"hue_variation_min"(GDfloat)
"initial_velocity_max"(GDfloat)
"initial_velocity_min"(GDfloat)
"lifetime"(GDfloat)
"lifetime_randomness"(GDfloat)
"linear_accel_curve"(GDCurve)
"linear_accel_max"(GDfloat)
"linear_accel_min"(GDfloat)
"local_coords"(GDbool)
"one_shot"(GDbool)
"orbit_velocity_curve"(GDCurve)
"orbit_velocity_max"(GDfloat)
"orbit_velocity_min"(GDfloat)
"particle_flag_align_y"(GDbool)
"preprocess"(GDfloat)
"radial_accel_curve"(GDCurve)
"radial_accel_max"(GDfloat)
"radial_accel_min"(GDfloat)
"randomness"(GDfloat)
"scale_amount_curve"(GDCurve)
"scale_amount_max"(GDfloat)
"scale_amount_min"(GDfloat)
"scale_curve_x"(GDCurve)
"scale_curve_y"(GDCurve)
"speed_scale"(GDfloat)
"split_scale"(GDbool)
"spread"(GDfloat)
"tangential_accel_curve"(GDCurve)
"tangential_accel_max"(GDfloat)
"tangential_accel_min"(GDfloat)
"texture"(GDTexture2D)
constructor { }

func("convert_from_particles") {
returns(GDvoid)
"particles"(GDNode)
}

func("get_param_curve") {
returns(GDCurve)
"param"(GDParameterEnum)
}

func("get_param_max") {
returns(GDfloat)
"param"(GDParameterEnum)
}

func("get_param_min") {
returns(GDfloat)
"param"(GDParameterEnum)
}

func("get_particle_flag") {
returns(GDbool)
"particle_flag"(GDParticleFlags)
}

func("restart") {
returns(GDvoid)

}

func("set_param_curve") {
returns(GDvoid)
"param"(GDParameterEnum)
"curve"(GDCurve)
}

func("set_param_max") {
returns(GDvoid)
"param"(GDParameterEnum)
"value"(GDfloat)
}

func("set_param_min") {
returns(GDvoid)
"param"(GDParameterEnum)
"value"(GDfloat)
}

func("set_particle_flag") {
returns(GDvoid)
"particle_flag"(GDParticleFlags)
"enable"(GDbool)
}
}){

}