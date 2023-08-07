
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTextLine: GDType("TextLine", {

"alignment"(GDHorizontalAlignment)
"direction"(GDDirection)
"flags"(GDUnknownType)
"orientation"(GDOrientation)
"preserve_control"(GDbool)
"preserve_invalid"(GDbool)
"text_overrun_behavior"(GDOverrunBehavior)
"width"(GDfloat)
constructor { }

func("add_object") {
returns(GDbool)
"key"(GDVariant)
"size"(GDVector2)
"inline_align"(GDInlineAlignment)
"length"(GDint)
"baseline"(GDfloat)
}

func("add_string") {
returns(GDbool)
"text"(GDString)
"font"(GDFont)
"font_size"(GDint)
"language"(GDString)
"meta"(GDVariant)
}

func("clear") {
returns(GDvoid)

}

func("draw") {
returns(GDvoid)
"canvas"(GDRID)
"pos"(GDVector2)
"color"(GDColor)
}

func("draw_outline") {
returns(GDvoid)
"canvas"(GDRID)
"pos"(GDVector2)
"outline_size"(GDint)
"color"(GDColor)
}

func("get_line_ascent") {
returns(GDfloat)

}

func("get_line_descent") {
returns(GDfloat)

}

func("get_line_underline_position") {
returns(GDfloat)

}

func("get_line_underline_thickness") {
returns(GDfloat)

}

func("get_line_width") {
returns(GDfloat)

}

func("get_object_rect") {
returns(GDRect2)
"key"(GDVariant)
}

func("get_objects") {
returns(GDArray)

}

func("get_rid") {
returns(GDRID)

}

func("get_size") {
returns(GDVector2)

}

func("hit_test") {
returns(GDint)
"coords"(GDfloat)
}

func("resize_object") {
returns(GDbool)
"key"(GDVariant)
"size"(GDVector2)
"inline_align"(GDInlineAlignment)
"baseline"(GDfloat)
}

func("set_bidi_override") {
returns(GDvoid)
"override"(GDArray)
}

func("tab_align") {
returns(GDvoid)
"tab_stops"(GDPackedFloat32Array)
}
}){

}