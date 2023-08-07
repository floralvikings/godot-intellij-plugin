
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTree: GDType("Tree", {

"children_hl_line_color"(GDColor)
"custom_button_font_highlight"(GDColor)
"drop_position_color"(GDColor)
"font_color"(GDColor)
"font_outline_color"(GDColor)
"font_selected_color"(GDColor)
"guide_color"(GDColor)
"parent_hl_line_color"(GDColor)
"relationship_line_color"(GDColor)
"title_button_color"(GDColor)
"button_margin"(GDint)
"children_hl_line_width"(GDint)
"draw_guides"(GDint)
"draw_relationship_lines"(GDint)
"h_separation"(GDint)
"icon_max_width"(GDint)
"item_margin"(GDint)
"outline_size"(GDint)
"parent_hl_line_margin"(GDint)
"parent_hl_line_width"(GDint)
"relationship_line_width"(GDint)
"scroll_border"(GDint)
"scroll_speed"(GDint)
"scrollbar_h_separation"(GDint)
"scrollbar_margin_bottom"(GDint)
"scrollbar_margin_left"(GDint)
"scrollbar_margin_right"(GDint)
"scrollbar_margin_top"(GDint)
"scrollbar_v_separation"(GDint)
"v_separation"(GDint)
"font"(GDFont)
"title_button_font"(GDFont)
"font_size"(GDint)
"arrow"(GDTexture2D)
"arrow_collapsed"(GDTexture2D)
"arrow_collapsed_mirrored"(GDTexture2D)
"checked"(GDTexture2D)
"indeterminate"(GDTexture2D)
"select_arrow"(GDTexture2D)
"unchecked"(GDTexture2D)
"updown"(GDTexture2D)
"button_pressed"(GDStyleBox)
"cursor"(GDStyleBox)
"cursor_unfocused"(GDStyleBox)
"custom_button"(GDStyleBox)
"custom_button_hover"(GDStyleBox)
"custom_button_pressed"(GDStyleBox)
"focus"(GDStyleBox)
"panel"(GDStyleBox)
"selected"(GDStyleBox)
"selected_focus"(GDStyleBox)
"title_button_hover"(GDStyleBox)
"title_button_normal"(GDStyleBox)
"title_button_pressed"(GDStyleBox)
"allow_reselect"(GDbool)
"allow_rmb_select"(GDbool)
"allow_search"(GDbool)
"clip_contents"(GDbool)
"column_titles_visible"(GDbool)
"columns"(GDint)
"drop_mode_flags"(GDint)
"enable_recursive_folding"(GDbool)
"focus_mode"(GDFocusMode)
"hide_folding"(GDbool)
"hide_root"(GDbool)
"scroll_horizontal_enabled"(GDbool)
"scroll_vertical_enabled"(GDbool)
"select_mode"(GDSelectMode)
constructor { }

func("clear") {
returns(GDvoid)

}

func("create_item") {
returns(GDTreeItem)
"parent"(GDTreeItem)
"index"(GDint)
}

func("deselect_all") {
returns(GDvoid)

}

func("edit_selected") {
returns(GDbool)
"force_edit"(GDbool)
}

func("ensure_cursor_is_visible") {
returns(GDvoid)

}

func("get_button_id_at_position") {
returns(GDint)
"position"(GDVector2)
}

func("get_column_at_position") {
returns(GDint)
"position"(GDVector2)
}

func("get_column_expand_ratio") {
returns(GDint)
"column"(GDint)
}

func("get_column_title") {
returns(GDString)
"column"(GDint)
}

func("get_column_title_alignment") {
returns(GDHorizontalAlignment)
"column"(GDint)
}

func("get_column_title_direction") {
returns(GDTextDirection)
"column"(GDint)
}

func("get_column_title_language") {
returns(GDString)
"column"(GDint)
}

func("get_column_width") {
returns(GDint)
"column"(GDint)
}

func("get_custom_popup_rect") {
returns(GDRect2)

}

func("get_drop_section_at_position") {
returns(GDint)
"position"(GDVector2)
}

func("get_edited") {
returns(GDTreeItem)

}

func("get_edited_column") {
returns(GDint)

}

func("get_item_area_rect") {
returns(GDRect2)
"item"(GDTreeItem)
"column"(GDint)
"button_index"(GDint)
}

func("get_item_at_position") {
returns(GDTreeItem)
"position"(GDVector2)
}

func("get_next_selected") {
returns(GDTreeItem)
"from"(GDTreeItem)
}

func("get_pressed_button") {
returns(GDint)

}

func("get_root") {
returns(GDTreeItem)

}

func("get_scroll") {
returns(GDVector2)

}

func("get_selected") {
returns(GDTreeItem)

}

func("get_selected_column") {
returns(GDint)

}

func("is_column_clipping_content") {
returns(GDbool)
"column"(GDint)
}

func("is_column_expanding") {
returns(GDbool)
"column"(GDint)
}

func("scroll_to_item") {
returns(GDvoid)
"item"(GDTreeItem)
"center_on_item"(GDbool)
}

func("set_column_clip_content") {
returns(GDvoid)
"column"(GDint)
"enable"(GDbool)
}

func("set_column_custom_minimum_width") {
returns(GDvoid)
"column"(GDint)
"min_width"(GDint)
}

func("set_column_expand") {
returns(GDvoid)
"column"(GDint)
"expand"(GDbool)
}

func("set_column_expand_ratio") {
returns(GDvoid)
"column"(GDint)
"ratio"(GDint)
}

func("set_column_title") {
returns(GDvoid)
"column"(GDint)
"title"(GDString)
}

func("set_column_title_alignment") {
returns(GDvoid)
"column"(GDint)
"title_alignment"(GDHorizontalAlignment)
}

func("set_column_title_direction") {
returns(GDvoid)
"column"(GDint)
"direction"(GDTextDirection)
}

func("set_column_title_language") {
returns(GDvoid)
"column"(GDint)
"language"(GDString)
}

func("set_selected") {
returns(GDvoid)
"item"(GDTreeItem)
"column"(GDint)
}
}){

}