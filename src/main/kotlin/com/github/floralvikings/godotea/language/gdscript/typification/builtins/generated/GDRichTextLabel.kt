
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRichTextLabel: GDType("RichTextLabel", {

"default_color"(GDColor)
"font_outline_color"(GDColor)
"font_selected_color"(GDColor)
"font_shadow_color"(GDColor)
"selection_color"(GDColor)
"table_border"(GDColor)
"table_even_row_bg"(GDColor)
"table_odd_row_bg"(GDColor)
"line_separation"(GDint)
"outline_size"(GDint)
"shadow_offset_x"(GDint)
"shadow_offset_y"(GDint)
"shadow_outline_size"(GDint)
"table_h_separation"(GDint)
"table_v_separation"(GDint)
"text_highlight_h_padding"(GDint)
"text_highlight_v_padding"(GDint)
"bold_font"(GDFont)
"bold_italics_font"(GDFont)
"italics_font"(GDFont)
"mono_font"(GDFont)
"normal_font"(GDFont)
"bold_font_size"(GDint)
"bold_italics_font_size"(GDint)
"italics_font_size"(GDint)
"mono_font_size"(GDint)
"normal_font_size"(GDint)
"focus"(GDStyleBox)
"normal"(GDStyleBox)
"autowrap_mode"(GDAutowrapMode)
"bbcode_enabled"(GDbool)
"clip_contents"(GDbool)
"context_menu_enabled"(GDbool)
"custom_effects"(GDArray)
"deselect_on_focus_loss_enabled"(GDbool)
"fit_content"(GDbool)
"hint_underlined"(GDbool)
"language"(GDString)
"meta_underlined"(GDbool)
"progress_bar_delay"(GDint)
"scroll_active"(GDbool)
"scroll_following"(GDbool)
"selection_enabled"(GDbool)
"shortcut_keys_enabled"(GDbool)
"structured_text_bidi_override"(GDStructuredTextParser)
"structured_text_bidi_override_options"(GDArray)
"tab_size"(GDint)
"text"(GDString)
"text_direction"(GDTextDirection)
"threaded"(GDbool)
"visible_characters"(GDint)
"visible_characters_behavior"(GDVisibleCharactersBehavior)
"visible_ratio"(GDfloat)
constructor { }

func("add_image") {
returns(GDvoid)
"image"(GDTexture2D)
"width"(GDint)
"height"(GDint)
"color"(GDColor)
"inline_align"(GDInlineAlignment)
"region"(GDRect2)
}

func("add_text") {
returns(GDvoid)
"text"(GDString)
}

func("append_text") {
returns(GDvoid)
"bbcode"(GDString)
}

func("clear") {
returns(GDvoid)

}

func("deselect") {
returns(GDvoid)

}

func("get_character_line") {
returns(GDint)
"character"(GDint)
}

func("get_character_paragraph") {
returns(GDint)
"character"(GDint)
}

func("get_content_height") {
returns(GDint)

}

func("get_content_width") {
returns(GDint)

}

func("get_line_count") {
returns(GDint)

}

func("get_line_offset") {
returns(GDfloat)
"line"(GDint)
}

func("get_menu") {
returns(GDPopupMenu)

}

func("get_paragraph_count") {
returns(GDint)

}

func("get_paragraph_offset") {
returns(GDfloat)
"paragraph"(GDint)
}

func("get_parsed_text") {
returns(GDString)

}

func("get_selected_text") {
returns(GDString)

}

func("get_selection_from") {
returns(GDint)

}

func("get_selection_to") {
returns(GDint)

}

func("get_total_character_count") {
returns(GDint)

}

func("get_v_scroll_bar") {
returns(GDVScrollBar)

}

func("get_visible_line_count") {
returns(GDint)

}

func("get_visible_paragraph_count") {
returns(GDint)

}

func("install_effect") {
returns(GDvoid)
"effect"(GDVariant)
}

func("is_menu_visible") {
returns(GDbool)

}

func("is_ready") {
returns(GDbool)

}

func("menu_option") {
returns(GDvoid)
"option"(GDint)
}

func("newline") {
returns(GDvoid)

}

func("parse_bbcode") {
returns(GDvoid)
"bbcode"(GDString)
}

func("parse_expressions_for_values") {
returns(GDDictionary)
"expressions"(GDPackedStringArray)
}

func("pop") {
returns(GDvoid)

}

func("push_bgcolor") {
returns(GDvoid)
"bgcolor"(GDColor)
}

func("push_bold") {
returns(GDvoid)

}

func("push_bold_italics") {
returns(GDvoid)

}

func("push_cell") {
returns(GDvoid)

}

func("push_color") {
returns(GDvoid)
"color"(GDColor)
}

func("push_customfx") {
returns(GDvoid)
"effect"(GDRichTextEffect)
"env"(GDDictionary)
}

func("push_dropcap") {
returns(GDvoid)
"string"(GDString)
"font"(GDFont)
"size"(GDint)
"dropcap_margins"(GDRect2)
"color"(GDColor)
"outline_size"(GDint)
"outline_color"(GDColor)
}

func("push_fgcolor") {
returns(GDvoid)
"fgcolor"(GDColor)
}

func("push_font") {
returns(GDvoid)
"font"(GDFont)
"font_size"(GDint)
}

func("push_font_size") {
returns(GDvoid)
"font_size"(GDint)
}

func("push_hint") {
returns(GDvoid)
"description"(GDString)
}

func("push_indent") {
returns(GDvoid)
"level"(GDint)
}

func("push_italics") {
returns(GDvoid)

}

func("push_list") {
returns(GDvoid)
"level"(GDint)
"type"(GDListType)
"capitalize"(GDbool)
"bullet"(GDString)
}

func("push_meta") {
returns(GDvoid)
"data"(GDVariant)
}

func("push_mono") {
returns(GDvoid)

}

func("push_normal") {
returns(GDvoid)

}

func("push_outline_color") {
returns(GDvoid)
"color"(GDColor)
}

func("push_outline_size") {
returns(GDvoid)
"outline_size"(GDint)
}

func("push_paragraph") {
returns(GDvoid)
"alignment"(GDHorizontalAlignment)
"base_direction"(GDTextDirection)
"language"(GDString)
"st_parser"(GDStructuredTextParser)
"justification_flags"(GDUnknownType)
"tab_stops"(GDPackedFloat32Array)
}

func("push_strikethrough") {
returns(GDvoid)

}

func("push_table") {
returns(GDvoid)
"columns"(GDint)
"inline_align"(GDInlineAlignment)
"align_to_row"(GDint)
}

func("push_underline") {
returns(GDvoid)

}

func("remove_paragraph") {
returns(GDbool)
"paragraph"(GDint)
}

func("scroll_to_line") {
returns(GDvoid)
"line"(GDint)
}

func("scroll_to_paragraph") {
returns(GDvoid)
"paragraph"(GDint)
}

func("scroll_to_selection") {
returns(GDvoid)

}

func("select_all") {
returns(GDvoid)

}

func("set_cell_border_color") {
returns(GDvoid)
"color"(GDColor)
}

func("set_cell_padding") {
returns(GDvoid)
"padding"(GDRect2)
}

func("set_cell_row_background_color") {
returns(GDvoid)
"odd_row_bg"(GDColor)
"even_row_bg"(GDColor)
}

func("set_cell_size_override") {
returns(GDvoid)
"min_size"(GDVector2)
"max_size"(GDVector2)
}

func("set_table_column_expand") {
returns(GDvoid)
"column"(GDint)
"expand"(GDbool)
"ratio"(GDint)
}
}){

}