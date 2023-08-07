
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDStyleBox: GDType("StyleBox", {

"content_margin_bottom"(GDfloat)
"content_margin_left"(GDfloat)
"content_margin_right"(GDfloat)
"content_margin_top"(GDfloat)
constructor { }

func("_draw") {
returns(GDvoid)
"to_canvas_item"(GDRID)
"rect"(GDRect2)
}

func("_get_draw_rect") {
returns(GDRect2)
"rect"(GDRect2)
}

func("_get_minimum_size") {
returns(GDVector2)

}

func("_test_mask") {
returns(GDbool)
"point"(GDVector2)
"rect"(GDRect2)
}

func("draw") {
returns(GDvoid)
"canvas_item"(GDRID)
"rect"(GDRect2)
}

func("get_content_margin") {
returns(GDfloat)
"margin"(GDSide)
}

func("get_current_item_drawn") {
returns(GDCanvasItem)

}

func("get_margin") {
returns(GDfloat)
"margin"(GDSide)
}

func("get_minimum_size") {
returns(GDVector2)

}

func("get_offset") {
returns(GDVector2)

}

func("set_content_margin") {
returns(GDvoid)
"margin"(GDSide)
"offset"(GDfloat)
}

func("set_content_margin_all") {
returns(GDvoid)
"offset"(GDfloat)
}

func("test_mask") {
returns(GDbool)
"point"(GDVector2)
"rect"(GDRect2)
}
}){

}