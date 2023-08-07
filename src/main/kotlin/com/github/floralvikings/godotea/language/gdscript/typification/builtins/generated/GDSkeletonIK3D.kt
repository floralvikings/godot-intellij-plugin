
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeletonIK3D: GDType("SkeletonIK3D", {

"interpolation"(GDfloat)
"magnet"(GDVector3)
"max_iterations"(GDint)
"min_distance"(GDfloat)
"override_tip_basis"(GDbool)
"root_bone"(GDStringName)
"target"(GDTransform3D)
"target_node"(GDNodePath)
"tip_bone"(GDStringName)
"use_magnet"(GDbool)
constructor { }

func("get_parent_skeleton") {
returns(GDSkeleton3D)

}

func("is_running") {
returns(GDbool)

}

func("start") {
returns(GDvoid)
"one_time"(GDbool)
}

func("stop") {
returns(GDvoid)

}
}){

}