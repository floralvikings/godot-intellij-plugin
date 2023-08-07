
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDInputEventWithModifiers: GDType("InputEventWithModifiers", {

"alt_pressed"(GDbool)
"command_or_control_autoremap"(GDbool)
"ctrl_pressed"(GDbool)
"meta_pressed"(GDbool)
"shift_pressed"(GDbool)
constructor { }

func("get_modifiers_mask") {
returns(GDUnknownType)

}

func("is_command_or_control_pressed") {
returns(GDbool)

}
}){

}