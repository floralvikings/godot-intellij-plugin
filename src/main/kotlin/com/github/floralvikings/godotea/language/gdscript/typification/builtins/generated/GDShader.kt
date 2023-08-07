
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDShader: GDType("Shader", {

"code"(GDString)
constructor { }

func("get_default_texture_parameter") {
returns(GDTexture2D)
"name"(GDStringName)
"index"(GDint)
}

func("get_mode") {
returns(GDMode)

}

func("get_shader_uniform_list") {
returns(GDArray)
"get_groups"(GDbool)
}

func("set_default_texture_parameter") {
returns(GDvoid)
"name"(GDStringName)
"texture"(GDTexture2D)
"index"(GDint)
}
}){

}