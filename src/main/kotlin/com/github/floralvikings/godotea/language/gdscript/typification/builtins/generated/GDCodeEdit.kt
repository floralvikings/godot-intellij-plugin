
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCodeEdit: GDType("CodeEdit", {

"background_color"(GDColor)
"bookmark_color"(GDColor)
"brace_mismatch_color"(GDColor)
"breakpoint_color"(GDColor)
"caret_background_color"(GDColor)
"caret_color"(GDColor)
"code_folding_color"(GDColor)
"completion_background_color"(GDColor)
"completion_existing_color"(GDColor)
"completion_font_color"(GDColor)
"completion_scroll_color"(GDColor)
"completion_scroll_hovered_color"(GDColor)
"completion_selected_color"(GDColor)
"current_line_color"(GDColor)
"executing_line_color"(GDColor)
"font_color"(GDColor)
"font_outline_color"(GDColor)
"font_placeholder_color"(GDColor)
"font_readonly_color"(GDColor)
"font_selected_color"(GDColor)
"line_length_guideline_color"(GDColor)
"line_number_color"(GDColor)
"search_result_border_color"(GDColor)
"search_result_color"(GDColor)
"selection_color"(GDColor)
"word_highlighted_color"(GDColor)
"completion_lines"(GDint)
"completion_max_width"(GDint)
"completion_scroll_width"(GDint)
"line_spacing"(GDint)
"outline_size"(GDint)
"font"(GDFont)
"font_size"(GDint)
"bookmark"(GDTexture2D)
"breakpoint"(GDTexture2D)
"can_fold"(GDTexture2D)
"executing_line"(GDTexture2D)
"folded"(GDTexture2D)
"folded_eol_icon"(GDTexture2D)
"space"(GDTexture2D)
"tab"(GDTexture2D)
"completion"(GDStyleBox)
"focus"(GDStyleBox)
"normal"(GDStyleBox)
"read_only"(GDStyleBox)
"auto_brace_completion_enabled"(GDbool)
"auto_brace_completion_highlight_matching"(GDbool)
"auto_brace_completion_pairs"(GDDictionary)
"code_completion_enabled"(GDbool)
"code_completion_prefixes"(GDTypedArray(GDString::class))
"delimiter_comments"(GDTypedArray(GDString::class))
"delimiter_strings"(GDTypedArray(GDString::class))
"gutters_draw_bookmarks"(GDbool)
"gutters_draw_breakpoints_gutter"(GDbool)
"gutters_draw_executing_lines"(GDbool)
"gutters_draw_fold_gutter"(GDbool)
"gutters_draw_line_numbers"(GDbool)
"gutters_zero_pad_line_numbers"(GDbool)
"indent_automatic"(GDbool)
"indent_automatic_prefixes"(GDTypedArray(GDString::class))
"indent_size"(GDint)
"indent_use_spaces"(GDbool)
"layout_direction"(GDLayoutDirection)
"line_folding"(GDbool)
"line_length_guidelines"(GDTypedArray(GDint::class))
"symbol_lookup_on_click"(GDbool)
"text_direction"(GDTextDirection)
constructor { }

func("_confirm_code_completion") {
returns(GDvoid)
"replace"(GDbool)
}

func("_filter_code_completion_candidates") {
returns(GDTypedArray(GDDictionary::class))
"candidates"(GDTypedArray(GDDictionary::class))
}

func("_request_code_completion") {
returns(GDvoid)
"force"(GDbool)
}

func("add_auto_brace_completion_pair") {
returns(GDvoid)
"start_key"(GDString)
"end_key"(GDString)
}

func("add_code_completion_option") {
returns(GDvoid)
"type"(GDCodeCompletionKind)
"display_text"(GDString)
"insert_text"(GDString)
"text_color"(GDColor)
"icon"(GDResource)
"value"(GDVariant)
"location"(GDint)
}

func("add_comment_delimiter") {
returns(GDvoid)
"start_key"(GDString)
"end_key"(GDString)
"line_only"(GDbool)
}

func("add_string_delimiter") {
returns(GDvoid)
"start_key"(GDString)
"end_key"(GDString)
"line_only"(GDbool)
}

func("can_fold_line") {
returns(GDbool)
"line"(GDint)
}

func("cancel_code_completion") {
returns(GDvoid)

}

func("clear_bookmarked_lines") {
returns(GDvoid)

}

func("clear_breakpointed_lines") {
returns(GDvoid)

}

func("clear_comment_delimiters") {
returns(GDvoid)

}

func("clear_executing_lines") {
returns(GDvoid)

}

func("clear_string_delimiters") {
returns(GDvoid)

}

func("confirm_code_completion") {
returns(GDvoid)
"replace"(GDbool)
}

func("convert_indent") {
returns(GDvoid)
"from_line"(GDint)
"to_line"(GDint)
}

func("do_indent") {
returns(GDvoid)

}

func("fold_all_lines") {
returns(GDvoid)

}

func("fold_line") {
returns(GDvoid)
"line"(GDint)
}

func("get_auto_brace_completion_close_key") {
returns(GDString)
"open_key"(GDString)
}

func("get_bookmarked_lines") {
returns(GDPackedInt32Array)

}

func("get_breakpointed_lines") {
returns(GDPackedInt32Array)

}

func("get_code_completion_option") {
returns(GDDictionary)
"index"(GDint)
}

func("get_code_completion_options") {
returns(GDTypedArray(GDDictionary::class))

}

func("get_code_completion_selected_index") {
returns(GDint)

}

func("get_delimiter_end_key") {
returns(GDString)
"delimiter_index"(GDint)
}

func("get_delimiter_end_position") {
returns(GDVector2)
"line"(GDint)
"column"(GDint)
}

func("get_delimiter_start_key") {
returns(GDString)
"delimiter_index"(GDint)
}

func("get_delimiter_start_position") {
returns(GDVector2)
"line"(GDint)
"column"(GDint)
}

func("get_executing_lines") {
returns(GDPackedInt32Array)

}

func("get_folded_lines") {
returns(GDTypedArray(GDint::class))

}

func("get_text_for_code_completion") {
returns(GDString)

}

func("get_text_for_symbol_lookup") {
returns(GDString)

}

func("has_auto_brace_completion_close_key") {
returns(GDbool)
"close_key"(GDString)
}

func("has_auto_brace_completion_open_key") {
returns(GDbool)
"open_key"(GDString)
}

func("has_comment_delimiter") {
returns(GDbool)
"start_key"(GDString)
}

func("has_string_delimiter") {
returns(GDbool)
"start_key"(GDString)
}

func("indent_lines") {
returns(GDvoid)

}

func("is_in_comment") {
returns(GDint)
"line"(GDint)
"column"(GDint)
}

func("is_in_string") {
returns(GDint)
"line"(GDint)
"column"(GDint)
}

func("is_line_bookmarked") {
returns(GDbool)
"line"(GDint)
}

func("is_line_breakpointed") {
returns(GDbool)
"line"(GDint)
}

func("is_line_executing") {
returns(GDbool)
"line"(GDint)
}

func("is_line_folded") {
returns(GDbool)
"line"(GDint)
}

func("remove_comment_delimiter") {
returns(GDvoid)
"start_key"(GDString)
}

func("remove_string_delimiter") {
returns(GDvoid)
"start_key"(GDString)
}

func("request_code_completion") {
returns(GDvoid)
"force"(GDbool)
}

func("set_code_completion_selected_index") {
returns(GDvoid)
"index"(GDint)
}

func("set_code_hint") {
returns(GDvoid)
"code_hint"(GDString)
}

func("set_code_hint_draw_below") {
returns(GDvoid)
"draw_below"(GDbool)
}

func("set_line_as_bookmarked") {
returns(GDvoid)
"line"(GDint)
"bookmarked"(GDbool)
}

func("set_line_as_breakpoint") {
returns(GDvoid)
"line"(GDint)
"breakpointed"(GDbool)
}

func("set_line_as_executing") {
returns(GDvoid)
"line"(GDint)
"executing"(GDbool)
}

func("set_symbol_lookup_word_as_valid") {
returns(GDvoid)
"valid"(GDbool)
}

func("toggle_foldable_line") {
returns(GDvoid)
"line"(GDint)
}

func("unfold_all_lines") {
returns(GDvoid)

}

func("unfold_line") {
returns(GDvoid)
"line"(GDint)
}

func("unindent_lines") {
returns(GDvoid)

}

func("update_code_completion_options") {
returns(GDvoid)
"force"(GDbool)
}
}){

}