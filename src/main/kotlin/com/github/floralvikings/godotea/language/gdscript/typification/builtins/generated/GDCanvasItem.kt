
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCanvasItem: GDType("CanvasItem", {

"clip_children"(GDClipChildrenMode)
"light_mask"(GDint)
"material"(GDMaterial)
"modulate"(GDColor)
"self_modulate"(GDColor)
"show_behind_parent"(GDbool)
"texture_filter"(GDTextureFilter)
"texture_repeat"(GDTextureRepeat)
"top_level"(GDbool)
"use_parent_material"(GDbool)
"visibility_layer"(GDint)
"visible"(GDbool)
"y_sort_enabled"(GDbool)
"z_as_relative"(GDbool)
"z_index"(GDint)
constructor { }

func("_draw") {
returns(GDvoid)

}

func("draw_animation_slice") {
returns(GDvoid)
"animation_length"(GDfloat)
"slice_begin"(GDfloat)
"slice_end"(GDfloat)
"offset"(GDfloat)
}

func("draw_arc") {
returns(GDvoid)
"center"(GDVector2)
"radius"(GDfloat)
"start_angle"(GDfloat)
"end_angle"(GDfloat)
"point_count"(GDint)
"color"(GDColor)
"width"(GDfloat)
"antialiased"(GDbool)
}

func("draw_char") {
returns(GDvoid)
"font"(GDFont)
"pos"(GDVector2)
"char"(GDString)
"font_size"(GDint)
"modulate"(GDColor)
}

func("draw_char_outline") {
returns(GDvoid)
"font"(GDFont)
"pos"(GDVector2)
"char"(GDString)
"font_size"(GDint)
"size"(GDint)
"modulate"(GDColor)
}

func("draw_circle") {
returns(GDvoid)
"position"(GDVector2)
"radius"(GDfloat)
"color"(GDColor)
}

func("draw_colored_polygon") {
returns(GDvoid)
"points"(GDPackedVector2Array)
"color"(GDColor)
"uvs"(GDPackedVector2Array)
"texture"(GDTexture2D)
}

func("draw_dashed_line") {
returns(GDvoid)
"from"(GDVector2)
"to"(GDVector2)
"color"(GDColor)
"width"(GDfloat)
"dash"(GDfloat)
"aligned"(GDbool)
}

func("draw_end_animation") {
returns(GDvoid)

}

func("draw_lcd_texture_rect_region") {
returns(GDvoid)
"texture"(GDTexture2D)
"rect"(GDRect2)
"src_rect"(GDRect2)
"modulate"(GDColor)
}

func("draw_line") {
returns(GDvoid)
"from"(GDVector2)
"to"(GDVector2)
"color"(GDColor)
"width"(GDfloat)
"antialiased"(GDbool)
}

func("draw_mesh") {
returns(GDvoid)
"mesh"(GDMesh)
"texture"(GDTexture2D)
"transform"(GDTransform2D)
"modulate"(GDColor)
}

func("draw_msdf_texture_rect_region") {
returns(GDvoid)
"texture"(GDTexture2D)
"rect"(GDRect2)
"src_rect"(GDRect2)
"modulate"(GDColor)
"outline"(GDfloat)
"pixel_range"(GDfloat)
"scale"(GDfloat)
}

func("draw_multiline") {
returns(GDvoid)
"points"(GDPackedVector2Array)
"color"(GDColor)
"width"(GDfloat)
}

func("draw_multiline_colors") {
returns(GDvoid)
"points"(GDPackedVector2Array)
"colors"(GDPackedColorArray)
"width"(GDfloat)
}

func("draw_multiline_string") {
returns(GDvoid)
"font"(GDFont)
"pos"(GDVector2)
"text"(GDString)
"alignment"(GDHorizontalAlignment)
"width"(GDfloat)
"font_size"(GDint)
"max_lines"(GDint)
"modulate"(GDColor)
"brk_flags"(GDUnknownType)
"justification_flags"(GDUnknownType)
"direction"(GDDirection)
"orientation"(GDOrientation)
}

func("draw_multiline_string_outline") {
returns(GDvoid)
"font"(GDFont)
"pos"(GDVector2)
"text"(GDString)
"alignment"(GDHorizontalAlignment)
"width"(GDfloat)
"font_size"(GDint)
"max_lines"(GDint)
"size"(GDint)
"modulate"(GDColor)
"brk_flags"(GDUnknownType)
"justification_flags"(GDUnknownType)
"direction"(GDDirection)
"orientation"(GDOrientation)
}

func("draw_multimesh") {
returns(GDvoid)
"multimesh"(GDMultiMesh)
"texture"(GDTexture2D)
}

func("draw_polygon") {
returns(GDvoid)
"points"(GDPackedVector2Array)
"colors"(GDPackedColorArray)
"uvs"(GDPackedVector2Array)
"texture"(GDTexture2D)
}

func("draw_polyline") {
returns(GDvoid)
"points"(GDPackedVector2Array)
"color"(GDColor)
"width"(GDfloat)
"antialiased"(GDbool)
}

func("draw_polyline_colors") {
returns(GDvoid)
"points"(GDPackedVector2Array)
"colors"(GDPackedColorArray)
"width"(GDfloat)
"antialiased"(GDbool)
}

func("draw_primitive") {
returns(GDvoid)
"points"(GDPackedVector2Array)
"colors"(GDPackedColorArray)
"uvs"(GDPackedVector2Array)
"texture"(GDTexture2D)
}

func("draw_rect") {
returns(GDvoid)
"rect"(GDRect2)
"color"(GDColor)
"filled"(GDbool)
"width"(GDfloat)
}

func("draw_set_transform") {
returns(GDvoid)
"position"(GDVector2)
"rotation"(GDfloat)
"scale"(GDVector2)
}

func("draw_set_transform_matrix") {
returns(GDvoid)
"xform"(GDTransform2D)
}

func("draw_string") {
returns(GDvoid)
"font"(GDFont)
"pos"(GDVector2)
"text"(GDString)
"alignment"(GDHorizontalAlignment)
"width"(GDfloat)
"font_size"(GDint)
"modulate"(GDColor)
"justification_flags"(GDUnknownType)
"direction"(GDDirection)
"orientation"(GDOrientation)
}

func("draw_string_outline") {
returns(GDvoid)
"font"(GDFont)
"pos"(GDVector2)
"text"(GDString)
"alignment"(GDHorizontalAlignment)
"width"(GDfloat)
"font_size"(GDint)
"size"(GDint)
"modulate"(GDColor)
"justification_flags"(GDUnknownType)
"direction"(GDDirection)
"orientation"(GDOrientation)
}

func("draw_style_box") {
returns(GDvoid)
"style_box"(GDStyleBox)
"rect"(GDRect2)
}

func("draw_texture") {
returns(GDvoid)
"texture"(GDTexture2D)
"position"(GDVector2)
"modulate"(GDColor)
}

func("draw_texture_rect") {
returns(GDvoid)
"texture"(GDTexture2D)
"rect"(GDRect2)
"tile"(GDbool)
"modulate"(GDColor)
"transpose"(GDbool)
}

func("draw_texture_rect_region") {
returns(GDvoid)
"texture"(GDTexture2D)
"rect"(GDRect2)
"src_rect"(GDRect2)
"modulate"(GDColor)
"transpose"(GDbool)
"clip_uv"(GDbool)
}

func("force_update_transform") {
returns(GDvoid)

}

func("get_canvas") {
returns(GDRID)

}

func("get_canvas_item") {
returns(GDRID)

}

func("get_canvas_transform") {
returns(GDTransform2D)

}

func("get_global_mouse_position") {
returns(GDVector2)

}

func("get_global_transform") {
returns(GDTransform2D)

}

func("get_global_transform_with_canvas") {
returns(GDTransform2D)

}

func("get_local_mouse_position") {
returns(GDVector2)

}

func("get_screen_transform") {
returns(GDTransform2D)

}

func("get_transform") {
returns(GDTransform2D)

}

func("get_viewport_rect") {
returns(GDRect2)

}

func("get_viewport_transform") {
returns(GDTransform2D)

}

func("get_visibility_layer_bit") {
returns(GDbool)
"layer"(GDint)
}

func("get_world_2d") {
returns(GDWorld2D)

}

func("hide") {
returns(GDvoid)

}

func("is_local_transform_notification_enabled") {
returns(GDbool)

}

func("is_transform_notification_enabled") {
returns(GDbool)

}

func("is_visible_in_tree") {
returns(GDbool)

}

func("make_canvas_position_local") {
returns(GDVector2)
"screen_point"(GDVector2)
}

func("make_input_local") {
returns(GDInputEvent)
"event"(GDInputEvent)
}

func("move_to_front") {
returns(GDvoid)

}

func("queue_redraw") {
returns(GDvoid)

}

func("set_notify_local_transform") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_notify_transform") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_visibility_layer_bit") {
returns(GDvoid)
"layer"(GDint)
"enabled"(GDbool)
}

func("show") {
returns(GDvoid)

}
}){

}