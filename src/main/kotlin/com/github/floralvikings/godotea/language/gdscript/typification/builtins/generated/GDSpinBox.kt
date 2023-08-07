
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSpinBox: GDType("SpinBox", {

"updown"(GDTexture2D)
"alignment"(GDHorizontalAlignment)
"custom_arrow_step"(GDfloat)
"editable"(GDbool)
"prefix"(GDString)
"select_all_on_focus"(GDbool)
"size_flags_vertical"(GDUnknownType)
"step"(GDfloat)
"suffix"(GDString)
"update_on_text_changed"(GDbool)
constructor { }

func("apply") {
returns(GDvoid)

}

func("get_line_edit") {
returns(GDLineEdit)

}
}){

}