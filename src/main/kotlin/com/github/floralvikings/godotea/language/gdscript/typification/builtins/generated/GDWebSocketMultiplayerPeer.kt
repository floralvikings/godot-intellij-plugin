
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDWebSocketMultiplayerPeer: GDType("WebSocketMultiplayerPeer", {

"handshake_headers"(GDPackedStringArray)
"handshake_timeout"(GDfloat)
"inbound_buffer_size"(GDint)
"max_queued_packets"(GDint)
"outbound_buffer_size"(GDint)
"supported_protocols"(GDPackedStringArray)
constructor { }

func("create_client") {
returns(GDError)
"url"(GDString)
"tls_client_options"(GDTLSOptions)
}

func("create_server") {
returns(GDError)
"port"(GDint)
"bind_address"(GDString)
"tls_server_options"(GDTLSOptions)
}

func("get_peer") {
returns(GDWebSocketPeer)
"peer_id"(GDint)
}

func("get_peer_address") {
returns(GDString)
"id"(GDint)
}

func("get_peer_port") {
returns(GDint)
"id"(GDint)
}
}){

}