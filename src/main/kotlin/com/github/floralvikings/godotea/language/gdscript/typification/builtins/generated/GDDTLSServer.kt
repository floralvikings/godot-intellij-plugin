
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDDTLSServer: GDType("DTLSServer", {


constructor { }

func("setup") {
returns(GDError)
"server_options"(GDTLSOptions)
}

func("take_connection") {
returns(GDPacketPeerDTLS)
"udp_peer"(GDPacketPeerUDP)
}
}){

}