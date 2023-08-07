
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNavigationLink3D: GDType("NavigationLink3D", {

"bidirectional"(GDbool)
"enabled"(GDbool)
"end_position"(GDVector3)
"enter_cost"(GDfloat)
"navigation_layers"(GDint)
"start_position"(GDVector3)
"travel_cost"(GDfloat)
constructor { }

func("get_global_end_position") {
returns(GDVector3)

}

func("get_global_start_position") {
returns(GDVector3)

}

func("get_navigation_layer_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("set_global_end_position") {
returns(GDvoid)
"position"(GDVector3)
}

func("set_global_start_position") {
returns(GDvoid)
"position"(GDVector3)
}

func("set_navigation_layer_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}
}){

}