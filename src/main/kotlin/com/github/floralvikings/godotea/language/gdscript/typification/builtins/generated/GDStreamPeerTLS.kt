
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDStreamPeerTLS: GDType("StreamPeerTLS", {


constructor { }

func("accept_stream") {
returns(GDError)
"stream"(GDStreamPeer)
"server_options"(GDTLSOptions)
}

func("connect_to_stream") {
returns(GDError)
"stream"(GDStreamPeer)
"common_name"(GDString)
"client_options"(GDTLSOptions)
}

func("disconnect_from_stream") {
returns(GDvoid)

}

func("get_status") {
returns(GDStatus)

}

func("get_stream") {
returns(GDStreamPeer)

}

func("poll") {
returns(GDvoid)

}
}){

}