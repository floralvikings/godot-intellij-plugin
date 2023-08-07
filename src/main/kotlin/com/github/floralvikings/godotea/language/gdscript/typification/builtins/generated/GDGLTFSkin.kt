
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGLTFSkin: GDType("GLTFSkin", {

"godot_skin"(GDSkin)
"joints"(GDPackedInt32Array)
"joints_original"(GDPackedInt32Array)
"non_joints"(GDPackedInt32Array)
"roots"(GDPackedInt32Array)
"skeleton"(GDint)
"skin_root"(GDint)
constructor { }

func("get_inverse_binds") {
returns(GDTypedArray(GDTransform3D::class))

}

func("get_joint_i_to_bone_i") {
returns(GDDictionary)

}

func("get_joint_i_to_name") {
returns(GDDictionary)

}

func("set_inverse_binds") {
returns(GDvoid)
"inverse_binds"(GDTypedArray(GDTransform3D::class))
}

func("set_joint_i_to_bone_i") {
returns(GDvoid)
"joint_i_to_bone_i"(GDDictionary)
}

func("set_joint_i_to_name") {
returns(GDvoid)
"joint_i_to_name"(GDDictionary)
}
}){

}