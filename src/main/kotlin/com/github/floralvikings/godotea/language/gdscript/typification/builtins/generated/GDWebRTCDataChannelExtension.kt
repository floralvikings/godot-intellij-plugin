
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDWebRTCDataChannelExtension: GDType("WebRTCDataChannelExtension", {


constructor { }

func("_close") {
returns(GDvoid)

}

func("_get_available_packet_count") {
returns(GDint)

}

func("_get_buffered_amount") {
returns(GDint)

}

func("_get_id") {
returns(GDint)

}

func("_get_label") {
returns(GDString)

}

func("_get_max_packet_life_time") {
returns(GDint)

}

func("_get_max_packet_size") {
returns(GDint)

}

func("_get_max_retransmits") {
returns(GDint)

}

func("_get_packet") {
returns(GDError)
"r_buffer_size"(GDUnknownType)
}

func("_get_protocol") {
returns(GDString)

}

func("_get_ready_state") {
returns(GDChannelState)

}

func("_get_write_mode") {
returns(GDWriteMode)

}

func("_is_negotiated") {
returns(GDbool)

}

func("_is_ordered") {
returns(GDbool)

}

func("_poll") {
returns(GDError)

}

func("_put_packet") {
returns(GDError)
"p_buffer_size"(GDint)
}

func("_set_write_mode") {
returns(GDvoid)
"p_write_mode"(GDWriteMode)
}

func("_was_string_packet") {
returns(GDbool)

}
}){

}