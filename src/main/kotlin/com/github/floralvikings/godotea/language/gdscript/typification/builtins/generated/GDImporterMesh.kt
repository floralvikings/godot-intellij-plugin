
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDImporterMesh: GDType("ImporterMesh", {

"_data"(GDDictionary)
constructor { }

func("add_blend_shape") {
returns(GDvoid)
"name"(GDString)
}

func("add_surface") {
returns(GDvoid)
"primitive"(GDPrimitiveType)
"arrays"(GDArray)
"blend_shapes"(GDTypedArray(GDArray::class))
"lods"(GDDictionary)
"material"(GDMaterial)
"name"(GDString)
"flags"(GDint)
}

func("clear") {
returns(GDvoid)

}

func("generate_lods") {
returns(GDvoid)
"normal_merge_angle"(GDfloat)
"normal_split_angle"(GDfloat)
"bone_transform_array"(GDArray)
}

func("get_blend_shape_count") {
returns(GDint)

}

func("get_blend_shape_mode") {
returns(GDBlendShapeMode)

}

func("get_blend_shape_name") {
returns(GDString)
"blend_shape_idx"(GDint)
}

func("get_lightmap_size_hint") {
returns(GDVector2i)

}

func("get_mesh") {
returns(GDArrayMesh)
"base_mesh"(GDArrayMesh)
}

func("get_surface_arrays") {
returns(GDArray)
"surface_idx"(GDint)
}

func("get_surface_blend_shape_arrays") {
returns(GDArray)
"surface_idx"(GDint)
"blend_shape_idx"(GDint)
}

func("get_surface_count") {
returns(GDint)

}

func("get_surface_format") {
returns(GDint)
"surface_idx"(GDint)
}

func("get_surface_lod_count") {
returns(GDint)
"surface_idx"(GDint)
}

func("get_surface_lod_indices") {
returns(GDPackedInt32Array)
"surface_idx"(GDint)
"lod_idx"(GDint)
}

func("get_surface_lod_size") {
returns(GDfloat)
"surface_idx"(GDint)
"lod_idx"(GDint)
}

func("get_surface_material") {
returns(GDMaterial)
"surface_idx"(GDint)
}

func("get_surface_name") {
returns(GDString)
"surface_idx"(GDint)
}

func("get_surface_primitive_type") {
returns(GDPrimitiveType)
"surface_idx"(GDint)
}

func("set_blend_shape_mode") {
returns(GDvoid)
"mode"(GDBlendShapeMode)
}

func("set_lightmap_size_hint") {
returns(GDvoid)
"size"(GDVector2i)
}

func("set_surface_material") {
returns(GDvoid)
"surface_idx"(GDint)
"material"(GDMaterial)
}

func("set_surface_name") {
returns(GDvoid)
"surface_idx"(GDint)
"name"(GDString)
}
}){

}