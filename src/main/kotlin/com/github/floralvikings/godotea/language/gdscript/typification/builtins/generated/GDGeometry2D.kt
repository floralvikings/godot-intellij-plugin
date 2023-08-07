
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGeometry2D: GDType("Geometry2D", {


constructor { }

func("clip_polygons") {
returns(GDTypedArray(GDPackedVector2Array::class))
"polygon_a"(GDPackedVector2Array)
"polygon_b"(GDPackedVector2Array)
}

func("clip_polyline_with_polygon") {
returns(GDTypedArray(GDPackedVector2Array::class))
"polyline"(GDPackedVector2Array)
"polygon"(GDPackedVector2Array)
}

func("convex_hull") {
returns(GDPackedVector2Array)
"points"(GDPackedVector2Array)
}

func("decompose_polygon_in_convex") {
returns(GDTypedArray(GDPackedVector2Array::class))
"polygon"(GDPackedVector2Array)
}

func("exclude_polygons") {
returns(GDTypedArray(GDPackedVector2Array::class))
"polygon_a"(GDPackedVector2Array)
"polygon_b"(GDPackedVector2Array)
}

func("get_closest_point_to_segment") {
returns(GDVector2)
"point"(GDVector2)
"s1"(GDVector2)
"s2"(GDVector2)
}

func("get_closest_point_to_segment_uncapped") {
returns(GDVector2)
"point"(GDVector2)
"s1"(GDVector2)
"s2"(GDVector2)
}

func("get_closest_points_between_segments") {
returns(GDPackedVector2Array)
"p1"(GDVector2)
"q1"(GDVector2)
"p2"(GDVector2)
"q2"(GDVector2)
}

func("intersect_polygons") {
returns(GDTypedArray(GDPackedVector2Array::class))
"polygon_a"(GDPackedVector2Array)
"polygon_b"(GDPackedVector2Array)
}

func("intersect_polyline_with_polygon") {
returns(GDTypedArray(GDPackedVector2Array::class))
"polyline"(GDPackedVector2Array)
"polygon"(GDPackedVector2Array)
}

func("is_point_in_circle") {
returns(GDbool)
"point"(GDVector2)
"circle_position"(GDVector2)
"circle_radius"(GDfloat)
}

func("is_point_in_polygon") {
returns(GDbool)
"point"(GDVector2)
"polygon"(GDPackedVector2Array)
}

func("is_polygon_clockwise") {
returns(GDbool)
"polygon"(GDPackedVector2Array)
}

func("line_intersects_line") {
returns(GDVariant)
"from_a"(GDVector2)
"dir_a"(GDVector2)
"from_b"(GDVector2)
"dir_b"(GDVector2)
}

func("make_atlas") {
returns(GDDictionary)
"sizes"(GDPackedVector2Array)
}

func("merge_polygons") {
returns(GDTypedArray(GDPackedVector2Array::class))
"polygon_a"(GDPackedVector2Array)
"polygon_b"(GDPackedVector2Array)
}

func("offset_polygon") {
returns(GDTypedArray(GDPackedVector2Array::class))
"polygon"(GDPackedVector2Array)
"delta"(GDfloat)
"join_type"(GDPolyJoinType)
}

func("offset_polyline") {
returns(GDTypedArray(GDPackedVector2Array::class))
"polyline"(GDPackedVector2Array)
"delta"(GDfloat)
"join_type"(GDPolyJoinType)
"end_type"(GDPolyEndType)
}

func("point_is_inside_triangle") {
returns(GDbool)
"point"(GDVector2)
"a"(GDVector2)
"b"(GDVector2)
"c"(GDVector2)
}

func("segment_intersects_circle") {
returns(GDfloat)
"segment_from"(GDVector2)
"segment_to"(GDVector2)
"circle_position"(GDVector2)
"circle_radius"(GDfloat)
}

func("segment_intersects_segment") {
returns(GDVariant)
"from_a"(GDVector2)
"to_a"(GDVector2)
"from_b"(GDVector2)
"to_b"(GDVector2)
}

func("triangulate_delaunay") {
returns(GDPackedInt32Array)
"points"(GDPackedVector2Array)
}

func("triangulate_polygon") {
returns(GDPackedInt32Array)
"polygon"(GDPackedVector2Array)
}
}){

}