
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDScrollContainer: GDType("ScrollContainer", {

"panel"(GDStyleBox)
"clip_contents"(GDbool)
"follow_focus"(GDbool)
"horizontal_scroll_mode"(GDScrollMode)
"scroll_deadzone"(GDint)
"scroll_horizontal"(GDint)
"scroll_horizontal_custom_step"(GDfloat)
"scroll_vertical"(GDint)
"scroll_vertical_custom_step"(GDfloat)
"vertical_scroll_mode"(GDScrollMode)
constructor { }

func("ensure_control_visible") {
returns(GDvoid)
"control"(GDControl)
}

func("get_h_scroll_bar") {
returns(GDHScrollBar)

}

func("get_v_scroll_bar") {
returns(GDVScrollBar)

}
}){

}