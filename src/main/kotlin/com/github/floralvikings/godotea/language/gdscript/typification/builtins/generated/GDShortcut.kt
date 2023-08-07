
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDShortcut: GDType("Shortcut", {

"events"(GDArray)
constructor { }

func("get_as_text") {
returns(GDString)

}

func("has_valid_event") {
returns(GDbool)

}

func("matches_event") {
returns(GDbool)
"event"(GDInputEvent)
}
}){

}