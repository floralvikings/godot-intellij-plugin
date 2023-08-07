
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDBoxContainer: GDType("BoxContainer", {

"separation"(GDint)
"alignment"(GDAlignmentMode)
"vertical"(GDbool)
constructor { }

func("add_spacer") {
returns(GDControl)
"begin"(GDbool)
}
}){

}