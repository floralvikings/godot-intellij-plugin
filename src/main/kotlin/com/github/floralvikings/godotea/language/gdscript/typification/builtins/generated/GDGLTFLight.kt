
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGLTFLight: GDType("GLTFLight", {

"color"(GDColor)
"inner_cone_angle"(GDfloat)
"intensity"(GDfloat)
"light_type"(GDString)
"outer_cone_angle"(GDfloat)
"range"(GDfloat)
constructor { }

func("from_dictionary") {
returns(GDSameType)
"dictionary"(GDDictionary)
}

func("from_node") {
returns(GDSameType)
"light_node"(GDLight3D)
}

func("to_dictionary") {
returns(GDDictionary)

}

func("to_node") {
returns(GDLight3D)

}
}){

}