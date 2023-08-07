
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioEffectRecord: GDType("AudioEffectRecord", {

"format"(GDFormat)
constructor { }

func("get_recording") {
returns(GDAudioStreamWAV)

}

func("is_recording_active") {
returns(GDbool)

}

func("set_recording_active") {
returns(GDvoid)
"record"(GDbool)
}
}){

}