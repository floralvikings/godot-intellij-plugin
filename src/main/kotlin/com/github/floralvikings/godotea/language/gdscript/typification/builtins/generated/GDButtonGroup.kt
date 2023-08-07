
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDButtonGroup: GDType("ButtonGroup", {

"allow_unpress"(GDbool)
"resource_local_to_scene"(GDbool)
constructor { }

func("get_buttons") {
returns(GDTypedArray(GDBaseButton::class))

}

func("get_pressed_button") {
returns(GDBaseButton)

}
}){

}