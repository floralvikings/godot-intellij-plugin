
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGPUParticles2D: GDType("GPUParticles2D", {

"amount"(GDint)
"collision_base_size"(GDfloat)
"draw_order"(GDDrawOrder)
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
"texture"(GDTexture2D)
"trail_enabled"(GDbool)
"trail_lifetime"(GDfloat)
"trail_section_subdivisions"(GDint)
"trail_sections"(GDint)
"visibility_rect"(GDRect2)
constructor { }

func("capture_rect") {
returns(GDRect2)

}

func("emit_particle") {
returns(GDvoid)
"xform"(GDTransform2D)
"velocity"(GDVector2)
"color"(GDColor)
"custom"(GDColor)
"flags"(GDint)
}

func("restart") {
returns(GDvoid)

}
}){

}