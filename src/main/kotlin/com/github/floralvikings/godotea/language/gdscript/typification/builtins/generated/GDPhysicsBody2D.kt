
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsBody2D: GDType("PhysicsBody2D", {

"input_pickable"(GDbool)
constructor { }

func("add_collision_exception_with") {
returns(GDvoid)
"body"(GDNode)
}

func("get_collision_exceptions") {
returns(GDTypedArray(GDSameType::class))

}

func("move_and_collide") {
returns(GDKinematicCollision2D)
"motion"(GDVector2)
"test_only"(GDbool)
"safe_margin"(GDfloat)
"recovery_as_collision"(GDbool)
}

func("remove_collision_exception_with") {
returns(GDvoid)
"body"(GDNode)
}

func("test_move") {
returns(GDbool)
"from"(GDTransform2D)
"motion"(GDVector2)
"collision"(GDKinematicCollision2D)
"safe_margin"(GDfloat)
"recovery_as_collision"(GDbool)
}
}){

}