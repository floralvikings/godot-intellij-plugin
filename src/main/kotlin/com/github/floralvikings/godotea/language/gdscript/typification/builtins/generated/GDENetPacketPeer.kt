
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDENetPacketPeer: GDType("ENetPacketPeer", {


constructor { }

func("get_channels") {
returns(GDint)

}

func("get_remote_address") {
returns(GDString)

}

func("get_remote_port") {
returns(GDint)

}

func("get_state") {
returns(GDPeerState)

}

func("get_statistic") {
returns(GDfloat)
"statistic"(GDPeerStatistic)
}

func("is_active") {
returns(GDbool)

}

func("peer_disconnect") {
returns(GDvoid)
"data"(GDint)
}

func("peer_disconnect_later") {
returns(GDvoid)
"data"(GDint)
}

func("peer_disconnect_now") {
returns(GDvoid)
"data"(GDint)
}

func("ping") {
returns(GDvoid)

}

func("ping_interval") {
returns(GDvoid)
"ping_interval"(GDint)
}

func("reset") {
returns(GDvoid)

}

func("send") {
returns(GDError)
"channel"(GDint)
"packet"(GDPackedByteArray)
"flags"(GDint)
}

func("set_timeout") {
returns(GDvoid)
"timeout"(GDint)
"timeout_min"(GDint)
"timeout_max"(GDint)
}

func("throttle_configure") {
returns(GDvoid)
"interval"(GDint)
"acceleration"(GDint)
"deceleration"(GDint)
}
}){

}