
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDBoneAttachment3D: GDType("BoneAttachment3D", {

"bone_idx"(GDint)
"bone_name"(GDString)
"override_pose"(GDbool)
constructor { }

func("get_external_skeleton") {
returns(GDNodePath)

}

func("get_use_external_skeleton") {
returns(GDbool)

}

func("on_bone_pose_update") {
returns(GDvoid)
"bone_index"(GDint)
}

func("set_external_skeleton") {
returns(GDvoid)
"external_skeleton"(GDNodePath)
}

func("set_use_external_skeleton") {
returns(GDvoid)
"use_external_skeleton"(GDbool)
}
}){

}