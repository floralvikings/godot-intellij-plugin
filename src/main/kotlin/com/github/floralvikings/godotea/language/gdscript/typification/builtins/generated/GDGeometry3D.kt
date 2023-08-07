
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGeometry3D: GDType("Geometry3D", {


constructor { }

func("build_box_planes") {
returns(GDTypedArray(GDPlane::class))
"extents"(GDVector3)
}

func("build_capsule_planes") {
returns(GDTypedArray(GDPlane::class))
"radius"(GDfloat)
"height"(GDfloat)
"sides"(GDint)
"lats"(GDint)
"axis"(GDVector3Axis)
}

func("build_cylinder_planes") {
returns(GDTypedArray(GDPlane::class))
"radius"(GDfloat)
"height"(GDfloat)
"sides"(GDint)
"axis"(GDVector3Axis)
}

func("clip_polygon") {
returns(GDPackedVector3Array)
"points"(GDPackedVector3Array)
"plane"(GDPlane)
}

func("get_closest_point_to_segment") {
returns(GDVector3)
"point"(GDVector3)
"s1"(GDVector3)
"s2"(GDVector3)
}

func("get_closest_point_to_segment_uncapped") {
returns(GDVector3)
"point"(GDVector3)
"s1"(GDVector3)
"s2"(GDVector3)
}

func("get_closest_points_between_segments") {
returns(GDPackedVector3Array)
"p1"(GDVector3)
"p2"(GDVector3)
"q1"(GDVector3)
"q2"(GDVector3)
}

func("ray_intersects_triangle") {
returns(GDVariant)
"from"(GDVector3)
"dir"(GDVector3)
"a"(GDVector3)
"b"(GDVector3)
"c"(GDVector3)
}

func("segment_intersects_convex") {
returns(GDPackedVector3Array)
"from"(GDVector3)
"to"(GDVector3)
"planes"(GDTypedArray(GDPlane::class))
}

func("segment_intersects_cylinder") {
returns(GDPackedVector3Array)
"from"(GDVector3)
"to"(GDVector3)
"height"(GDfloat)
"radius"(GDfloat)
}

func("segment_intersects_sphere") {
returns(GDPackedVector3Array)
"from"(GDVector3)
"to"(GDVector3)
"sphere_position"(GDVector3)
"sphere_radius"(GDfloat)
}

func("segment_intersects_triangle") {
returns(GDVariant)
"from"(GDVector3)
"to"(GDVector3)
"a"(GDVector3)
"b"(GDVector3)
"c"(GDVector3)
}
}){

}