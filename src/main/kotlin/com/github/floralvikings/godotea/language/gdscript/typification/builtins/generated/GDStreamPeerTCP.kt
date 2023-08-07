
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDStreamPeerTCP: GDType("StreamPeerTCP", {


constructor { }

func("bind") {
returns(GDError)
"port"(GDint)
"host"(GDString)
}

func("connect_to_host") {
returns(GDError)
"host"(GDString)
"port"(GDint)
}

func("disconnect_from_host") {
returns(GDvoid)

}

func("get_connected_host") {
returns(GDString)

}

func("get_connected_port") {
returns(GDint)

}

func("get_local_port") {
returns(GDint)

}

func("get_status") {
returns(GDStatus)

}

func("poll") {
returns(GDError)

}

func("set_no_delay") {
returns(GDvoid)
"enabled"(GDbool)
}
}){

}