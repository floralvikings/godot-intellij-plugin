
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDLineEdit: GDType("LineEdit", {

"caret_color"(GDColor)
"clear_button_color"(GDColor)
"clear_button_color_pressed"(GDColor)
"font_color"(GDColor)
"font_outline_color"(GDColor)
"font_placeholder_color"(GDColor)
"font_selected_color"(GDColor)
"font_uneditable_color"(GDColor)
"selection_color"(GDColor)
"caret_width"(GDint)
"minimum_character_width"(GDint)
"outline_size"(GDint)
"font"(GDFont)
"font_size"(GDint)
"clear"(GDTexture2D)
"focus"(GDStyleBox)
"normal"(GDStyleBox)
"read_only"(GDStyleBox)
"alignment"(GDHorizontalAlignment)
"caret_blink"(GDbool)
"caret_blink_interval"(GDfloat)
"caret_column"(GDint)
"caret_force_displayed"(GDbool)
"caret_mid_grapheme"(GDbool)
"clear_button_enabled"(GDbool)
"context_menu_enabled"(GDbool)
"deselect_on_focus_loss_enabled"(GDbool)
"draw_control_chars"(GDbool)
"editable"(GDbool)
"expand_to_text_length"(GDbool)
"flat"(GDbool)
"focus_mode"(GDFocusMode)
"language"(GDString)
"max_length"(GDint)
"middle_mouse_paste_enabled"(GDbool)
"mouse_default_cursor_shape"(GDCursorShape)
"placeholder_text"(GDString)
"right_icon"(GDTexture2D)
"secret"(GDbool)
"secret_character"(GDString)
"select_all_on_focus"(GDbool)
"selecting_enabled"(GDbool)
"shortcut_keys_enabled"(GDbool)
"structured_text_bidi_override"(GDStructuredTextParser)
"structured_text_bidi_override_options"(GDArray)
"text"(GDString)
"text_direction"(GDTextDirection)
"virtual_keyboard_enabled"(GDbool)
"virtual_keyboard_type"(GDVirtualKeyboardType)
constructor { }

func("clear") {
returns(GDvoid)

}

func("delete_char_at_caret") {
returns(GDvoid)

}

func("delete_text") {
returns(GDvoid)
"from_column"(GDint)
"to_column"(GDint)
}

func("deselect") {
returns(GDvoid)

}

func("get_menu") {
returns(GDPopupMenu)

}

func("get_scroll_offset") {
returns(GDfloat)

}

func("get_selected_text") {
returns(GDString)

}

func("get_selection_from_column") {
returns(GDint)

}

func("get_selection_to_column") {
returns(GDint)

}

func("has_selection") {
returns(GDbool)

}

func("insert_text_at_caret") {
returns(GDvoid)
"text"(GDString)
}

func("is_menu_visible") {
returns(GDbool)

}

func("menu_option") {
returns(GDvoid)
"option"(GDint)
}

func("select") {
returns(GDvoid)
"from"(GDint)
"to"(GDint)
}

func("select_all") {
returns(GDvoid)

}
}){

}