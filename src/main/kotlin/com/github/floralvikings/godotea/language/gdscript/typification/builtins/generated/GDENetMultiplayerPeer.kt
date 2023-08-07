
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDENetMultiplayerPeer: GDType("ENetMultiplayerPeer", {

"host"(GDENetConnection)
constructor { }

func("add_mesh_peer") {
returns(GDError)
"peer_id"(GDint)
"host"(GDENetConnection)
}

func("create_client") {
returns(GDError)
"address"(GDString)
"port"(GDint)
"channel_count"(GDint)
"in_bandwidth"(GDint)
"out_bandwidth"(GDint)
"local_port"(GDint)
}

func("create_mesh") {
returns(GDError)
"unique_id"(GDint)
}

func("create_server") {
returns(GDError)
"port"(GDint)
"max_clients"(GDint)
"max_channels"(GDint)
"in_bandwidth"(GDint)
"out_bandwidth"(GDint)
}

func("get_peer") {
returns(GDENetPacketPeer)
"id"(GDint)
}

func("set_bind_ip") {
returns(GDvoid)
"ip"(GDString)
}
}){

}