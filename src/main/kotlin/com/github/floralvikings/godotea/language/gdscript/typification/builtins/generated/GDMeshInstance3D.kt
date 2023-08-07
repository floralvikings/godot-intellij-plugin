
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMeshInstance3D: GDType("MeshInstance3D", {

"mesh"(GDMesh)
"skeleton"(GDNodePath)
"skin"(GDSkin)
constructor { }

func("create_convex_collision") {
returns(GDvoid)
"clean"(GDbool)
"simplify"(GDbool)
}

func("create_debug_tangents") {
returns(GDvoid)

}

func("create_multiple_convex_collisions") {
returns(GDvoid)
"settings"(GDMeshConvexDecompositionSettings)
}

func("create_trimesh_collision") {
returns(GDvoid)

}

func("find_blend_shape_by_name") {
returns(GDint)
"name"(GDStringName)
}

func("get_active_material") {
returns(GDMaterial)
"surface"(GDint)
}

func("get_blend_shape_count") {
returns(GDint)

}

func("get_blend_shape_value") {
returns(GDfloat)
"blend_shape_idx"(GDint)
}

func("get_surface_override_material") {
returns(GDMaterial)
"surface"(GDint)
}

func("get_surface_override_material_count") {
returns(GDint)

}

func("set_blend_shape_value") {
returns(GDvoid)
"blend_shape_idx"(GDint)
"value"(GDfloat)
}

func("set_surface_override_material") {
returns(GDvoid)
"surface"(GDint)
"material"(GDMaterial)
}
}){

}