
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGeometryInstance3D: GDType("GeometryInstance3D", {

"cast_shadow"(GDShadowCastingSetting)
"custom_aabb"(GDAABB)
"extra_cull_margin"(GDfloat)
"gi_lightmap_scale"(GDLightmapScale)
"gi_mode"(GDGIMode)
"ignore_occlusion_culling"(GDbool)
"lod_bias"(GDfloat)
"material_overlay"(GDMaterial)
"material_override"(GDMaterial)
"transparency"(GDfloat)
"visibility_range_begin"(GDfloat)
"visibility_range_begin_margin"(GDfloat)
"visibility_range_end"(GDfloat)
"visibility_range_end_margin"(GDfloat)
"visibility_range_fade_mode"(GDVisibilityRangeFadeMode)
constructor { }

func("get_instance_shader_parameter") {
returns(GDVariant)
"name"(GDStringName)
}

func("set_instance_shader_parameter") {
returns(GDvoid)
"name"(GDStringName)
"value"(GDVariant)
}
}){

}