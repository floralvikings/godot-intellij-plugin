
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDStreamPeerExtension: GDType("StreamPeerExtension", {


constructor { }

func("_get_available_bytes") {
returns(GDint)

}

func("_get_data") {
returns(GDError)
"r_buffer"(GDUnknownType)
"r_bytes"(GDint)
"r_received"(GDUnknownType)
}

func("_get_partial_data") {
returns(GDError)
"r_buffer"(GDUnknownType)
"r_bytes"(GDint)
"r_received"(GDUnknownType)
}

func("_put_data") {
returns(GDError)
"p_bytes"(GDint)
"r_sent"(GDUnknownType)
}

func("_put_partial_data") {
returns(GDError)
"p_bytes"(GDint)
"r_sent"(GDUnknownType)
}
}){

}