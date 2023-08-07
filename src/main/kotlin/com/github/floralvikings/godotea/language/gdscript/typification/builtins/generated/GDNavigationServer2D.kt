
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNavigationServer2D: GDType("NavigationServer2D", {


constructor { }

func("agent_create") {
returns(GDRID)

}

func("agent_get_avoidance_enabled") {
returns(GDbool)
"agent"(GDRID)
}

func("agent_get_map") {
returns(GDRID)
"agent"(GDRID)
}

func("agent_get_paused") {
returns(GDbool)
"agent"(GDRID)
}

func("agent_is_map_changed") {
returns(GDbool)
"agent"(GDRID)
}

func("agent_set_avoidance_callback") {
returns(GDvoid)
"agent"(GDRID)
"callback"(GDCallable)
}

func("agent_set_avoidance_enabled") {
returns(GDvoid)
"agent"(GDRID)
"enabled"(GDbool)
}

func("agent_set_avoidance_layers") {
returns(GDvoid)
"agent"(GDRID)
"layers"(GDint)
}

func("agent_set_avoidance_mask") {
returns(GDvoid)
"agent"(GDRID)
"mask"(GDint)
}

func("agent_set_avoidance_priority") {
returns(GDvoid)
"agent"(GDRID)
"priority"(GDfloat)
}

func("agent_set_map") {
returns(GDvoid)
"agent"(GDRID)
"map"(GDRID)
}

func("agent_set_max_neighbors") {
returns(GDvoid)
"agent"(GDRID)
"count"(GDint)
}

func("agent_set_max_speed") {
returns(GDvoid)
"agent"(GDRID)
"max_speed"(GDfloat)
}

func("agent_set_neighbor_distance") {
returns(GDvoid)
"agent"(GDRID)
"distance"(GDfloat)
}

func("agent_set_paused") {
returns(GDvoid)
"agent"(GDRID)
"paused"(GDbool)
}

func("agent_set_position") {
returns(GDvoid)
"agent"(GDRID)
"position"(GDVector2)
}

func("agent_set_radius") {
returns(GDvoid)
"agent"(GDRID)
"radius"(GDfloat)
}

func("agent_set_time_horizon_agents") {
returns(GDvoid)
"agent"(GDRID)
"time_horizon"(GDfloat)
}

func("agent_set_time_horizon_obstacles") {
returns(GDvoid)
"agent"(GDRID)
"time_horizon"(GDfloat)
}

func("agent_set_velocity") {
returns(GDvoid)
"agent"(GDRID)
"velocity"(GDVector2)
}

func("agent_set_velocity_forced") {
returns(GDvoid)
"agent"(GDRID)
"velocity"(GDVector2)
}

func("free_rid") {
returns(GDvoid)
"rid"(GDRID)
}

func("get_debug_enabled") {
returns(GDbool)

}

func("get_maps") {
returns(GDTypedArray(GDRID::class))

}

func("link_create") {
returns(GDRID)

}

func("link_get_end_position") {
returns(GDVector2)
"link"(GDRID)
}

func("link_get_enter_cost") {
returns(GDfloat)
"link"(GDRID)
}

func("link_get_map") {
returns(GDRID)
"link"(GDRID)
}

func("link_get_navigation_layers") {
returns(GDint)
"link"(GDRID)
}

func("link_get_owner_id") {
returns(GDint)
"link"(GDRID)
}

func("link_get_start_position") {
returns(GDVector2)
"link"(GDRID)
}

func("link_get_travel_cost") {
returns(GDfloat)
"link"(GDRID)
}

func("link_is_bidirectional") {
returns(GDbool)
"link"(GDRID)
}

func("link_set_bidirectional") {
returns(GDvoid)
"link"(GDRID)
"bidirectional"(GDbool)
}

func("link_set_end_position") {
returns(GDvoid)
"link"(GDRID)
"position"(GDVector2)
}

func("link_set_enter_cost") {
returns(GDvoid)
"link"(GDRID)
"enter_cost"(GDfloat)
}

func("link_set_map") {
returns(GDvoid)
"link"(GDRID)
"map"(GDRID)
}

func("link_set_navigation_layers") {
returns(GDvoid)
"link"(GDRID)
"navigation_layers"(GDint)
}

func("link_set_owner_id") {
returns(GDvoid)
"link"(GDRID)
"owner_id"(GDint)
}

func("link_set_start_position") {
returns(GDvoid)
"link"(GDRID)
"position"(GDVector2)
}

func("link_set_travel_cost") {
returns(GDvoid)
"link"(GDRID)
"travel_cost"(GDfloat)
}

func("map_create") {
returns(GDRID)

}

func("map_force_update") {
returns(GDvoid)
"map"(GDRID)
}

func("map_get_agents") {
returns(GDTypedArray(GDRID::class))
"map"(GDRID)
}

func("map_get_cell_size") {
returns(GDfloat)
"map"(GDRID)
}

func("map_get_closest_point") {
returns(GDVector2)
"map"(GDRID)
"to_point"(GDVector2)
}

func("map_get_closest_point_owner") {
returns(GDRID)
"map"(GDRID)
"to_point"(GDVector2)
}

func("map_get_edge_connection_margin") {
returns(GDfloat)
"map"(GDRID)
}

func("map_get_link_connection_radius") {
returns(GDfloat)
"map"(GDRID)
}

func("map_get_links") {
returns(GDTypedArray(GDRID::class))
"map"(GDRID)
}

func("map_get_obstacles") {
returns(GDTypedArray(GDRID::class))
"map"(GDRID)
}

func("map_get_path") {
returns(GDPackedVector2Array)
"map"(GDRID)
"origin"(GDVector2)
"destination"(GDVector2)
"optimize"(GDbool)
"navigation_layers"(GDint)
}

func("map_get_regions") {
returns(GDTypedArray(GDRID::class))
"map"(GDRID)
}

func("map_get_use_edge_connections") {
returns(GDbool)
"map"(GDRID)
}

func("map_is_active") {
returns(GDbool)
"map"(GDRID)
}

func("map_set_active") {
returns(GDvoid)
"map"(GDRID)
"active"(GDbool)
}

func("map_set_cell_size") {
returns(GDvoid)
"map"(GDRID)
"cell_size"(GDfloat)
}

func("map_set_edge_connection_margin") {
returns(GDvoid)
"map"(GDRID)
"margin"(GDfloat)
}

func("map_set_link_connection_radius") {
returns(GDvoid)
"map"(GDRID)
"radius"(GDfloat)
}

func("map_set_use_edge_connections") {
returns(GDvoid)
"map"(GDRID)
"enabled"(GDbool)
}

func("obstacle_create") {
returns(GDRID)

}

func("obstacle_get_avoidance_enabled") {
returns(GDbool)
"obstacle"(GDRID)
}

func("obstacle_get_map") {
returns(GDRID)
"obstacle"(GDRID)
}

func("obstacle_get_paused") {
returns(GDbool)
"obstacle"(GDRID)
}

func("obstacle_set_avoidance_enabled") {
returns(GDvoid)
"obstacle"(GDRID)
"enabled"(GDbool)
}

func("obstacle_set_avoidance_layers") {
returns(GDvoid)
"obstacle"(GDRID)
"layers"(GDint)
}

func("obstacle_set_map") {
returns(GDvoid)
"obstacle"(GDRID)
"map"(GDRID)
}

func("obstacle_set_paused") {
returns(GDvoid)
"obstacle"(GDRID)
"paused"(GDbool)
}

func("obstacle_set_position") {
returns(GDvoid)
"obstacle"(GDRID)
"position"(GDVector2)
}

func("obstacle_set_radius") {
returns(GDvoid)
"obstacle"(GDRID)
"radius"(GDfloat)
}

func("obstacle_set_velocity") {
returns(GDvoid)
"obstacle"(GDRID)
"velocity"(GDVector2)
}

func("obstacle_set_vertices") {
returns(GDvoid)
"obstacle"(GDRID)
"vertices"(GDPackedVector2Array)
}

func("query_path") {
returns(GDvoid)
"parameters"(GDNavigationPathQueryParameters2D)
"result"(GDNavigationPathQueryResult2D)
}

func("region_create") {
returns(GDRID)

}

func("region_get_connection_pathway_end") {
returns(GDVector2)
"region"(GDRID)
"connection"(GDint)
}

func("region_get_connection_pathway_start") {
returns(GDVector2)
"region"(GDRID)
"connection"(GDint)
}

func("region_get_connections_count") {
returns(GDint)
"region"(GDRID)
}

func("region_get_enter_cost") {
returns(GDfloat)
"region"(GDRID)
}

func("region_get_map") {
returns(GDRID)
"region"(GDRID)
}

func("region_get_navigation_layers") {
returns(GDint)
"region"(GDRID)
}

func("region_get_owner_id") {
returns(GDint)
"region"(GDRID)
}

func("region_get_travel_cost") {
returns(GDfloat)
"region"(GDRID)
}

func("region_get_use_edge_connections") {
returns(GDbool)
"region"(GDRID)
}

func("region_owns_point") {
returns(GDbool)
"region"(GDRID)
"point"(GDVector2)
}

func("region_set_enter_cost") {
returns(GDvoid)
"region"(GDRID)
"enter_cost"(GDfloat)
}

func("region_set_map") {
returns(GDvoid)
"region"(GDRID)
"map"(GDRID)
}

func("region_set_navigation_layers") {
returns(GDvoid)
"region"(GDRID)
"navigation_layers"(GDint)
}

func("region_set_navigation_polygon") {
returns(GDvoid)
"region"(GDRID)
"navigation_polygon"(GDNavigationPolygon)
}

func("region_set_owner_id") {
returns(GDvoid)
"region"(GDRID)
"owner_id"(GDint)
}

func("region_set_transform") {
returns(GDvoid)
"region"(GDRID)
"transform"(GDTransform2D)
}

func("region_set_travel_cost") {
returns(GDvoid)
"region"(GDRID)
"travel_cost"(GDfloat)
}

func("region_set_use_edge_connections") {
returns(GDvoid)
"region"(GDRID)
"enabled"(GDbool)
}

func("set_debug_enabled") {
returns(GDvoid)
"enabled"(GDbool)
}
}){

}