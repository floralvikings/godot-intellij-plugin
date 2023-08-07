
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDConfirmationDialog: GDType("ConfirmationDialog", {

"cancel_button_text"(GDString)
"min_size"(GDVector2i)
"size"(GDVector2i)
"title"(GDString)
constructor { }

func("get_cancel_button") {
returns(GDButton)

}
}){

}