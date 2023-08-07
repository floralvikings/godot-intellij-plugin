
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMeshDataTool: GDType("MeshDataTool", {


constructor { }

func("clear") {
returns(GDvoid)

}

func("commit_to_surface") {
returns(GDError)
"mesh"(GDArrayMesh)
}

func("create_from_surface") {
returns(GDError)
"mesh"(GDArrayMesh)
"surface"(GDint)
}

func("get_edge_count") {
returns(GDint)

}

func("get_edge_faces") {
returns(GDPackedInt32Array)
"idx"(GDint)
}

func("get_edge_meta") {
returns(GDVariant)
"idx"(GDint)
}

func("get_edge_vertex") {
returns(GDint)
"idx"(GDint)
"vertex"(GDint)
}

func("get_face_count") {
returns(GDint)

}

func("get_face_edge") {
returns(GDint)
"idx"(GDint)
"edge"(GDint)
}

func("get_face_meta") {
returns(GDVariant)
"idx"(GDint)
}

func("get_face_normal") {
returns(GDVector3)
"idx"(GDint)
}

func("get_face_vertex") {
returns(GDint)
"idx"(GDint)
"vertex"(GDint)
}

func("get_format") {
returns(GDint)

}

func("get_material") {
returns(GDMaterial)

}

func("get_vertex") {
returns(GDVector3)
"idx"(GDint)
}

func("get_vertex_bones") {
returns(GDPackedInt32Array)
"idx"(GDint)
}

func("get_vertex_color") {
returns(GDColor)
"idx"(GDint)
}

func("get_vertex_count") {
returns(GDint)

}

func("get_vertex_edges") {
returns(GDPackedInt32Array)
"idx"(GDint)
}

func("get_vertex_faces") {
returns(GDPackedInt32Array)
"idx"(GDint)
}

func("get_vertex_meta") {
returns(GDVariant)
"idx"(GDint)
}

func("get_vertex_normal") {
returns(GDVector3)
"idx"(GDint)
}

func("get_vertex_tangent") {
returns(GDPlane)
"idx"(GDint)
}

func("get_vertex_uv") {
returns(GDVector2)
"idx"(GDint)
}

func("get_vertex_uv2") {
returns(GDVector2)
"idx"(GDint)
}

func("get_vertex_weights") {
returns(GDPackedFloat32Array)
"idx"(GDint)
}

func("set_edge_meta") {
returns(GDvoid)
"idx"(GDint)
"meta"(GDVariant)
}

func("set_face_meta") {
returns(GDvoid)
"idx"(GDint)
"meta"(GDVariant)
}

func("set_material") {
returns(GDvoid)
"material"(GDMaterial)
}

func("set_vertex") {
returns(GDvoid)
"idx"(GDint)
"vertex"(GDVector3)
}

func("set_vertex_bones") {
returns(GDvoid)
"idx"(GDint)
"bones"(GDPackedInt32Array)
}

func("set_vertex_color") {
returns(GDvoid)
"idx"(GDint)
"color"(GDColor)
}

func("set_vertex_meta") {
returns(GDvoid)
"idx"(GDint)
"meta"(GDVariant)
}

func("set_vertex_normal") {
returns(GDvoid)
"idx"(GDint)
"normal"(GDVector3)
}

func("set_vertex_tangent") {
returns(GDvoid)
"idx"(GDint)
"tangent"(GDPlane)
}

func("set_vertex_uv") {
returns(GDvoid)
"idx"(GDint)
"uv"(GDVector2)
}

func("set_vertex_uv2") {
returns(GDvoid)
"idx"(GDint)
"uv2"(GDVector2)
}

func("set_vertex_weights") {
returns(GDvoid)
"idx"(GDint)
"weights"(GDPackedFloat32Array)
}
}){

}