
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNavigationObstacle2D: GDType("NavigationObstacle2D", {

"avoidance_enabled"(GDbool)
"avoidance_layers"(GDint)
"radius"(GDfloat)
"velocity"(GDVector2)
"vertices"(GDPackedVector2Array)
constructor { }

func("get_avoidance_layer_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_navigation_map") {
returns(GDRID)

}

func("get_rid") {
returns(GDRID)

}

func("set_avoidance_layer_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_navigation_map") {
returns(GDvoid)
"navigation_map"(GDRID)
}
}){

}