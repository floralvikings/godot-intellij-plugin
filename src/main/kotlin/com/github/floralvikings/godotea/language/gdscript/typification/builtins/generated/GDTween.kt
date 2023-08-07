
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTween: GDType("Tween", {


constructor { }

func("bind_node") {
returns(GDSameType)
"node"(GDNode)
}

func("chain") {
returns(GDSameType)

}

func("custom_step") {
returns(GDbool)
"delta"(GDfloat)
}

func("get_loops_left") {
returns(GDint)

}

func("get_total_elapsed_time") {
returns(GDfloat)

}

func("interpolate_value") {
returns(GDVariant)
"initial_value"(GDVariant)
"delta_value"(GDVariant)
"elapsed_time"(GDfloat)
"duration"(GDfloat)
"trans_type"(GDTransitionType)
"ease_type"(GDEaseType)
}

func("is_running") {
returns(GDbool)

}

func("is_valid") {
returns(GDbool)

}

func("kill") {
returns(GDvoid)

}

func("parallel") {
returns(GDSameType)

}

func("pause") {
returns(GDvoid)

}

func("play") {
returns(GDvoid)

}

func("set_ease") {
returns(GDSameType)
"ease"(GDEaseType)
}

func("set_loops") {
returns(GDSameType)
"loops"(GDint)
}

func("set_parallel") {
returns(GDSameType)
"parallel"(GDbool)
}

func("set_pause_mode") {
returns(GDSameType)
"mode"(GDTweenPauseMode)
}

func("set_process_mode") {
returns(GDSameType)
"mode"(GDTweenProcessMode)
}

func("set_speed_scale") {
returns(GDSameType)
"speed"(GDfloat)
}

func("set_trans") {
returns(GDSameType)
"trans"(GDTransitionType)
}

func("stop") {
returns(GDvoid)

}

func("tween_callback") {
returns(GDCallbackTweener)
"callback"(GDCallable)
}

func("tween_interval") {
returns(GDIntervalTweener)
"time"(GDfloat)
}

func("tween_method") {
returns(GDMethodTweener)
"method"(GDCallable)
"from"(GDVariant)
"to"(GDVariant)
"duration"(GDfloat)
}

func("tween_property") {
returns(GDPropertyTweener)
"object"(GDObject)
"property"(GDNodePath)
"final_val"(GDVariant)
"duration"(GDfloat)
}
}){

}