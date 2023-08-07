
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTileSetSource: GDType("TileSetSource", {


constructor { }

func("get_alternative_tile_id") {
returns(GDint)
"atlas_coords"(GDVector2i)
"index"(GDint)
}

func("get_alternative_tiles_count") {
returns(GDint)
"atlas_coords"(GDVector2i)
}

func("get_tile_id") {
returns(GDVector2i)
"index"(GDint)
}

func("get_tiles_count") {
returns(GDint)

}

func("has_alternative_tile") {
returns(GDbool)
"atlas_coords"(GDVector2i)
"alternative_tile"(GDint)
}

func("has_tile") {
returns(GDbool)
"atlas_coords"(GDVector2i)
}
}){

}