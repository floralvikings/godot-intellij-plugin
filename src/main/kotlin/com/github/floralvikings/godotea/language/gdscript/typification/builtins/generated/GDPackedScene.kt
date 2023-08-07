
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPackedScene: GDType("PackedScene", {

"_bundled"(GDDictionary)
constructor { }

func("can_instantiate") {
returns(GDbool)

}

func("get_state") {
returns(GDSceneState)

}

func("instantiate") {
returns(GDNode)
"edit_state"(GDGenEditState)
}

func("pack") {
returns(GDError)
"path"(GDNode)
}
}){

}