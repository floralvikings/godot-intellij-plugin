
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDUDPServer: GDType("UDPServer", {

"max_pending_connections"(GDint)
constructor { }

func("get_local_port") {
returns(GDint)

}

func("is_connection_available") {
returns(GDbool)

}

func("is_listening") {
returns(GDbool)

}

func("listen") {
returns(GDError)
"port"(GDint)
"bind_address"(GDString)
}

func("poll") {
returns(GDError)

}

func("stop") {
returns(GDvoid)

}

func("take_connection") {
returns(GDPacketPeerUDP)

}
}){

}