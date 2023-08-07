
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAStar2D: GDType("AStar2D", {


constructor { }

func("_compute_cost") {
returns(GDfloat)
"from_id"(GDint)
"to_id"(GDint)
}

func("_estimate_cost") {
returns(GDfloat)
"from_id"(GDint)
"to_id"(GDint)
}

func("add_point") {
returns(GDvoid)
"id"(GDint)
"position"(GDVector2)
"weight_scale"(GDfloat)
}

func("are_points_connected") {
returns(GDbool)
"id"(GDint)
"to_id"(GDint)
"bidirectional"(GDbool)
}

func("clear") {
returns(GDvoid)

}

func("connect_points") {
returns(GDvoid)
"id"(GDint)
"to_id"(GDint)
"bidirectional"(GDbool)
}

func("disconnect_points") {
returns(GDvoid)
"id"(GDint)
"to_id"(GDint)
"bidirectional"(GDbool)
}

func("get_available_point_id") {
returns(GDint)

}

func("get_closest_point") {
returns(GDint)
"to_position"(GDVector2)
"include_disabled"(GDbool)
}

func("get_closest_position_in_segment") {
returns(GDVector2)
"to_position"(GDVector2)
}

func("get_id_path") {
returns(GDPackedInt64Array)
"from_id"(GDint)
"to_id"(GDint)
}

func("get_point_capacity") {
returns(GDint)

}

func("get_point_connections") {
returns(GDPackedInt64Array)
"id"(GDint)
}

func("get_point_count") {
returns(GDint)

}

func("get_point_ids") {
returns(GDPackedInt64Array)

}

func("get_point_path") {
returns(GDPackedVector2Array)
"from_id"(GDint)
"to_id"(GDint)
}

func("get_point_position") {
returns(GDVector2)
"id"(GDint)
}

func("get_point_weight_scale") {
returns(GDfloat)
"id"(GDint)
}

func("has_point") {
returns(GDbool)
"id"(GDint)
}

func("is_point_disabled") {
returns(GDbool)
"id"(GDint)
}

func("remove_point") {
returns(GDvoid)
"id"(GDint)
}

func("reserve_space") {
returns(GDvoid)
"num_nodes"(GDint)
}

func("set_point_disabled") {
returns(GDvoid)
"id"(GDint)
"disabled"(GDbool)
}

func("set_point_position") {
returns(GDvoid)
"id"(GDint)
"position"(GDVector2)
}

func("set_point_weight_scale") {
returns(GDvoid)
"id"(GDint)
"weight_scale"(GDfloat)
}
}){

}