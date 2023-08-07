
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTileSet: GDType("TileSet", {

"tile_layout"(GDTileLayout)
"tile_offset_axis"(GDTileOffsetAxis)
"tile_shape"(GDTileShape)
"tile_size"(GDVector2i)
"uv_clipping"(GDbool)
constructor { }

func("add_custom_data_layer") {
returns(GDvoid)
"to_position"(GDint)
}

func("add_navigation_layer") {
returns(GDvoid)
"to_position"(GDint)
}

func("add_occlusion_layer") {
returns(GDvoid)
"to_position"(GDint)
}

func("add_pattern") {
returns(GDint)
"pattern"(GDTileMapPattern)
"index"(GDint)
}

func("add_physics_layer") {
returns(GDvoid)
"to_position"(GDint)
}

func("add_source") {
returns(GDint)
"source"(GDTileSetSource)
"atlas_source_id_override"(GDint)
}

func("add_terrain") {
returns(GDvoid)
"terrain_set"(GDint)
"to_position"(GDint)
}

func("add_terrain_set") {
returns(GDvoid)
"to_position"(GDint)
}

func("cleanup_invalid_tile_proxies") {
returns(GDvoid)

}

func("clear_tile_proxies") {
returns(GDvoid)

}

func("get_alternative_level_tile_proxy") {
returns(GDArray)
"source_from"(GDint)
"coords_from"(GDVector2i)
"alternative_from"(GDint)
}

func("get_coords_level_tile_proxy") {
returns(GDArray)
"source_from"(GDint)
"coords_from"(GDVector2i)
}

func("get_custom_data_layer_by_name") {
returns(GDint)
"layer_name"(GDString)
}

func("get_custom_data_layer_name") {
returns(GDString)
"layer_index"(GDint)
}

func("get_custom_data_layer_type") {
returns(GDVariantType)
"layer_index"(GDint)
}

func("get_custom_data_layers_count") {
returns(GDint)

}

func("get_navigation_layer_layer_value") {
returns(GDbool)
"layer_index"(GDint)
"layer_number"(GDint)
}

func("get_navigation_layer_layers") {
returns(GDint)
"layer_index"(GDint)
}

func("get_navigation_layers_count") {
returns(GDint)

}

func("get_next_source_id") {
returns(GDint)

}

func("get_occlusion_layer_light_mask") {
returns(GDint)
"layer_index"(GDint)
}

func("get_occlusion_layer_sdf_collision") {
returns(GDbool)
"layer_index"(GDint)
}

func("get_occlusion_layers_count") {
returns(GDint)

}

func("get_pattern") {
returns(GDTileMapPattern)
"index"(GDint)
}

func("get_patterns_count") {
returns(GDint)

}

func("get_physics_layer_collision_layer") {
returns(GDint)
"layer_index"(GDint)
}

func("get_physics_layer_collision_mask") {
returns(GDint)
"layer_index"(GDint)
}

func("get_physics_layer_physics_material") {
returns(GDPhysicsMaterial)
"layer_index"(GDint)
}

func("get_physics_layers_count") {
returns(GDint)

}

func("get_source") {
returns(GDTileSetSource)
"source_id"(GDint)
}

func("get_source_count") {
returns(GDint)

}

func("get_source_id") {
returns(GDint)
"index"(GDint)
}

func("get_source_level_tile_proxy") {
returns(GDint)
"source_from"(GDint)
}

func("get_terrain_color") {
returns(GDColor)
"terrain_set"(GDint)
"terrain_index"(GDint)
}

func("get_terrain_name") {
returns(GDString)
"terrain_set"(GDint)
"terrain_index"(GDint)
}

func("get_terrain_set_mode") {
returns(GDTerrainMode)
"terrain_set"(GDint)
}

func("get_terrain_sets_count") {
returns(GDint)

}

func("get_terrains_count") {
returns(GDint)
"terrain_set"(GDint)
}

func("has_alternative_level_tile_proxy") {
returns(GDbool)
"source_from"(GDint)
"coords_from"(GDVector2i)
"alternative_from"(GDint)
}

func("has_coords_level_tile_proxy") {
returns(GDbool)
"source_from"(GDint)
"coords_from"(GDVector2i)
}

func("has_source") {
returns(GDbool)
"source_id"(GDint)
}

func("has_source_level_tile_proxy") {
returns(GDbool)
"source_from"(GDint)
}

func("map_tile_proxy") {
returns(GDArray)
"source_from"(GDint)
"coords_from"(GDVector2i)
"alternative_from"(GDint)
}

func("move_custom_data_layer") {
returns(GDvoid)
"layer_index"(GDint)
"to_position"(GDint)
}

func("move_navigation_layer") {
returns(GDvoid)
"layer_index"(GDint)
"to_position"(GDint)
}

func("move_occlusion_layer") {
returns(GDvoid)
"layer_index"(GDint)
"to_position"(GDint)
}

func("move_physics_layer") {
returns(GDvoid)
"layer_index"(GDint)
"to_position"(GDint)
}

func("move_terrain") {
returns(GDvoid)
"terrain_set"(GDint)
"terrain_index"(GDint)
"to_position"(GDint)
}

func("move_terrain_set") {
returns(GDvoid)
"terrain_set"(GDint)
"to_position"(GDint)
}

func("remove_alternative_level_tile_proxy") {
returns(GDvoid)
"source_from"(GDint)
"coords_from"(GDVector2i)
"alternative_from"(GDint)
}

func("remove_coords_level_tile_proxy") {
returns(GDvoid)
"source_from"(GDint)
"coords_from"(GDVector2i)
}

func("remove_custom_data_layer") {
returns(GDvoid)
"layer_index"(GDint)
}

func("remove_navigation_layer") {
returns(GDvoid)
"layer_index"(GDint)
}

func("remove_occlusion_layer") {
returns(GDvoid)
"layer_index"(GDint)
}

func("remove_pattern") {
returns(GDvoid)
"index"(GDint)
}

func("remove_physics_layer") {
returns(GDvoid)
"layer_index"(GDint)
}

func("remove_source") {
returns(GDvoid)
"source_id"(GDint)
}

func("remove_source_level_tile_proxy") {
returns(GDvoid)
"source_from"(GDint)
}

func("remove_terrain") {
returns(GDvoid)
"terrain_set"(GDint)
"terrain_index"(GDint)
}

func("remove_terrain_set") {
returns(GDvoid)
"terrain_set"(GDint)
}

func("set_alternative_level_tile_proxy") {
returns(GDvoid)
"source_from"(GDint)
"coords_from"(GDVector2i)
"alternative_from"(GDint)
"source_to"(GDint)
"coords_to"(GDVector2i)
"alternative_to"(GDint)
}

func("set_coords_level_tile_proxy") {
returns(GDvoid)
"p_source_from"(GDint)
"coords_from"(GDVector2i)
"source_to"(GDint)
"coords_to"(GDVector2i)
}

func("set_custom_data_layer_name") {
returns(GDvoid)
"layer_index"(GDint)
"layer_name"(GDString)
}

func("set_custom_data_layer_type") {
returns(GDvoid)
"layer_index"(GDint)
"layer_type"(GDVariantType)
}

func("set_navigation_layer_layer_value") {
returns(GDvoid)
"layer_index"(GDint)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_navigation_layer_layers") {
returns(GDvoid)
"layer_index"(GDint)
"layers"(GDint)
}

func("set_occlusion_layer_light_mask") {
returns(GDvoid)
"layer_index"(GDint)
"light_mask"(GDint)
}

func("set_occlusion_layer_sdf_collision") {
returns(GDvoid)
"layer_index"(GDint)
"sdf_collision"(GDbool)
}

func("set_physics_layer_collision_layer") {
returns(GDvoid)
"layer_index"(GDint)
"layer"(GDint)
}

func("set_physics_layer_collision_mask") {
returns(GDvoid)
"layer_index"(GDint)
"mask"(GDint)
}

func("set_physics_layer_physics_material") {
returns(GDvoid)
"layer_index"(GDint)
"physics_material"(GDPhysicsMaterial)
}

func("set_source_id") {
returns(GDvoid)
"source_id"(GDint)
"new_source_id"(GDint)
}

func("set_source_level_tile_proxy") {
returns(GDvoid)
"source_from"(GDint)
"source_to"(GDint)
}

func("set_terrain_color") {
returns(GDvoid)
"terrain_set"(GDint)
"terrain_index"(GDint)
"color"(GDColor)
}

func("set_terrain_name") {
returns(GDvoid)
"terrain_set"(GDint)
"terrain_index"(GDint)
"name"(GDString)
}

func("set_terrain_set_mode") {
returns(GDvoid)
"terrain_set"(GDint)
"mode"(GDTerrainMode)
}
}){

}