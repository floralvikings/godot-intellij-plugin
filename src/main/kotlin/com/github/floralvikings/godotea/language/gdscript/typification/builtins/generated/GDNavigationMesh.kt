
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNavigationMesh: GDType("NavigationMesh", {

"agent_height"(GDfloat)
"agent_max_climb"(GDfloat)
"agent_max_slope"(GDfloat)
"agent_radius"(GDfloat)
"cell_height"(GDfloat)
"cell_size"(GDfloat)
"detail_sample_distance"(GDfloat)
"detail_sample_max_error"(GDfloat)
"edge_max_error"(GDfloat)
"edge_max_length"(GDfloat)
"filter_baking_aabb"(GDAABB)
"filter_baking_aabb_offset"(GDVector3)
"filter_ledge_spans"(GDbool)
"filter_low_hanging_obstacles"(GDbool)
"filter_walkable_low_height_spans"(GDbool)
"geometry_collision_mask"(GDint)
"geometry_parsed_geometry_type"(GDParsedGeometryType)
"geometry_source_geometry_mode"(GDSourceGeometryMode)
"geometry_source_group_name"(GDStringName)
"region_merge_size"(GDfloat)
"region_min_size"(GDfloat)
"sample_partition_type"(GDSamplePartitionType)
"vertices_per_polygon"(GDfloat)
constructor { }

func("add_polygon") {
returns(GDvoid)
"polygon"(GDPackedInt32Array)
}

func("clear_polygons") {
returns(GDvoid)

}

func("create_from_mesh") {
returns(GDvoid)
"mesh"(GDMesh)
}

func("get_collision_mask_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_polygon") {
returns(GDPackedInt32Array)
"idx"(GDint)
}

func("get_polygon_count") {
returns(GDint)

}

func("get_vertices") {
returns(GDPackedVector3Array)

}

func("set_collision_mask_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_vertices") {
returns(GDvoid)
"vertices"(GDPackedVector3Array)
}
}){

}