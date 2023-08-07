
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVisualShader: GDType("VisualShader", {

"graph_offset"(GDVector2)
constructor { }

func("add_node") {
returns(GDvoid)
"type"(GDTypeEnum)
"node"(GDVisualShaderNode)
"position"(GDVector2)
"id"(GDint)
}

func("add_varying") {
returns(GDvoid)
"name"(GDString)
"mode"(GDVaryingMode)
"type"(GDVaryingType)
}

func("can_connect_nodes") {
returns(GDbool)
"type"(GDTypeEnum)
"from_node"(GDint)
"from_port"(GDint)
"to_node"(GDint)
"to_port"(GDint)
}

func("connect_nodes") {
returns(GDError)
"type"(GDTypeEnum)
"from_node"(GDint)
"from_port"(GDint)
"to_node"(GDint)
"to_port"(GDint)
}

func("connect_nodes_forced") {
returns(GDvoid)
"type"(GDTypeEnum)
"from_node"(GDint)
"from_port"(GDint)
"to_node"(GDint)
"to_port"(GDint)
}

func("disconnect_nodes") {
returns(GDvoid)
"type"(GDTypeEnum)
"from_node"(GDint)
"from_port"(GDint)
"to_node"(GDint)
"to_port"(GDint)
}

func("get_node") {
returns(GDVisualShaderNode)
"type"(GDTypeEnum)
"id"(GDint)
}

func("get_node_connections") {
returns(GDTypedArray(GDDictionary::class))
"type"(GDTypeEnum)
}

func("get_node_list") {
returns(GDPackedInt32Array)
"type"(GDTypeEnum)
}

func("get_node_position") {
returns(GDVector2)
"type"(GDTypeEnum)
"id"(GDint)
}

func("get_valid_node_id") {
returns(GDint)
"type"(GDTypeEnum)
}

func("has_varying") {
returns(GDbool)
"name"(GDString)
}

func("is_node_connection") {
returns(GDbool)
"type"(GDTypeEnum)
"from_node"(GDint)
"from_port"(GDint)
"to_node"(GDint)
"to_port"(GDint)
}

func("remove_node") {
returns(GDvoid)
"type"(GDTypeEnum)
"id"(GDint)
}

func("remove_varying") {
returns(GDvoid)
"name"(GDString)
}

func("replace_node") {
returns(GDvoid)
"type"(GDTypeEnum)
"id"(GDint)
"new_class"(GDStringName)
}

func("set_mode") {
returns(GDvoid)
"mode"(GDMode)
}

func("set_node_position") {
returns(GDvoid)
"type"(GDTypeEnum)
"id"(GDint)
"position"(GDVector2)
}
}){

}