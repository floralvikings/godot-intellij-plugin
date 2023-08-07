
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGPUParticles3D: GDType("GPUParticles3D", {

"amount"(GDint)
"collision_base_size"(GDfloat)
"draw_order"(GDDrawOrder)
"draw_pass_1"(GDMesh)
"draw_pass_2"(GDMesh)
"draw_pass_3"(GDMesh)
"draw_pass_4"(GDMesh)
"draw_passes"(GDint)
"draw_skin"(GDSkin)
"emitting"(GDbool)
"explosiveness"(GDfloat)
"fixed_fps"(GDint)
"fract_delta"(GDbool)
"interpolate"(GDbool)
"lifetime"(GDfloat)
"local_coords"(GDbool)
"one_shot"(GDbool)
"preprocess"(GDfloat)
"process_material"(GDMaterial)
"randomness"(GDfloat)
"speed_scale"(GDfloat)
"sub_emitter"(GDNodePath)
"trail_enabled"(GDbool)
"trail_lifetime"(GDfloat)
"transform_align"(GDTransformAlign)
"visibility_aabb"(GDAABB)
constructor { }

func("capture_aabb") {
returns(GDAABB)

}

func("emit_particle") {
returns(GDvoid)
"xform"(GDTransform3D)
"velocity"(GDVector3)
"color"(GDColor)
"custom"(GDColor)
"flags"(GDint)
}

func("get_draw_pass_mesh") {
returns(GDMesh)
"pass"(GDint)
}

func("restart") {
returns(GDvoid)

}

func("set_draw_pass_mesh") {
returns(GDvoid)
"pass"(GDint)
"mesh"(GDMesh)
}
}){

}