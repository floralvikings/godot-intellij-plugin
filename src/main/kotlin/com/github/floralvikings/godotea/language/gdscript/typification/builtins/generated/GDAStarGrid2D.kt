
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAStarGrid2D: GDType("AStarGrid2D", {

"cell_size"(GDVector2)
"default_compute_heuristic"(GDHeuristic)
"default_estimate_heuristic"(GDHeuristic)
"diagonal_mode"(GDDiagonalMode)
"jumping_enabled"(GDbool)
"offset"(GDVector2)
"region"(GDRect2i)
"size"(GDVector2i)
constructor { }

func("_compute_cost") {
returns(GDfloat)
"from_id"(GDVector2i)
"to_id"(GDVector2i)
}

func("_estimate_cost") {
returns(GDfloat)
"from_id"(GDVector2i)
"to_id"(GDVector2i)
}

func("clear") {
returns(GDvoid)

}

func("get_id_path") {
returns(GDTypedArray(GDVector2i::class))
"from_id"(GDVector2i)
"to_id"(GDVector2i)
}

func("get_point_path") {
returns(GDPackedVector2Array)
"from_id"(GDVector2i)
"to_id"(GDVector2i)
}

func("get_point_position") {
returns(GDVector2)
"id"(GDVector2i)
}

func("get_point_weight_scale") {
returns(GDfloat)
"id"(GDVector2i)
}

func("is_dirty") {
returns(GDbool)

}

func("is_in_bounds") {
returns(GDbool)
"x"(GDint)
"y"(GDint)
}

func("is_in_boundsv") {
returns(GDbool)
"id"(GDVector2i)
}

func("is_point_solid") {
returns(GDbool)
"id"(GDVector2i)
}

func("set_point_solid") {
returns(GDvoid)
"id"(GDVector2i)
"solid"(GDbool)
}

func("set_point_weight_scale") {
returns(GDvoid)
"id"(GDVector2i)
"weight_scale"(GDfloat)
}

func("update") {
returns(GDvoid)

}
}){

}