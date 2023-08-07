
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEngineProfiler: GDType("EngineProfiler", {


constructor { }

func("_add_frame") {
returns(GDvoid)
"data"(GDArray)
}

func("_tick") {
returns(GDvoid)
"frame_time"(GDfloat)
"process_time"(GDfloat)
"physics_time"(GDfloat)
"physics_frame_time"(GDfloat)
}

func("_toggle") {
returns(GDvoid)
"enable"(GDbool)
"options"(GDArray)
}
}){

}