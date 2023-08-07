
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeletonModification2DCCDIK: GDType("SkeletonModification2DCCDIK", {

"ccdik_data_chain_length"(GDint)
"target_nodepath"(GDNodePath)
"tip_nodepath"(GDNodePath)
constructor { }

func("get_ccdik_joint_bone2d_node") {
returns(GDNodePath)
"joint_idx"(GDint)
}

func("get_ccdik_joint_bone_index") {
returns(GDint)
"joint_idx"(GDint)
}

func("get_ccdik_joint_constraint_angle_invert") {
returns(GDbool)
"joint_idx"(GDint)
}

func("get_ccdik_joint_constraint_angle_max") {
returns(GDfloat)
"joint_idx"(GDint)
}

func("get_ccdik_joint_constraint_angle_min") {
returns(GDfloat)
"joint_idx"(GDint)
}

func("get_ccdik_joint_enable_constraint") {
returns(GDbool)
"joint_idx"(GDint)
}

func("get_ccdik_joint_rotate_from_joint") {
returns(GDbool)
"joint_idx"(GDint)
}

func("set_ccdik_joint_bone2d_node") {
returns(GDvoid)
"joint_idx"(GDint)
"bone2d_nodepath"(GDNodePath)
}

func("set_ccdik_joint_bone_index") {
returns(GDvoid)
"joint_idx"(GDint)
"bone_idx"(GDint)
}

func("set_ccdik_joint_constraint_angle_invert") {
returns(GDvoid)
"joint_idx"(GDint)
"invert"(GDbool)
}

func("set_ccdik_joint_constraint_angle_max") {
returns(GDvoid)
"joint_idx"(GDint)
"angle_max"(GDfloat)
}

func("set_ccdik_joint_constraint_angle_min") {
returns(GDvoid)
"joint_idx"(GDint)
"angle_min"(GDfloat)
}

func("set_ccdik_joint_enable_constraint") {
returns(GDvoid)
"joint_idx"(GDint)
"enable_constraint"(GDbool)
}

func("set_ccdik_joint_rotate_from_joint") {
returns(GDvoid)
"joint_idx"(GDint)
"rotate_from_joint"(GDbool)
}
}){

}