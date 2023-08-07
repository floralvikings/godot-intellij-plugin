
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMultiplayerAPI: GDType("MultiplayerAPI", {

"multiplayer_peer"(GDMultiplayerPeer)
constructor { }

func("create_default_interface") {
returns(GDSameType)

}

func("get_default_interface") {
returns(GDStringName)

}

func("get_peers") {
returns(GDPackedInt32Array)

}

func("get_remote_sender_id") {
returns(GDint)

}

func("get_unique_id") {
returns(GDint)

}

func("has_multiplayer_peer") {
returns(GDbool)

}

func("is_server") {
returns(GDbool)

}

func("object_configuration_add") {
returns(GDError)
"object"(GDObject)
"configuration"(GDVariant)
}

func("object_configuration_remove") {
returns(GDError)
"object"(GDObject)
"configuration"(GDVariant)
}

func("poll") {
returns(GDError)

}

func("rpc") {
returns(GDError)
"peer"(GDint)
"object"(GDObject)
"method"(GDStringName)
"arguments"(GDArray)
}

func("set_default_interface") {
returns(GDvoid)
"interface_name"(GDStringName)
}
}){

}