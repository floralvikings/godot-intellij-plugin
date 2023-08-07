
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRayCast2D: GDType("RayCast2D", {

"collide_with_areas"(GDbool)
"collide_with_bodies"(GDbool)
"collision_mask"(GDint)
"enabled"(GDbool)
"exclude_parent"(GDbool)
"hit_from_inside"(GDbool)
"target_position"(GDVector2)
constructor { }

func("add_exception") {
returns(GDvoid)
"node"(GDCollisionObject2D)
}

func("add_exception_rid") {
returns(GDvoid)
"rid"(GDRID)
}

func("clear_exceptions") {
returns(GDvoid)

}

func("force_raycast_update") {
returns(GDvoid)

}

func("get_collider") {
returns(GDObject)

}

func("get_collider_rid") {
returns(GDRID)

}

func("get_collider_shape") {
returns(GDint)

}

func("get_collision_mask_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_collision_normal") {
returns(GDVector2)

}

func("get_collision_point") {
returns(GDVector2)

}

func("is_colliding") {
returns(GDbool)

}

func("remove_exception") {
returns(GDvoid)
"node"(GDCollisionObject2D)
}

func("remove_exception_rid") {
returns(GDvoid)
"rid"(GDRID)
}

func("set_collision_mask_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}
}){

}