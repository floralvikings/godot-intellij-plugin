
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDOpenXRInterface: GDType("OpenXRInterface", {

"display_refresh_rate"(GDfloat)
"render_target_size_multiplier"(GDfloat)
constructor { }

func("get_action_sets") {
returns(GDArray)

}

func("get_available_display_refresh_rates") {
returns(GDArray)

}

func("is_action_set_active") {
returns(GDbool)
"name"(GDString)
}

func("set_action_set_active") {
returns(GDvoid)
"name"(GDString)
"active"(GDbool)
}
}){

}