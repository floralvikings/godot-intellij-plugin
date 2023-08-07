
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioStreamPlaybackResampled: GDType("AudioStreamPlaybackResampled", {


constructor { }

func("_get_stream_sampling_rate") {
returns(GDfloat)

}

func("_mix_resampled") {
returns(GDint)
"dst_buffer"(GDUnknownType)
"frame_count"(GDint)
}

func("begin_resample") {
returns(GDvoid)

}
}){

}