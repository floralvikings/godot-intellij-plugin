
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGraphEdit: GDType("GraphEdit", {

"activity"(GDColor)
"grid_major"(GDColor)
"grid_minor"(GDColor)
"selection_fill"(GDColor)
"selection_stroke"(GDColor)
"port_hotzone_inner_extent"(GDint)
"port_hotzone_outer_extent"(GDint)
"layout"(GDTexture2D)
"minimap"(GDTexture2D)
"minus"(GDTexture2D)
"more"(GDTexture2D)
"reset"(GDTexture2D)
"snap"(GDTexture2D)
"bg"(GDStyleBox)
"arrange_nodes_button_hidden"(GDbool)
"clip_contents"(GDbool)
"connection_lines_antialiased"(GDbool)
"connection_lines_curvature"(GDfloat)
"connection_lines_thickness"(GDfloat)
"focus_mode"(GDFocusMode)
"minimap_enabled"(GDbool)
"minimap_opacity"(GDfloat)
"minimap_size"(GDVector2)
"panning_scheme"(GDPanningScheme)
"right_disconnects"(GDbool)
"scroll_offset"(GDVector2)
"show_zoom_label"(GDbool)
"snap_distance"(GDint)
"use_snap"(GDbool)
"zoom"(GDfloat)
"zoom_max"(GDfloat)
"zoom_min"(GDfloat)
"zoom_step"(GDfloat)
constructor { }

func("_get_connection_line") {
returns(GDPackedVector2Array)
"from_position"(GDVector2)
"to_position"(GDVector2)
}

func("_is_in_input_hotzone") {
returns(GDbool)
"in_node"(GDObject)
"in_port"(GDint)
"mouse_position"(GDVector2)
}

func("_is_in_output_hotzone") {
returns(GDbool)
"in_node"(GDObject)
"in_port"(GDint)
"mouse_position"(GDVector2)
}

func("_is_node_hover_valid") {
returns(GDbool)
"from_node"(GDStringName)
"from_port"(GDint)
"to_node"(GDStringName)
"to_port"(GDint)
}

func("add_valid_connection_type") {
returns(GDvoid)
"from_type"(GDint)
"to_type"(GDint)
}

func("add_valid_left_disconnect_type") {
returns(GDvoid)
"type"(GDint)
}

func("add_valid_right_disconnect_type") {
returns(GDvoid)
"type"(GDint)
}

func("arrange_nodes") {
returns(GDvoid)

}

func("clear_connections") {
returns(GDvoid)

}

func("connect_node") {
returns(GDError)
"from_node"(GDStringName)
"from_port"(GDint)
"to_node"(GDStringName)
"to_port"(GDint)
}

func("disconnect_node") {
returns(GDvoid)
"from_node"(GDStringName)
"from_port"(GDint)
"to_node"(GDStringName)
"to_port"(GDint)
}

func("force_connection_drag_end") {
returns(GDvoid)

}

func("get_connection_line") {
returns(GDPackedVector2Array)
"from_node"(GDVector2)
"to_node"(GDVector2)
}

func("get_connection_list") {
returns(GDTypedArray(GDDictionary::class))

}

func("get_zoom_hbox") {
returns(GDHBoxContainer)

}

func("is_node_connected") {
returns(GDbool)
"from_node"(GDStringName)
"from_port"(GDint)
"to_node"(GDStringName)
"to_port"(GDint)
}

func("is_valid_connection_type") {
returns(GDbool)
"from_type"(GDint)
"to_type"(GDint)
}

func("remove_valid_connection_type") {
returns(GDvoid)
"from_type"(GDint)
"to_type"(GDint)
}

func("remove_valid_left_disconnect_type") {
returns(GDvoid)
"type"(GDint)
}

func("remove_valid_right_disconnect_type") {
returns(GDvoid)
"type"(GDint)
}

func("set_connection_activity") {
returns(GDvoid)
"from_node"(GDStringName)
"from_port"(GDint)
"to_node"(GDStringName)
"to_port"(GDint)
"amount"(GDfloat)
}

func("set_selected") {
returns(GDvoid)
"node"(GDNode)
}
}){

}