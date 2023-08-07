
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDWebRTCPeerConnection: GDType("WebRTCPeerConnection", {


constructor { }

func("add_ice_candidate") {
returns(GDError)
"media"(GDString)
"index"(GDint)
"name"(GDString)
}

func("close") {
returns(GDvoid)

}

func("create_data_channel") {
returns(GDWebRTCDataChannel)
"label"(GDString)
"options"(GDDictionary)
}

func("create_offer") {
returns(GDError)

}

func("get_connection_state") {
returns(GDConnectionState)

}

func("get_gathering_state") {
returns(GDGatheringState)

}

func("get_signaling_state") {
returns(GDSignalingState)

}

func("initialize") {
returns(GDError)
"configuration"(GDDictionary)
}

func("poll") {
returns(GDError)

}

func("set_default_extension") {
returns(GDvoid)
"extension_class"(GDStringName)
}

func("set_local_description") {
returns(GDError)
"type"(GDString)
"sdp"(GDString)
}

func("set_remote_description") {
returns(GDError)
"type"(GDString)
"sdp"(GDString)
}
}){

}