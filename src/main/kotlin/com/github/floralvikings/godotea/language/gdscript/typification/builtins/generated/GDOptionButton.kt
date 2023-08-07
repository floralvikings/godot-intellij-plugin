
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDOptionButton: GDType("OptionButton", {

"font_color"(GDColor)
"font_disabled_color"(GDColor)
"font_focus_color"(GDColor)
"font_hover_color"(GDColor)
"font_hover_pressed_color"(GDColor)
"font_outline_color"(GDColor)
"font_pressed_color"(GDColor)
"arrow_margin"(GDint)
"h_separation"(GDint)
"modulate_arrow"(GDint)
"outline_size"(GDint)
"font"(GDFont)
"font_size"(GDint)
"arrow"(GDTexture2D)
"disabled"(GDStyleBox)
"disabled_mirrored"(GDStyleBox)
"focus"(GDStyleBox)
"hover"(GDStyleBox)
"hover_mirrored"(GDStyleBox)
"normal"(GDStyleBox)
"normal_mirrored"(GDStyleBox)
"pressed"(GDStyleBox)
"pressed_mirrored"(GDStyleBox)
"action_mode"(GDActionMode)
"alignment"(GDHorizontalAlignment)
"allow_reselect"(GDbool)
"fit_to_longest_item"(GDbool)
"item_count"(GDint)
"selected"(GDint)
"toggle_mode"(GDbool)
constructor { }

func("add_icon_item") {
returns(GDvoid)
"texture"(GDTexture2D)
"label"(GDString)
"id"(GDint)
}

func("add_item") {
returns(GDvoid)
"label"(GDString)
"id"(GDint)
}

func("add_separator") {
returns(GDvoid)
"text"(GDString)
}

func("clear") {
returns(GDvoid)

}

func("get_item_icon") {
returns(GDTexture2D)
"idx"(GDint)
}

func("get_item_id") {
returns(GDint)
"idx"(GDint)
}

func("get_item_index") {
returns(GDint)
"id"(GDint)
}

func("get_item_metadata") {
returns(GDVariant)
"idx"(GDint)
}

func("get_item_text") {
returns(GDString)
"idx"(GDint)
}

func("get_item_tooltip") {
returns(GDString)
"idx"(GDint)
}

func("get_popup") {
returns(GDPopupMenu)

}

func("get_selectable_item") {
returns(GDint)
"from_last"(GDbool)
}

func("get_selected_id") {
returns(GDint)

}

func("get_selected_metadata") {
returns(GDVariant)

}

func("has_selectable_items") {
returns(GDbool)

}

func("is_item_disabled") {
returns(GDbool)
"idx"(GDint)
}

func("is_item_separator") {
returns(GDbool)
"idx"(GDint)
}

func("remove_item") {
returns(GDvoid)
"idx"(GDint)
}

func("select") {
returns(GDvoid)
"idx"(GDint)
}

func("set_item_disabled") {
returns(GDvoid)
"idx"(GDint)
"disabled"(GDbool)
}

func("set_item_icon") {
returns(GDvoid)
"idx"(GDint)
"texture"(GDTexture2D)
}

func("set_item_id") {
returns(GDvoid)
"idx"(GDint)
"id"(GDint)
}

func("set_item_metadata") {
returns(GDvoid)
"idx"(GDint)
"metadata"(GDVariant)
}

func("set_item_text") {
returns(GDvoid)
"idx"(GDint)
"text"(GDString)
}

func("set_item_tooltip") {
returns(GDvoid)
"idx"(GDint)
"tooltip"(GDString)
}

func("show_popup") {
returns(GDvoid)

}
}){

}