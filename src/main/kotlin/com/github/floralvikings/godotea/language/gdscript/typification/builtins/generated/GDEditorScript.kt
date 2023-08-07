
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorScript: GDType("EditorScript", {


constructor { }

func("_run") {
returns(GDvoid)

}

func("add_root_node") {
returns(GDvoid)
"node"(GDNode)
}

func("get_editor_interface") {
returns(GDEditorInterface)

}

func("get_scene") {
returns(GDNode)

}
}){

}