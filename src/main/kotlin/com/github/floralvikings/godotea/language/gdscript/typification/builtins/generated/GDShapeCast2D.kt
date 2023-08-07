
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDShapeCast2D: GDType("ShapeCast2D", {

"collide_with_areas"(GDbool)
"collide_with_bodies"(GDbool)
"collision_mask"(GDint)
"collision_result"(GDArray)
"enabled"(GDbool)
"exclude_parent"(GDbool)
"margin"(GDfloat)
"max_results"(GDint)
"shape"(GDShape2D)
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
returns(GDVector2)
"index"(GDint)
}

func("get_collision_point") {
returns(GDVector2)
"index"(GDint)
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