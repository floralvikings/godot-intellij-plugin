
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSceneState: GDType("SceneState", {


constructor { }

func("get_connection_binds") {
returns(GDArray)
"idx"(GDint)
}

func("get_connection_count") {
returns(GDint)

}

func("get_connection_flags") {
returns(GDint)
"idx"(GDint)
}

func("get_connection_method") {
returns(GDStringName)
"idx"(GDint)
}

func("get_connection_signal") {
returns(GDStringName)
"idx"(GDint)
}

func("get_connection_source") {
returns(GDNodePath)
"idx"(GDint)
}

func("get_connection_target") {
returns(GDNodePath)
"idx"(GDint)
}

func("get_connection_unbinds") {
returns(GDint)
"idx"(GDint)
}

func("get_node_count") {
returns(GDint)

}

func("get_node_groups") {
returns(GDPackedStringArray)
"idx"(GDint)
}

func("get_node_index") {
returns(GDint)
"idx"(GDint)
}

func("get_node_instance") {
returns(GDPackedScene)
"idx"(GDint)
}

func("get_node_instance_placeholder") {
returns(GDString)
"idx"(GDint)
}

func("get_node_name") {
returns(GDStringName)
"idx"(GDint)
}

func("get_node_owner_path") {
returns(GDNodePath)
"idx"(GDint)
}

func("get_node_path") {
returns(GDNodePath)
"idx"(GDint)
"for_parent"(GDbool)
}

func("get_node_property_count") {
returns(GDint)
"idx"(GDint)
}

func("get_node_property_name") {
returns(GDStringName)
"idx"(GDint)
"prop_idx"(GDint)
}

func("get_node_property_value") {
returns(GDVariant)
"idx"(GDint)
"prop_idx"(GDint)
}

func("get_node_type") {
returns(GDStringName)
"idx"(GDint)
}

func("is_node_instance_placeholder") {
returns(GDbool)
"idx"(GDint)
}
}){

}