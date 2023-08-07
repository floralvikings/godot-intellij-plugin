
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeletonProfile: GDType("SkeletonProfile", {

"bone_size"(GDint)
"group_size"(GDint)
"root_bone"(GDStringName)
"scale_base_bone"(GDStringName)
constructor { }

func("find_bone") {
returns(GDint)
"bone_name"(GDStringName)
}

func("get_bone_name") {
returns(GDStringName)
"bone_idx"(GDint)
}

func("get_bone_parent") {
returns(GDStringName)
"bone_idx"(GDint)
}

func("get_bone_tail") {
returns(GDStringName)
"bone_idx"(GDint)
}

func("get_group") {
returns(GDStringName)
"bone_idx"(GDint)
}

func("get_group_name") {
returns(GDStringName)
"group_idx"(GDint)
}

func("get_handle_offset") {
returns(GDVector2)
"bone_idx"(GDint)
}

func("get_reference_pose") {
returns(GDTransform3D)
"bone_idx"(GDint)
}

func("get_tail_direction") {
returns(GDTailDirection)
"bone_idx"(GDint)
}

func("get_texture") {
returns(GDTexture2D)
"group_idx"(GDint)
}

func("set_bone_name") {
returns(GDvoid)
"bone_idx"(GDint)
"bone_name"(GDStringName)
}

func("set_bone_parent") {
returns(GDvoid)
"bone_idx"(GDint)
"bone_parent"(GDStringName)
}

func("set_bone_tail") {
returns(GDvoid)
"bone_idx"(GDint)
"bone_tail"(GDStringName)
}

func("set_group") {
returns(GDvoid)
"bone_idx"(GDint)
"group"(GDStringName)
}

func("set_group_name") {
returns(GDvoid)
"group_idx"(GDint)
"group_name"(GDStringName)
}

func("set_handle_offset") {
returns(GDvoid)
"bone_idx"(GDint)
"handle_offset"(GDVector2)
}

func("set_reference_pose") {
returns(GDvoid)
"bone_idx"(GDint)
"bone_name"(GDTransform3D)
}

func("set_tail_direction") {
returns(GDvoid)
"bone_idx"(GDint)
"tail_direction"(GDTailDirection)
}

func("set_texture") {
returns(GDvoid)
"group_idx"(GDint)
"texture"(GDTexture2D)
}
}){

}