
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsDirectSpaceState2D: GDType("PhysicsDirectSpaceState2D", {


constructor { }

func("cast_motion") {
returns(GDPackedFloat32Array)
"parameters"(GDPhysicsShapeQueryParameters2D)
}

func("collide_shape") {
returns(GDTypedArray(GDVector2::class))
"parameters"(GDPhysicsShapeQueryParameters2D)
"max_results"(GDint)
}

func("get_rest_info") {
returns(GDDictionary)
"parameters"(GDPhysicsShapeQueryParameters2D)
}

func("intersect_point") {
returns(GDTypedArray(GDDictionary::class))
"parameters"(GDPhysicsPointQueryParameters2D)
"max_results"(GDint)
}

func("intersect_ray") {
returns(GDDictionary)
"parameters"(GDPhysicsRayQueryParameters2D)
}

func("intersect_shape") {
returns(GDTypedArray(GDDictionary::class))
"parameters"(GDPhysicsShapeQueryParameters2D)
"max_results"(GDint)
}
}){

}