
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsBody3D: GDType("PhysicsBody3D", {

"axis_lock_angular_x"(GDbool)
"axis_lock_angular_y"(GDbool)
"axis_lock_angular_z"(GDbool)
"axis_lock_linear_x"(GDbool)
"axis_lock_linear_y"(GDbool)
"axis_lock_linear_z"(GDbool)
constructor { }

func("add_collision_exception_with") {
returns(GDvoid)
"body"(GDNode)
}

func("get_axis_lock") {
returns(GDbool)
"axis"(GDBodyAxis)
}

func("get_collision_exceptions") {
returns(GDTypedArray(GDSameType::class))

}

func("move_and_collide") {
returns(GDKinematicCollision3D)
"motion"(GDVector3)
"test_only"(GDbool)
"safe_margin"(GDfloat)
"recovery_as_collision"(GDbool)
"max_collisions"(GDint)
}

func("remove_collision_exception_with") {
returns(GDvoid)
"body"(GDNode)
}

func("set_axis_lock") {
returns(GDvoid)
"axis"(GDBodyAxis)
"lock"(GDbool)
}

func("test_move") {
returns(GDbool)
"from"(GDTransform3D)
"motion"(GDVector3)
"collision"(GDKinematicCollision3D)
"safe_margin"(GDfloat)
"recovery_as_collision"(GDbool)
"max_collisions"(GDint)
}
}){

}