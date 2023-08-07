
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVideoStreamPlayback: GDType("VideoStreamPlayback", {


constructor { }

func("_get_channels") {
returns(GDint)

}

func("_get_length") {
returns(GDfloat)

}

func("_get_mix_rate") {
returns(GDint)

}

func("_get_playback_position") {
returns(GDfloat)

}

func("_get_texture") {
returns(GDTexture2D)

}

func("_is_paused") {
returns(GDbool)

}

func("_is_playing") {
returns(GDbool)

}

func("_play") {
returns(GDvoid)

}

func("_seek") {
returns(GDvoid)
"time"(GDfloat)
}

func("_set_audio_track") {
returns(GDvoid)
"idx"(GDint)
}

func("_set_paused") {
returns(GDvoid)
"paused"(GDbool)
}

func("_stop") {
returns(GDvoid)

}

func("_update") {
returns(GDvoid)
"delta"(GDfloat)
}

func("mix_audio") {
returns(GDint)
"num_frames"(GDint)
"buffer"(GDPackedFloat32Array)
"offset"(GDint)
}
}){

}