
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeletonModification2DPhysicalBones: GDType("SkeletonModification2DPhysicalBones", {

"physical_bone_chain_length"(GDint)
constructor { }

func("fetch_physical_bones") {
returns(GDvoid)

}

func("get_physical_bone_node") {
returns(GDNodePath)
"joint_idx"(GDint)
}

func("set_physical_bone_node") {
returns(GDvoid)
"joint_idx"(GDint)
"physicalbone2d_node"(GDNodePath)
}

func("start_simulation") {
returns(GDvoid)
"bones"(GDTypedArray(GDStringName::class))
}

func("stop_simulation") {
returns(GDvoid)
"bones"(GDTypedArray(GDStringName::class))
}
}){

}