
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNavigationRegion2D: GDType("NavigationRegion2D", {

"avoidance_layers"(GDint)
"constrain_avoidance"(GDbool)
"enabled"(GDbool)
"enter_cost"(GDfloat)
"navigation_layers"(GDint)
"navigation_polygon"(GDNavigationPolygon)
"travel_cost"(GDfloat)
"use_edge_connections"(GDbool)
constructor { }

func("get_avoidance_layer_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_navigation_layer_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_region_rid") {
returns(GDRID)

}

func("set_avoidance_layer_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_navigation_layer_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}
}){

}