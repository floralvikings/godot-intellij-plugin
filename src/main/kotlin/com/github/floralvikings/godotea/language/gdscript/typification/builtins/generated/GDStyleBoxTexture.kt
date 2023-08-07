
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDStyleBoxTexture: GDType("StyleBoxTexture", {

"axis_stretch_horizontal"(GDAxisStretchMode)
"axis_stretch_vertical"(GDAxisStretchMode)
"draw_center"(GDbool)
"expand_margin_bottom"(GDfloat)
"expand_margin_left"(GDfloat)
"expand_margin_right"(GDfloat)
"expand_margin_top"(GDfloat)
"modulate_color"(GDColor)
"region_rect"(GDRect2)
"texture"(GDTexture2D)
"texture_margin_bottom"(GDfloat)
"texture_margin_left"(GDfloat)
"texture_margin_right"(GDfloat)
"texture_margin_top"(GDfloat)
constructor { }

func("get_expand_margin") {
returns(GDfloat)
"margin"(GDSide)
}

func("get_texture_margin") {
returns(GDfloat)
"margin"(GDSide)
}

func("set_expand_margin") {
returns(GDvoid)
"margin"(GDSide)
"size"(GDfloat)
}

func("set_expand_margin_all") {
returns(GDvoid)
"size"(GDfloat)
}

func("set_texture_margin") {
returns(GDvoid)
"margin"(GDSide)
"size"(GDfloat)
}

func("set_texture_margin_all") {
returns(GDvoid)
"size"(GDfloat)
}
}){

}