
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCamera3D: GDType("Camera3D", {

"attributes"(GDCameraAttributes)
"cull_mask"(GDint)
"current"(GDbool)
"doppler_tracking"(GDDopplerTracking)
"environment"(GDEnvironment)
"far"(GDfloat)
"fov"(GDfloat)
"frustum_offset"(GDVector2)
"h_offset"(GDfloat)
"keep_aspect"(GDKeepAspect)
"near"(GDfloat)
"projection"(GDProjectionType)
"size"(GDfloat)
"v_offset"(GDfloat)
constructor { }

func("clear_current") {
returns(GDvoid)
"enable_next"(GDbool)
}

func("get_camera_projection") {
returns(GDProjection)

}

func("get_camera_rid") {
returns(GDRID)

}

func("get_camera_transform") {
returns(GDTransform3D)

}

func("get_cull_mask_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_frustum") {
returns(GDTypedArray(GDPlane::class))

}

func("get_pyramid_shape_rid") {
returns(GDRID)

}

func("is_position_behind") {
returns(GDbool)
"world_point"(GDVector3)
}

func("is_position_in_frustum") {
returns(GDbool)
"world_point"(GDVector3)
}

func("make_current") {
returns(GDvoid)

}

func("project_local_ray_normal") {
returns(GDVector3)
"screen_point"(GDVector2)
}

func("project_position") {
returns(GDVector3)
"screen_point"(GDVector2)
"z_depth"(GDfloat)
}

func("project_ray_normal") {
returns(GDVector3)
"screen_point"(GDVector2)
}

func("project_ray_origin") {
returns(GDVector3)
"screen_point"(GDVector2)
}

func("set_cull_mask_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_frustum") {
returns(GDvoid)
"size"(GDfloat)
"offset"(GDVector2)
"z_near"(GDfloat)
"z_far"(GDfloat)
}

func("set_orthogonal") {
returns(GDvoid)
"size"(GDfloat)
"z_near"(GDfloat)
"z_far"(GDfloat)
}

func("set_perspective") {
returns(GDvoid)
"fov"(GDfloat)
"z_near"(GDfloat)
"z_far"(GDfloat)
}

func("unproject_position") {
returns(GDVector2)
"world_point"(GDVector3)
}
}){

}