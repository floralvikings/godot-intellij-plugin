
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDInstancePlaceholder: GDType("InstancePlaceholder", {


constructor { }

func("create_instance") {
returns(GDNode)
"replace"(GDbool)
"custom_scene"(GDPackedScene)
}

func("get_instance_path") {
returns(GDString)

}

func("get_stored_values") {
returns(GDDictionary)
"with_order"(GDbool)
}
}){

}