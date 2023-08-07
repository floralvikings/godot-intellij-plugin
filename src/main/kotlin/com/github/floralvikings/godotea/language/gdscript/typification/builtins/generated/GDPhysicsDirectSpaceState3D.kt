
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsDirectSpaceState3D: GDType("PhysicsDirectSpaceState3D", {


constructor { }

func("cast_motion") {
returns(GDPackedFloat32Array)
"parameters"(GDPhysicsShapeQueryParameters3D)
}

func("collide_shape") {
returns(GDTypedArray(GDVector3::class))
"parameters"(GDPhysicsShapeQueryParameters3D)
"max_results"(GDint)
}

func("get_rest_info") {
returns(GDDictionary)
"parameters"(GDPhysicsShapeQueryParameters3D)
}

func("intersect_point") {
returns(GDTypedArray(GDDictionary::class))
"parameters"(GDPhysicsPointQueryParameters3D)
"max_results"(GDint)
}

func("intersect_ray") {
returns(GDDictionary)
"parameters"(GDPhysicsRayQueryParameters3D)
}

func("intersect_shape") {
returns(GDTypedArray(GDDictionary::class))
"parameters"(GDPhysicsShapeQueryParameters3D)
"max_results"(GDint)
}
}){

}