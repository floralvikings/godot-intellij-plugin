
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDWebRTCMultiplayerPeer: GDType("WebRTCMultiplayerPeer", {


constructor { }

func("add_peer") {
returns(GDError)
"peer"(GDWebRTCPeerConnection)
"peer_id"(GDint)
"unreliable_lifetime"(GDint)
}

func("create_client") {
returns(GDError)
"peer_id"(GDint)
"channels_config"(GDArray)
}

func("create_mesh") {
returns(GDError)
"peer_id"(GDint)
"channels_config"(GDArray)
}

func("create_server") {
returns(GDError)
"channels_config"(GDArray)
}

func("get_peer") {
returns(GDDictionary)
"peer_id"(GDint)
}

func("get_peers") {
returns(GDDictionary)

}

func("has_peer") {
returns(GDbool)
"peer_id"(GDint)
}

func("remove_peer") {
returns(GDvoid)
"peer_id"(GDint)
}
}){

}