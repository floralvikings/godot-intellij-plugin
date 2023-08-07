
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSoftBody3D: GDType("SoftBody3D", {

"collision_layer"(GDint)
"collision_mask"(GDint)
"damping_coefficient"(GDfloat)
"disable_mode"(GDDisableMode)
"drag_coefficient"(GDfloat)
"linear_stiffness"(GDfloat)
"parent_collision_ignore"(GDNodePath)
"pressure_coefficient"(GDfloat)
"ray_pickable"(GDbool)
"simulation_precision"(GDint)
"total_mass"(GDfloat)
constructor { }

func("add_collision_exception_with") {
returns(GDvoid)
"body"(GDNode)
}

func("get_collision_exceptions") {
returns(GDTypedArray(GDPhysicsBody3D::class))

}

func("get_collision_layer_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_collision_mask_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_physics_rid") {
returns(GDRID)

}

func("get_point_transform") {
returns(GDVector3)
"point_index"(GDint)
}

func("is_point_pinned") {
returns(GDbool)
"point_index"(GDint)
}

func("remove_collision_exception_with") {
returns(GDvoid)
"body"(GDNode)
}

func("set_collision_layer_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_collision_mask_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_point_pinned") {
returns(GDvoid)
"point_index"(GDint)
"pinned"(GDbool)
"attachment_path"(GDNodePath)
}
}){

}