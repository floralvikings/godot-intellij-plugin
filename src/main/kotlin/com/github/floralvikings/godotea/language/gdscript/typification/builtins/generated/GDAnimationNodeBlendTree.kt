
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimationNodeBlendTree: GDType("AnimationNodeBlendTree", {

"graph_offset"(GDVector2)
constructor { }

func("add_node") {
returns(GDvoid)
"name"(GDStringName)
"node"(GDAnimationNode)
"position"(GDVector2)
}

func("connect_node") {
returns(GDvoid)
"input_node"(GDStringName)
"input_index"(GDint)
"output_node"(GDStringName)
}

func("disconnect_node") {
returns(GDvoid)
"input_node"(GDStringName)
"input_index"(GDint)
}

func("get_node") {
returns(GDAnimationNode)
"name"(GDStringName)
}

func("get_node_position") {
returns(GDVector2)
"name"(GDStringName)
}

func("has_node") {
returns(GDbool)
"name"(GDStringName)
}

func("remove_node") {
returns(GDvoid)
"name"(GDStringName)
}

func("rename_node") {
returns(GDvoid)
"name"(GDStringName)
"new_name"(GDStringName)
}

func("set_node_position") {
returns(GDvoid)
"name"(GDStringName)
"position"(GDVector2)
}
}){

}