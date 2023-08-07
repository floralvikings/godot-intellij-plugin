
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDShaderMaterial: GDType("ShaderMaterial", {

"shader"(GDShader)
constructor { }

func("get_shader_parameter") {
returns(GDVariant)
"param"(GDStringName)
}

func("set_shader_parameter") {
returns(GDvoid)
"param"(GDStringName)
"value"(GDVariant)
}
}){

}