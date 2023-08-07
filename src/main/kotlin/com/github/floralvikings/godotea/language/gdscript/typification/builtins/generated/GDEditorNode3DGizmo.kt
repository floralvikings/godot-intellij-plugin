
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorNode3DGizmo: GDType("EditorNode3DGizmo", {


constructor { }

func("_commit_handle") {
returns(GDvoid)
"id"(GDint)
"secondary"(GDbool)
"restore"(GDVariant)
"cancel"(GDbool)
}

func("_commit_subgizmos") {
returns(GDvoid)
"ids"(GDPackedInt32Array)
"restores"(GDTypedArray(GDTransform3D::class))
"cancel"(GDbool)
}

func("_get_handle_name") {
returns(GDString)
"id"(GDint)
"secondary"(GDbool)
}

func("_get_handle_value") {
returns(GDVariant)
"id"(GDint)
"secondary"(GDbool)
}

func("_get_subgizmo_transform") {
returns(GDTransform3D)
"id"(GDint)
}

func("_is_handle_highlighted") {
returns(GDbool)
"id"(GDint)
"secondary"(GDbool)
}

func("_redraw") {
returns(GDvoid)

}

func("_set_handle") {
returns(GDvoid)
"id"(GDint)
"secondary"(GDbool)
"camera"(GDCamera3D)
"point"(GDVector2)
}

func("_set_subgizmo_transform") {
returns(GDvoid)
"id"(GDint)
"transform"(GDTransform3D)
}

func("_subgizmos_intersect_frustum") {
returns(GDPackedInt32Array)
"camera"(GDCamera3D)
"frustum"(GDTypedArray(GDPlane::class))
}

func("_subgizmos_intersect_ray") {
returns(GDint)
"camera"(GDCamera3D)
"point"(GDVector2)
}

func("add_collision_segments") {
returns(GDvoid)
"segments"(GDPackedVector3Array)
}

func("add_collision_triangles") {
returns(GDvoid)
"triangles"(GDTriangleMesh)
}

func("add_handles") {
returns(GDvoid)
"handles"(GDPackedVector3Array)
"material"(GDMaterial)
"ids"(GDPackedInt32Array)
"billboard"(GDbool)
"secondary"(GDbool)
}

func("add_lines") {
returns(GDvoid)
"lines"(GDPackedVector3Array)
"material"(GDMaterial)
"billboard"(GDbool)
"modulate"(GDColor)
}

func("add_mesh") {
returns(GDvoid)
"mesh"(GDMesh)
"material"(GDMaterial)
"transform"(GDTransform3D)
"skeleton"(GDSkinReference)
}

func("add_unscaled_billboard") {
returns(GDvoid)
"material"(GDMaterial)
"default_scale"(GDfloat)
"modulate"(GDColor)
}

func("clear") {
returns(GDvoid)

}

func("get_node_3d") {
returns(GDNode3D)

}

func("get_plugin") {
returns(GDEditorNode3DGizmoPlugin)

}

func("get_subgizmo_selection") {
returns(GDPackedInt32Array)

}

func("is_subgizmo_selected") {
returns(GDbool)
"id"(GDint)
}

func("set_hidden") {
returns(GDvoid)
"hidden"(GDbool)
}

func("set_node_3d") {
returns(GDvoid)
"node"(GDNode)
}
}){

}