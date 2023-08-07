
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioStreamPlayback: GDType("AudioStreamPlayback", {


constructor { }

func("_get_loop_count") {
returns(GDint)

}

func("_get_playback_position") {
returns(GDfloat)

}

func("_is_playing") {
returns(GDbool)

}

func("_mix") {
returns(GDint)
"buffer"(GDUnknownType)
"rate_scale"(GDfloat)
"frames"(GDint)
}

func("_seek") {
returns(GDvoid)
"position"(GDfloat)
}

func("_start") {
returns(GDvoid)
"from_pos"(GDfloat)
}

func("_stop") {
returns(GDvoid)

}

func("_tag_used_streams") {
returns(GDvoid)

}
}){

}