
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTexture2D: GDType("Texture2D", {


constructor { }

func("_draw") {
returns(GDvoid)
"to_canvas_item"(GDRID)
"pos"(GDVector2)
"modulate"(GDColor)
"transpose"(GDbool)
}

func("_draw_rect") {
returns(GDvoid)
"to_canvas_item"(GDRID)
"rect"(GDRect2)
"tile"(GDbool)
"modulate"(GDColor)
"transpose"(GDbool)
}

func("_draw_rect_region") {
returns(GDvoid)
"to_canvas_item"(GDRID)
"rect"(GDRect2)
"src_rect"(GDRect2)
"modulate"(GDColor)
"transpose"(GDbool)
"clip_uv"(GDbool)
}

func("_get_height") {
returns(GDint)

}

func("_get_width") {
returns(GDint)

}

func("_has_alpha") {
returns(GDbool)

}

func("_is_pixel_opaque") {
returns(GDbool)
"x"(GDint)
"y"(GDint)
}

func("create_placeholder") {
returns(GDResource)

}

func("draw") {
returns(GDvoid)
"canvas_item"(GDRID)
"position"(GDVector2)
"modulate"(GDColor)
"transpose"(GDbool)
}

func("draw_rect") {
returns(GDvoid)
"canvas_item"(GDRID)
"rect"(GDRect2)
"tile"(GDbool)
"modulate"(GDColor)
"transpose"(GDbool)
}

func("draw_rect_region") {
returns(GDvoid)
"canvas_item"(GDRID)
"rect"(GDRect2)
"src_rect"(GDRect2)
"modulate"(GDColor)
"transpose"(GDbool)
"clip_uv"(GDbool)
}

func("get_height") {
returns(GDint)

}

func("get_image") {
returns(GDImage)

}

func("get_size") {
returns(GDVector2)

}

func("get_width") {
returns(GDint)

}

func("has_alpha") {
returns(GDbool)

}
}){

}