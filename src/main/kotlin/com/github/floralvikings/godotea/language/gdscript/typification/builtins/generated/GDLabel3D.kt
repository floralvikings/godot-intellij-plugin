
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDLabel3D: GDType("Label3D", {

"alpha_antialiasing_edge"(GDfloat)
"alpha_antialiasing_mode"(GDAlphaAntiAliasing)
"alpha_cut"(GDAlphaCutMode)
"alpha_hash_scale"(GDfloat)
"alpha_scissor_threshold"(GDfloat)
"autowrap_mode"(GDAutowrapMode)
"billboard"(GDBillboardMode)
"cast_shadow"(GDShadowCastingSetting)
"double_sided"(GDbool)
"fixed_size"(GDbool)
"font"(GDFont)
"font_size"(GDint)
"gi_mode"(GDGIMode)
"horizontal_alignment"(GDHorizontalAlignment)
"justification_flags"(GDUnknownType)
"language"(GDString)
"line_spacing"(GDfloat)
"modulate"(GDColor)
"no_depth_test"(GDbool)
"offset"(GDVector2)
"outline_modulate"(GDColor)
"outline_render_priority"(GDint)
"outline_size"(GDint)
"pixel_size"(GDfloat)
"render_priority"(GDint)
"shaded"(GDbool)
"structured_text_bidi_override"(GDStructuredTextParser)
"structured_text_bidi_override_options"(GDArray)
"text"(GDString)
"text_direction"(GDDirection)
"texture_filter"(GDTextureFilter)
"uppercase"(GDbool)
"vertical_alignment"(GDVerticalAlignment)
"width"(GDfloat)
constructor { }

func("generate_triangle_mesh") {
returns(GDTriangleMesh)

}

func("get_draw_flag") {
returns(GDbool)
"flag"(GDDrawFlags)
}

func("set_draw_flag") {
returns(GDvoid)
"flag"(GDDrawFlags)
"enabled"(GDbool)
}
}){

}