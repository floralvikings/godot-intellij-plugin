
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimationNodeStateMachine: GDType("AnimationNodeStateMachine", {

"allow_transition_to_self"(GDbool)
"reset_ends"(GDbool)
"state_machine_type"(GDStateMachineType)
constructor { }

func("add_node") {
returns(GDvoid)
"name"(GDStringName)
"node"(GDAnimationNode)
"position"(GDVector2)
}

func("add_transition") {
returns(GDvoid)
"from"(GDStringName)
"to"(GDStringName)
"transition"(GDAnimationNodeStateMachineTransition)
}

func("get_graph_offset") {
returns(GDVector2)

}

func("get_node") {
returns(GDAnimationNode)
"name"(GDStringName)
}

func("get_node_name") {
returns(GDStringName)
"node"(GDAnimationNode)
}

func("get_node_position") {
returns(GDVector2)
"name"(GDStringName)
}

func("get_transition") {
returns(GDAnimationNodeStateMachineTransition)
"idx"(GDint)
}

func("get_transition_count") {
returns(GDint)

}

func("get_transition_from") {
returns(GDStringName)
"idx"(GDint)
}

func("get_transition_to") {
returns(GDStringName)
"idx"(GDint)
}

func("has_node") {
returns(GDbool)
"name"(GDStringName)
}

func("has_transition") {
returns(GDbool)
"from"(GDStringName)
"to"(GDStringName)
}

func("remove_node") {
returns(GDvoid)
"name"(GDStringName)
}

func("remove_transition") {
returns(GDvoid)
"from"(GDStringName)
"to"(GDStringName)
}

func("remove_transition_by_index") {
returns(GDvoid)
"idx"(GDint)
}

func("rename_node") {
returns(GDvoid)
"name"(GDStringName)
"new_name"(GDStringName)
}

func("replace_node") {
returns(GDvoid)
"name"(GDStringName)
"node"(GDAnimationNode)
}

func("set_graph_offset") {
returns(GDvoid)
"offset"(GDVector2)
}

func("set_node_position") {
returns(GDvoid)
"name"(GDStringName)
"position"(GDVector2)
}
}){

}