
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGPUParticlesCollisionSDF3D: GDType("GPUParticlesCollisionSDF3D", {

"bake_mask"(GDint)
"resolution"(GDResolution)
"size"(GDVector3)
"texture"(GDTexture3D)
"thickness"(GDfloat)
constructor { }

func("get_bake_mask_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("set_bake_mask_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}
}){

}