
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPopupMenu: GDType("PopupMenu", {

"font_accelerator_color"(GDColor)
"font_color"(GDColor)
"font_disabled_color"(GDColor)
"font_hover_color"(GDColor)
"font_outline_color"(GDColor)
"font_separator_color"(GDColor)
"font_separator_outline_color"(GDColor)
"h_separation"(GDint)
"icon_max_width"(GDint)
"indent"(GDint)
"item_end_padding"(GDint)
"item_start_padding"(GDint)
"outline_size"(GDint)
"separator_outline_size"(GDint)
"v_separation"(GDint)
"font"(GDFont)
"font_separator"(GDFont)
"font_separator_size"(GDint)
"font_size"(GDint)
"checked"(GDTexture2D)
"checked_disabled"(GDTexture2D)
"radio_checked"(GDTexture2D)
"radio_checked_disabled"(GDTexture2D)
"radio_unchecked"(GDTexture2D)
"radio_unchecked_disabled"(GDTexture2D)
"submenu"(GDTexture2D)
"submenu_mirrored"(GDTexture2D)
"unchecked"(GDTexture2D)
"unchecked_disabled"(GDTexture2D)
"hover"(GDStyleBox)
"labeled_separator_left"(GDStyleBox)
"labeled_separator_right"(GDStyleBox)
"panel"(GDStyleBox)
"panel_disabled"(GDStyleBox)
"separator"(GDStyleBox)
"allow_search"(GDbool)
"hide_on_checkable_item_selection"(GDbool)
"hide_on_item_selection"(GDbool)
"hide_on_state_item_selection"(GDbool)
"item_count"(GDint)
"submenu_popup_delay"(GDfloat)
constructor { }

func("add_check_item") {
returns(GDvoid)
"label"(GDString)
"id"(GDint)
"accel"(GDKey)
}

func("add_check_shortcut") {
returns(GDvoid)
"shortcut"(GDShortcut)
"id"(GDint)
"global"(GDbool)
}

func("add_icon_check_item") {
returns(GDvoid)
"texture"(GDTexture2D)
"label"(GDString)
"id"(GDint)
"accel"(GDKey)
}

func("add_icon_check_shortcut") {
returns(GDvoid)
"texture"(GDTexture2D)
"shortcut"(GDShortcut)
"id"(GDint)
"global"(GDbool)
}

func("add_icon_item") {
returns(GDvoid)
"texture"(GDTexture2D)
"label"(GDString)
"id"(GDint)
"accel"(GDKey)
}

func("add_icon_radio_check_item") {
returns(GDvoid)
"texture"(GDTexture2D)
"label"(GDString)
"id"(GDint)
"accel"(GDKey)
}

func("add_icon_radio_check_shortcut") {
returns(GDvoid)
"texture"(GDTexture2D)
"shortcut"(GDShortcut)
"id"(GDint)
"global"(GDbool)
}

func("add_icon_shortcut") {
returns(GDvoid)
"texture"(GDTexture2D)
"shortcut"(GDShortcut)
"id"(GDint)
"global"(GDbool)
}

func("add_item") {
returns(GDvoid)
"label"(GDString)
"id"(GDint)
"accel"(GDKey)
}

func("add_multistate_item") {
returns(GDvoid)
"label"(GDString)
"max_states"(GDint)
"default_state"(GDint)
"id"(GDint)
"accel"(GDKey)
}

func("add_radio_check_item") {
returns(GDvoid)
"label"(GDString)
"id"(GDint)
"accel"(GDKey)
}

func("add_radio_check_shortcut") {
returns(GDvoid)
"shortcut"(GDShortcut)
"id"(GDint)
"global"(GDbool)
}

func("add_separator") {
returns(GDvoid)
"label"(GDString)
"id"(GDint)
}

func("add_shortcut") {
returns(GDvoid)
"shortcut"(GDShortcut)
"id"(GDint)
"global"(GDbool)
}

func("add_submenu_item") {
returns(GDvoid)
"label"(GDString)
"submenu"(GDString)
"id"(GDint)
}

func("clear") {
returns(GDvoid)

}

func("get_focused_item") {
returns(GDint)

}

func("get_item_accelerator") {
returns(GDKey)
"index"(GDint)
}

func("get_item_icon") {
returns(GDTexture2D)
"index"(GDint)
}

func("get_item_icon_max_width") {
returns(GDint)
"index"(GDint)
}

func("get_item_icon_modulate") {
returns(GDColor)
"index"(GDint)
}

func("get_item_id") {
returns(GDint)
"index"(GDint)
}

func("get_item_indent") {
returns(GDint)
"index"(GDint)
}

func("get_item_index") {
returns(GDint)
"id"(GDint)
}

func("get_item_language") {
returns(GDString)
"index"(GDint)
}

func("get_item_metadata") {
returns(GDVariant)
"index"(GDint)
}

func("get_item_shortcut") {
returns(GDShortcut)
"index"(GDint)
}

func("get_item_submenu") {
returns(GDString)
"index"(GDint)
}

func("get_item_text") {
returns(GDString)
"index"(GDint)
}

func("get_item_text_direction") {
returns(GDTextDirection)
"index"(GDint)
}

func("get_item_tooltip") {
returns(GDString)
"index"(GDint)
}

func("is_item_checkable") {
returns(GDbool)
"index"(GDint)
}

func("is_item_checked") {
returns(GDbool)
"index"(GDint)
}

func("is_item_disabled") {
returns(GDbool)
"index"(GDint)
}

func("is_item_radio_checkable") {
returns(GDbool)
"index"(GDint)
}

func("is_item_separator") {
returns(GDbool)
"index"(GDint)
}

func("is_item_shortcut_disabled") {
returns(GDbool)
"index"(GDint)
}

func("remove_item") {
returns(GDvoid)
"index"(GDint)
}

func("scroll_to_item") {
returns(GDvoid)
"index"(GDint)
}

func("set_focused_item") {
returns(GDvoid)
"index"(GDint)
}

func("set_item_accelerator") {
returns(GDvoid)
"index"(GDint)
"accel"(GDKey)
}

func("set_item_as_checkable") {
returns(GDvoid)
"index"(GDint)
"enable"(GDbool)
}

func("set_item_as_radio_checkable") {
returns(GDvoid)
"index"(GDint)
"enable"(GDbool)
}

func("set_item_as_separator") {
returns(GDvoid)
"index"(GDint)
"enable"(GDbool)
}

func("set_item_checked") {
returns(GDvoid)
"index"(GDint)
"checked"(GDbool)
}

func("set_item_disabled") {
returns(GDvoid)
"index"(GDint)
"disabled"(GDbool)
}

func("set_item_icon") {
returns(GDvoid)
"index"(GDint)
"icon"(GDTexture2D)
}

func("set_item_icon_max_width") {
returns(GDvoid)
"index"(GDint)
"width"(GDint)
}

func("set_item_icon_modulate") {
returns(GDvoid)
"index"(GDint)
"modulate"(GDColor)
}

func("set_item_id") {
returns(GDvoid)
"index"(GDint)
"id"(GDint)
}

func("set_item_indent") {
returns(GDvoid)
"index"(GDint)
"indent"(GDint)
}

func("set_item_language") {
returns(GDvoid)
"index"(GDint)
"language"(GDString)
}

func("set_item_metadata") {
returns(GDvoid)
"index"(GDint)
"metadata"(GDVariant)
}

func("set_item_multistate") {
returns(GDvoid)
"index"(GDint)
"state"(GDint)
}

func("set_item_shortcut") {
returns(GDvoid)
"index"(GDint)
"shortcut"(GDShortcut)
"global"(GDbool)
}

func("set_item_shortcut_disabled") {
returns(GDvoid)
"index"(GDint)
"disabled"(GDbool)
}

func("set_item_submenu") {
returns(GDvoid)
"index"(GDint)
"submenu"(GDString)
}

func("set_item_text") {
returns(GDvoid)
"index"(GDint)
"text"(GDString)
}

func("set_item_text_direction") {
returns(GDvoid)
"index"(GDint)
"direction"(GDTextDirection)
}

func("set_item_tooltip") {
returns(GDvoid)
"index"(GDint)
"tooltip"(GDString)
}

func("toggle_item_checked") {
returns(GDvoid)
"index"(GDint)
}

func("toggle_item_multistate") {
returns(GDvoid)
"index"(GDint)
}
}){

}