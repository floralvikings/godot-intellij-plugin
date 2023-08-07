
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVideoStreamPlayer: GDType("VideoStreamPlayer", {

"audio_track"(GDint)
"autoplay"(GDbool)
"buffering_msec"(GDint)
"bus"(GDStringName)
"expand"(GDbool)
"paused"(GDbool)
"stream"(GDVideoStream)
"stream_position"(GDfloat)
"volume"(GDfloat)
"volume_db"(GDfloat)
constructor { }

func("get_stream_name") {
returns(GDString)

}

func("get_video_texture") {
returns(GDTexture2D)

}

func("is_playing") {
returns(GDbool)

}

func("play") {
returns(GDvoid)

}

func("stop") {
returns(GDvoid)

}
}){

}