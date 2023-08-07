
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMultiplayerAPIExtension: GDType("MultiplayerAPIExtension", {


constructor { }

func("_get_multiplayer_peer") {
returns(GDMultiplayerPeer)

}

func("_get_peer_ids") {
returns(GDPackedInt32Array)

}

func("_get_remote_sender_id") {
returns(GDint)

}

func("_get_unique_id") {
returns(GDint)

}

func("_object_configuration_add") {
returns(GDError)
"object"(GDObject)
"configuration"(GDVariant)
}

func("_object_configuration_remove") {
returns(GDError)
"object"(GDObject)
"configuration"(GDVariant)
}

func("_poll") {
returns(GDError)

}

func("_rpc") {
returns(GDError)
"peer"(GDint)
"object"(GDObject)
"method"(GDStringName)
"args"(GDArray)
}

func("_set_multiplayer_peer") {
returns(GDvoid)
"multiplayer_peer"(GDMultiplayerPeer)
}
}){

}