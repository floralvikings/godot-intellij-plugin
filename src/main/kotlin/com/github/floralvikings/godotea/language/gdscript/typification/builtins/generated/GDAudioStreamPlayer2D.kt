
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioStreamPlayer2D: GDType("AudioStreamPlayer2D", {

"area_mask"(GDint)
"attenuation"(GDfloat)
"autoplay"(GDbool)
"bus"(GDStringName)
"max_distance"(GDfloat)
"max_polyphony"(GDint)
"panning_strength"(GDfloat)
"pitch_scale"(GDfloat)
"playing"(GDbool)
"stream"(GDAudioStream)
"stream_paused"(GDbool)
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