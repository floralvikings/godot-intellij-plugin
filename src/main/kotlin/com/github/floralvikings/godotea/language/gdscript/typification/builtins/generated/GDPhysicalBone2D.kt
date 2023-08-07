
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicalBone2D: GDType("PhysicalBone2D", {

"auto_configure_joint"(GDbool)
"bone2d_index"(GDint)
"bone2d_nodepath"(GDNodePath)
"follow_bone_when_simulating"(GDbool)
"simulate_physics"(GDbool)
constructor { }

func("get_joint") {
returns(GDJoint2D)

}

func("is_simulating_physics") {
returns(GDbool)

}
}){

}