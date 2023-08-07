
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDBoneMap: GDType("BoneMap", {

"profile"(GDSkeletonProfile)
constructor { }

func("find_profile_bone_name") {
returns(GDStringName)
"skeleton_bone_name"(GDStringName)
}

func("get_skeleton_bone_name") {
returns(GDStringName)
"profile_bone_name"(GDStringName)
}

func("set_skeleton_bone_name") {
returns(GDvoid)
"profile_bone_name"(GDStringName)
"skeleton_bone_name"(GDStringName)
}
}){

}