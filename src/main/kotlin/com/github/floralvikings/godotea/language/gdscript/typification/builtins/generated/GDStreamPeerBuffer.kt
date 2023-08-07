
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDStreamPeerBuffer: GDType("StreamPeerBuffer", {

"data_array"(GDPackedByteArray)
constructor { }

func("clear") {
returns(GDvoid)

}

func("duplicate") {
returns(GDSameType)

}

func("get_position") {
returns(GDint)

}

func("get_size") {
returns(GDint)

}

func("resize") {
returns(GDvoid)
"size"(GDint)
}

func("seek") {
returns(GDvoid)
"position"(GDint)
}
}){

}