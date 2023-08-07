
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioStream: GDType("AudioStream", {


constructor { }

func("_get_beat_count") {
returns(GDint)

}

func("_get_bpm") {
returns(GDfloat)

}

func("_get_length") {
returns(GDfloat)

}

func("_get_stream_name") {
returns(GDString)

}

func("_instantiate_playback") {
returns(GDAudioStreamPlayback)

}

func("_is_monophonic") {
returns(GDbool)

}

func("get_length") {
returns(GDfloat)

}

func("instantiate_playback") {
returns(GDAudioStreamPlayback)

}

func("is_monophonic") {
returns(GDbool)

}
}){

}