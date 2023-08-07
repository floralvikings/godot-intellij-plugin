
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTileData: GDType("TileData", {

"flip_h"(GDbool)
"flip_v"(GDbool)
"material"(GDMaterial)
"modulate"(GDColor)
"probability"(GDfloat)
"terrain"(GDint)
"terrain_set"(GDint)
"texture_origin"(GDVector2i)
"transpose"(GDbool)
"y_sort_origin"(GDint)
"z_index"(GDint)
constructor { }

func("add_collision_polygon") {
returns(GDvoid)
"layer_id"(GDint)
}

func("get_collision_polygon_one_way_margin") {
returns(GDfloat)
"layer_id"(GDint)
"polygon_index"(GDint)
}

func("get_collision_polygon_points") {
returns(GDPackedVector2Array)
"layer_id"(GDint)
"polygon_index"(GDint)
}

func("get_collision_polygons_count") {
returns(GDint)
"layer_id"(GDint)
}

func("get_constant_angular_velocity") {
returns(GDfloat)
"layer_id"(GDint)
}

func("get_constant_linear_velocity") {
returns(GDVector2)
"layer_id"(GDint)
}

func("get_custom_data") {
returns(GDVariant)
"layer_name"(GDString)
}

func("get_custom_data_by_layer_id") {
returns(GDVariant)
"layer_id"(GDint)
}

func("get_navigation_polygon") {
returns(GDNavigationPolygon)
"layer_id"(GDint)
}

func("get_occluder") {
returns(GDOccluderPolygon2D)
"layer_id"(GDint)
}

func("get_terrain_peering_bit") {
returns(GDint)
"peering_bit"(GDCellNeighbor)
}

func("is_collision_polygon_one_way") {
returns(GDbool)
"layer_id"(GDint)
"polygon_index"(GDint)
}

func("remove_collision_polygon") {
returns(GDvoid)
"layer_id"(GDint)
"polygon_index"(GDint)
}

func("set_collision_polygon_one_way") {
returns(GDvoid)
"layer_id"(GDint)
"polygon_index"(GDint)
"one_way"(GDbool)
}

func("set_collision_polygon_one_way_margin") {
returns(GDvoid)
"layer_id"(GDint)
"polygon_index"(GDint)
"one_way_margin"(GDfloat)
}

func("set_collision_polygon_points") {
returns(GDvoid)
"layer_id"(GDint)
"polygon_index"(GDint)
"polygon"(GDPackedVector2Array)
}

func("set_collision_polygons_count") {
returns(GDvoid)
"layer_id"(GDint)
"polygons_count"(GDint)
}

func("set_constant_angular_velocity") {
returns(GDvoid)
"layer_id"(GDint)
"velocity"(GDfloat)
}

func("set_constant_linear_velocity") {
returns(GDvoid)
"layer_id"(GDint)
"velocity"(GDVector2)
}

func("set_custom_data") {
returns(GDvoid)
"layer_name"(GDString)
"value"(GDVariant)
}

func("set_custom_data_by_layer_id") {
returns(GDvoid)
"layer_id"(GDint)
"value"(GDVariant)
}

func("set_navigation_polygon") {
returns(GDvoid)
"layer_id"(GDint)
"navigation_polygon"(GDNavigationPolygon)
}

func("set_occluder") {
returns(GDvoid)
"layer_id"(GDint)
"occluder_polygon"(GDOccluderPolygon2D)
}

func("set_terrain_peering_bit") {
returns(GDvoid)
"peering_bit"(GDCellNeighbor)
"terrain"(GDint)
}
}){

}