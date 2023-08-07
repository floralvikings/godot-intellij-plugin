
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDArrayMesh: GDType("ArrayMesh", {

"blend_shape_mode"(GDBlendShapeMode)
"custom_aabb"(GDAABB)
"shadow_mesh"(GDSameType)
constructor { }

func("add_blend_shape") {
returns(GDvoid)
"name"(GDStringName)
}

func("add_surface_from_arrays") {
returns(GDvoid)
"primitive"(GDPrimitiveType)
"arrays"(GDArray)
"blend_shapes"(GDTypedArray(GDArray::class))
"lods"(GDDictionary)
"flags"(GDUnknownType)
}

func("clear_blend_shapes") {
returns(GDvoid)

}

func("clear_surfaces") {
returns(GDvoid)

}

func("get_blend_shape_count") {
returns(GDint)

}

func("get_blend_shape_name") {
returns(GDStringName)
"index"(GDint)
}

func("lightmap_unwrap") {
returns(GDError)
"transform"(GDTransform3D)
"texel_size"(GDfloat)
}

func("regen_normal_maps") {
returns(GDvoid)

}

func("set_blend_shape_name") {
returns(GDvoid)
"index"(GDint)
"name"(GDStringName)
}

func("surface_find_by_name") {
returns(GDint)
"name"(GDString)
}

func("surface_get_array_index_len") {
returns(GDint)
"surf_idx"(GDint)
}

func("surface_get_array_len") {
returns(GDint)
"surf_idx"(GDint)
}

func("surface_get_format") {
returns(GDUnknownType)
"surf_idx"(GDint)
}

func("surface_get_name") {
returns(GDString)
"surf_idx"(GDint)
}

func("surface_get_primitive_type") {
returns(GDPrimitiveType)
"surf_idx"(GDint)
}

func("surface_set_name") {
returns(GDvoid)
"surf_idx"(GDint)
"name"(GDString)
}

func("surface_update_attribute_region") {
returns(GDvoid)
"surf_idx"(GDint)
"offset"(GDint)
"data"(GDPackedByteArray)
}

func("surface_update_skin_region") {
returns(GDvoid)
"surf_idx"(GDint)
"offset"(GDint)
"data"(GDPackedByteArray)
}

func("surface_update_vertex_region") {
returns(GDvoid)
"surf_idx"(GDint)
"offset"(GDint)
"data"(GDPackedByteArray)
}
}){

}