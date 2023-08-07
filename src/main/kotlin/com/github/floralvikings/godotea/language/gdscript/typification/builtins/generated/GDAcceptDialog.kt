
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAcceptDialog: GDType("AcceptDialog", {

"buttons_separation"(GDint)
"panel"(GDStyleBox)
"dialog_autowrap"(GDbool)
"dialog_close_on_escape"(GDbool)
"dialog_hide_on_ok"(GDbool)
"dialog_text"(GDString)
"exclusive"(GDbool)
"ok_button_text"(GDString)
"title"(GDString)
"transient"(GDbool)
"visible"(GDbool)
"wrap_controls"(GDbool)
constructor { }

func("add_button") {
returns(GDButton)
"text"(GDString)
"right"(GDbool)
"action"(GDString)
}

func("add_cancel_button") {
returns(GDButton)
"name"(GDString)
}

func("get_label") {
returns(GDLabel)

}

func("get_ok_button") {
returns(GDButton)

}

func("register_text_enter") {
returns(GDvoid)
"line_edit"(GDControl)
}

func("remove_button") {
returns(GDvoid)
"button"(GDControl)
}
}){

}