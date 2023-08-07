
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVisualInstance3D: GDType("VisualInstance3D", {

"layers"(GDint)
"sorting_offset"(GDfloat)
"sorting_use_aabb_center"(GDbool)
constructor { }

func("_get_aabb") {
returns(GDAABB)

}

func("get_aabb") {
returns(GDAABB)

}

func("get_base") {
returns(GDRID)

}

func("get_instance") {
returns(GDRID)

}

func("get_layer_mask_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("set_base") {
returns(GDvoid)
"base"(GDRID)
}

func("set_layer_mask_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}
}){

}