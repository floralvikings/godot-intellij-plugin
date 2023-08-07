
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPacketPeerDTLS: GDType("PacketPeerDTLS", {


constructor { }

func("connect_to_peer") {
returns(GDError)
"packet_peer"(GDPacketPeerUDP)
"hostname"(GDString)
"client_options"(GDTLSOptions)
}

func("disconnect_from_peer") {
returns(GDvoid)

}

func("get_status") {
returns(GDStatus)

}

func("poll") {
returns(GDvoid)

}
}){

}