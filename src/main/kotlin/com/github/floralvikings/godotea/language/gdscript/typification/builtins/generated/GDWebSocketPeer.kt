
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDWebSocketPeer: GDType("WebSocketPeer", {

"handshake_headers"(GDPackedStringArray)
"inbound_buffer_size"(GDint)
"max_queued_packets"(GDint)
"outbound_buffer_size"(GDint)
"supported_protocols"(GDPackedStringArray)
constructor { }

func("accept_stream") {
returns(GDError)
"stream"(GDStreamPeer)
}

func("close") {
returns(GDvoid)
"code"(GDint)
"reason"(GDString)
}

func("connect_to_url") {
returns(GDError)
"url"(GDString)
"tls_client_options"(GDTLSOptions)
}

func("get_close_code") {
returns(GDint)

}

func("get_close_reason") {
returns(GDString)

}

func("get_connected_host") {
returns(GDString)

}

func("get_connected_port") {
returns(GDint)

}

func("get_current_outbound_buffered_amount") {
returns(GDint)

}

func("get_ready_state") {
returns(GDState)

}

func("get_requested_url") {
returns(GDString)

}

func("get_selected_protocol") {
returns(GDString)

}

func("poll") {
returns(GDvoid)

}

func("send") {
returns(GDError)
"message"(GDPackedByteArray)
"write_mode"(GDWriteMode)
}

func("send_text") {
returns(GDError)
"message"(GDString)
}

func("set_no_delay") {
returns(GDvoid)
"enabled"(GDbool)
}

func("was_string_packet") {
returns(GDbool)

}
}){

}