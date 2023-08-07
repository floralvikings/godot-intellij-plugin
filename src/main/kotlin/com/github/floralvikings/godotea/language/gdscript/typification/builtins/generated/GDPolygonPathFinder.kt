
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPolygonPathFinder: GDType("PolygonPathFinder", {


constructor { }

func("find_path") {
returns(GDPackedVector2Array)
"from"(GDVector2)
"to"(GDVector2)
}

func("get_bounds") {
returns(GDRect2)

}

func("get_closest_point") {
returns(GDVector2)
"point"(GDVector2)
}

func("get_intersections") {
returns(GDPackedVector2Array)
"from"(GDVector2)
"to"(GDVector2)
}

func("get_point_penalty") {
returns(GDfloat)
"idx"(GDint)
}

func("is_point_inside") {
returns(GDbool)
"point"(GDVector2)
}

func("set_point_penalty") {
returns(GDvoid)
"idx"(GDint)
"penalty"(GDfloat)
}

func("setup") {
returns(GDvoid)
"points"(GDPackedVector2Array)
"connections"(GDPackedInt32Array)
}
}){

}