
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDWebRTCPeerConnectionExtension: GDType("WebRTCPeerConnectionExtension", {


constructor { }

func("_add_ice_candidate") {
returns(GDError)
"p_sdp_mid_name"(GDString)
"p_sdp_mline_index"(GDint)
"p_sdp_name"(GDString)
}

func("_close") {
returns(GDvoid)

}

func("_create_data_channel") {
returns(GDWebRTCDataChannel)
"p_label"(GDString)
"p_config"(GDDictionary)
}

func("_create_offer") {
returns(GDError)

}

func("_get_connection_state") {
returns(GDConnectionState)

}

func("_get_gathering_state") {
returns(GDGatheringState)

}

func("_get_signaling_state") {
returns(GDSignalingState)

}

func("_initialize") {
returns(GDError)
"p_config"(GDDictionary)
}

func("_poll") {
returns(GDError)

}

func("_set_local_description") {
returns(GDError)
"p_type"(GDString)
"p_sdp"(GDString)
}

func("_set_remote_description") {
returns(GDError)
"p_type"(GDString)
"p_sdp"(GDString)
}
}){

}