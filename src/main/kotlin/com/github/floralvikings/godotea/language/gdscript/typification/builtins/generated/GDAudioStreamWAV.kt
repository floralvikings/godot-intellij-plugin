
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioStreamWAV: GDType("AudioStreamWAV", {

"data"(GDPackedByteArray)
"format"(GDFormat)
"loop_begin"(GDint)
"loop_end"(GDint)
"loop_mode"(GDLoopMode)
"mix_rate"(GDint)
"stereo"(GDbool)
constructor { }

func("save_to_wav") {
returns(GDError)
"path"(GDString)
}
}){

}