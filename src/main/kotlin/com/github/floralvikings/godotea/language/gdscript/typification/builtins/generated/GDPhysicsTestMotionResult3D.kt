
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsTestMotionResult3D: GDType("PhysicsTestMotionResult3D", {


constructor { }

func("get_collider") {
returns(GDObject)
"collision_index"(GDint)
}

func("get_collider_id") {
returns(GDint)
"collision_index"(GDint)
}

func("get_collider_rid") {
returns(GDRID)
"collision_index"(GDint)
}

func("get_collider_shape") {
returns(GDint)
"collision_index"(GDint)
}

func("get_collider_velocity") {
returns(GDVector3)
"collision_index"(GDint)
}

func("get_collision_count") {
returns(GDint)

}

func("get_collision_depth") {
returns(GDfloat)
"collision_index"(GDint)
}

func("get_collision_local_shape") {
returns(GDint)
"collision_index"(GDint)
}

func("get_collision_normal") {
returns(GDVector3)
"collision_index"(GDint)
}

func("get_collision_point") {
returns(GDVector3)
"collision_index"(GDint)
}

func("get_collision_safe_fraction") {
returns(GDfloat)

}

func("get_collision_unsafe_fraction") {
returns(GDfloat)

}

func("get_remainder") {
returns(GDVector3)

}

func("get_travel") {
returns(GDVector3)

}
}){

}