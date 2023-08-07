
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDXRInterface: GDType("XRInterface", {

"ar_is_anchor_detection_enabled"(GDbool)
"interface_is_primary"(GDbool)
"xr_play_area_mode"(GDPlayAreaMode)
constructor { }

func("get_camera_feed_id") {
returns(GDint)

}

func("get_capabilities") {
returns(GDint)

}

func("get_name") {
returns(GDStringName)

}

func("get_play_area") {
returns(GDPackedVector3Array)

}

func("get_projection_for_view") {
returns(GDProjection)
"view"(GDint)
"aspect"(GDfloat)
"near"(GDfloat)
"far"(GDfloat)
}

func("get_render_target_size") {
returns(GDVector2)

}

func("get_supported_environment_blend_modes") {
returns(GDArray)

}

func("get_system_info") {
returns(GDDictionary)

}

func("get_tracking_status") {
returns(GDTrackingStatus)

}

func("get_transform_for_view") {
returns(GDTransform3D)
"view"(GDint)
"cam_transform"(GDTransform3D)
}

func("get_view_count") {
returns(GDint)

}

func("initialize") {
returns(GDbool)

}

func("is_initialized") {
returns(GDbool)

}

func("is_passthrough_enabled") {
returns(GDbool)

}

func("is_passthrough_supported") {
returns(GDbool)

}

func("set_environment_blend_mode") {
returns(GDbool)
"mode"(GDEnvironmentBlendMode)
}

func("set_play_area_mode") {
returns(GDbool)
"mode"(GDPlayAreaMode)
}

func("start_passthrough") {
returns(GDbool)

}

func("stop_passthrough") {
returns(GDvoid)

}

func("supports_play_area_mode") {
returns(GDbool)
"mode"(GDPlayAreaMode)
}

func("trigger_haptic_pulse") {
returns(GDvoid)
"action_name"(GDString)
"tracker_name"(GDStringName)
"frequency"(GDfloat)
"amplitude"(GDfloat)
"duration_sec"(GDfloat)
"delay_sec"(GDfloat)
}

func("uninitialize") {
returns(GDvoid)

}
}){

}