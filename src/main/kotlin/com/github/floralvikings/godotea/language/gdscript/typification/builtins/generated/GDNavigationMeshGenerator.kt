
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNavigationMeshGenerator: GDType("NavigationMeshGenerator", {


constructor { }

func("bake") {
returns(GDvoid)
"navigation_mesh"(GDNavigationMesh)
"root_node"(GDNode)
}

func("bake_from_source_geometry_data") {
returns(GDvoid)
"navigation_mesh"(GDNavigationMesh)
"source_geometry_data"(GDNavigationMeshSourceGeometryData3D)
"callback"(GDCallable)
}

func("clear") {
returns(GDvoid)
"navigation_mesh"(GDNavigationMesh)
}

func("parse_source_geometry_data") {
returns(GDvoid)
"navigation_mesh"(GDNavigationMesh)
"source_geometry_data"(GDNavigationMeshSourceGeometryData3D)
"root_node"(GDNode)
"callback"(GDCallable)
}
}){

}