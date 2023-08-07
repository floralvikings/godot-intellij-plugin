
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioStreamPlaybackPolyphonic: GDType("AudioStreamPlaybackPolyphonic", {


constructor { }

func("is_stream_playing") {
returns(GDbool)
"stream"(GDint)
}

func("play_stream") {
returns(GDint)
"stream"(GDAudioStream)
"from_offset"(GDfloat)
"volume_db"(GDfloat)
"pitch_scale"(GDfloat)
}

func("set_stream_pitch_scale") {
returns(GDvoid)
"stream"(GDint)
"pitch_scale"(GDfloat)
}

func("set_stream_volume") {
returns(GDvoid)
"stream"(GDint)
"volume_db"(GDfloat)
}

func("stop_stream") {
returns(GDvoid)
"stream"(GDint)
}
}){

}