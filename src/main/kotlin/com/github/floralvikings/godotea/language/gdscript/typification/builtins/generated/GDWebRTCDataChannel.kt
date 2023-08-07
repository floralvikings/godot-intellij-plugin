
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDWebRTCDataChannel: GDType("WebRTCDataChannel", {

"write_mode"(GDWriteMode)
constructor { }

func("close") {
returns(GDvoid)

}

func("get_buffered_amount") {
returns(GDint)

}

func("get_id") {
returns(GDint)

}

func("get_label") {
returns(GDString)

}

func("get_max_packet_life_time") {
returns(GDint)

}

func("get_max_retransmits") {
returns(GDint)

}

func("get_protocol") {
returns(GDString)

}

func("get_ready_state") {
returns(GDChannelState)

}

func("is_negotiated") {
returns(GDbool)

}

func("is_ordered") {
returns(GDbool)

}

func("poll") {
returns(GDError)

}

func("was_string_packet") {
returns(GDbool)

}
}){

}