
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDXRInterfaceExtension: GDType("XRInterfaceExtension", {


constructor { }

func("_end_frame") {
returns(GDvoid)

}

func("_get_anchor_detection_is_enabled") {
returns(GDbool)

}

func("_get_camera_feed_id") {
returns(GDint)

}

func("_get_camera_transform") {
returns(GDTransform3D)

}

func("_get_capabilities") {
returns(GDint)

}

func("_get_color_texture") {
returns(GDRID)

}

func("_get_depth_texture") {
returns(GDRID)

}

func("_get_name") {
returns(GDStringName)

}

func("_get_play_area") {
returns(GDPackedVector3Array)

}

func("_get_play_area_mode") {
returns(GDPlayAreaMode)

}

func("_get_projection_for_view") {
returns(GDPackedFloat64Array)
"view"(GDint)
"aspect"(GDfloat)
"z_near"(GDfloat)
"z_far"(GDfloat)
}

func("_get_render_target_size") {
returns(GDVector2)

}

func("_get_suggested_pose_names") {
returns(GDPackedStringArray)
"tracker_name"(GDStringName)
}

func("_get_suggested_tracker_names") {
returns(GDPackedStringArray)

}

func("_get_system_info") {
returns(GDDictionary)

}

func("_get_tracking_status") {
returns(GDTrackingStatus)

}

func("_get_transform_for_view") {
returns(GDTransform3D)
"view"(GDint)
"cam_transform"(GDTransform3D)
}

func("_get_velocity_texture") {
returns(GDRID)

}

func("_get_view_count") {
returns(GDint)

}

func("_get_vrs_texture") {
returns(GDRID)

}

func("_initialize") {
returns(GDbool)

}

func("_is_initialized") {
returns(GDbool)

}

func("_post_draw_viewport") {
returns(GDvoid)
"render_target"(GDRID)
"screen_rect"(GDRect2)
}

func("_pre_draw_viewport") {
returns(GDbool)
"render_target"(GDRID)
}

func("_pre_render") {
returns(GDvoid)

}

func("_process") {
returns(GDvoid)

}

func("_set_anchor_detection_is_enabled") {
returns(GDvoid)
"enabled"(GDbool)
}

func("_set_play_area_mode") {
returns(GDbool)
"mode"(GDPlayAreaMode)
}

func("_supports_play_area_mode") {
returns(GDbool)
"mode"(GDPlayAreaMode)
}

func("_trigger_haptic_pulse") {
returns(GDvoid)
"action_name"(GDString)
"tracker_name"(GDStringName)
"frequency"(GDfloat)
"amplitude"(GDfloat)
"duration_sec"(GDfloat)
"delay_sec"(GDfloat)
}

func("_uninitialize") {
returns(GDvoid)

}

func("add_blit") {
returns(GDvoid)
"render_target"(GDRID)
"src_rect"(GDRect2)
"dst_rect"(GDRect2i)
"use_layer"(GDbool)
"layer"(GDint)
"apply_lens_distortion"(GDbool)
"eye_center"(GDVector2)
"k1"(GDfloat)
"k2"(GDfloat)
"upscale"(GDfloat)
"aspect_ratio"(GDfloat)
}

func("get_color_texture") {
returns(GDRID)

}

func("get_depth_texture") {
returns(GDRID)

}

func("get_render_target_texture") {
returns(GDRID)
"render_target"(GDRID)
}

func("get_velocity_texture") {
returns(GDRID)

}
}){

}