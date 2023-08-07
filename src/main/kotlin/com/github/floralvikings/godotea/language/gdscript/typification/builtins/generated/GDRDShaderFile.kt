
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRDShaderFile: GDType("RDShaderFile", {

"base_error"(GDString)
constructor { }

func("get_spirv") {
returns(GDRDShaderSPIRV)
"version"(GDStringName)
}

func("get_version_list") {
returns(GDTypedArray(GDStringName::class))

}

func("set_bytecode") {
returns(GDvoid)
"bytecode"(GDRDShaderSPIRV)
"version"(GDStringName)
}
}){

}