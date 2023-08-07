
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorSelection: GDType("EditorSelection", {


constructor { }

func("add_node") {
returns(GDvoid)
"node"(GDNode)
}

func("clear") {
returns(GDvoid)

}

func("get_selected_nodes") {
returns(GDTypedArray(GDNode::class))

}

func("get_transformable_selected_nodes") {
returns(GDTypedArray(GDNode::class))

}

func("remove_node") {
returns(GDvoid)
"node"(GDNode)
}
}){

}