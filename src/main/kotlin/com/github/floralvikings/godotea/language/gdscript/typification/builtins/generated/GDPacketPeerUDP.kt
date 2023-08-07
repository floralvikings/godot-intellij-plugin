
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPacketPeerUDP: GDType("PacketPeerUDP", {


constructor { }

func("bind") {
returns(GDError)
"port"(GDint)
"bind_address"(GDString)
"recv_buf_size"(GDint)
}

func("close") {
returns(GDvoid)

}

func("connect_to_host") {
returns(GDError)
"host"(GDString)
"port"(GDint)
}

func("get_local_port") {
returns(GDint)

}

func("get_packet_ip") {
returns(GDString)

}

func("get_packet_port") {
returns(GDint)

}

func("is_bound") {
returns(GDbool)

}

func("is_socket_connected") {
returns(GDbool)

}

func("join_multicast_group") {
returns(GDError)
"multicast_address"(GDString)
"interface_name"(GDString)
}

func("leave_multicast_group") {
returns(GDError)
"multicast_address"(GDString)
"interface_name"(GDString)
}

func("set_broadcast_enabled") {
returns(GDvoid)
"enabled"(GDbool)
}

func("set_dest_address") {
returns(GDError)
"host"(GDString)
"port"(GDint)
}

func("wait") {
returns(GDError)

}
}){

}