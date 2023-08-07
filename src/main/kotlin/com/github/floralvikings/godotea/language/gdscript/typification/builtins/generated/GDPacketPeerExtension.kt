
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPacketPeerExtension: GDType("PacketPeerExtension", {


constructor { }

func("_get_available_packet_count") {
returns(GDint)

}

func("_get_max_packet_size") {
returns(GDint)

}

func("_get_packet") {
returns(GDError)
"r_buffer_size"(GDUnknownType)
}

func("_put_packet") {
returns(GDError)
"p_buffer_size"(GDint)
}
}){

}