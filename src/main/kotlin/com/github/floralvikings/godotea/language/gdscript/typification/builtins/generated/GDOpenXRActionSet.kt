
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDOpenXRActionSet: GDType("OpenXRActionSet", {

"actions"(GDArray)
"localized_name"(GDString)
"priority"(GDint)
constructor { }

func("add_action") {
returns(GDvoid)
"action"(GDOpenXRAction)
}

func("get_action_count") {
returns(GDint)

}

func("remove_action") {
returns(GDvoid)
"action"(GDOpenXRAction)
}
}){

}