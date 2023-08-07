
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDENetConnection: GDType("ENetConnection", {


constructor { }

func("bandwidth_limit") {
returns(GDvoid)
"in_bandwidth"(GDint)
"out_bandwidth"(GDint)
}

func("broadcast") {
returns(GDvoid)
"channel"(GDint)
"packet"(GDPackedByteArray)
"flags"(GDint)
}

func("channel_limit") {
returns(GDvoid)
"limit"(GDint)
}

func("compress") {
returns(GDvoid)
"mode"(GDCompressionMode)
}

func("connect_to_host") {
returns(GDENetPacketPeer)
"address"(GDString)
"port"(GDint)
"channels"(GDint)
"data"(GDint)
}

func("create_host") {
returns(GDError)
"max_peers"(GDint)
"max_channels"(GDint)
"in_bandwidth"(GDint)
"out_bandwidth"(GDint)
}

func("create_host_bound") {
returns(GDError)
"bind_address"(GDString)
"bind_port"(GDint)
"max_peers"(GDint)
"max_channels"(GDint)
"in_bandwidth"(GDint)
"out_bandwidth"(GDint)
}

func("destroy") {
returns(GDvoid)

}

func("dtls_client_setup") {
returns(GDError)
"hostname"(GDString)
"client_options"(GDTLSOptions)
}

func("dtls_server_setup") {
returns(GDError)
"server_options"(GDTLSOptions)
}

func("flush") {
returns(GDvoid)

}

func("get_local_port") {
returns(GDint)

}

func("get_max_channels") {
returns(GDint)

}

func("get_peers") {
returns(GDTypedArray(GDENetPacketPeer::class))

}

func("pop_statistic") {
returns(GDfloat)
"statistic"(GDHostStatistic)
}

func("refuse_new_connections") {
returns(GDvoid)
"refuse"(GDbool)
}

func("service") {
returns(GDArray)
"timeout"(GDint)
}

func("socket_send") {
returns(GDvoid)
"destination_address"(GDString)
"destination_port"(GDint)
"packet"(GDPackedByteArray)
}
}){

}