
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSurfaceTool: GDType("SurfaceTool", {


constructor { }

func("add_index") {
returns(GDvoid)
"index"(GDint)
}

func("add_triangle_fan") {
returns(GDvoid)
"vertices"(GDPackedVector3Array)
"uvs"(GDPackedVector2Array)
"colors"(GDPackedColorArray)
"uv2s"(GDPackedVector2Array)
"normals"(GDPackedVector3Array)
"tangents"(GDTypedArray(GDPlane::class))
}

func("add_vertex") {
returns(GDvoid)
"vertex"(GDVector3)
}

func("append_from") {
returns(GDvoid)
"existing"(GDMesh)
"surface"(GDint)
"transform"(GDTransform3D)
}

func("begin") {
returns(GDvoid)
"primitive"(GDPrimitiveType)
}

func("clear") {
returns(GDvoid)

}

func("commit") {
returns(GDArrayMesh)
"existing"(GDArrayMesh)
"flags"(GDint)
}

func("commit_to_arrays") {
returns(GDArray)

}

func("create_from") {
returns(GDvoid)
"existing"(GDMesh)
"surface"(GDint)
}

func("create_from_blend_shape") {
returns(GDvoid)
"existing"(GDMesh)
"surface"(GDint)
"blend_shape"(GDString)
}

func("deindex") {
returns(GDvoid)

}

func("generate_lod") {
returns(GDPackedInt32Array)
"nd_threshold"(GDfloat)
"target_index_count"(GDint)
}

func("generate_normals") {
returns(GDvoid)
"flip"(GDbool)
}

func("generate_tangents") {
returns(GDvoid)

}

func("get_aabb") {
returns(GDAABB)

}

func("get_custom_format") {
returns(GDCustomFormat)
"channel_index"(GDint)
}

func("get_primitive_type") {
returns(GDPrimitiveType)

}

func("get_skin_weight_count") {
returns(GDSkinWeightCount)

}

func("index") {
returns(GDvoid)

}

func("optimize_indices_for_cache") {
returns(GDvoid)

}

func("set_bones") {
returns(GDvoid)
"bones"(GDPackedInt32Array)
}

func("set_color") {
returns(GDvoid)
"color"(GDColor)
}

func("set_custom") {
returns(GDvoid)
"channel_index"(GDint)
"custom_color"(GDColor)
}

func("set_custom_format") {
returns(GDvoid)
"channel_index"(GDint)
"format"(GDCustomFormat)
}

func("set_material") {
returns(GDvoid)
"material"(GDMaterial)
}

func("set_normal") {
returns(GDvoid)
"normal"(GDVector3)
}

func("set_skin_weight_count") {
returns(GDvoid)
"count"(GDSkinWeightCount)
}

func("set_smooth_group") {
returns(GDvoid)
"index"(GDint)
}

func("set_tangent") {
returns(GDvoid)
"tangent"(GDPlane)
}

func("set_uv") {
returns(GDvoid)
"uv"(GDVector2)
}

func("set_uv2") {
returns(GDvoid)
"uv2"(GDVector2)
}

func("set_weights") {
returns(GDvoid)
"weights"(GDPackedFloat32Array)
}
}){

}