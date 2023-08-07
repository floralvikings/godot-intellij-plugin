
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTileMap: GDType("TileMap", {

"cell_quadrant_size"(GDint)
"collision_animatable"(GDbool)
"collision_visibility_mode"(GDVisibilityMode)
"navigation_visibility_mode"(GDVisibilityMode)
"tile_set"(GDTileSet)
constructor { }

func("_tile_data_runtime_update") {
returns(GDvoid)
"layer"(GDint)
"coords"(GDVector2i)
"tile_data"(GDTileData)
}

func("_use_tile_data_runtime_update") {
returns(GDbool)
"layer"(GDint)
"coords"(GDVector2i)
}

func("add_layer") {
returns(GDvoid)
"to_position"(GDint)
}

func("clear") {
returns(GDvoid)

}

func("clear_layer") {
returns(GDvoid)
"layer"(GDint)
}

func("erase_cell") {
returns(GDvoid)
"layer"(GDint)
"coords"(GDVector2i)
}

func("fix_invalid_tiles") {
returns(GDvoid)

}

func("force_update") {
returns(GDvoid)
"layer"(GDint)
}

func("get_cell_alternative_tile") {
returns(GDint)
"layer"(GDint)
"coords"(GDVector2i)
"use_proxies"(GDbool)
}

func("get_cell_atlas_coords") {
returns(GDVector2i)
"layer"(GDint)
"coords"(GDVector2i)
"use_proxies"(GDbool)
}

func("get_cell_source_id") {
returns(GDint)
"layer"(GDint)
"coords"(GDVector2i)
"use_proxies"(GDbool)
}

func("get_cell_tile_data") {
returns(GDTileData)
"layer"(GDint)
"coords"(GDVector2i)
"use_proxies"(GDbool)
}

func("get_coords_for_body_rid") {
returns(GDVector2i)
"body"(GDRID)
}

func("get_layer_for_body_rid") {
returns(GDint)
"body"(GDRID)
}

func("get_layer_modulate") {
returns(GDColor)
"layer"(GDint)
}

func("get_layer_name") {
returns(GDString)
"layer"(GDint)
}

func("get_layer_y_sort_origin") {
returns(GDint)
"layer"(GDint)
}

func("get_layer_z_index") {
returns(GDint)
"layer"(GDint)
}

func("get_layers_count") {
returns(GDint)

}

func("get_navigation_map") {
returns(GDRID)
"layer"(GDint)
}

func("get_neighbor_cell") {
returns(GDVector2i)
"coords"(GDVector2i)
"neighbor"(GDCellNeighbor)
}

func("get_pattern") {
returns(GDTileMapPattern)
"layer"(GDint)
"coords_array"(GDTypedArray(GDVector2i::class))
}

func("get_surrounding_cells") {
returns(GDTypedArray(GDVector2i::class))
"coords"(GDVector2i)
}

func("get_used_cells") {
returns(GDTypedArray(GDVector2i::class))
"layer"(GDint)
}

func("get_used_cells_by_id") {
returns(GDTypedArray(GDVector2i::class))
"layer"(GDint)
"source_id"(GDint)
"atlas_coords"(GDVector2i)
"alternative_tile"(GDint)
}

func("get_used_rect") {
returns(GDRect2i)

}

func("is_layer_enabled") {
returns(GDbool)
"layer"(GDint)
}

func("is_layer_y_sort_enabled") {
returns(GDbool)
"layer"(GDint)
}

func("local_to_map") {
returns(GDVector2i)
"local_position"(GDVector2)
}

func("map_pattern") {
returns(GDVector2i)
"position_in_tilemap"(GDVector2i)
"coords_in_pattern"(GDVector2i)
"pattern"(GDTileMapPattern)
}

func("map_to_local") {
returns(GDVector2)
"map_position"(GDVector2i)
}

func("move_layer") {
returns(GDvoid)
"layer"(GDint)
"to_position"(GDint)
}

func("remove_layer") {
returns(GDvoid)
"layer"(GDint)
}

func("set_cell") {
returns(GDvoid)
"layer"(GDint)
"coords"(GDVector2i)
"source_id"(GDint)
"atlas_coords"(GDVector2i)
"alternative_tile"(GDint)
}

func("set_cells_terrain_connect") {
returns(GDvoid)
"layer"(GDint)
"cells"(GDTypedArray(GDVector2i::class))
"terrain_set"(GDint)
"terrain"(GDint)
"ignore_empty_terrains"(GDbool)
}

func("set_cells_terrain_path") {
returns(GDvoid)
"layer"(GDint)
"path"(GDTypedArray(GDVector2i::class))
"terrain_set"(GDint)
"terrain"(GDint)
"ignore_empty_terrains"(GDbool)
}

func("set_layer_enabled") {
returns(GDvoid)
"layer"(GDint)
"enabled"(GDbool)
}

func("set_layer_modulate") {
returns(GDvoid)
"layer"(GDint)
"modulate"(GDColor)
}

func("set_layer_name") {
returns(GDvoid)
"layer"(GDint)
"name"(GDString)
}

func("set_layer_y_sort_enabled") {
returns(GDvoid)
"layer"(GDint)
"y_sort_enabled"(GDbool)
}

func("set_layer_y_sort_origin") {
returns(GDvoid)
"layer"(GDint)
"y_sort_origin"(GDint)
}

func("set_layer_z_index") {
returns(GDvoid)
"layer"(GDint)
"z_index"(GDint)
}

func("set_navigation_map") {
returns(GDvoid)
"layer"(GDint)
"map"(GDRID)
}

func("set_pattern") {
returns(GDvoid)
"layer"(GDint)
"position"(GDVector2i)
"pattern"(GDTileMapPattern)
}
}){

}