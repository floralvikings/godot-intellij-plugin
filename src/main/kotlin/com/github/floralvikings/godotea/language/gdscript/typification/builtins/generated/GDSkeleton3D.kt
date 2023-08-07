
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeleton3D: GDType("Skeleton3D", {

"animate_physical_bones"(GDbool)
"motion_scale"(GDfloat)
"show_rest_only"(GDbool)
constructor { }

func("add_bone") {
returns(GDvoid)
"name"(GDString)
}

func("clear_bones") {
returns(GDvoid)

}

func("clear_bones_global_pose_override") {
returns(GDvoid)

}

func("create_skin_from_rest_transforms") {
returns(GDSkin)

}

func("find_bone") {
returns(GDint)
"name"(GDString)
}

func("force_update_all_bone_transforms") {
returns(GDvoid)

}

func("force_update_bone_child_transform") {
returns(GDvoid)
"bone_idx"(GDint)
}

func("get_bone_children") {
returns(GDPackedInt32Array)
"bone_idx"(GDint)
}

func("get_bone_count") {
returns(GDint)

}

func("get_bone_global_pose") {
returns(GDTransform3D)
"bone_idx"(GDint)
}

func("get_bone_global_pose_no_override") {
returns(GDTransform3D)
"bone_idx"(GDint)
}

func("get_bone_global_pose_override") {
returns(GDTransform3D)
"bone_idx"(GDint)
}

func("get_bone_global_rest") {
returns(GDTransform3D)
"bone_idx"(GDint)
}

func("get_bone_name") {
returns(GDString)
"bone_idx"(GDint)
}

func("get_bone_parent") {
returns(GDint)
"bone_idx"(GDint)
}

func("get_bone_pose") {
returns(GDTransform3D)
"bone_idx"(GDint)
}

func("get_bone_pose_position") {
returns(GDVector3)
"bone_idx"(GDint)
}

func("get_bone_pose_rotation") {
returns(GDQuaternion)
"bone_idx"(GDint)
}

func("get_bone_pose_scale") {
returns(GDVector3)
"bone_idx"(GDint)
}

func("get_bone_rest") {
returns(GDTransform3D)
"bone_idx"(GDint)
}

func("get_parentless_bones") {
returns(GDPackedInt32Array)

}

func("get_version") {
returns(GDint)

}

func("is_bone_enabled") {
returns(GDbool)
"bone_idx"(GDint)
}

func("localize_rests") {
returns(GDvoid)

}

func("physical_bones_add_collision_exception") {
returns(GDvoid)
"exception"(GDRID)
}

func("physical_bones_remove_collision_exception") {
returns(GDvoid)
"exception"(GDRID)
}

func("physical_bones_start_simulation") {
returns(GDvoid)
"bones"(GDTypedArray(GDStringName::class))
}

func("physical_bones_stop_simulation") {
returns(GDvoid)

}

func("register_skin") {
returns(GDSkinReference)
"skin"(GDSkin)
}

func("reset_bone_pose") {
returns(GDvoid)
"bone_idx"(GDint)
}

func("reset_bone_poses") {
returns(GDvoid)

}

func("set_bone_enabled") {
returns(GDvoid)
"bone_idx"(GDint)
"enabled"(GDbool)
}

func("set_bone_global_pose_override") {
returns(GDvoid)
"bone_idx"(GDint)
"pose"(GDTransform3D)
"amount"(GDfloat)
"persistent"(GDbool)
}

func("set_bone_name") {
returns(GDvoid)
"bone_idx"(GDint)
"name"(GDString)
}

func("set_bone_parent") {
returns(GDvoid)
"bone_idx"(GDint)
"parent_idx"(GDint)
}

func("set_bone_pose_position") {
returns(GDvoid)
"bone_idx"(GDint)
"position"(GDVector3)
}

func("set_bone_pose_rotation") {
returns(GDvoid)
"bone_idx"(GDint)
"rotation"(GDQuaternion)
}

func("set_bone_pose_scale") {
returns(GDvoid)
"bone_idx"(GDint)
"scale"(GDVector3)
}

func("set_bone_rest") {
returns(GDvoid)
"bone_idx"(GDint)
"rest"(GDTransform3D)
}

func("unparent_bone_and_rest") {
returns(GDvoid)
"bone_idx"(GDint)
}
}){

}