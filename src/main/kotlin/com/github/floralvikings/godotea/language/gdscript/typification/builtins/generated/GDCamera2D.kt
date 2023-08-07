
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCamera2D: GDType("Camera2D", {

"anchor_mode"(GDAnchorMode)
"custom_viewport"(GDNode)
"drag_bottom_margin"(GDfloat)
"drag_horizontal_enabled"(GDbool)
"drag_horizontal_offset"(GDfloat)
"drag_left_margin"(GDfloat)
"drag_right_margin"(GDfloat)
"drag_top_margin"(GDfloat)
"drag_vertical_enabled"(GDbool)
"drag_vertical_offset"(GDfloat)
"editor_draw_drag_margin"(GDbool)
"editor_draw_limits"(GDbool)
"editor_draw_screen"(GDbool)
"enabled"(GDbool)
"ignore_rotation"(GDbool)
"limit_bottom"(GDint)
"limit_left"(GDint)
"limit_right"(GDint)
"limit_smoothed"(GDbool)
"limit_top"(GDint)
"offset"(GDVector2)
"position_smoothing_enabled"(GDbool)
"position_smoothing_speed"(GDfloat)
"process_callback"(GDCamera2DProcessCallback)
"rotation_smoothing_enabled"(GDbool)
"rotation_smoothing_speed"(GDfloat)
"zoom"(GDVector2)
constructor { }

func("align") {
returns(GDvoid)

}

func("force_update_scroll") {
returns(GDvoid)

}

func("get_drag_margin") {
returns(GDfloat)
"margin"(GDSide)
}

func("get_limit") {
returns(GDint)
"margin"(GDSide)
}

func("get_screen_center_position") {
returns(GDVector2)

}

func("get_target_position") {
returns(GDVector2)

}

func("is_current") {
returns(GDbool)

}

func("make_current") {
returns(GDvoid)

}

func("reset_smoothing") {
returns(GDvoid)

}

func("set_drag_margin") {
returns(GDvoid)
"margin"(GDSide)
"drag_margin"(GDfloat)
}

func("set_limit") {
returns(GDvoid)
"margin"(GDSide)
"limit"(GDint)
}
}){

}