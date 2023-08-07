
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSceneTree: GDType("SceneTree", {

"auto_accept_quit"(GDbool)
"current_scene"(GDNode)
"debug_collisions_hint"(GDbool)
"debug_navigation_hint"(GDbool)
"debug_paths_hint"(GDbool)
"edited_scene_root"(GDNode)
"multiplayer_poll"(GDbool)
"paused"(GDbool)
"quit_on_go_back"(GDbool)
"root"(GDWindow)
constructor { }

func("call_group") {
returns(GDvoid)
"group"(GDStringName)
"method"(GDStringName)
}

func("call_group_flags") {
returns(GDvoid)
"flags"(GDint)
"group"(GDStringName)
"method"(GDStringName)
}

func("change_scene_to_file") {
returns(GDError)
"path"(GDString)
}

func("change_scene_to_packed") {
returns(GDError)
"packed_scene"(GDPackedScene)
}

func("create_timer") {
returns(GDSceneTreeTimer)
"time_sec"(GDfloat)
"process_always"(GDbool)
"process_in_physics"(GDbool)
"ignore_time_scale"(GDbool)
}

func("create_tween") {
returns(GDTween)

}

func("get_first_node_in_group") {
returns(GDNode)
"group"(GDStringName)
}

func("get_frame") {
returns(GDint)

}

func("get_multiplayer") {
returns(GDMultiplayerAPI)
"for_path"(GDNodePath)
}

func("get_node_count") {
returns(GDint)

}

func("get_nodes_in_group") {
returns(GDTypedArray(GDNode::class))
"group"(GDStringName)
}

func("get_processed_tweens") {
returns(GDTypedArray(GDTween::class))

}

func("has_group") {
returns(GDbool)
"name"(GDStringName)
}

func("notify_group") {
returns(GDvoid)
"group"(GDStringName)
"notification"(GDint)
}

func("notify_group_flags") {
returns(GDvoid)
"call_flags"(GDint)
"group"(GDStringName)
"notification"(GDint)
}

func("queue_delete") {
returns(GDvoid)
"obj"(GDObject)
}

func("quit") {
returns(GDvoid)
"exit_code"(GDint)
}

func("reload_current_scene") {
returns(GDError)

}

func("set_group") {
returns(GDvoid)
"group"(GDStringName)
"property"(GDString)
"value"(GDVariant)
}

func("set_group_flags") {
returns(GDvoid)
"call_flags"(GDint)
"group"(GDStringName)
"property"(GDString)
"value"(GDVariant)
}

func("set_multiplayer") {
returns(GDvoid)
"multiplayer"(GDMultiplayerAPI)
"root_path"(GDNodePath)
}

func("unload_current_scene") {
returns(GDvoid)

}
}){

}