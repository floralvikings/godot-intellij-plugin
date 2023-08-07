
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDLight3D: GDType("Light3D", {

"distance_fade_begin"(GDfloat)
"distance_fade_enabled"(GDbool)
"distance_fade_length"(GDfloat)
"distance_fade_shadow"(GDfloat)
"editor_only"(GDbool)
"light_angular_distance"(GDfloat)
"light_bake_mode"(GDBakeMode)
"light_color"(GDColor)
"light_cull_mask"(GDint)
"light_energy"(GDfloat)
"light_indirect_energy"(GDfloat)
"light_intensity_lumens"(GDfloat)
"light_intensity_lux"(GDfloat)
"light_negative"(GDbool)
"light_projector"(GDTexture2D)
"light_size"(GDfloat)
"light_specular"(GDfloat)
"light_temperature"(GDfloat)
"light_volumetric_fog_energy"(GDfloat)
"shadow_bias"(GDfloat)
"shadow_blur"(GDfloat)
"shadow_enabled"(GDbool)
"shadow_normal_bias"(GDfloat)
"shadow_opacity"(GDfloat)
"shadow_reverse_cull_face"(GDbool)
"shadow_transmittance_bias"(GDfloat)
constructor { }

func("get_correlated_color") {
returns(GDColor)

}

func("get_param") {
returns(GDfloat)
"param"(GDParam)
}

func("set_param") {
returns(GDvoid)
"param"(GDParam)
"value"(GDfloat)
}
}){

}