
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNode3D: GDType("Node3D", {

"basis"(GDBasis)
"global_position"(GDVector3)
"global_rotation"(GDVector3)
"global_rotation_degrees"(GDVector3)
"global_transform"(GDTransform3D)
"position"(GDVector3)
"quaternion"(GDQuaternion)
"rotation"(GDVector3)
"rotation_degrees"(GDVector3)
"rotation_edit_mode"(GDRotationEditMode)
"rotation_order"(GDEulerOrder)
"scale"(GDVector3)
"top_level"(GDbool)
"transform"(GDTransform3D)
"visibility_parent"(GDNodePath)
"visible"(GDbool)
constructor { }

func("add_gizmo") {
returns(GDvoid)
"gizmo"(GDNode3DGizmo)
}

func("clear_gizmos") {
returns(GDvoid)

}

func("clear_subgizmo_selection") {
returns(GDvoid)

}

func("force_update_transform") {
returns(GDvoid)

}

func("get_gizmos") {
returns(GDTypedArray(GDNode3DGizmo::class))

}

func("get_parent_node_3d") {
returns(GDSameType)

}

func("get_world_3d") {
returns(GDWorld3D)

}

func("global_rotate") {
returns(GDvoid)
"axis"(GDVector3)
"angle"(GDfloat)
}

func("global_scale") {
returns(GDvoid)
"scale"(GDVector3)
}

func("global_translate") {
returns(GDvoid)
"offset"(GDVector3)
}

func("hide") {
returns(GDvoid)

}

func("is_local_transform_notification_enabled") {
returns(GDbool)

}

func("is_scale_disabled") {
returns(GDbool)

}

func("is_transform_notification_enabled") {
returns(GDbool)

}

func("is_visible_in_tree") {
returns(GDbool)

}

func("look_at") {
returns(GDvoid)
"target"(GDVector3)
"up"(GDVector3)
"use_model_front"(GDbool)
}

func("look_at_from_position") {
returns(GDvoid)
"position"(GDVector3)
"target"(GDVector3)
"up"(GDVector3)
"use_model_front"(GDbool)
}

func("orthonormalize") {
returns(GDvoid)

}

func("rotate") {
returns(GDvoid)
"axis"(GDVector3)
"angle"(GDfloat)
}

func("rotate_object_local") {
returns(GDvoid)
"axis"(GDVector3)
"angle"(GDfloat)
}

func("rotate_x") {
returns(GDvoid)
"angle"(GDfloat)
}

func("rotate_y") {
returns(GDvoid)
"angle"(GDfloat)
}

func("rotate_z") {
returns(GDvoid)
"angle"(GDfloat)
}

func("scale_object_local") {
returns(GDvoid)
"scale"(GDVector3)
}

func("set_disable_scale") {
returns(GDvoid)
"disable"(GDbool)
}

func("set_identity") {
returns(GDvoid)

}

func("set_ignore_transform_notification") {
returns(GDvoid)
"enabled"(GDbool)
}

func("set_notify_local_transform") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_notify_transform") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_subgizmo_selection") {
returns(GDvoid)
"gizmo"(GDNode3DGizmo)
"id"(GDint)
"transform"(GDTransform3D)
}

func("show") {
returns(GDvoid)

}

func("to_global") {
returns(GDVector3)
"local_point"(GDVector3)
}

func("to_local") {
returns(GDVector3)
"global_point"(GDVector3)
}

func("translate") {
returns(GDvoid)
"offset"(GDVector3)
}

func("translate_object_local") {
returns(GDvoid)
"offset"(GDVector3)
}

func("update_gizmos") {
returns(GDvoid)

}
}){

}