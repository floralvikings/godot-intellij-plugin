
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNavigationAgent3D: GDType("NavigationAgent3D", {

"avoidance_enabled"(GDbool)
"avoidance_layers"(GDint)
"avoidance_mask"(GDint)
"avoidance_priority"(GDfloat)
"debug_enabled"(GDbool)
"debug_path_custom_color"(GDColor)
"debug_path_custom_point_size"(GDfloat)
"debug_use_custom"(GDbool)
"height"(GDfloat)
"max_neighbors"(GDint)
"max_speed"(GDfloat)
"navigation_layers"(GDint)
"neighbor_distance"(GDfloat)
"path_desired_distance"(GDfloat)
"path_height_offset"(GDfloat)
"path_max_distance"(GDfloat)
"path_metadata_flags"(GDUnknownType)
"path_postprocessing"(GDPathPostProcessing)
"pathfinding_algorithm"(GDPathfindingAlgorithm)
"radius"(GDfloat)
"target_desired_distance"(GDfloat)
"target_position"(GDVector3)
"time_horizon_agents"(GDfloat)
"time_horizon_obstacles"(GDfloat)
"use_3d_avoidance"(GDbool)
"velocity"(GDVector3)
constructor { }

func("distance_to_target") {
returns(GDfloat)

}

func("get_avoidance_layer_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_avoidance_mask_value") {
returns(GDbool)
"mask_number"(GDint)
}

func("get_current_navigation_path") {
returns(GDPackedVector3Array)

}

func("get_current_navigation_path_index") {
returns(GDint)

}

func("get_current_navigation_result") {
returns(GDNavigationPathQueryResult3D)

}

func("get_final_position") {
returns(GDVector3)

}

func("get_navigation_layer_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_navigation_map") {
returns(GDRID)

}

func("get_next_path_position") {
returns(GDVector3)

}

func("get_rid") {
returns(GDRID)

}

func("is_navigation_finished") {
returns(GDbool)

}

func("is_target_reachable") {
returns(GDbool)

}

func("is_target_reached") {
returns(GDbool)

}

func("set_avoidance_layer_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_avoidance_mask_value") {
returns(GDvoid)
"mask_number"(GDint)
"value"(GDbool)
}

func("set_navigation_layer_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_navigation_map") {
returns(GDvoid)
"navigation_map"(GDRID)
}

func("set_velocity_forced") {
returns(GDvoid)
"velocity"(GDVector3)
}
}){

}