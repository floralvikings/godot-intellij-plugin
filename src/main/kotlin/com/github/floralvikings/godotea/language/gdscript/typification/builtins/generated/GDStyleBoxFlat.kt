
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDStyleBoxFlat: GDType("StyleBoxFlat", {

"anti_aliasing"(GDbool)
"anti_aliasing_size"(GDfloat)
"bg_color"(GDColor)
"border_blend"(GDbool)
"border_color"(GDColor)
"border_width_bottom"(GDint)
"border_width_left"(GDint)
"border_width_right"(GDint)
"border_width_top"(GDint)
"corner_detail"(GDint)
"corner_radius_bottom_left"(GDint)
"corner_radius_bottom_right"(GDint)
"corner_radius_top_left"(GDint)
"corner_radius_top_right"(GDint)
"draw_center"(GDbool)
"expand_margin_bottom"(GDfloat)
"expand_margin_left"(GDfloat)
"expand_margin_right"(GDfloat)
"expand_margin_top"(GDfloat)
"shadow_color"(GDColor)
"shadow_offset"(GDVector2)
"shadow_size"(GDint)
"skew"(GDVector2)
constructor { }

func("get_border_width") {
returns(GDint)
"margin"(GDSide)
}

func("get_border_width_min") {
returns(GDint)

}

func("get_corner_radius") {
returns(GDint)
"corner"(GDCorner)
}

func("get_expand_margin") {
returns(GDfloat)
"margin"(GDSide)
}

func("set_border_width") {
returns(GDvoid)
"margin"(GDSide)
"width"(GDint)
}

func("set_border_width_all") {
returns(GDvoid)
"width"(GDint)
}

func("set_corner_radius") {
returns(GDvoid)
"corner"(GDCorner)
"radius"(GDint)
}

func("set_corner_radius_all") {
returns(GDvoid)
"radius"(GDint)
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
}){

}