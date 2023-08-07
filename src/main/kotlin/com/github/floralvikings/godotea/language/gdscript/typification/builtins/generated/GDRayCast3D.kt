
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRayCast3D: GDType("RayCast3D", {

"collide_with_areas"(GDbool)
"collide_with_bodies"(GDbool)
"collision_mask"(GDint)
"debug_shape_custom_color"(GDColor)
"debug_shape_thickness"(GDint)
"enabled"(GDbool)
"exclude_parent"(GDbool)
"hit_from_inside"(GDbool)
"target_position"(GDVector3)
constructor { }

func("add_exception") {
returns(GDvoid)
"node"(GDCollisionObject3D)
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
returns(GDVector3)

}

func("get_collision_point") {
returns(GDVector3)

}

func("is_colliding") {
returns(GDbool)

}

func("remove_exception") {
returns(GDvoid)
"node"(GDCollisionObject3D)
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