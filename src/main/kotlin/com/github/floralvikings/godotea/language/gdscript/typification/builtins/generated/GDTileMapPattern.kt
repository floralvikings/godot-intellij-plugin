
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTileMapPattern: GDType("TileMapPattern", {


constructor { }

func("get_cell_alternative_tile") {
returns(GDint)
"coords"(GDVector2i)
}

func("get_cell_atlas_coords") {
returns(GDVector2i)
"coords"(GDVector2i)
}

func("get_cell_source_id") {
returns(GDint)
"coords"(GDVector2i)
}

func("get_size") {
returns(GDVector2i)

}

func("get_used_cells") {
returns(GDTypedArray(GDVector2i::class))

}

func("has_cell") {
returns(GDbool)
"coords"(GDVector2i)
}

func("is_empty") {
returns(GDbool)

}

func("remove_cell") {
returns(GDvoid)
"coords"(GDVector2i)
"update_size"(GDbool)
}

func("set_cell") {
returns(GDvoid)
"coords"(GDVector2i)
"source_id"(GDint)
"atlas_coords"(GDVector2i)
"alternative_tile"(GDint)
}

func("set_size") {
returns(GDvoid)
"size"(GDVector2i)
}
}){

}