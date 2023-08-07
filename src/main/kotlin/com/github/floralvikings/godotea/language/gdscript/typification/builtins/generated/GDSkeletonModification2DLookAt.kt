
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeletonModification2DLookAt: GDType("SkeletonModification2DLookAt", {

"bone2d_node"(GDNodePath)
"bone_index"(GDint)
"target_nodepath"(GDNodePath)
constructor { }

func("get_additional_rotation") {
returns(GDfloat)

}

func("get_constraint_angle_invert") {
returns(GDbool)

}

func("get_constraint_angle_max") {
returns(GDfloat)

}

func("get_constraint_angle_min") {
returns(GDfloat)

}

func("get_enable_constraint") {
returns(GDbool)

}

func("set_additional_rotation") {
returns(GDvoid)
"rotation"(GDfloat)
}

func("set_constraint_angle_invert") {
returns(GDvoid)
"invert"(GDbool)
}

func("set_constraint_angle_max") {
returns(GDvoid)
"angle_max"(GDfloat)
}

func("set_constraint_angle_min") {
returns(GDvoid)
"angle_min"(GDfloat)
}

func("set_enable_constraint") {
returns(GDvoid)
"enable_constraint"(GDbool)
}
}){

}