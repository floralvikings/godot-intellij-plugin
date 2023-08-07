
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDColorPicker: GDType("ColorPicker", {

"center_slider_grabbers"(GDint)
"h_width"(GDint)
"label_width"(GDint)
"margin"(GDint)
"sv_height"(GDint)
"sv_width"(GDint)
"add_preset"(GDTexture2D)
"bar_arrow"(GDTexture2D)
"color_hue"(GDTexture2D)
"color_okhsl_hue"(GDTexture2D)
"expanded_arrow"(GDTexture2D)
"folded_arrow"(GDTexture2D)
"overbright_indicator"(GDTexture2D)
"picker_cursor"(GDTexture2D)
"sample_bg"(GDTexture2D)
"screen_picker"(GDTexture2D)
"shape_circle"(GDTexture2D)
"shape_rect"(GDTexture2D)
"shape_rect_wheel"(GDTexture2D)
"can_add_swatches"(GDbool)
"color"(GDColor)
"color_mode"(GDColorModeType)
"color_modes_visible"(GDbool)
"deferred_mode"(GDbool)
"edit_alpha"(GDbool)
"hex_visible"(GDbool)
"picker_shape"(GDPickerShapeType)
"presets_visible"(GDbool)
"sampler_visible"(GDbool)
"sliders_visible"(GDbool)
constructor { }

func("add_preset") {
returns(GDvoid)
"color"(GDColor)
}

func("add_recent_preset") {
returns(GDvoid)
"color"(GDColor)
}

func("erase_preset") {
returns(GDvoid)
"color"(GDColor)
}

func("erase_recent_preset") {
returns(GDvoid)
"color"(GDColor)
}

func("get_presets") {
returns(GDPackedColorArray)

}

func("get_recent_presets") {
returns(GDPackedColorArray)

}
}){

}