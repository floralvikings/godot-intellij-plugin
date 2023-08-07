
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimation: GDType("Animation", {

"length"(GDfloat)
"loop_mode"(GDLoopMode)
"step"(GDfloat)
constructor { }

func("add_track") {
returns(GDint)
"type"(GDTrackType)
"at_position"(GDint)
}

func("animation_track_get_key_animation") {
returns(GDStringName)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("animation_track_insert_key") {
returns(GDint)
"track_idx"(GDint)
"time"(GDfloat)
"animation"(GDStringName)
}

func("animation_track_set_key_animation") {
returns(GDvoid)
"track_idx"(GDint)
"key_idx"(GDint)
"animation"(GDStringName)
}

func("audio_track_get_key_end_offset") {
returns(GDfloat)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("audio_track_get_key_start_offset") {
returns(GDfloat)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("audio_track_get_key_stream") {
returns(GDResource)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("audio_track_insert_key") {
returns(GDint)
"track_idx"(GDint)
"time"(GDfloat)
"stream"(GDResource)
"start_offset"(GDfloat)
"end_offset"(GDfloat)
}

func("audio_track_is_use_blend") {
returns(GDbool)
"track_idx"(GDint)
}

func("audio_track_set_key_end_offset") {
returns(GDvoid)
"track_idx"(GDint)
"key_idx"(GDint)
"offset"(GDfloat)
}

func("audio_track_set_key_start_offset") {
returns(GDvoid)
"track_idx"(GDint)
"key_idx"(GDint)
"offset"(GDfloat)
}

func("audio_track_set_key_stream") {
returns(GDvoid)
"track_idx"(GDint)
"key_idx"(GDint)
"stream"(GDResource)
}

func("audio_track_set_use_blend") {
returns(GDvoid)
"track_idx"(GDint)
"enable"(GDbool)
}

func("bezier_track_get_key_in_handle") {
returns(GDVector2)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("bezier_track_get_key_out_handle") {
returns(GDVector2)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("bezier_track_get_key_value") {
returns(GDfloat)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("bezier_track_insert_key") {
returns(GDint)
"track_idx"(GDint)
"time"(GDfloat)
"value"(GDfloat)
"in_handle"(GDVector2)
"out_handle"(GDVector2)
}

func("bezier_track_interpolate") {
returns(GDfloat)
"track_idx"(GDint)
"time"(GDfloat)
}

func("bezier_track_set_key_in_handle") {
returns(GDvoid)
"track_idx"(GDint)
"key_idx"(GDint)
"in_handle"(GDVector2)
"balanced_value_time_ratio"(GDfloat)
}

func("bezier_track_set_key_out_handle") {
returns(GDvoid)
"track_idx"(GDint)
"key_idx"(GDint)
"out_handle"(GDVector2)
"balanced_value_time_ratio"(GDfloat)
}

func("bezier_track_set_key_value") {
returns(GDvoid)
"track_idx"(GDint)
"key_idx"(GDint)
"value"(GDfloat)
}

func("blend_shape_track_insert_key") {
returns(GDint)
"track_idx"(GDint)
"time"(GDfloat)
"amount"(GDfloat)
}

func("blend_shape_track_interpolate") {
returns(GDfloat)
"track_idx"(GDint)
"time_sec"(GDfloat)
}

func("clear") {
returns(GDvoid)

}

func("compress") {
returns(GDvoid)
"page_size"(GDint)
"fps"(GDint)
"split_tolerance"(GDfloat)
}

func("copy_track") {
returns(GDvoid)
"track_idx"(GDint)
"to_animation"(GDSameType)
}

func("find_track") {
returns(GDint)
"path"(GDNodePath)
"type"(GDTrackType)
}

func("get_track_count") {
returns(GDint)

}

func("method_track_get_name") {
returns(GDStringName)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("method_track_get_params") {
returns(GDArray)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("position_track_insert_key") {
returns(GDint)
"track_idx"(GDint)
"time"(GDfloat)
"position"(GDVector3)
}

func("position_track_interpolate") {
returns(GDVector3)
"track_idx"(GDint)
"time_sec"(GDfloat)
}

func("remove_track") {
returns(GDvoid)
"track_idx"(GDint)
}

func("rotation_track_insert_key") {
returns(GDint)
"track_idx"(GDint)
"time"(GDfloat)
"rotation"(GDQuaternion)
}

func("rotation_track_interpolate") {
returns(GDQuaternion)
"track_idx"(GDint)
"time_sec"(GDfloat)
}

func("scale_track_insert_key") {
returns(GDint)
"track_idx"(GDint)
"time"(GDfloat)
"scale"(GDVector3)
}

func("scale_track_interpolate") {
returns(GDVector3)
"track_idx"(GDint)
"time_sec"(GDfloat)
}

func("track_find_key") {
returns(GDint)
"track_idx"(GDint)
"time"(GDfloat)
"find_mode"(GDFindMode)
}

func("track_get_interpolation_loop_wrap") {
returns(GDbool)
"track_idx"(GDint)
}

func("track_get_interpolation_type") {
returns(GDInterpolationType)
"track_idx"(GDint)
}

func("track_get_key_count") {
returns(GDint)
"track_idx"(GDint)
}

func("track_get_key_time") {
returns(GDfloat)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("track_get_key_transition") {
returns(GDfloat)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("track_get_key_value") {
returns(GDVariant)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("track_get_path") {
returns(GDNodePath)
"track_idx"(GDint)
}

func("track_get_type") {
returns(GDTrackType)
"track_idx"(GDint)
}

func("track_insert_key") {
returns(GDint)
"track_idx"(GDint)
"time"(GDfloat)
"key"(GDVariant)
"transition"(GDfloat)
}

func("track_is_compressed") {
returns(GDbool)
"track_idx"(GDint)
}

func("track_is_enabled") {
returns(GDbool)
"track_idx"(GDint)
}

func("track_is_imported") {
returns(GDbool)
"track_idx"(GDint)
}

func("track_move_down") {
returns(GDvoid)
"track_idx"(GDint)
}

func("track_move_to") {
returns(GDvoid)
"track_idx"(GDint)
"to_idx"(GDint)
}

func("track_move_up") {
returns(GDvoid)
"track_idx"(GDint)
}

func("track_remove_key") {
returns(GDvoid)
"track_idx"(GDint)
"key_idx"(GDint)
}

func("track_remove_key_at_time") {
returns(GDvoid)
"track_idx"(GDint)
"time"(GDfloat)
}

func("track_set_enabled") {
returns(GDvoid)
"track_idx"(GDint)
"enabled"(GDbool)
}

func("track_set_imported") {
returns(GDvoid)
"track_idx"(GDint)
"imported"(GDbool)
}

func("track_set_interpolation_loop_wrap") {
returns(GDvoid)
"track_idx"(GDint)
"interpolation"(GDbool)
}

func("track_set_interpolation_type") {
returns(GDvoid)
"track_idx"(GDint)
"interpolation"(GDInterpolationType)
}

func("track_set_key_time") {
returns(GDvoid)
"track_idx"(GDint)
"key_idx"(GDint)
"time"(GDfloat)
}

func("track_set_key_transition") {
returns(GDvoid)
"track_idx"(GDint)
"key_idx"(GDint)
"transition"(GDfloat)
}

func("track_set_key_value") {
returns(GDvoid)
"track_idx"(GDint)
"key"(GDint)
"value"(GDVariant)
}

func("track_set_path") {
returns(GDvoid)
"track_idx"(GDint)
"path"(GDNodePath)
}

func("track_swap") {
returns(GDvoid)
"track_idx"(GDint)
"with_idx"(GDint)
}

func("value_track_get_update_mode") {
returns(GDUpdateMode)
"track_idx"(GDint)
}

func("value_track_interpolate") {
returns(GDVariant)
"track_idx"(GDint)
"time_sec"(GDfloat)
}

func("value_track_set_update_mode") {
returns(GDvoid)
"track_idx"(GDint)
"mode"(GDUpdateMode)
}
}){

}