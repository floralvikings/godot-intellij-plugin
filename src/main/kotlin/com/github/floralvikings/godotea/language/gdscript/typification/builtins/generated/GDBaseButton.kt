
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDBaseButton: GDType("BaseButton", {

"action_mode"(GDActionMode)
"button_group"(GDButtonGroup)
"button_mask"(GDUnknownType)
"button_pressed"(GDbool)
"disabled"(GDbool)
"focus_mode"(GDFocusMode)
"keep_pressed_outside"(GDbool)
"shortcut"(GDShortcut)
"shortcut_feedback"(GDbool)
"shortcut_in_tooltip"(GDbool)
"toggle_mode"(GDbool)
constructor { }

func("_pressed") {
returns(GDvoid)

}

func("_toggled") {
returns(GDvoid)
"button_pressed"(GDbool)
}

func("get_draw_mode") {
returns(GDDrawMode)

}

func("is_hovered") {
returns(GDbool)

}

func("set_pressed_no_signal") {
returns(GDvoid)
"pressed"(GDbool)
}
}){

}