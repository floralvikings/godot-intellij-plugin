
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGLTFSkeleton: GDType("GLTFSkeleton", {

"joints"(GDPackedInt32Array)
"roots"(GDPackedInt32Array)
constructor { }

func("get_bone_attachment") {
returns(GDBoneAttachment3D)
"idx"(GDint)
}

func("get_bone_attachment_count") {
returns(GDint)

}

func("get_godot_bone_node") {
returns(GDDictionary)

}

func("get_godot_skeleton") {
returns(GDSkeleton3D)

}

func("get_unique_names") {
returns(GDTypedArray(GDString::class))

}

func("set_godot_bone_node") {
returns(GDvoid)
"godot_bone_node"(GDDictionary)
}

func("set_unique_names") {
returns(GDvoid)
"unique_names"(GDTypedArray(GDString::class))
}
}){

}