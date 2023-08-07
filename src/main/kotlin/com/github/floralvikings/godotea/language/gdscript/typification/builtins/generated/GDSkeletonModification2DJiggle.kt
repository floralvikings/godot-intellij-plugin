
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeletonModification2DJiggle: GDType("SkeletonModification2DJiggle", {

"damping"(GDfloat)
"gravity"(GDVector2)
"jiggle_data_chain_length"(GDint)
"mass"(GDfloat)
"stiffness"(GDfloat)
"target_nodepath"(GDNodePath)
"use_gravity"(GDbool)
constructor { }

func("get_collision_mask") {
returns(GDint)

}

func("get_jiggle_joint_bone2d_node") {
returns(GDNodePath)
"joint_idx"(GDint)
}

func("get_jiggle_joint_bone_index") {
returns(GDint)
"joint_idx"(GDint)
}

func("get_jiggle_joint_damping") {
returns(GDfloat)
"joint_idx"(GDint)
}

func("get_jiggle_joint_gravity") {
returns(GDVector2)
"joint_idx"(GDint)
}

func("get_jiggle_joint_mass") {
returns(GDfloat)
"joint_idx"(GDint)
}

func("get_jiggle_joint_override") {
returns(GDbool)
"joint_idx"(GDint)
}

func("get_jiggle_joint_stiffness") {
returns(GDfloat)
"joint_idx"(GDint)
}

func("get_jiggle_joint_use_gravity") {
returns(GDbool)
"joint_idx"(GDint)
}

func("get_use_colliders") {
returns(GDbool)

}

func("set_collision_mask") {
returns(GDvoid)
"collision_mask"(GDint)
}

func("set_jiggle_joint_bone2d_node") {
returns(GDvoid)
"joint_idx"(GDint)
"bone2d_node"(GDNodePath)
}

func("set_jiggle_joint_bone_index") {
returns(GDvoid)
"joint_idx"(GDint)
"bone_idx"(GDint)
}

func("set_jiggle_joint_damping") {
returns(GDvoid)
"joint_idx"(GDint)
"damping"(GDfloat)
}

func("set_jiggle_joint_gravity") {
returns(GDvoid)
"joint_idx"(GDint)
"gravity"(GDVector2)
}

func("set_jiggle_joint_mass") {
returns(GDvoid)
"joint_idx"(GDint)
"mass"(GDfloat)
}

func("set_jiggle_joint_override") {
returns(GDvoid)
"joint_idx"(GDint)
"override"(GDbool)
}

func("set_jiggle_joint_stiffness") {
returns(GDvoid)
"joint_idx"(GDint)
"stiffness"(GDfloat)
}

func("set_jiggle_joint_use_gravity") {
returns(GDvoid)
"joint_idx"(GDint)
"use_gravity"(GDbool)
}

func("set_use_colliders") {
returns(GDvoid)
"use_colliders"(GDbool)
}
}){

}