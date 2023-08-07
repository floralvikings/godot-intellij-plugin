
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMultiplayerPeerExtension: GDType("MultiplayerPeerExtension", {


constructor { }

func("_close") {
returns(GDvoid)

}

func("_disconnect_peer") {
returns(GDvoid)
"p_peer"(GDint)
"p_force"(GDbool)
}

func("_get_available_packet_count") {
returns(GDint)

}

func("_get_connection_status") {
returns(GDConnectionStatus)

}

func("_get_max_packet_size") {
returns(GDint)

}

func("_get_packet") {
returns(GDError)
"r_buffer_size"(GDUnknownType)
}

func("_get_packet_channel") {
returns(GDint)

}

func("_get_packet_mode") {
returns(GDTransferMode)

}

func("_get_packet_peer") {
returns(GDint)

}

func("_get_packet_script") {
returns(GDPackedByteArray)

}

func("_get_transfer_channel") {
returns(GDint)

}

func("_get_transfer_mode") {
returns(GDTransferMode)

}

func("_get_unique_id") {
returns(GDint)

}

func("_is_refusing_new_connections") {
returns(GDbool)

}

func("_is_server") {
returns(GDbool)

}

func("_is_server_relay_supported") {
returns(GDbool)

}

func("_poll") {
returns(GDvoid)

}

func("_put_packet") {
returns(GDError)
"p_buffer_size"(GDint)
}

func("_put_packet_script") {
returns(GDError)
"p_buffer"(GDPackedByteArray)
}

func("_set_refuse_new_connections") {
returns(GDvoid)
"p_enable"(GDbool)
}

func("_set_target_peer") {
returns(GDvoid)
"p_peer"(GDint)
}

func("_set_transfer_channel") {
returns(GDvoid)
"p_channel"(GDint)
}

func("_set_transfer_mode") {
returns(GDvoid)
"p_mode"(GDTransferMode)
}
}){

}