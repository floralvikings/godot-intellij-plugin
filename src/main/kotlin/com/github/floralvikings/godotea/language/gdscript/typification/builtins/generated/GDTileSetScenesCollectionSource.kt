
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTileSetScenesCollectionSource: GDType("TileSetScenesCollectionSource", {


constructor { }

func("create_scene_tile") {
returns(GDint)
"packed_scene"(GDPackedScene)
"id_override"(GDint)
}

func("get_next_scene_tile_id") {
returns(GDint)

}

func("get_scene_tile_display_placeholder") {
returns(GDbool)
"id"(GDint)
}

func("get_scene_tile_id") {
returns(GDint)
"index"(GDint)
}

func("get_scene_tile_scene") {
returns(GDPackedScene)
"id"(GDint)
}

func("get_scene_tiles_count") {
returns(GDint)

}

func("has_scene_tile_id") {
returns(GDbool)
"id"(GDint)
}

func("remove_scene_tile") {
returns(GDvoid)
"id"(GDint)
}

func("set_scene_tile_display_placeholder") {
returns(GDvoid)
"id"(GDint)
"display_placeholder"(GDbool)
}

func("set_scene_tile_id") {
returns(GDvoid)
"id"(GDint)
"new_id"(GDint)
}

func("set_scene_tile_scene") {
returns(GDvoid)
"id"(GDint)
"packed_scene"(GDPackedScene)
}
}){

}