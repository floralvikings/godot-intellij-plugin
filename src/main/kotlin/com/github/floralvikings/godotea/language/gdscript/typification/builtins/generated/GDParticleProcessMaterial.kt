
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDParticleProcessMaterial: GDType("ParticleProcessMaterial", {

"angle_curve"(GDTexture2D)
"angle_max"(GDfloat)
"angle_min"(GDfloat)
"angular_velocity_curve"(GDTexture2D)
"angular_velocity_max"(GDfloat)
"angular_velocity_min"(GDfloat)
"anim_offset_curve"(GDTexture2D)
"anim_offset_max"(GDfloat)
"anim_offset_min"(GDfloat)
"anim_speed_curve"(GDTexture2D)
"anim_speed_max"(GDfloat)
"anim_speed_min"(GDfloat)
"attractor_interaction_enabled"(GDbool)
"collision_bounce"(GDfloat)
"collision_friction"(GDfloat)
"collision_mode"(GDCollisionMode)
"collision_use_scale"(GDbool)
"color"(GDColor)
"color_initial_ramp"(GDTexture2D)
"color_ramp"(GDTexture2D)
"damping_curve"(GDTexture2D)
"damping_max"(GDfloat)
"damping_min"(GDfloat)
"direction"(GDVector3)
"emission_box_extents"(GDVector3)
"emission_color_texture"(GDTexture2D)
"emission_normal_texture"(GDTexture2D)
"emission_point_count"(GDint)
"emission_point_texture"(GDTexture2D)
"emission_ring_axis"(GDVector3)
"emission_ring_height"(GDfloat)
"emission_ring_inner_radius"(GDfloat)
"emission_ring_radius"(GDfloat)
"emission_shape"(GDEmissionShape)
"emission_sphere_radius"(GDfloat)
"flatness"(GDfloat)
"gravity"(GDVector3)
"hue_variation_curve"(GDTexture2D)
"hue_variation_max"(GDfloat)
"hue_variation_min"(GDfloat)
"initial_velocity_max"(GDfloat)
"initial_velocity_min"(GDfloat)
"lifetime_randomness"(GDfloat)
"linear_accel_curve"(GDTexture2D)
"linear_accel_max"(GDfloat)
"linear_accel_min"(GDfloat)
"orbit_velocity_curve"(GDTexture2D)
"orbit_velocity_max"(GDfloat)
"orbit_velocity_min"(GDfloat)
"particle_flag_align_y"(GDbool)
"particle_flag_disable_z"(GDbool)
"particle_flag_rotate_y"(GDbool)
"radial_accel_curve"(GDTexture2D)
"radial_accel_max"(GDfloat)
"radial_accel_min"(GDfloat)
"scale_curve"(GDTexture2D)
"scale_max"(GDfloat)
"scale_min"(GDfloat)
"spread"(GDfloat)
"sub_emitter_amount_at_collision"(GDint)
"sub_emitter_amount_at_end"(GDint)
"sub_emitter_frequency"(GDfloat)
"sub_emitter_keep_velocity"(GDbool)
"sub_emitter_mode"(GDSubEmitterMode)
"tangential_accel_curve"(GDTexture2D)
"tangential_accel_max"(GDfloat)
"tangential_accel_min"(GDfloat)
"turbulence_enabled"(GDbool)
"turbulence_influence_max"(GDfloat)
"turbulence_influence_min"(GDfloat)
"turbulence_influence_over_life"(GDTexture2D)
"turbulence_initial_displacement_max"(GDfloat)
"turbulence_initial_displacement_min"(GDfloat)
"turbulence_noise_scale"(GDfloat)
"turbulence_noise_speed"(GDVector3)
"turbulence_noise_speed_random"(GDfloat)
"turbulence_noise_strength"(GDfloat)
constructor { }

func("get_param_max") {
returns(GDfloat)
"param"(GDParameterEnum)
}

func("get_param_min") {
returns(GDfloat)
"param"(GDParameterEnum)
}

func("get_param_texture") {
returns(GDTexture2D)
"param"(GDParameterEnum)
}

func("get_particle_flag") {
returns(GDbool)
"particle_flag"(GDParticleFlags)
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

func("set_param_texture") {
returns(GDvoid)
"param"(GDParameterEnum)
"texture"(GDTexture2D)
}

func("set_particle_flag") {
returns(GDvoid)
"particle_flag"(GDParticleFlags)
"enable"(GDbool)
}
}){

}