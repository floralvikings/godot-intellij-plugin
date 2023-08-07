
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNavigationRegion3D: GDType("NavigationRegion3D", {

"enabled"(GDbool)
"enter_cost"(GDfloat)
"navigation_layers"(GDint)
"navigation_mesh"(GDNavigationMesh)
"travel_cost"(GDfloat)
"use_edge_connections"(GDbool)
constructor { }

func("bake_navigation_mesh") {
returns(GDvoid)
"on_thread"(GDbool)
}

func("get_navigation_layer_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_region_rid") {
returns(GDRID)

}

func("set_navigation_layer_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}
}){

}