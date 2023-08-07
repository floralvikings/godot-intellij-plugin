
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsDirectSpaceState3DExtension: GDType("PhysicsDirectSpaceState3DExtension", {


constructor { }

func("_cast_motion") {
returns(GDbool)
"shape_rid"(GDRID)
"transform"(GDTransform3D)
"motion"(GDVector3)
"margin"(GDfloat)
"collision_mask"(GDint)
"collide_with_bodies"(GDbool)
"collide_with_areas"(GDbool)
"closest_safe"(GDUnknownType)
"closest_unsafe"(GDUnknownType)
"info"(GDUnknownType)
}

func("_collide_shape") {
returns(GDbool)
"shape_rid"(GDRID)
"transform"(GDTransform3D)
"motion"(GDVector3)
"margin"(GDfloat)
"collision_mask"(GDint)
"collide_with_bodies"(GDbool)
"collide_with_areas"(GDbool)
"results"(GDUnknownType)
"max_results"(GDint)
"result_count"(GDUnknownType)
}

func("_get_closest_point_to_object_volume") {
returns(GDVector3)
"object"(GDRID)
"point"(GDVector3)
}

func("_intersect_point") {
returns(GDint)
"position"(GDVector3)
"collision_mask"(GDint)
"collide_with_bodies"(GDbool)
"collide_with_areas"(GDbool)
"results"(GDUnknownType)
"max_results"(GDint)
}

func("_intersect_ray") {
returns(GDbool)
"from"(GDVector3)
"to"(GDVector3)
"collision_mask"(GDint)
"collide_with_bodies"(GDbool)
"collide_with_areas"(GDbool)
"hit_from_inside"(GDbool)
"hit_back_faces"(GDbool)
"pick_ray"(GDbool)
"result"(GDUnknownType)
}

func("_intersect_shape") {
returns(GDint)
"shape_rid"(GDRID)
"transform"(GDTransform3D)
"motion"(GDVector3)
"margin"(GDfloat)
"collision_mask"(GDint)
"collide_with_bodies"(GDbool)
"collide_with_areas"(GDbool)
"result_count"(GDUnknownType)
"max_results"(GDint)
}

func("_rest_info") {
returns(GDbool)
"shape_rid"(GDRID)
"transform"(GDTransform3D)
"motion"(GDVector3)
"margin"(GDfloat)
"collision_mask"(GDint)
"collide_with_bodies"(GDbool)
"collide_with_areas"(GDbool)
"rest_info"(GDUnknownType)
}

func("is_body_excluded_from_query") {
returns(GDbool)
"body"(GDRID)
}
}){

}