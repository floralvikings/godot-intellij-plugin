
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMenuBar: GDType("MenuBar", {

"font_color"(GDColor)
"font_disabled_color"(GDColor)
"font_focus_color"(GDColor)
"font_hover_color"(GDColor)
"font_hover_pressed_color"(GDColor)
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
"flat"(GDbool)
"language"(GDString)
"prefer_global_menu"(GDbool)
"start_index"(GDint)
"switch_on_hover"(GDbool)
"text_direction"(GDTextDirection)
constructor { }

func("get_menu_count") {
returns(GDint)

}

func("get_menu_popup") {
returns(GDPopupMenu)
"menu"(GDint)
}

func("get_menu_title") {
returns(GDString)
"menu"(GDint)
}

func("get_menu_tooltip") {
returns(GDString)
"menu"(GDint)
}

func("is_menu_disabled") {
returns(GDbool)
"menu"(GDint)
}

func("is_menu_hidden") {
returns(GDbool)
"menu"(GDint)
}

func("is_native_menu") {
returns(GDbool)

}

func("set_disable_shortcuts") {
returns(GDvoid)
"disabled"(GDbool)
}

func("set_menu_disabled") {
returns(GDvoid)
"menu"(GDint)
"disabled"(GDbool)
}

func("set_menu_hidden") {
returns(GDvoid)
"menu"(GDint)
"hidden"(GDbool)
}

func("set_menu_title") {
returns(GDvoid)
"menu"(GDint)
"title"(GDString)
}

func("set_menu_tooltip") {
returns(GDvoid)
"menu"(GDint)
"tooltip"(GDString)
}
}){

}