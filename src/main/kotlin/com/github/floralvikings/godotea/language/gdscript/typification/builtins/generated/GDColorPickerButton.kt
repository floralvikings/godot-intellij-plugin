
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDColorPickerButton: GDType("ColorPickerButton", {

"font_color"(GDColor)
"font_disabled_color"(GDColor)
"font_focus_color"(GDColor)
"font_hover_color"(GDColor)
"font_outline_color"(GDColor)
"font_pressed_color"(GDColor)
"h_separation"(GDint)
"outline_size"(GDint)
"font"(GDFont)
"font_size"(GDint)
"bg"(GDTexture2D)
"disabled"(GDStyleBox)
"focus"(GDStyleBox)
"hover"(GDStyleBox)
"normal"(GDStyleBox)
"pressed"(GDStyleBox)
"color"(GDColor)
"edit_alpha"(GDbool)
"toggle_mode"(GDbool)
constructor { }

func("get_picker") {
returns(GDColorPicker)

}

func("get_popup") {
returns(GDPopupPanel)

}
}){

}