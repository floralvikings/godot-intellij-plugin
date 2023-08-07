
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMultiplayerSynchronizer: GDType("MultiplayerSynchronizer", {

"delta_interval"(GDfloat)
"public_visibility"(GDbool)
"replication_config"(GDSceneReplicationConfig)
"replication_interval"(GDfloat)
"root_path"(GDNodePath)
"visibility_update_mode"(GDVisibilityUpdateMode)
constructor { }

func("add_visibility_filter") {
returns(GDvoid)
"filter"(GDCallable)
}

func("get_visibility_for") {
returns(GDbool)
"peer"(GDint)
}

func("remove_visibility_filter") {
returns(GDvoid)
"filter"(GDCallable)
}

func("set_visibility_for") {
returns(GDvoid)
"peer"(GDint)
"visible"(GDbool)
}

func("update_visibility") {
returns(GDvoid)
"for_peer"(GDint)
}
}){

}