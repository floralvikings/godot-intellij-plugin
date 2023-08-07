
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDWindow: GDType("Window", {

"title_color"(GDColor)
"title_outline_modulate"(GDColor)
"close_h_offset"(GDint)
"close_v_offset"(GDint)
"resize_margin"(GDint)
"title_height"(GDint)
"title_outline_size"(GDint)
"title_font"(GDFont)
"title_font_size"(GDint)
"close"(GDTexture2D)
"close_pressed"(GDTexture2D)
"embedded_border"(GDStyleBox)
"always_on_top"(GDbool)
"auto_translate"(GDbool)
"borderless"(GDbool)
"content_scale_aspect"(GDContentScaleAspect)
"content_scale_factor"(GDfloat)
"content_scale_mode"(GDContentScaleMode)
"content_scale_size"(GDVector2i)
"current_screen"(GDint)
"exclusive"(GDbool)
"extend_to_title"(GDbool)
"initial_position"(GDWindowInitialPosition)
"max_size"(GDVector2i)
"min_size"(GDVector2i)
"mode"(GDMode)
"mouse_passthrough"(GDbool)
"mouse_passthrough_polygon"(GDPackedVector2Array)
"popup_window"(GDbool)
"position"(GDVector2i)
"size"(GDVector2i)
"theme"(GDTheme)
"theme_type_variation"(GDStringName)
"title"(GDString)
"transient"(GDbool)
"transparent"(GDbool)
"unfocusable"(GDbool)
"unresizable"(GDbool)
"visible"(GDbool)
"wrap_controls"(GDbool)
constructor { }

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

func("can_draw") {
returns(GDbool)

}

func("child_controls_changed") {
returns(GDvoid)

}

func("end_bulk_theme_override") {
returns(GDvoid)

}

func("get_contents_minimum_size") {
returns(GDVector2)

}

func("get_flag") {
returns(GDbool)
"flag"(GDFlags)
}

func("get_layout_direction") {
returns(GDLayoutDirection)

}

func("get_position_with_decorations") {
returns(GDVector2i)

}

func("get_size_with_decorations") {
returns(GDVector2i)

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

func("get_window_id") {
returns(GDint)

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

func("hide") {
returns(GDvoid)

}

func("is_embedded") {
returns(GDbool)

}

func("is_layout_rtl") {
returns(GDbool)

}

func("is_maximize_allowed") {
returns(GDbool)

}

func("is_using_font_oversampling") {
returns(GDbool)

}

func("move_to_foreground") {
returns(GDvoid)

}

func("popup") {
returns(GDvoid)
"rect"(GDRect2i)
}

func("popup_centered") {
returns(GDvoid)
"minsize"(GDVector2i)
}

func("popup_centered_clamped") {
returns(GDvoid)
"minsize"(GDVector2i)
"fallback_ratio"(GDfloat)
}

func("popup_centered_ratio") {
returns(GDvoid)
"ratio"(GDfloat)
}

func("popup_exclusive") {
returns(GDvoid)
"from_node"(GDNode)
"rect"(GDRect2i)
}

func("popup_exclusive_centered") {
returns(GDvoid)
"from_node"(GDNode)
"minsize"(GDVector2i)
}

func("popup_exclusive_centered_clamped") {
returns(GDvoid)
"from_node"(GDNode)
"minsize"(GDVector2i)
"fallback_ratio"(GDfloat)
}

func("popup_exclusive_centered_ratio") {
returns(GDvoid)
"from_node"(GDNode)
"ratio"(GDfloat)
}

func("popup_exclusive_on_parent") {
returns(GDvoid)
"from_node"(GDNode)
"parent_rect"(GDRect2i)
}

func("popup_on_parent") {
returns(GDvoid)
"parent_rect"(GDRect2i)
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

func("request_attention") {
returns(GDvoid)

}

func("reset_size") {
returns(GDvoid)

}

func("set_flag") {
returns(GDvoid)
"flag"(GDFlags)
"enabled"(GDbool)
}

func("set_ime_active") {
returns(GDvoid)
"active"(GDbool)
}

func("set_ime_position") {
returns(GDvoid)
"position"(GDVector2i)
}

func("set_layout_direction") {
returns(GDvoid)
"direction"(GDLayoutDirection)
}

func("set_unparent_when_invisible") {
returns(GDvoid)
"unparent"(GDbool)
}

func("set_use_font_oversampling") {
returns(GDvoid)
"enable"(GDbool)
}

func("show") {
returns(GDvoid)

}
}){

}