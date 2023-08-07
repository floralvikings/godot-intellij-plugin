
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMainLoop: GDType("MainLoop", {


constructor { }

func("_finalize") {
returns(GDvoid)

}

func("_initialize") {
returns(GDvoid)

}

func("_physics_process") {
returns(GDbool)
"delta"(GDfloat)
}

func("_process") {
returns(GDbool)
"delta"(GDfloat)
}
}){

}