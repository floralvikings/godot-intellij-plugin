
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTextureProgressBar: GDType("TextureProgressBar", {

"fill_mode"(GDint)
"mouse_filter"(GDMouseFilter)
"nine_patch_stretch"(GDbool)
"radial_center_offset"(GDVector2)
"radial_fill_degrees"(GDfloat)
"radial_initial_angle"(GDfloat)
"size_flags_vertical"(GDUnknownType)
"step"(GDfloat)
"stretch_margin_bottom"(GDint)
"stretch_margin_left"(GDint)
"stretch_margin_right"(GDint)
"stretch_margin_top"(GDint)
"texture_over"(GDTexture2D)
"texture_progress"(GDTexture2D)
"texture_progress_offset"(GDVector2)
"texture_under"(GDTexture2D)
"tint_over"(GDColor)
"tint_progress"(GDColor)
"tint_under"(GDColor)
constructor { }

func("get_stretch_margin") {
returns(GDint)
"margin"(GDSide)
}

func("set_stretch_margin") {
returns(GDvoid)
"margin"(GDSide)
"value"(GDint)
}
}){

}