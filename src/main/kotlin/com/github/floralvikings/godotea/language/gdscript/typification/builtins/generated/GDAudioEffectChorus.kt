
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioEffectChorus: GDType("AudioEffectChorus", {

"dry"(GDfloat)
"voice/1/cutoff_hz"(GDfloat)
"voice/1/delay_ms"(GDfloat)
"voice/1/depth_ms"(GDfloat)
"voice/1/level_db"(GDfloat)
"voice/1/pan"(GDfloat)
"voice/1/rate_hz"(GDfloat)
"voice/2/cutoff_hz"(GDfloat)
"voice/2/delay_ms"(GDfloat)
"voice/2/depth_ms"(GDfloat)
"voice/2/level_db"(GDfloat)
"voice/2/pan"(GDfloat)
"voice/2/rate_hz"(GDfloat)
"voice/3/cutoff_hz"(GDfloat)
"voice/3/delay_ms"(GDfloat)
"voice/3/depth_ms"(GDfloat)
"voice/3/level_db"(GDfloat)
"voice/3/pan"(GDfloat)
"voice/3/rate_hz"(GDfloat)
"voice/4/cutoff_hz"(GDfloat)
"voice/4/delay_ms"(GDfloat)
"voice/4/depth_ms"(GDfloat)
"voice/4/level_db"(GDfloat)
"voice/4/pan"(GDfloat)
"voice/4/rate_hz"(GDfloat)
"voice_count"(GDint)
"wet"(GDfloat)
constructor { }

func("get_voice_cutoff_hz") {
returns(GDfloat)
"voice_idx"(GDint)
}

func("get_voice_delay_ms") {
returns(GDfloat)
"voice_idx"(GDint)
}

func("get_voice_depth_ms") {
returns(GDfloat)
"voice_idx"(GDint)
}

func("get_voice_level_db") {
returns(GDfloat)
"voice_idx"(GDint)
}

func("get_voice_pan") {
returns(GDfloat)
"voice_idx"(GDint)
}

func("get_voice_rate_hz") {
returns(GDfloat)
"voice_idx"(GDint)
}

func("set_voice_cutoff_hz") {
returns(GDvoid)
"voice_idx"(GDint)
"cutoff_hz"(GDfloat)
}

func("set_voice_delay_ms") {
returns(GDvoid)
"voice_idx"(GDint)
"delay_ms"(GDfloat)
}

func("set_voice_depth_ms") {
returns(GDvoid)
"voice_idx"(GDint)
"depth_ms"(GDfloat)
}

func("set_voice_level_db") {
returns(GDvoid)
"voice_idx"(GDint)
"level_db"(GDfloat)
}

func("set_voice_pan") {
returns(GDvoid)
"voice_idx"(GDint)
"pan"(GDfloat)
}

func("set_voice_rate_hz") {
returns(GDvoid)
"voice_idx"(GDint)
"rate_hz"(GDfloat)
}
}){

}