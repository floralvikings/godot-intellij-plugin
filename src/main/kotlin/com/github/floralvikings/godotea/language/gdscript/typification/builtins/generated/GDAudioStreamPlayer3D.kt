
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioStreamPlayer3D: GDType("AudioStreamPlayer3D", {

"area_mask"(GDint)
"attenuation_filter_cutoff_hz"(GDfloat)
"attenuation_filter_db"(GDfloat)
"attenuation_model"(GDAttenuationModel)
"autoplay"(GDbool)
"bus"(GDStringName)
"doppler_tracking"(GDDopplerTracking)
"emission_angle_degrees"(GDfloat)
"emission_angle_enabled"(GDbool)
"emission_angle_filter_attenuation_db"(GDfloat)
"max_db"(GDfloat)
"max_distance"(GDfloat)
"max_polyphony"(GDint)
"panning_strength"(GDfloat)
"pitch_scale"(GDfloat)
"playing"(GDbool)
"stream"(GDAudioStream)
"stream_paused"(GDbool)
"unit_size"(GDfloat)
"volume_db"(GDfloat)
constructor { }

func("get_playback_position") {
returns(GDfloat)

}

func("get_stream_playback") {
returns(GDAudioStreamPlayback)

}

func("has_stream_playback") {
returns(GDbool)

}

func("play") {
returns(GDvoid)
"from_position"(GDfloat)
}

func("seek") {
returns(GDvoid)
"to_position"(GDfloat)
}

func("stop") {
returns(GDvoid)

}
}){

}