
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDProjection: GDType("Projection", {

"w"(GDVector4)
"x"(GDVector4)
"y"(GDVector4)
"z"(GDVector4)

constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"from"(GDTransform3D)
}

constructor {
"x_axis"(GDVector4)
"y_axis"(GDVector4)
"z_axis"(GDVector4)
"w_axis"(GDVector4)
}

func("create_depth_correction") {
returns(GDSameType)
"flip_y"(GDbool)
}

func("create_fit_aabb") {
returns(GDSameType)
"aabb"(GDAABB)
}

func("create_for_hmd") {
returns(GDSameType)
"eye"(GDint)
"aspect"(GDfloat)
"intraocular_dist"(GDfloat)
"display_width"(GDfloat)
"display_to_lens"(GDfloat)
"oversample"(GDfloat)
"z_near"(GDfloat)
"z_far"(GDfloat)
}

func("create_frustum") {
returns(GDSameType)
"left"(GDfloat)
"right"(GDfloat)
"bottom"(GDfloat)
"top"(GDfloat)
"z_near"(GDfloat)
"z_far"(GDfloat)
}

func("create_frustum_aspect") {
returns(GDSameType)
"size"(GDfloat)
"aspect"(GDfloat)
"offset"(GDVector2)
"z_near"(GDfloat)
"z_far"(GDfloat)
"flip_fov"(GDbool)
}

func("create_light_atlas_rect") {
returns(GDSameType)
"rect"(GDRect2)
}

func("create_orthogonal") {
returns(GDSameType)
"left"(GDfloat)
"right"(GDfloat)
"bottom"(GDfloat)
"top"(GDfloat)
"z_near"(GDfloat)
"z_far"(GDfloat)
}

func("create_orthogonal_aspect") {
returns(GDSameType)
"size"(GDfloat)
"aspect"(GDfloat)
"z_near"(GDfloat)
"z_far"(GDfloat)
"flip_fov"(GDbool)
}

func("create_perspective") {
returns(GDSameType)
"fovy"(GDfloat)
"aspect"(GDfloat)
"z_near"(GDfloat)
"z_far"(GDfloat)
"flip_fov"(GDbool)
}

func("create_perspective_hmd") {
returns(GDSameType)
"fovy"(GDfloat)
"aspect"(GDfloat)
"z_near"(GDfloat)
"z_far"(GDfloat)
"flip_fov"(GDbool)
"eye"(GDint)
"intraocular_dist"(GDfloat)
"convergence_dist"(GDfloat)
}

func("determinant") {
returns(GDfloat)

}

func("flipped_y") {
returns(GDSameType)

}

func("get_aspect") {
returns(GDfloat)

}

func("get_far_plane_half_extents") {
returns(GDVector2)

}

func("get_fov") {
returns(GDfloat)

}

func("get_fovy") {
returns(GDfloat)
"fovx"(GDfloat)
"aspect"(GDfloat)
}

func("get_lod_multiplier") {
returns(GDfloat)

}

func("get_pixels_per_meter") {
returns(GDint)
"for_pixel_width"(GDint)
}

func("get_projection_plane") {
returns(GDPlane)
"plane"(GDint)
}

func("get_viewport_half_extents") {
returns(GDVector2)

}

func("get_z_far") {
returns(GDfloat)

}

func("get_z_near") {
returns(GDfloat)

}

func("inverse") {
returns(GDSameType)

}

func("is_orthogonal") {
returns(GDbool)

}

func("jitter_offseted") {
returns(GDSameType)
"offset"(GDVector2)
}

func("perspective_znear_adjusted") {
returns(GDSameType)
"new_znear"(GDfloat)
}
}){

}