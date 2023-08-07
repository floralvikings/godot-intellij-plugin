
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVoxelGI: GDType("VoxelGI", {

"camera_attributes"(GDCameraAttributes)
"data"(GDVoxelGIData)
"size"(GDVector3)
"subdiv"(GDSubdiv)
constructor { }

func("bake") {
returns(GDvoid)
"from_node"(GDNode)
"create_visual_debug"(GDbool)
}

func("debug_bake") {
returns(GDvoid)

}
}){

}