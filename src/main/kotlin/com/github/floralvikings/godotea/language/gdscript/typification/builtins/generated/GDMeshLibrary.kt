
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMeshLibrary: GDType("MeshLibrary", {


constructor { }

func("clear") {
returns(GDvoid)

}

func("create_item") {
returns(GDvoid)
"id"(GDint)
}

func("find_item_by_name") {
returns(GDint)
"name"(GDString)
}

func("get_item_list") {
returns(GDPackedInt32Array)

}

func("get_item_mesh") {
returns(GDMesh)
"id"(GDint)
}

func("get_item_mesh_transform") {
returns(GDTransform3D)
"id"(GDint)
}

func("get_item_name") {
returns(GDString)
"id"(GDint)
}

func("get_item_navigation_layers") {
returns(GDint)
"id"(GDint)
}

func("get_item_navigation_mesh") {
returns(GDNavigationMesh)
"id"(GDint)
}

func("get_item_navigation_mesh_transform") {
returns(GDTransform3D)
"id"(GDint)
}

func("get_item_preview") {
returns(GDTexture2D)
"id"(GDint)
}

func("get_item_shapes") {
returns(GDArray)
"id"(GDint)
}

func("get_last_unused_item_id") {
returns(GDint)

}

func("remove_item") {
returns(GDvoid)
"id"(GDint)
}

func("set_item_mesh") {
returns(GDvoid)
"id"(GDint)
"mesh"(GDMesh)
}

func("set_item_mesh_transform") {
returns(GDvoid)
"id"(GDint)
"mesh_transform"(GDTransform3D)
}

func("set_item_name") {
returns(GDvoid)
"id"(GDint)
"name"(GDString)
}

func("set_item_navigation_layers") {
returns(GDvoid)
"id"(GDint)
"navigation_layers"(GDint)
}

func("set_item_navigation_mesh") {
returns(GDvoid)
"id"(GDint)
"navigation_mesh"(GDNavigationMesh)
}

func("set_item_navigation_mesh_transform") {
returns(GDvoid)
"id"(GDint)
"navigation_mesh"(GDTransform3D)
}

func("set_item_preview") {
returns(GDvoid)
"id"(GDint)
"texture"(GDTexture2D)
}

func("set_item_shapes") {
returns(GDvoid)
"id"(GDint)
"shapes"(GDArray)
}
}){

}