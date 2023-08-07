
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorNode3DGizmoPlugin: GDType("EditorNode3DGizmoPlugin", {


constructor { }

func("_can_be_hidden") {
returns(GDbool)

}

func("_commit_handle") {
returns(GDvoid)
"gizmo"(GDEditorNode3DGizmo)
"handle_id"(GDint)
"secondary"(GDbool)
"restore"(GDVariant)
"cancel"(GDbool)
}

func("_commit_subgizmos") {
returns(GDvoid)
"gizmo"(GDEditorNode3DGizmo)
"ids"(GDPackedInt32Array)
"restores"(GDTypedArray(GDTransform3D::class))
"cancel"(GDbool)
}

func("_create_gizmo") {
returns(GDEditorNode3DGizmo)
"for_node_3d"(GDNode3D)
}

func("_get_gizmo_name") {
returns(GDString)

}

func("_get_handle_name") {
returns(GDString)
"gizmo"(GDEditorNode3DGizmo)
"handle_id"(GDint)
"secondary"(GDbool)
}

func("_get_handle_value") {
returns(GDVariant)
"gizmo"(GDEditorNode3DGizmo)
"handle_id"(GDint)
"secondary"(GDbool)
}

func("_get_priority") {
returns(GDint)

}

func("_get_subgizmo_transform") {
returns(GDTransform3D)
"gizmo"(GDEditorNode3DGizmo)
"subgizmo_id"(GDint)
}

func("_has_gizmo") {
returns(GDbool)
"for_node_3d"(GDNode3D)
}

func("_is_handle_highlighted") {
returns(GDbool)
"gizmo"(GDEditorNode3DGizmo)
"handle_id"(GDint)
"secondary"(GDbool)
}

func("_is_selectable_when_hidden") {
returns(GDbool)

}

func("_redraw") {
returns(GDvoid)
"gizmo"(GDEditorNode3DGizmo)
}

func("_set_handle") {
returns(GDvoid)
"gizmo"(GDEditorNode3DGizmo)
"handle_id"(GDint)
"secondary"(GDbool)
"camera"(GDCamera3D)
"screen_pos"(GDVector2)
}

func("_set_subgizmo_transform") {
returns(GDvoid)
"gizmo"(GDEditorNode3DGizmo)
"subgizmo_id"(GDint)
"transform"(GDTransform3D)
}

func("_subgizmos_intersect_frustum") {
returns(GDPackedInt32Array)
"gizmo"(GDEditorNode3DGizmo)
"camera"(GDCamera3D)
"frustum_planes"(GDTypedArray(GDPlane::class))
}

func("_subgizmos_intersect_ray") {
returns(GDint)
"gizmo"(GDEditorNode3DGizmo)
"camera"(GDCamera3D)
"screen_pos"(GDVector2)
}

func("add_material") {
returns(GDvoid)
"name"(GDString)
"material"(GDStandardMaterial3D)
}

func("create_handle_material") {
returns(GDvoid)
"name"(GDString)
"billboard"(GDbool)
"texture"(GDTexture2D)
}

func("create_icon_material") {
returns(GDvoid)
"name"(GDString)
"texture"(GDTexture2D)
"on_top"(GDbool)
"color"(GDColor)
}

func("create_material") {
returns(GDvoid)
"name"(GDString)
"color"(GDColor)
"billboard"(GDbool)
"on_top"(GDbool)
"use_vertex_color"(GDbool)
}

func("get_material") {
returns(GDStandardMaterial3D)
"name"(GDString)
"gizmo"(GDEditorNode3DGizmo)
}
}){

}