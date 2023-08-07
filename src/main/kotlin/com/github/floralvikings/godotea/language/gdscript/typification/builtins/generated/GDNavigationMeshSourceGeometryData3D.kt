
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNavigationMeshSourceGeometryData3D: GDType("NavigationMeshSourceGeometryData3D", {


constructor { }

func("add_faces") {
returns(GDvoid)
"faces"(GDPackedVector3Array)
"xform"(GDTransform3D)
}

func("add_mesh") {
returns(GDvoid)
"mesh"(GDMesh)
"xform"(GDTransform3D)
}

func("add_mesh_array") {
returns(GDvoid)
"mesh_array"(GDArray)
"xform"(GDTransform3D)
}

func("clear") {
returns(GDvoid)

}

func("get_indices") {
returns(GDPackedInt32Array)

}

func("get_vertices") {
returns(GDPackedFloat32Array)

}

func("has_data") {
returns(GDbool)

}

func("set_indices") {
returns(GDvoid)
"indices"(GDPackedInt32Array)
}

func("set_vertices") {
returns(GDvoid)
"vertices"(GDPackedFloat32Array)
}
}){

}