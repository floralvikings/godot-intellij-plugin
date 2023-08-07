
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDKinematicCollision3D: GDType("KinematicCollision3D", {


constructor { }

func("get_angle") {
returns(GDfloat)
"collision_index"(GDint)
"up_direction"(GDVector3)
}

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
returns(GDObject)
"collision_index"(GDint)
}

func("get_collider_shape_index") {
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

func("get_depth") {
returns(GDfloat)

}

func("get_local_shape") {
returns(GDObject)
"collision_index"(GDint)
}

func("get_normal") {
returns(GDVector3)
"collision_index"(GDint)
}

func("get_position") {
returns(GDVector3)
"collision_index"(GDint)
}

func("get_remainder") {
returns(GDVector3)

}

func("get_travel") {
returns(GDVector3)

}
}){

}