
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeletonModification2DFABRIK: GDType("SkeletonModification2DFABRIK", {

"fabrik_data_chain_length"(GDint)
"target_nodepath"(GDNodePath)
constructor { }

func("get_fabrik_joint_bone2d_node") {
returns(GDNodePath)
"joint_idx"(GDint)
}

func("get_fabrik_joint_bone_index") {
returns(GDint)
"joint_idx"(GDint)
}

func("get_fabrik_joint_magnet_position") {
returns(GDVector2)
"joint_idx"(GDint)
}

func("get_fabrik_joint_use_target_rotation") {
returns(GDbool)
"joint_idx"(GDint)
}

func("set_fabrik_joint_bone2d_node") {
returns(GDvoid)
"joint_idx"(GDint)
"bone2d_nodepath"(GDNodePath)
}

func("set_fabrik_joint_bone_index") {
returns(GDvoid)
"joint_idx"(GDint)
"bone_idx"(GDint)
}

func("set_fabrik_joint_magnet_position") {
returns(GDvoid)
"joint_idx"(GDint)
"magnet_position"(GDVector2)
}

func("set_fabrik_joint_use_target_rotation") {
returns(GDvoid)
"joint_idx"(GDint)
"use_target_rotation"(GDbool)
}
}){

}