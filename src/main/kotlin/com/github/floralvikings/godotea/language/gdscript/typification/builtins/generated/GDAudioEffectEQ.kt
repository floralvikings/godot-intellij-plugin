
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioEffectEQ: GDType("AudioEffectEQ", {


constructor { }

func("get_band_count") {
returns(GDint)

}

func("get_band_gain_db") {
returns(GDfloat)
"band_idx"(GDint)
}

func("set_band_gain_db") {
returns(GDvoid)
"band_idx"(GDint)
"volume_db"(GDfloat)
}
}){

}