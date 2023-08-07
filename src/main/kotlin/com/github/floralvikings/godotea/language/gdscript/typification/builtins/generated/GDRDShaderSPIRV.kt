
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRDShaderSPIRV: GDType("RDShaderSPIRV", {

"bytecode_compute"(GDPackedByteArray)
"bytecode_fragment"(GDPackedByteArray)
"bytecode_tesselation_control"(GDPackedByteArray)
"bytecode_tesselation_evaluation"(GDPackedByteArray)
"bytecode_vertex"(GDPackedByteArray)
"compile_error_compute"(GDString)
"compile_error_fragment"(GDString)
"compile_error_tesselation_control"(GDString)
"compile_error_tesselation_evaluation"(GDString)
"compile_error_vertex"(GDString)
constructor { }

func("get_stage_bytecode") {
returns(GDPackedByteArray)
"stage"(GDShaderStage)
}

func("get_stage_compile_error") {
returns(GDString)
"stage"(GDShaderStage)
}

func("set_stage_bytecode") {
returns(GDvoid)
"stage"(GDShaderStage)
"bytecode"(GDPackedByteArray)
}

func("set_stage_compile_error") {
returns(GDvoid)
"stage"(GDShaderStage)
"compile_error"(GDString)
}
}){

}