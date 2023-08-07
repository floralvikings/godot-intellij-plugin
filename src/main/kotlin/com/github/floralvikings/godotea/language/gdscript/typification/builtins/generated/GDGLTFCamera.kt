
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGLTFCamera: GDType("GLTFCamera", {

"depth_far"(GDfloat)
"depth_near"(GDfloat)
"fov"(GDfloat)
"perspective"(GDbool)
"size_mag"(GDfloat)
constructor { }

func("from_dictionary") {
returns(GDSameType)
"dictionary"(GDDictionary)
}

func("from_node") {
returns(GDSameType)
"camera_node"(GDCamera3D)
}

func("to_dictionary") {
returns(GDDictionary)

}

func("to_node") {
returns(GDCamera3D)

}
}){

}