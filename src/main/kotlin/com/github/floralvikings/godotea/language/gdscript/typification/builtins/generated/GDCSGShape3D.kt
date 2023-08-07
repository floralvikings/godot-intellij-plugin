
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCSGShape3D: GDType("CSGShape3D", {

"calculate_tangents"(GDbool)
"collision_layer"(GDint)
"collision_mask"(GDint)
"collision_priority"(GDfloat)
"operation"(GDOperation)
"snap"(GDfloat)
"use_collision"(GDbool)
constructor { }

func("get_collision_layer_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_collision_mask_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_meshes") {
returns(GDArray)

}

func("is_root_shape") {
returns(GDbool)

}

func("set_collision_layer_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_collision_mask_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}
}){

}