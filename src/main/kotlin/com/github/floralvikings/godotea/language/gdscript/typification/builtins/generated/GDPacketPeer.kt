
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPacketPeer: GDType("PacketPeer", {

"encode_buffer_max_size"(GDint)
constructor { }

func("get_available_packet_count") {
returns(GDint)

}

func("get_packet") {
returns(GDPackedByteArray)

}

func("get_packet_error") {
returns(GDError)

}

func("get_var") {
returns(GDVariant)
"allow_objects"(GDbool)
}

func("put_packet") {
returns(GDError)
"buffer"(GDPackedByteArray)
}

func("put_var") {
returns(GDError)
"var"(GDVariant)
"full_objects"(GDbool)
}
}){

}