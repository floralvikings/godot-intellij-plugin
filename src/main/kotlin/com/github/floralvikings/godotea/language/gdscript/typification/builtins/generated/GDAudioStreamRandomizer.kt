
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioStreamRandomizer: GDType("AudioStreamRandomizer", {

"playback_mode"(GDPlaybackMode)
"random_pitch"(GDfloat)
"random_volume_offset_db"(GDfloat)
"streams_count"(GDint)
constructor { }

func("add_stream") {
returns(GDvoid)
"index"(GDint)
"stream"(GDAudioStream)
"weight"(GDfloat)
}

func("get_stream") {
returns(GDAudioStream)
"index"(GDint)
}

func("get_stream_probability_weight") {
returns(GDfloat)
"index"(GDint)
}

func("move_stream") {
returns(GDvoid)
"index_from"(GDint)
"index_to"(GDint)
}

func("remove_stream") {
returns(GDvoid)
"index"(GDint)
}

func("set_stream") {
returns(GDvoid)
"index"(GDint)
"stream"(GDAudioStream)
}

func("set_stream_probability_weight") {
returns(GDvoid)
"index"(GDint)
"weight"(GDfloat)
}
}){

}