
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTabBar: GDType("TabBar", {

"drop_mark_color"(GDColor)
"font_disabled_color"(GDColor)
"font_hovered_color"(GDColor)
"font_outline_color"(GDColor)
"font_selected_color"(GDColor)
"font_unselected_color"(GDColor)
"h_separation"(GDint)
"icon_max_width"(GDint)
"outline_size"(GDint)
"font"(GDFont)
"font_size"(GDint)
"close"(GDTexture2D)
"decrement"(GDTexture2D)
"decrement_highlight"(GDTexture2D)
"drop_mark"(GDTexture2D)
"increment"(GDTexture2D)
"increment_highlight"(GDTexture2D)
"button_highlight"(GDStyleBox)
"button_pressed"(GDStyleBox)
"tab_disabled"(GDStyleBox)
"tab_hovered"(GDStyleBox)
"tab_selected"(GDStyleBox)
"tab_unselected"(GDStyleBox)
"clip_tabs"(GDbool)
"current_tab"(GDint)
"drag_to_rearrange_enabled"(GDbool)
"max_tab_width"(GDint)
"scroll_to_selected"(GDbool)
"scrolling_enabled"(GDbool)
"select_with_rmb"(GDbool)
"tab_alignment"(GDAlignmentMode)
"tab_close_display_policy"(GDCloseButtonDisplayPolicy)
"tab_count"(GDint)
"tabs_rearrange_group"(GDint)
constructor { }

func("add_tab") {
returns(GDvoid)
"title"(GDString)
"icon"(GDTexture2D)
}

func("clear_tabs") {
returns(GDvoid)

}

func("ensure_tab_visible") {
returns(GDvoid)
"idx"(GDint)
}

func("get_offset_buttons_visible") {
returns(GDbool)

}

func("get_previous_tab") {
returns(GDint)

}

func("get_tab_button_icon") {
returns(GDTexture2D)
"tab_idx"(GDint)
}

func("get_tab_icon") {
returns(GDTexture2D)
"tab_idx"(GDint)
}

func("get_tab_icon_max_width") {
returns(GDint)
"tab_idx"(GDint)
}

func("get_tab_idx_at_point") {
returns(GDint)
"point"(GDVector2)
}

func("get_tab_language") {
returns(GDString)
"tab_idx"(GDint)
}

func("get_tab_metadata") {
returns(GDVariant)
"tab_idx"(GDint)
}

func("get_tab_offset") {
returns(GDint)

}

func("get_tab_rect") {
returns(GDRect2)
"tab_idx"(GDint)
}

func("get_tab_text_direction") {
returns(GDTextDirection)
"tab_idx"(GDint)
}

func("get_tab_title") {
returns(GDString)
"tab_idx"(GDint)
}

func("is_tab_disabled") {
returns(GDbool)
"tab_idx"(GDint)
}

func("is_tab_hidden") {
returns(GDbool)
"tab_idx"(GDint)
}

func("move_tab") {
returns(GDvoid)
"from"(GDint)
"to"(GDint)
}

func("remove_tab") {
returns(GDvoid)
"tab_idx"(GDint)
}

func("set_tab_button_icon") {
returns(GDvoid)
"tab_idx"(GDint)
"icon"(GDTexture2D)
}

func("set_tab_disabled") {
returns(GDvoid)
"tab_idx"(GDint)
"disabled"(GDbool)
}

func("set_tab_hidden") {
returns(GDvoid)
"tab_idx"(GDint)
"hidden"(GDbool)
}

func("set_tab_icon") {
returns(GDvoid)
"tab_idx"(GDint)
"icon"(GDTexture2D)
}

func("set_tab_icon_max_width") {
returns(GDvoid)
"tab_idx"(GDint)
"width"(GDint)
}

func("set_tab_language") {
returns(GDvoid)
"tab_idx"(GDint)
"language"(GDString)
}

func("set_tab_metadata") {
returns(GDvoid)
"tab_idx"(GDint)
"metadata"(GDVariant)
}

func("set_tab_text_direction") {
returns(GDvoid)
"tab_idx"(GDint)
"direction"(GDTextDirection)
}

func("set_tab_title") {
returns(GDvoid)
"tab_idx"(GDint)
"title"(GDString)
}
}){

}