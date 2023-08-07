
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDShapeCast3D: GDType("ShapeCast3D", {

"collide_with_areas"(GDbool)
"collide_with_bodies"(GDbool)
"collision_mask"(GDint)
"collision_result"(GDArray)
"debug_shape_custom_color"(GDColor)
"enabled"(GDbool)
"exclude_parent"(GDbool)
"margin"(GDfloat)
"max_results"(GDint)
"shape"(GDShape3D)
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

func("force_shapecast_update") {
returns(GDvoid)

}

func("get_closest_collision_safe_fraction") {
returns(GDfloat)

}

func("get_closest_collision_unsafe_fraction") {
returns(GDfloat)

}

func("get_collider") {
returns(GDObject)
"index"(GDint)
}

func("get_collider_rid") {
returns(GDRID)
"index"(GDint)
}

func("get_collider_shape") {
returns(GDint)
"index"(GDint)
}

func("get_collision_count") {
returns(GDint)

}

func("get_collision_mask_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_collision_normal") {
returns(GDVector3)
"index"(GDint)
}

func("get_collision_point") {
returns(GDVector3)
"index"(GDint)
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

func("resource_changed") {
returns(GDvoid)
"resource"(GDResource)
}

func("set_collision_mask_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}
}){

}