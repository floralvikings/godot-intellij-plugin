
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTileSetAtlasSource: GDType("TileSetAtlasSource", {

"margins"(GDVector2i)
"separation"(GDVector2i)
"texture"(GDTexture2D)
"texture_region_size"(GDVector2i)
"use_texture_padding"(GDbool)
constructor { }

func("create_alternative_tile") {
returns(GDint)
"atlas_coords"(GDVector2i)
"alternative_id_override"(GDint)
}

func("create_tile") {
returns(GDvoid)
"atlas_coords"(GDVector2i)
"size"(GDVector2i)
}

func("get_atlas_grid_size") {
returns(GDVector2i)

}

func("get_next_alternative_tile_id") {
returns(GDint)
"atlas_coords"(GDVector2i)
}

func("get_runtime_texture") {
returns(GDTexture2D)

}

func("get_runtime_tile_texture_region") {
returns(GDRect2i)
"atlas_coords"(GDVector2i)
"frame"(GDint)
}

func("get_tile_animation_columns") {
returns(GDint)
"atlas_coords"(GDVector2i)
}

func("get_tile_animation_frame_duration") {
returns(GDfloat)
"atlas_coords"(GDVector2i)
"frame_index"(GDint)
}

func("get_tile_animation_frames_count") {
returns(GDint)
"atlas_coords"(GDVector2i)
}

func("get_tile_animation_separation") {
returns(GDVector2i)
"atlas_coords"(GDVector2i)
}

func("get_tile_animation_speed") {
returns(GDfloat)
"atlas_coords"(GDVector2i)
}

func("get_tile_animation_total_duration") {
returns(GDfloat)
"atlas_coords"(GDVector2i)
}

func("get_tile_at_coords") {
returns(GDVector2i)
"atlas_coords"(GDVector2i)
}

func("get_tile_data") {
returns(GDTileData)
"atlas_coords"(GDVector2i)
"alternative_tile"(GDint)
}

func("get_tile_size_in_atlas") {
returns(GDVector2i)
"atlas_coords"(GDVector2i)
}

func("get_tile_texture_region") {
returns(GDRect2i)
"atlas_coords"(GDVector2i)
"frame"(GDint)
}

func("get_tiles_to_be_removed_on_change") {
returns(GDPackedVector2Array)
"texture"(GDTexture2D)
"margins"(GDVector2i)
"separation"(GDVector2i)
"texture_region_size"(GDVector2i)
}

func("has_room_for_tile") {
returns(GDbool)
"atlas_coords"(GDVector2i)
"size"(GDVector2i)
"animation_columns"(GDint)
"animation_separation"(GDVector2i)
"frames_count"(GDint)
"ignored_tile"(GDVector2i)
}

func("move_tile_in_atlas") {
returns(GDvoid)
"atlas_coords"(GDVector2i)
"new_atlas_coords"(GDVector2i)
"new_size"(GDVector2i)
}

func("remove_alternative_tile") {
returns(GDvoid)
"atlas_coords"(GDVector2i)
"alternative_tile"(GDint)
}

func("remove_tile") {
returns(GDvoid)
"atlas_coords"(GDVector2i)
}

func("set_alternative_tile_id") {
returns(GDvoid)
"atlas_coords"(GDVector2i)
"alternative_tile"(GDint)
"new_id"(GDint)
}

func("set_tile_animation_columns") {
returns(GDvoid)
"atlas_coords"(GDVector2i)
"frame_columns"(GDint)
}

func("set_tile_animation_frame_duration") {
returns(GDvoid)
"atlas_coords"(GDVector2i)
"frame_index"(GDint)
"duration"(GDfloat)
}

func("set_tile_animation_frames_count") {
returns(GDvoid)
"atlas_coords"(GDVector2i)
"frames_count"(GDint)
}

func("set_tile_animation_separation") {
returns(GDvoid)
"atlas_coords"(GDVector2i)
"separation"(GDVector2i)
}

func("set_tile_animation_speed") {
returns(GDvoid)
"atlas_coords"(GDVector2i)
"speed"(GDfloat)
}
}){

}