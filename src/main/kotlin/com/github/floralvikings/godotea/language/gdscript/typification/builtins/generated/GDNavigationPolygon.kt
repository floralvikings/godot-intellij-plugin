
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNavigationPolygon: GDType("NavigationPolygon", {

"cell_size"(GDfloat)
constructor { }

func("add_outline") {
returns(GDvoid)
"outline"(GDPackedVector2Array)
}

func("add_outline_at_index") {
returns(GDvoid)
"outline"(GDPackedVector2Array)
"index"(GDint)
}

func("add_polygon") {
returns(GDvoid)
"polygon"(GDPackedInt32Array)
}

func("clear_outlines") {
returns(GDvoid)

}

func("clear_polygons") {
returns(GDvoid)

}

func("get_navigation_mesh") {
returns(GDNavigationMesh)

}

func("get_outline") {
returns(GDPackedVector2Array)
"idx"(GDint)
}

func("get_outline_count") {
returns(GDint)

}

func("get_polygon") {
returns(GDPackedInt32Array)
"idx"(GDint)
}

func("get_polygon_count") {
returns(GDint)

}

func("get_vertices") {
returns(GDPackedVector2Array)

}

func("make_polygons_from_outlines") {
returns(GDvoid)

}

func("remove_outline") {
returns(GDvoid)
"idx"(GDint)
}

func("set_outline") {
returns(GDvoid)
"idx"(GDint)
"outline"(GDPackedVector2Array)
}

func("set_vertices") {
returns(GDvoid)
"vertices"(GDPackedVector2Array)
}
}){

}