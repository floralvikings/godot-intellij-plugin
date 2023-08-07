
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeleton2D: GDType("Skeleton2D", {


constructor { }

func("execute_modifications") {
returns(GDvoid)
"delta"(GDfloat)
"execution_mode"(GDint)
}

func("get_bone") {
returns(GDBone2D)
"idx"(GDint)
}

func("get_bone_count") {
returns(GDint)

}

func("get_bone_local_pose_override") {
returns(GDTransform2D)
"bone_idx"(GDint)
}

func("get_modification_stack") {
returns(GDSkeletonModificationStack2D)

}

func("get_skeleton") {
returns(GDRID)

}

func("set_bone_local_pose_override") {
returns(GDvoid)
"bone_idx"(GDint)
"override_pose"(GDTransform2D)
"strength"(GDfloat)
"persistent"(GDbool)
}

func("set_modification_stack") {
returns(GDvoid)
"modification_stack"(GDSkeletonModificationStack2D)
}
}){

}