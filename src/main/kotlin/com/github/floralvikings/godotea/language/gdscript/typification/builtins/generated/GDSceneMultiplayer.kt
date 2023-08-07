
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSceneMultiplayer: GDType("SceneMultiplayer", {

"allow_object_decoding"(GDbool)
"auth_callback"(GDCallable)
"auth_timeout"(GDfloat)
"max_delta_packet_size"(GDint)
"max_sync_packet_size"(GDint)
"refuse_new_connections"(GDbool)
"root_path"(GDNodePath)
"server_relay"(GDbool)
constructor { }

func("clear") {
returns(GDvoid)

}

func("complete_auth") {
returns(GDError)
"id"(GDint)
}

func("disconnect_peer") {
returns(GDvoid)
"id"(GDint)
}

func("get_authenticating_peers") {
returns(GDPackedInt32Array)

}

func("send_auth") {
returns(GDError)
"id"(GDint)
"data"(GDPackedByteArray)
}

func("send_bytes") {
returns(GDError)
"bytes"(GDPackedByteArray)
"id"(GDint)
"mode"(GDTransferMode)
"channel"(GDint)
}
}){

}