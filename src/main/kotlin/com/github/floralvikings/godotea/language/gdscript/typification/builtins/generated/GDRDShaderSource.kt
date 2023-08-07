
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRDShaderSource: GDType("RDShaderSource", {

"language"(GDShaderLanguage)
"source_compute"(GDString)
"source_fragment"(GDString)
"source_tesselation_control"(GDString)
"source_tesselation_evaluation"(GDString)
"source_vertex"(GDString)
constructor { }

func("get_stage_source") {
returns(GDString)
"stage"(GDShaderStage)
}

func("set_stage_source") {
returns(GDvoid)
"stage"(GDShaderStage)
"source"(GDString)
}
}){

}