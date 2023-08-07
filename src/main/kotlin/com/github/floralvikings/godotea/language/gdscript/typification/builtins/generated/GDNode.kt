
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNode: GDType("Node", {

"editor_description"(GDString)
"multiplayer"(GDMultiplayerAPI)
"name"(GDStringName)
"owner"(GDSameType)
"process_mode"(GDProcessMode)
"process_physics_priority"(GDint)
"process_priority"(GDint)
"process_thread_group"(GDProcessThreadGroup)
"process_thread_group_order"(GDint)
"process_thread_messages"(GDUnknownType)
"scene_file_path"(GDString)
"unique_name_in_owner"(GDbool)
constructor { }

func("_enter_tree") {
returns(GDvoid)

}

func("_exit_tree") {
returns(GDvoid)

}

func("_get_configuration_warnings") {
returns(GDPackedStringArray)

}

func("_input") {
returns(GDvoid)
"event"(GDInputEvent)
}

func("_physics_process") {
returns(GDvoid)
"delta"(GDfloat)
}

func("_process") {
returns(GDvoid)
"delta"(GDfloat)
}

func("_ready") {
returns(GDvoid)

}

func("_shortcut_input") {
returns(GDvoid)
"event"(GDInputEvent)
}

func("_unhandled_input") {
returns(GDvoid)
"event"(GDInputEvent)
}

func("_unhandled_key_input") {
returns(GDvoid)
"event"(GDInputEvent)
}

func("add_child") {
returns(GDvoid)
"node"(GDSameType)
"force_readable_name"(GDbool)
"internal"(GDInternalMode)
}

func("add_sibling") {
returns(GDvoid)
"sibling"(GDSameType)
"force_readable_name"(GDbool)
}

func("add_to_group") {
returns(GDvoid)
"group"(GDStringName)
"persistent"(GDbool)
}

func("call_deferred_thread_group") {
returns(GDVariant)
"method"(GDStringName)
}

func("call_thread_safe") {
returns(GDVariant)
"method"(GDStringName)
}

func("can_process") {
returns(GDbool)

}

func("create_tween") {
returns(GDTween)

}

func("duplicate") {
returns(GDSameType)
"flags"(GDint)
}

func("find_child") {
returns(GDSameType)
"pattern"(GDString)
"recursive"(GDbool)
"owned"(GDbool)
}

func("find_children") {
returns(GDTypedArray(GDSameType::class))
"pattern"(GDString)
"type"(GDString)
"recursive"(GDbool)
"owned"(GDbool)
}

func("find_parent") {
returns(GDSameType)
"pattern"(GDString)
}

func("get_child") {
returns(GDSameType)
"idx"(GDint)
"include_internal"(GDbool)
}

func("get_child_count") {
returns(GDint)
"include_internal"(GDbool)
}

func("get_children") {
returns(GDTypedArray(GDSameType::class))
"include_internal"(GDbool)
}

func("get_groups") {
returns(GDTypedArray(GDStringName::class))

}

func("get_index") {
returns(GDint)
"include_internal"(GDbool)
}

func("get_last_exclusive_window") {
returns(GDWindow)

}

func("get_multiplayer_authority") {
returns(GDint)

}

func("get_node") {
returns(GDSameType)
"path"(GDNodePath)
}

func("get_node_and_resource") {
returns(GDArray)
"path"(GDNodePath)
}

func("get_node_or_null") {
returns(GDSameType)
"path"(GDNodePath)
}

func("get_parent") {
returns(GDSameType)

}

func("get_path") {
returns(GDNodePath)

}

func("get_path_to") {
returns(GDNodePath)
"node"(GDSameType)
"use_unique_path"(GDbool)
}

func("get_physics_process_delta_time") {
returns(GDfloat)

}

func("get_process_delta_time") {
returns(GDfloat)

}

func("get_scene_instance_load_placeholder") {
returns(GDbool)

}

func("get_tree") {
returns(GDSceneTree)

}

func("get_viewport") {
returns(GDViewport)

}

func("get_window") {
returns(GDWindow)

}

func("has_node") {
returns(GDbool)
"path"(GDNodePath)
}

func("has_node_and_resource") {
returns(GDbool)
"path"(GDNodePath)
}

func("is_ancestor_of") {
returns(GDbool)
"node"(GDSameType)
}

func("is_displayed_folded") {
returns(GDbool)

}

func("is_editable_instance") {
returns(GDbool)
"node"(GDSameType)
}

func("is_greater_than") {
returns(GDbool)
"node"(GDSameType)
}

func("is_in_group") {
returns(GDbool)
"group"(GDStringName)
}

func("is_inside_tree") {
returns(GDbool)

}

func("is_multiplayer_authority") {
returns(GDbool)

}

func("is_node_ready") {
returns(GDbool)

}

func("is_physics_processing") {
returns(GDbool)

}

func("is_physics_processing_internal") {
returns(GDbool)

}

func("is_processing") {
returns(GDbool)

}

func("is_processing_input") {
returns(GDbool)

}

func("is_processing_internal") {
returns(GDbool)

}

func("is_processing_shortcut_input") {
returns(GDbool)

}

func("is_processing_unhandled_input") {
returns(GDbool)

}

func("is_processing_unhandled_key_input") {
returns(GDbool)

}

func("move_child") {
returns(GDvoid)
"child_node"(GDSameType)
"to_index"(GDint)
}

func("notify_deferred_thread_group") {
returns(GDvoid)
"what"(GDint)
}

func("notify_thread_safe") {
returns(GDvoid)
"what"(GDint)
}

func("print_orphan_nodes") {
returns(GDvoid)

}

func("print_tree") {
returns(GDvoid)

}

func("print_tree_pretty") {
returns(GDvoid)

}

func("propagate_call") {
returns(GDvoid)
"method"(GDStringName)
"args"(GDArray)
"parent_first"(GDbool)
}

func("propagate_notification") {
returns(GDvoid)
"what"(GDint)
}

func("queue_free") {
returns(GDvoid)

}

func("remove_child") {
returns(GDvoid)
"node"(GDSameType)
}

func("remove_from_group") {
returns(GDvoid)
"group"(GDStringName)
}

func("reparent") {
returns(GDvoid)
"new_parent"(GDSameType)
"keep_global_transform"(GDbool)
}

func("replace_by") {
returns(GDvoid)
"node"(GDSameType)
"keep_groups"(GDbool)
}

func("request_ready") {
returns(GDvoid)

}

func("rpc") {
returns(GDError)
"method"(GDStringName)
}

func("rpc_config") {
returns(GDvoid)
"method"(GDStringName)
"config"(GDVariant)
}

func("rpc_id") {
returns(GDError)
"peer_id"(GDint)
"method"(GDStringName)
}

func("set_deferred_thread_group") {
returns(GDvoid)
"property"(GDStringName)
"value"(GDVariant)
}

func("set_display_folded") {
returns(GDvoid)
"fold"(GDbool)
}

func("set_editable_instance") {
returns(GDvoid)
"node"(GDSameType)
"is_editable"(GDbool)
}

func("set_multiplayer_authority") {
returns(GDvoid)
"id"(GDint)
"recursive"(GDbool)
}

func("set_physics_process") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_physics_process_internal") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_process") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_process_input") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_process_internal") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_process_shortcut_input") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_process_unhandled_input") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_process_unhandled_key_input") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_scene_instance_load_placeholder") {
returns(GDvoid)
"load_placeholder"(GDbool)
}

func("set_thread_safe") {
returns(GDvoid)
"property"(GDStringName)
"value"(GDVariant)
}

func("update_configuration_warnings") {
returns(GDvoid)

}
}){

}