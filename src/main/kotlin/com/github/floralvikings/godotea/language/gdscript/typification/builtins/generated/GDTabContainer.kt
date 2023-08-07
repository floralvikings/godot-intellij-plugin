
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTabContainer: GDType("TabContainer", {

"drop_mark_color"(GDColor)
"font_disabled_color"(GDColor)
"font_hovered_color"(GDColor)
"font_outline_color"(GDColor)
"font_selected_color"(GDColor)
"font_unselected_color"(GDColor)
"icon_max_width"(GDint)
"icon_separation"(GDint)
"outline_size"(GDint)
"side_margin"(GDint)
"font"(GDFont)
"font_size"(GDint)
"decrement"(GDTexture2D)
"decrement_highlight"(GDTexture2D)
"drop_mark"(GDTexture2D)
"increment"(GDTexture2D)
"increment_highlight"(GDTexture2D)
"menu"(GDTexture2D)
"menu_highlight"(GDTexture2D)
"panel"(GDStyleBox)
"tab_disabled"(GDStyleBox)
"tab_hovered"(GDStyleBox)
"tab_selected"(GDStyleBox)
"tab_unselected"(GDStyleBox)
"tabbar_background"(GDStyleBox)
"all_tabs_in_front"(GDbool)
"clip_tabs"(GDbool)
"current_tab"(GDint)
"drag_to_rearrange_enabled"(GDbool)
"tab_alignment"(GDAlignmentMode)
"tabs_rearrange_group"(GDint)
"tabs_visible"(GDbool)
"use_hidden_tabs_for_min_size"(GDbool)
constructor { }

func("get_current_tab_control") {
returns(GDControl)

}

func("get_popup") {
returns(GDPopup)

}

func("get_previous_tab") {
returns(GDint)

}

func("get_tab_button_icon") {
returns(GDTexture2D)
"tab_idx"(GDint)
}

func("get_tab_control") {
returns(GDControl)
"tab_idx"(GDint)
}

func("get_tab_count") {
returns(GDint)

}

func("get_tab_icon") {
returns(GDTexture2D)
"tab_idx"(GDint)
}

func("get_tab_idx_at_point") {
returns(GDint)
"point"(GDVector2)
}

func("get_tab_idx_from_control") {
returns(GDint)
"control"(GDControl)
}

func("get_tab_metadata") {
returns(GDVariant)
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

func("set_popup") {
returns(GDvoid)
"popup"(GDNode)
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

func("set_tab_metadata") {
returns(GDvoid)
"tab_idx"(GDint)
"metadata"(GDVariant)
}

func("set_tab_title") {
returns(GDvoid)
"tab_idx"(GDint)
"title"(GDString)
}
}){

}