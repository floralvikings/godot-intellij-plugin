
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMesh: GDType("Mesh", {

"lightmap_size_hint"(GDVector2i)
constructor { }

func("_get_aabb") {
returns(GDAABB)

}

func("_get_blend_shape_count") {
returns(GDint)

}

func("_get_blend_shape_name") {
returns(GDStringName)
"index"(GDint)
}

func("_get_surface_count") {
returns(GDint)

}

func("_set_blend_shape_name") {
returns(GDvoid)
"index"(GDint)
"name"(GDStringName)
}

func("_surface_get_array_index_len") {
returns(GDint)
"index"(GDint)
}

func("_surface_get_array_len") {
returns(GDint)
"index"(GDint)
}

func("_surface_get_arrays") {
returns(GDArray)
"index"(GDint)
}

func("_surface_get_blend_shape_arrays") {
returns(GDTypedArray(GDArray::class))
"index"(GDint)
}

func("_surface_get_format") {
returns(GDint)
"index"(GDint)
}

func("_surface_get_lods") {
returns(GDDictionary)
"index"(GDint)
}

func("_surface_get_material") {
returns(GDMaterial)
"index"(GDint)
}

func("_surface_get_primitive_type") {
returns(GDint)
"index"(GDint)
}

func("_surface_set_material") {
returns(GDvoid)
"index"(GDint)
"material"(GDMaterial)
}

func("create_convex_shape") {
returns(GDConvexPolygonShape3D)
"clean"(GDbool)
"simplify"(GDbool)
}

func("create_outline") {
returns(GDSameType)
"margin"(GDfloat)
}

func("create_placeholder") {
returns(GDResource)

}

func("create_trimesh_shape") {
returns(GDConcavePolygonShape3D)

}

func("generate_triangle_mesh") {
returns(GDTriangleMesh)

}

func("get_aabb") {
returns(GDAABB)

}

func("get_faces") {
returns(GDPackedVector3Array)

}

func("get_surface_count") {
returns(GDint)

}

func("surface_get_arrays") {
returns(GDArray)
"surf_idx"(GDint)
}

func("surface_get_blend_shape_arrays") {
returns(GDTypedArray(GDArray::class))
"surf_idx"(GDint)
}

func("surface_get_material") {
returns(GDMaterial)
"surf_idx"(GDint)
}

func("surface_set_material") {
returns(GDvoid)
"surf_idx"(GDint)
"material"(GDMaterial)
}
}){

}