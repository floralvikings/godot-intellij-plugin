
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeletonModification2DTwoBoneIK: GDType("SkeletonModification2DTwoBoneIK", {

"flip_bend_direction"(GDbool)
"target_maximum_distance"(GDfloat)
"target_minimum_distance"(GDfloat)
"target_nodepath"(GDNodePath)
constructor { }

func("get_joint_one_bone2d_node") {
returns(GDNodePath)

}

func("get_joint_one_bone_idx") {
returns(GDint)

}

func("get_joint_two_bone2d_node") {
returns(GDNodePath)

}

func("get_joint_two_bone_idx") {
returns(GDint)

}

func("set_joint_one_bone2d_node") {
returns(GDvoid)
"bone2d_node"(GDNodePath)
}

func("set_joint_one_bone_idx") {
returns(GDvoid)
"bone_idx"(GDint)
}

func("set_joint_two_bone2d_node") {
returns(GDvoid)
"bone2d_node"(GDNodePath)
}

func("set_joint_two_bone_idx") {
returns(GDvoid)
"bone_idx"(GDint)
}
}){

}