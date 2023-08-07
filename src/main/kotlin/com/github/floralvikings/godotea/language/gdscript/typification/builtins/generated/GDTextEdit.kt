
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTextEdit: GDType("TextEdit", {

"background_color"(GDColor)
"caret_background_color"(GDColor)
"caret_color"(GDColor)
"current_line_color"(GDColor)
"font_color"(GDColor)
"font_outline_color"(GDColor)
"font_placeholder_color"(GDColor)
"font_readonly_color"(GDColor)
"font_selected_color"(GDColor)
"search_result_border_color"(GDColor)
"search_result_color"(GDColor)
"selection_color"(GDColor)
"word_highlighted_color"(GDColor)
"caret_width"(GDint)
"line_spacing"(GDint)
"outline_size"(GDint)
"font"(GDFont)
"font_size"(GDint)
"space"(GDTexture2D)
"tab"(GDTexture2D)
"focus"(GDStyleBox)
"normal"(GDStyleBox)
"read_only"(GDStyleBox)
"autowrap_mode"(GDAutowrapMode)
"caret_blink"(GDbool)
"caret_blink_interval"(GDfloat)
"caret_draw_when_editable_disabled"(GDbool)
"caret_mid_grapheme"(GDbool)
"caret_move_on_right_click"(GDbool)
"caret_multiple"(GDbool)
"caret_type"(GDCaretType)
"context_menu_enabled"(GDbool)
"deselect_on_focus_loss_enabled"(GDbool)
"drag_and_drop_selection_enabled"(GDbool)
"draw_control_chars"(GDbool)
"draw_spaces"(GDbool)
"draw_tabs"(GDbool)
"editable"(GDbool)
"focus_mode"(GDFocusMode)
"highlight_all_occurrences"(GDbool)
"highlight_current_line"(GDbool)
"language"(GDString)
"middle_mouse_paste_enabled"(GDbool)
"minimap_draw"(GDbool)
"minimap_width"(GDint)
"mouse_default_cursor_shape"(GDCursorShape)
"placeholder_text"(GDString)
"scroll_fit_content_height"(GDbool)
"scroll_horizontal"(GDint)
"scroll_past_end_of_file"(GDbool)
"scroll_smooth"(GDbool)
"scroll_v_scroll_speed"(GDfloat)
"scroll_vertical"(GDfloat)
"selecting_enabled"(GDbool)
"shortcut_keys_enabled"(GDbool)
"structured_text_bidi_override"(GDStructuredTextParser)
"structured_text_bidi_override_options"(GDArray)
"syntax_highlighter"(GDSyntaxHighlighter)
"text"(GDString)
"text_direction"(GDTextDirection)
"virtual_keyboard_enabled"(GDbool)
"wrap_mode"(GDLineWrappingMode)
constructor { }

func("_backspace") {
returns(GDvoid)
"caret_index"(GDint)
}

func("_copy") {
returns(GDvoid)
"caret_index"(GDint)
}

func("_cut") {
returns(GDvoid)
"caret_index"(GDint)
}

func("_handle_unicode_input") {
returns(GDvoid)
"unicode_char"(GDint)
"caret_index"(GDint)
}

func("_paste") {
returns(GDvoid)
"caret_index"(GDint)
}

func("_paste_primary_clipboard") {
returns(GDvoid)
"caret_index"(GDint)
}

func("add_caret") {
returns(GDint)
"line"(GDint)
"col"(GDint)
}

func("add_caret_at_carets") {
returns(GDvoid)
"below"(GDbool)
}

func("add_gutter") {
returns(GDvoid)
"at"(GDint)
}

func("add_selection_for_next_occurrence") {
returns(GDvoid)

}

func("adjust_carets_after_edit") {
returns(GDvoid)
"caret"(GDint)
"from_line"(GDint)
"from_col"(GDint)
"to_line"(GDint)
"to_col"(GDint)
}

func("adjust_viewport_to_caret") {
returns(GDvoid)
"caret_index"(GDint)
}

func("backspace") {
returns(GDvoid)
"caret_index"(GDint)
}

func("begin_complex_operation") {
returns(GDvoid)

}

func("center_viewport_to_caret") {
returns(GDvoid)
"caret_index"(GDint)
}

func("clear") {
returns(GDvoid)

}

func("clear_undo_history") {
returns(GDvoid)

}

func("copy") {
returns(GDvoid)
"caret_index"(GDint)
}

func("cut") {
returns(GDvoid)
"caret_index"(GDint)
}

func("delete_selection") {
returns(GDvoid)
"caret_index"(GDint)
}

func("deselect") {
returns(GDvoid)
"caret_index"(GDint)
}

func("end_action") {
returns(GDvoid)

}

func("end_complex_operation") {
returns(GDvoid)

}

func("get_caret_column") {
returns(GDint)
"caret_index"(GDint)
}

func("get_caret_count") {
returns(GDint)

}

func("get_caret_draw_pos") {
returns(GDVector2)
"caret_index"(GDint)
}

func("get_caret_index_edit_order") {
returns(GDPackedInt32Array)

}

func("get_caret_line") {
returns(GDint)
"caret_index"(GDint)
}

func("get_caret_wrap_index") {
returns(GDint)
"caret_index"(GDint)
}

func("get_first_non_whitespace_column") {
returns(GDint)
"line"(GDint)
}

func("get_first_visible_line") {
returns(GDint)

}

func("get_gutter_count") {
returns(GDint)

}

func("get_gutter_name") {
returns(GDString)
"gutter"(GDint)
}

func("get_gutter_type") {
returns(GDGutterType)
"gutter"(GDint)
}

func("get_gutter_width") {
returns(GDint)
"gutter"(GDint)
}

func("get_h_scroll_bar") {
returns(GDHScrollBar)

}

func("get_indent_level") {
returns(GDint)
"line"(GDint)
}

func("get_last_full_visible_line") {
returns(GDint)

}

func("get_last_full_visible_line_wrap_index") {
returns(GDint)

}

func("get_last_unhidden_line") {
returns(GDint)

}

func("get_line") {
returns(GDString)
"line"(GDint)
}

func("get_line_background_color") {
returns(GDColor)
"line"(GDint)
}

func("get_line_column_at_pos") {
returns(GDVector2i)
"position"(GDVector2i)
"allow_out_of_bounds"(GDbool)
}

func("get_line_count") {
returns(GDint)

}

func("get_line_gutter_icon") {
returns(GDTexture2D)
"line"(GDint)
"gutter"(GDint)
}

func("get_line_gutter_item_color") {
returns(GDColor)
"line"(GDint)
"gutter"(GDint)
}

func("get_line_gutter_metadata") {
returns(GDVariant)
"line"(GDint)
"gutter"(GDint)
}

func("get_line_gutter_text") {
returns(GDString)
"line"(GDint)
"gutter"(GDint)
}

func("get_line_height") {
returns(GDint)

}

func("get_line_width") {
returns(GDint)
"line"(GDint)
"wrap_index"(GDint)
}

func("get_line_wrap_count") {
returns(GDint)
"line"(GDint)
}

func("get_line_wrap_index_at_column") {
returns(GDint)
"line"(GDint)
"column"(GDint)
}

func("get_line_wrapped_text") {
returns(GDPackedStringArray)
"line"(GDint)
}

func("get_local_mouse_pos") {
returns(GDVector2)

}

func("get_menu") {
returns(GDPopupMenu)

}

func("get_minimap_line_at_pos") {
returns(GDint)
"position"(GDVector2i)
}

func("get_minimap_visible_lines") {
returns(GDint)

}

func("get_next_visible_line_index_offset_from") {
returns(GDVector2i)
"line"(GDint)
"wrap_index"(GDint)
"visible_amount"(GDint)
}

func("get_next_visible_line_offset_from") {
returns(GDint)
"line"(GDint)
"visible_amount"(GDint)
}

func("get_pos_at_line_column") {
returns(GDVector2i)
"line"(GDint)
"column"(GDint)
}

func("get_rect_at_line_column") {
returns(GDRect2i)
"line"(GDint)
"column"(GDint)
}

func("get_saved_version") {
returns(GDint)

}

func("get_scroll_pos_for_line") {
returns(GDfloat)
"line"(GDint)
"wrap_index"(GDint)
}

func("get_selected_text") {
returns(GDString)
"caret_index"(GDint)
}

func("get_selection_column") {
returns(GDint)
"caret_index"(GDint)
}

func("get_selection_from_column") {
returns(GDint)
"caret_index"(GDint)
}

func("get_selection_from_line") {
returns(GDint)
"caret_index"(GDint)
}

func("get_selection_line") {
returns(GDint)
"caret_index"(GDint)
}

func("get_selection_mode") {
returns(GDSelectionMode)

}

func("get_selection_to_column") {
returns(GDint)
"caret_index"(GDint)
}

func("get_selection_to_line") {
returns(GDint)
"caret_index"(GDint)
}

func("get_tab_size") {
returns(GDint)

}

func("get_total_gutter_width") {
returns(GDint)

}

func("get_total_visible_line_count") {
returns(GDint)

}

func("get_v_scroll_bar") {
returns(GDVScrollBar)

}

func("get_version") {
returns(GDint)

}

func("get_visible_line_count") {
returns(GDint)

}

func("get_visible_line_count_in_range") {
returns(GDint)
"from_line"(GDint)
"to_line"(GDint)
}

func("get_word_at_pos") {
returns(GDString)
"position"(GDVector2)
}

func("get_word_under_caret") {
returns(GDString)
"caret_index"(GDint)
}

func("has_ime_text") {
returns(GDbool)

}

func("has_redo") {
returns(GDbool)

}

func("has_selection") {
returns(GDbool)
"caret_index"(GDint)
}

func("has_undo") {
returns(GDbool)

}

func("insert_line_at") {
returns(GDvoid)
"line"(GDint)
"text"(GDString)
}

func("insert_text_at_caret") {
returns(GDvoid)
"text"(GDString)
"caret_index"(GDint)
}

func("is_caret_visible") {
returns(GDbool)
"caret_index"(GDint)
}

func("is_dragging_cursor") {
returns(GDbool)

}

func("is_gutter_clickable") {
returns(GDbool)
"gutter"(GDint)
}

func("is_gutter_drawn") {
returns(GDbool)
"gutter"(GDint)
}

func("is_gutter_overwritable") {
returns(GDbool)
"gutter"(GDint)
}

func("is_line_gutter_clickable") {
returns(GDbool)
"line"(GDint)
"gutter"(GDint)
}

func("is_line_wrapped") {
returns(GDbool)
"line"(GDint)
}

func("is_menu_visible") {
returns(GDbool)

}

func("is_mouse_over_selection") {
returns(GDbool)
"edges"(GDbool)
"caret_index"(GDint)
}

func("is_overtype_mode_enabled") {
returns(GDbool)

}

func("menu_option") {
returns(GDvoid)
"option"(GDint)
}

func("merge_gutters") {
returns(GDvoid)
"from_line"(GDint)
"to_line"(GDint)
}

func("merge_overlapping_carets") {
returns(GDvoid)

}

func("paste") {
returns(GDvoid)
"caret_index"(GDint)
}

func("paste_primary_clipboard") {
returns(GDvoid)
"caret_index"(GDint)
}

func("redo") {
returns(GDvoid)

}

func("remove_caret") {
returns(GDvoid)
"caret"(GDint)
}

func("remove_gutter") {
returns(GDvoid)
"gutter"(GDint)
}

func("remove_secondary_carets") {
returns(GDvoid)

}

func("remove_text") {
returns(GDvoid)
"from_line"(GDint)
"from_column"(GDint)
"to_line"(GDint)
"to_column"(GDint)
}

func("search") {
returns(GDVector2i)
"text"(GDString)
"flags"(GDint)
"from_line"(GDint)
"from_colum"(GDint)
}

func("select") {
returns(GDvoid)
"from_line"(GDint)
"from_column"(GDint)
"to_line"(GDint)
"to_column"(GDint)
"caret_index"(GDint)
}

func("select_all") {
returns(GDvoid)

}

func("select_word_under_caret") {
returns(GDvoid)
"caret_index"(GDint)
}

func("set_caret_column") {
returns(GDvoid)
"column"(GDint)
"adjust_viewport"(GDbool)
"caret_index"(GDint)
}

func("set_caret_line") {
returns(GDvoid)
"line"(GDint)
"adjust_viewport"(GDbool)
"can_be_hidden"(GDbool)
"wrap_index"(GDint)
"caret_index"(GDint)
}

func("set_gutter_clickable") {
returns(GDvoid)
"gutter"(GDint)
"clickable"(GDbool)
}

func("set_gutter_custom_draw") {
returns(GDvoid)
"column"(GDint)
"draw_callback"(GDCallable)
}

func("set_gutter_draw") {
returns(GDvoid)
"gutter"(GDint)
"draw"(GDbool)
}

func("set_gutter_name") {
returns(GDvoid)
"gutter"(GDint)
"name"(GDString)
}

func("set_gutter_overwritable") {
returns(GDvoid)
"gutter"(GDint)
"overwritable"(GDbool)
}

func("set_gutter_type") {
returns(GDvoid)
"gutter"(GDint)
"type"(GDGutterType)
}

func("set_gutter_width") {
returns(GDvoid)
"gutter"(GDint)
"width"(GDint)
}

func("set_line") {
returns(GDvoid)
"line"(GDint)
"new_text"(GDString)
}

func("set_line_as_center_visible") {
returns(GDvoid)
"line"(GDint)
"wrap_index"(GDint)
}

func("set_line_as_first_visible") {
returns(GDvoid)
"line"(GDint)
"wrap_index"(GDint)
}

func("set_line_as_last_visible") {
returns(GDvoid)
"line"(GDint)
"wrap_index"(GDint)
}

func("set_line_background_color") {
returns(GDvoid)
"line"(GDint)
"color"(GDColor)
}

func("set_line_gutter_clickable") {
returns(GDvoid)
"line"(GDint)
"gutter"(GDint)
"clickable"(GDbool)
}

func("set_line_gutter_icon") {
returns(GDvoid)
"line"(GDint)
"gutter"(GDint)
"icon"(GDTexture2D)
}

func("set_line_gutter_item_color") {
returns(GDvoid)
"line"(GDint)
"gutter"(GDint)
"color"(GDColor)
}

func("set_line_gutter_metadata") {
returns(GDvoid)
"line"(GDint)
"gutter"(GDint)
"metadata"(GDVariant)
}

func("set_line_gutter_text") {
returns(GDvoid)
"line"(GDint)
"gutter"(GDint)
"text"(GDString)
}

func("set_overtype_mode_enabled") {
returns(GDvoid)
"enabled"(GDbool)
}

func("set_search_flags") {
returns(GDvoid)
"flags"(GDint)
}

func("set_search_text") {
returns(GDvoid)
"search_text"(GDString)
}

func("set_selection_mode") {
returns(GDvoid)
"mode"(GDSelectionMode)
"line"(GDint)
"column"(GDint)
"caret_index"(GDint)
}

func("set_tab_size") {
returns(GDvoid)
"size"(GDint)
}

func("set_tooltip_request_func") {
returns(GDvoid)
"callback"(GDCallable)
}

func("start_action") {
returns(GDvoid)
"action"(GDEditAction)
}

func("swap_lines") {
returns(GDvoid)
"from_line"(GDint)
"to_line"(GDint)
}

func("tag_saved_version") {
returns(GDvoid)

}

func("undo") {
returns(GDvoid)

}
}){

}