
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMultiplayerPeer: GDType("MultiplayerPeer", {

"refuse_new_connections"(GDbool)
"transfer_channel"(GDint)
"transfer_mode"(GDTransferMode)
constructor { }

func("close") {
returns(GDvoid)

}

func("disconnect_peer") {
returns(GDvoid)
"peer"(GDint)
"force"(GDbool)
}

func("generate_unique_id") {
returns(GDint)

}

func("get_connection_status") {
returns(GDConnectionStatus)

}

func("get_packet_channel") {
returns(GDint)

}

func("get_packet_mode") {
returns(GDTransferMode)

}

func("get_packet_peer") {
returns(GDint)

}

func("get_unique_id") {
returns(GDint)

}

func("is_server_relay_supported") {
returns(GDbool)

}

func("poll") {
returns(GDvoid)

}

func("set_target_peer") {
returns(GDvoid)
"id"(GDint)
}
}){

}