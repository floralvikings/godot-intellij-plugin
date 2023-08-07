
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDItemList: GDType("ItemList", {

"font_color"(GDColor)
"font_hovered_color"(GDColor)
"font_outline_color"(GDColor)
"font_selected_color"(GDColor)
"guide_color"(GDColor)
"h_separation"(GDint)
"icon_margin"(GDint)
"line_separation"(GDint)
"outline_size"(GDint)
"v_separation"(GDint)
"font"(GDFont)
"font_size"(GDint)
"cursor"(GDStyleBox)
"cursor_unfocused"(GDStyleBox)
"focus"(GDStyleBox)
"hovered"(GDStyleBox)
"panel"(GDStyleBox)
"selected"(GDStyleBox)
"selected_focus"(GDStyleBox)
"allow_reselect"(GDbool)
"allow_rmb_select"(GDbool)
"allow_search"(GDbool)
"auto_height"(GDbool)
"clip_contents"(GDbool)
"fixed_column_width"(GDint)
"fixed_icon_size"(GDVector2i)
"focus_mode"(GDFocusMode)
"icon_mode"(GDIconMode)
"icon_scale"(GDfloat)
"item_count"(GDint)
"max_columns"(GDint)
"max_text_lines"(GDint)
"same_column_width"(GDbool)
"select_mode"(GDSelectMode)
"text_overrun_behavior"(GDOverrunBehavior)
constructor { }

func("add_icon_item") {
returns(GDint)
"icon"(GDTexture2D)
"selectable"(GDbool)
}

func("add_item") {
returns(GDint)
"text"(GDString)
"icon"(GDTexture2D)
"selectable"(GDbool)
}

func("clear") {
returns(GDvoid)

}

func("deselect") {
returns(GDvoid)
"idx"(GDint)
}

func("deselect_all") {
returns(GDvoid)

}

func("ensure_current_is_visible") {
returns(GDvoid)

}

func("get_item_at_position") {
returns(GDint)
"position"(GDVector2)
"exact"(GDbool)
}

func("get_item_custom_bg_color") {
returns(GDColor)
"idx"(GDint)
}

func("get_item_custom_fg_color") {
returns(GDColor)
"idx"(GDint)
}

func("get_item_icon") {
returns(GDTexture2D)
"idx"(GDint)
}

func("get_item_icon_modulate") {
returns(GDColor)
"idx"(GDint)
}

func("get_item_icon_region") {
returns(GDRect2)
"idx"(GDint)
}

func("get_item_language") {
returns(GDString)
"idx"(GDint)
}

func("get_item_metadata") {
returns(GDVariant)
"idx"(GDint)
}

func("get_item_rect") {
returns(GDRect2)
"idx"(GDint)
"expand"(GDbool)
}

func("get_item_text") {
returns(GDString)
"idx"(GDint)
}

func("get_item_text_direction") {
returns(GDTextDirection)
"idx"(GDint)
}

func("get_item_tooltip") {
returns(GDString)
"idx"(GDint)
}

func("get_selected_items") {
returns(GDPackedInt32Array)

}

func("get_v_scroll_bar") {
returns(GDVScrollBar)

}

func("is_anything_selected") {
returns(GDbool)

}

func("is_item_disabled") {
returns(GDbool)
"idx"(GDint)
}

func("is_item_icon_transposed") {
returns(GDbool)
"idx"(GDint)
}

func("is_item_selectable") {
returns(GDbool)
"idx"(GDint)
}

func("is_item_tooltip_enabled") {
returns(GDbool)
"idx"(GDint)
}

func("is_selected") {
returns(GDbool)
"idx"(GDint)
}

func("move_item") {
returns(GDvoid)
"from_idx"(GDint)
"to_idx"(GDint)
}

func("remove_item") {
returns(GDvoid)
"idx"(GDint)
}

func("select") {
returns(GDvoid)
"idx"(GDint)
"single"(GDbool)
}

func("set_item_custom_bg_color") {
returns(GDvoid)
"idx"(GDint)
"custom_bg_color"(GDColor)
}

func("set_item_custom_fg_color") {
returns(GDvoid)
"idx"(GDint)
"custom_fg_color"(GDColor)
}

func("set_item_disabled") {
returns(GDvoid)
"idx"(GDint)
"disabled"(GDbool)
}

func("set_item_icon") {
returns(GDvoid)
"idx"(GDint)
"icon"(GDTexture2D)
}

func("set_item_icon_modulate") {
returns(GDvoid)
"idx"(GDint)
"modulate"(GDColor)
}

func("set_item_icon_region") {
returns(GDvoid)
"idx"(GDint)
"rect"(GDRect2)
}

func("set_item_icon_transposed") {
returns(GDvoid)
"idx"(GDint)
"transposed"(GDbool)
}

func("set_item_language") {
returns(GDvoid)
"idx"(GDint)
"language"(GDString)
}

func("set_item_metadata") {
returns(GDvoid)
"idx"(GDint)
"metadata"(GDVariant)
}

func("set_item_selectable") {
returns(GDvoid)
"idx"(GDint)
"selectable"(GDbool)
}

func("set_item_text") {
returns(GDvoid)
"idx"(GDint)
"text"(GDString)
}

func("set_item_text_direction") {
returns(GDvoid)
"idx"(GDint)
"direction"(GDTextDirection)
}

func("set_item_tooltip") {
returns(GDvoid)
"idx"(GDint)
"tooltip"(GDString)
}

func("set_item_tooltip_enabled") {
returns(GDvoid)
"idx"(GDint)
"enable"(GDbool)
}

func("sort_items_by_text") {
returns(GDvoid)

}
}){

}