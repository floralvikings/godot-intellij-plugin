
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMenuButton: GDType("MenuButton", {

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
"disabled"(GDStyleBox)
"focus"(GDStyleBox)
"hover"(GDStyleBox)
"normal"(GDStyleBox)
"pressed"(GDStyleBox)
"action_mode"(GDActionMode)
"flat"(GDbool)
"focus_mode"(GDFocusMode)
"item_count"(GDint)
"switch_on_hover"(GDbool)
"toggle_mode"(GDbool)
constructor { }

func("get_popup") {
returns(GDPopupMenu)

}

func("set_disable_shortcuts") {
returns(GDvoid)
"disabled"(GDbool)
}

func("show_popup") {
returns(GDvoid)

}
}){

}