
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioEffectInstance: GDType("AudioEffectInstance", {


constructor { }

func("_process") {
returns(GDvoid)
"dst_buffer"(GDUnknownType)
"frame_count"(GDint)
}

func("_process_silence") {
returns(GDbool)

}
}){

}