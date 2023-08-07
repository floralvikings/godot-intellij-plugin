
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDControl: GDType("Control", {

"anchor_bottom"(GDfloat)
"anchor_left"(GDfloat)
"anchor_right"(GDfloat)
"anchor_top"(GDfloat)
"auto_translate"(GDbool)
"clip_contents"(GDbool)
"custom_minimum_size"(GDVector2)
"focus_mode"(GDFocusMode)
"focus_neighbor_bottom"(GDNodePath)
"focus_neighbor_left"(GDNodePath)
"focus_neighbor_right"(GDNodePath)
"focus_neighbor_top"(GDNodePath)
"focus_next"(GDNodePath)
"focus_previous"(GDNodePath)
"global_position"(GDVector2)
"grow_horizontal"(GDGrowDirection)
"grow_vertical"(GDGrowDirection)
"layout_direction"(GDLayoutDirection)
"localize_numeral_system"(GDbool)
"mouse_default_cursor_shape"(GDCursorShape)
"mouse_filter"(GDMouseFilter)
"mouse_force_pass_scroll_events"(GDbool)
"offset_bottom"(GDfloat)
"offset_left"(GDfloat)
"offset_right"(GDfloat)
"offset_top"(GDfloat)
"pivot_offset"(GDVector2)
"position"(GDVector2)
"rotation"(GDfloat)
"rotation_degrees"(GDfloat)
"scale"(GDVector2)
"shortcut_context"(GDNode)
"size"(GDVector2)
"size_flags_horizontal"(GDUnknownType)
"size_flags_stretch_ratio"(GDfloat)
"size_flags_vertical"(GDUnknownType)
"theme"(GDTheme)
"theme_type_variation"(GDStringName)
"tooltip_text"(GDString)
constructor { }

func("_can_drop_data") {
returns(GDbool)
"at_position"(GDVector2)
"data"(GDVariant)
}

func("_drop_data") {
returns(GDvoid)
"at_position"(GDVector2)
"data"(GDVariant)
}

func("_get_drag_data") {
returns(GDVariant)
"at_position"(GDVector2)
}

func("_get_minimum_size") {
returns(GDVector2)

}

func("_get_tooltip") {
returns(GDString)
"at_position"(GDVector2)
}

func("_gui_input") {
returns(GDvoid)
"event"(GDInputEvent)
}

func("_has_point") {
returns(GDbool)
"point"(GDVector2)
}

func("_make_custom_tooltip") {
returns(GDObject)
"for_text"(GDString)
}

func("_structured_text_parser") {
returns(GDTypedArray(GDVector3i::class))
"args"(GDArray)
"text"(GDString)
}

func("accept_event") {
returns(GDvoid)

}

func("add_theme_color_override") {
returns(GDvoid)
"name"(GDStringName)
"color"(GDColor)
}

func("add_theme_constant_override") {
returns(GDvoid)
"name"(GDStringName)
"constant"(GDint)
}

func("add_theme_font_override") {
returns(GDvoid)
"name"(GDStringName)
"font"(GDFont)
}

func("add_theme_font_size_override") {
returns(GDvoid)
"name"(GDStringName)
"font_size"(GDint)
}

func("add_theme_icon_override") {
returns(GDvoid)
"name"(GDStringName)
"texture"(GDTexture2D)
}

func("add_theme_stylebox_override") {
returns(GDvoid)
"name"(GDStringName)
"stylebox"(GDStyleBox)
}

func("begin_bulk_theme_override") {
returns(GDvoid)

}

func("end_bulk_theme_override") {
returns(GDvoid)

}

func("find_next_valid_focus") {
returns(GDSameType)

}

func("find_prev_valid_focus") {
returns(GDSameType)

}

func("force_drag") {
returns(GDvoid)
"data"(GDVariant)
"preview"(GDSameType)
}

func("get_anchor") {
returns(GDfloat)
"side"(GDSide)
}

func("get_begin") {
returns(GDVector2)

}

func("get_combined_minimum_size") {
returns(GDVector2)

}

func("get_cursor_shape") {
returns(GDCursorShape)
"position"(GDVector2)
}

func("get_end") {
returns(GDVector2)

}

func("get_focus_neighbor") {
returns(GDNodePath)
"side"(GDSide)
}

func("get_global_rect") {
returns(GDRect2)

}

func("get_minimum_size") {
returns(GDVector2)

}

func("get_offset") {
returns(GDfloat)
"offset"(GDSide)
}

func("get_parent_area_size") {
returns(GDVector2)

}

func("get_parent_control") {
returns(GDSameType)

}

func("get_rect") {
returns(GDRect2)

}

func("get_screen_position") {
returns(GDVector2)

}

func("get_theme_color") {
returns(GDColor)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_theme_constant") {
returns(GDint)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_theme_default_base_scale") {
returns(GDfloat)

}

func("get_theme_default_font") {
returns(GDFont)

}

func("get_theme_default_font_size") {
returns(GDint)

}

func("get_theme_font") {
returns(GDFont)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_theme_font_size") {
returns(GDint)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_theme_icon") {
returns(GDTexture2D)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_theme_stylebox") {
returns(GDStyleBox)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_tooltip") {
returns(GDString)
"at_position"(GDVector2)
}

func("grab_click_focus") {
returns(GDvoid)

}

func("grab_focus") {
returns(GDvoid)

}

func("has_focus") {
returns(GDbool)

}

func("has_theme_color") {
returns(GDbool)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("has_theme_color_override") {
returns(GDbool)
"name"(GDStringName)
}

func("has_theme_constant") {
returns(GDbool)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("has_theme_constant_override") {
returns(GDbool)
"name"(GDStringName)
}

func("has_theme_font") {
returns(GDbool)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("has_theme_font_override") {
returns(GDbool)
"name"(GDStringName)
}

func("has_theme_font_size") {
returns(GDbool)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("has_theme_font_size_override") {
returns(GDbool)
"name"(GDStringName)
}

func("has_theme_icon") {
returns(GDbool)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("has_theme_icon_override") {
returns(GDbool)
"name"(GDStringName)
}

func("has_theme_stylebox") {
returns(GDbool)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("has_theme_stylebox_override") {
returns(GDbool)
"name"(GDStringName)
}

func("is_drag_successful") {
returns(GDbool)

}

func("is_layout_rtl") {
returns(GDbool)

}

func("release_focus") {
returns(GDvoid)

}

func("remove_theme_color_override") {
returns(GDvoid)
"name"(GDStringName)
}

func("remove_theme_constant_override") {
returns(GDvoid)
"name"(GDStringName)
}

func("remove_theme_font_override") {
returns(GDvoid)
"name"(GDStringName)
}

func("remove_theme_font_size_override") {
returns(GDvoid)
"name"(GDStringName)
}

func("remove_theme_icon_override") {
returns(GDvoid)
"name"(GDStringName)
}

func("remove_theme_stylebox_override") {
returns(GDvoid)
"name"(GDStringName)
}

func("reset_size") {
returns(GDvoid)

}

func("set_anchor") {
returns(GDvoid)
"side"(GDSide)
"anchor"(GDfloat)
"keep_offset"(GDbool)
"push_opposite_anchor"(GDbool)
}

func("set_anchor_and_offset") {
returns(GDvoid)
"side"(GDSide)
"anchor"(GDfloat)
"offset"(GDfloat)
"push_opposite_anchor"(GDbool)
}

func("set_anchors_and_offsets_preset") {
returns(GDvoid)
"preset"(GDLayoutPreset)
"resize_mode"(GDLayoutPresetMode)
"margin"(GDint)
}

func("set_anchors_preset") {
returns(GDvoid)
"preset"(GDLayoutPreset)
"keep_offsets"(GDbool)
}

func("set_begin") {
returns(GDvoid)
"position"(GDVector2)
}

func("set_drag_forwarding") {
returns(GDvoid)
"drag_func"(GDCallable)
"can_drop_func"(GDCallable)
"drop_func"(GDCallable)
}

func("set_drag_preview") {
returns(GDvoid)
"control"(GDSameType)
}

func("set_end") {
returns(GDvoid)
"position"(GDVector2)
}

func("set_focus_neighbor") {
returns(GDvoid)
"side"(GDSide)
"neighbor"(GDNodePath)
}

func("set_global_position") {
returns(GDvoid)
"position"(GDVector2)
"keep_offsets"(GDbool)
}

func("set_offset") {
returns(GDvoid)
"side"(GDSide)
"offset"(GDfloat)
}

func("set_offsets_preset") {
returns(GDvoid)
"preset"(GDLayoutPreset)
"resize_mode"(GDLayoutPresetMode)
"margin"(GDint)
}

func("set_position") {
returns(GDvoid)
"position"(GDVector2)
"keep_offsets"(GDbool)
}

func("set_size") {
returns(GDvoid)
"size"(GDVector2)
"keep_offsets"(GDbool)
}

func("update_minimum_size") {
returns(GDvoid)

}

func("warp_mouse") {
returns(GDvoid)
"position"(GDVector2)
}
}){

}