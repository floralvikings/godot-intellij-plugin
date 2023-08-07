
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTextParagraph: GDType("TextParagraph", {

"alignment"(GDHorizontalAlignment)
"break_flags"(GDUnknownType)
"custom_punctuation"(GDString)
"direction"(GDDirection)
"justification_flags"(GDUnknownType)
"max_lines_visible"(GDint)
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

func("clear_dropcap") {
returns(GDvoid)

}

func("draw") {
returns(GDvoid)
"canvas"(GDRID)
"pos"(GDVector2)
"color"(GDColor)
"dc_color"(GDColor)
}

func("draw_dropcap") {
returns(GDvoid)
"canvas"(GDRID)
"pos"(GDVector2)
"color"(GDColor)
}

func("draw_dropcap_outline") {
returns(GDvoid)
"canvas"(GDRID)
"pos"(GDVector2)
"outline_size"(GDint)
"color"(GDColor)
}

func("draw_line") {
returns(GDvoid)
"canvas"(GDRID)
"pos"(GDVector2)
"line"(GDint)
"color"(GDColor)
}

func("draw_line_outline") {
returns(GDvoid)
"canvas"(GDRID)
"pos"(GDVector2)
"line"(GDint)
"outline_size"(GDint)
"color"(GDColor)
}

func("draw_outline") {
returns(GDvoid)
"canvas"(GDRID)
"pos"(GDVector2)
"outline_size"(GDint)
"color"(GDColor)
"dc_color"(GDColor)
}

func("get_dropcap_lines") {
returns(GDint)

}

func("get_dropcap_rid") {
returns(GDRID)

}

func("get_dropcap_size") {
returns(GDVector2)

}

func("get_line_ascent") {
returns(GDfloat)
"line"(GDint)
}

func("get_line_count") {
returns(GDint)

}

func("get_line_descent") {
returns(GDfloat)
"line"(GDint)
}

func("get_line_object_rect") {
returns(GDRect2)
"line"(GDint)
"key"(GDVariant)
}

func("get_line_objects") {
returns(GDArray)
"line"(GDint)
}

func("get_line_range") {
returns(GDVector2i)
"line"(GDint)
}

func("get_line_rid") {
returns(GDRID)
"line"(GDint)
}

func("get_line_size") {
returns(GDVector2)
"line"(GDint)
}

func("get_line_underline_position") {
returns(GDfloat)
"line"(GDint)
}

func("get_line_underline_thickness") {
returns(GDfloat)
"line"(GDint)
}

func("get_line_width") {
returns(GDfloat)
"line"(GDint)
}

func("get_non_wrapped_size") {
returns(GDVector2)

}

func("get_rid") {
returns(GDRID)

}

func("get_size") {
returns(GDVector2)

}

func("hit_test") {
returns(GDint)
"coords"(GDVector2)
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

func("set_dropcap") {
returns(GDbool)
"text"(GDString)
"font"(GDFont)
"font_size"(GDint)
"dropcap_margins"(GDRect2)
"language"(GDString)
}

func("tab_align") {
returns(GDvoid)
"tab_stops"(GDPackedFloat32Array)
}
}){

}