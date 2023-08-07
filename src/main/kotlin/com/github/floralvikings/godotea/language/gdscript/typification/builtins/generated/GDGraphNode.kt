
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGraphNode: GDType("GraphNode", {

"close_color"(GDColor)
"resizer_color"(GDColor)
"title_color"(GDColor)
"close_h_offset"(GDint)
"close_offset"(GDint)
"port_offset"(GDint)
"separation"(GDint)
"title_h_offset"(GDint)
"title_offset"(GDint)
"title_font"(GDFont)
"close"(GDTexture2D)
"port"(GDTexture2D)
"resizer"(GDTexture2D)
"breakpoint"(GDStyleBox)
"comment"(GDStyleBox)
"comment_focus"(GDStyleBox)
"frame"(GDStyleBox)
"position"(GDStyleBox)
"selected_frame"(GDStyleBox)
"slot"(GDStyleBox)
"comment"(GDbool)
"draggable"(GDbool)
"language"(GDString)
"mouse_filter"(GDMouseFilter)
"overlay"(GDOverlay)
"position_offset"(GDVector2)
"resizable"(GDbool)
"selectable"(GDbool)
"selected"(GDbool)
"show_close"(GDbool)
"text_direction"(GDTextDirection)
"title"(GDString)
constructor { }

func("clear_all_slots") {
returns(GDvoid)

}

func("clear_slot") {
returns(GDvoid)
"slot_index"(GDint)
}

func("get_connection_input_color") {
returns(GDColor)
"port"(GDint)
}

func("get_connection_input_count") {
returns(GDint)

}

func("get_connection_input_height") {
returns(GDint)
"port"(GDint)
}

func("get_connection_input_position") {
returns(GDVector2)
"port"(GDint)
}

func("get_connection_input_slot") {
returns(GDint)
"port"(GDint)
}

func("get_connection_input_type") {
returns(GDint)
"port"(GDint)
}

func("get_connection_output_color") {
returns(GDColor)
"port"(GDint)
}

func("get_connection_output_count") {
returns(GDint)

}

func("get_connection_output_height") {
returns(GDint)
"port"(GDint)
}

func("get_connection_output_position") {
returns(GDVector2)
"port"(GDint)
}

func("get_connection_output_slot") {
returns(GDint)
"port"(GDint)
}

func("get_connection_output_type") {
returns(GDint)
"port"(GDint)
}

func("get_slot_color_left") {
returns(GDColor)
"slot_index"(GDint)
}

func("get_slot_color_right") {
returns(GDColor)
"slot_index"(GDint)
}

func("get_slot_type_left") {
returns(GDint)
"slot_index"(GDint)
}

func("get_slot_type_right") {
returns(GDint)
"slot_index"(GDint)
}

func("is_slot_draw_stylebox") {
returns(GDbool)
"slot_index"(GDint)
}

func("is_slot_enabled_left") {
returns(GDbool)
"slot_index"(GDint)
}

func("is_slot_enabled_right") {
returns(GDbool)
"slot_index"(GDint)
}

func("set_slot") {
returns(GDvoid)
"slot_index"(GDint)
"enable_left_port"(GDbool)
"type_left"(GDint)
"color_left"(GDColor)
"enable_right_port"(GDbool)
"type_right"(GDint)
"color_right"(GDColor)
"custom_icon_left"(GDTexture2D)
"custom_icon_right"(GDTexture2D)
"draw_stylebox"(GDbool)
}

func("set_slot_color_left") {
returns(GDvoid)
"slot_index"(GDint)
"color"(GDColor)
}

func("set_slot_color_right") {
returns(GDvoid)
"slot_index"(GDint)
"color"(GDColor)
}

func("set_slot_draw_stylebox") {
returns(GDvoid)
"slot_index"(GDint)
"enable"(GDbool)
}

func("set_slot_enabled_left") {
returns(GDvoid)
"slot_index"(GDint)
"enable"(GDbool)
}

func("set_slot_enabled_right") {
returns(GDvoid)
"slot_index"(GDint)
"enable"(GDbool)
}

func("set_slot_type_left") {
returns(GDvoid)
"slot_index"(GDint)
"type"(GDint)
}

func("set_slot_type_right") {
returns(GDvoid)
"slot_index"(GDint)
"type"(GDint)
}
}){

}