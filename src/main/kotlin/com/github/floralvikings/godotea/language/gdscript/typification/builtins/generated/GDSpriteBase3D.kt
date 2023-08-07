
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSpriteBase3D: GDType("SpriteBase3D", {

"alpha_antialiasing_edge"(GDfloat)
"alpha_antialiasing_mode"(GDAlphaAntiAliasing)
"alpha_cut"(GDAlphaCutMode)
"alpha_hash_scale"(GDfloat)
"alpha_scissor_threshold"(GDfloat)
"axis"(GDVector3Axis)
"billboard"(GDBillboardMode)
"centered"(GDbool)
"double_sided"(GDbool)
"fixed_size"(GDbool)
"flip_h"(GDbool)
"flip_v"(GDbool)
"modulate"(GDColor)
"no_depth_test"(GDbool)
"offset"(GDVector2)
"pixel_size"(GDfloat)
"render_priority"(GDint)
"shaded"(GDbool)
"texture_filter"(GDTextureFilter)
"transparent"(GDbool)
constructor { }

func("generate_triangle_mesh") {
returns(GDTriangleMesh)

}

func("get_draw_flag") {
returns(GDbool)
"flag"(GDDrawFlags)
}

func("get_item_rect") {
returns(GDRect2)

}

func("set_draw_flag") {
returns(GDvoid)
"flag"(GDDrawFlags)
"enabled"(GDbool)
}
}){

}