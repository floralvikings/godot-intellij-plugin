
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGridMap: GDType("GridMap", {

"bake_navigation"(GDbool)
"cell_center_x"(GDbool)
"cell_center_y"(GDbool)
"cell_center_z"(GDbool)
"cell_octant_size"(GDint)
"cell_scale"(GDfloat)
"cell_size"(GDVector3)
"collision_layer"(GDint)
"collision_mask"(GDint)
"collision_priority"(GDfloat)
"mesh_library"(GDMeshLibrary)
"physics_material"(GDPhysicsMaterial)
constructor { }

func("clear") {
returns(GDvoid)

}

func("clear_baked_meshes") {
returns(GDvoid)

}

func("get_bake_mesh_instance") {
returns(GDRID)
"idx"(GDint)
}

func("get_bake_meshes") {
returns(GDArray)

}

func("get_basis_with_orthogonal_index") {
returns(GDBasis)
"index"(GDint)
}

func("get_cell_item") {
returns(GDint)
"position"(GDVector3i)
}

func("get_cell_item_basis") {
returns(GDBasis)
"position"(GDVector3i)
}

func("get_cell_item_orientation") {
returns(GDint)
"position"(GDVector3i)
}

func("get_collision_layer_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_collision_mask_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_meshes") {
returns(GDArray)

}

func("get_navigation_map") {
returns(GDRID)

}

func("get_orthogonal_index_from_basis") {
returns(GDint)
"basis"(GDBasis)
}

func("get_used_cells") {
returns(GDTypedArray(GDVector3i::class))

}

func("get_used_cells_by_item") {
returns(GDTypedArray(GDVector3i::class))
"item"(GDint)
}

func("local_to_map") {
returns(GDVector3i)
"local_position"(GDVector3)
}

func("make_baked_meshes") {
returns(GDvoid)
"gen_lightmap_uv"(GDbool)
"lightmap_uv_texel_size"(GDfloat)
}

func("map_to_local") {
returns(GDVector3)
"map_position"(GDVector3i)
}

func("resource_changed") {
returns(GDvoid)
"resource"(GDResource)
}

func("set_cell_item") {
returns(GDvoid)
"position"(GDVector3i)
"item"(GDint)
"orientation"(GDint)
}

func("set_collision_layer_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_collision_mask_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_navigation_map") {
returns(GDvoid)
"navigation_map"(GDRID)
}
}){

}