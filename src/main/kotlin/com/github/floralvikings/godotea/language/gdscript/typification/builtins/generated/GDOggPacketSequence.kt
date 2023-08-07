
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDOggPacketSequence: GDType("OggPacketSequence", {

"granule_positions"(GDPackedInt64Array)
"packet_data"(GDTypedArray(GDArray::class))
"sampling_rate"(GDfloat)
constructor { }

func("get_length") {
returns(GDfloat)

}
}){

}