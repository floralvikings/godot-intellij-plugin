
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDColor: GDType("Color", {

"a"(GDfloat)
"a8"(GDint)
"b"(GDfloat)
"b8"(GDint)
"g"(GDfloat)
"g8"(GDint)
"h"(GDfloat)
"r"(GDfloat)
"r8"(GDint)
"s"(GDfloat)
"v"(GDfloat)

constructor {

}

constructor {
"from"(GDSameType)
"alpha"(GDfloat)
}

constructor {
"from"(GDSameType)
}

constructor {
"code"(GDString)
}

constructor {
"code"(GDString)
"alpha"(GDfloat)
}

constructor {
"r"(GDfloat)
"g"(GDfloat)
"b"(GDfloat)
}

constructor {
"r"(GDfloat)
"g"(GDfloat)
"b"(GDfloat)
"a"(GDfloat)
}

func("blend") {
returns(GDSameType)
"over"(GDSameType)
}

func("clamp") {
returns(GDSameType)
"min"(GDSameType)
"max"(GDSameType)
}

func("darkened") {
returns(GDSameType)
"amount"(GDfloat)
}

func("from_hsv") {
returns(GDSameType)
"h"(GDfloat)
"s"(GDfloat)
"v"(GDfloat)
"alpha"(GDfloat)
}

func("from_ok_hsl") {
returns(GDSameType)
"h"(GDfloat)
"s"(GDfloat)
"l"(GDfloat)
"alpha"(GDfloat)
}

func("from_rgbe9995") {
returns(GDSameType)
"rgbe"(GDint)
}

func("from_string") {
returns(GDSameType)
"str"(GDString)
"default"(GDSameType)
}

func("get_luminance") {
returns(GDfloat)

}

func("hex") {
returns(GDSameType)
"hex"(GDint)
}

func("hex64") {
returns(GDSameType)
"hex"(GDint)
}

func("html") {
returns(GDSameType)
"rgba"(GDString)
}

func("html_is_valid") {
returns(GDbool)
"color"(GDString)
}

func("inverted") {
returns(GDSameType)

}

func("is_equal_approx") {
returns(GDbool)
"to"(GDSameType)
}

func("lerp") {
returns(GDSameType)
"to"(GDSameType)
"weight"(GDfloat)
}

func("lightened") {
returns(GDSameType)
"amount"(GDfloat)
}

func("linear_to_srgb") {
returns(GDSameType)

}

func("srgb_to_linear") {
returns(GDSameType)

}

func("to_abgr32") {
returns(GDint)

}

func("to_abgr64") {
returns(GDint)

}

func("to_argb32") {
returns(GDint)

}

func("to_argb64") {
returns(GDint)

}

func("to_html") {
returns(GDString)
"with_alpha"(GDbool)
}

func("to_rgba32") {
returns(GDint)

}

func("to_rgba64") {
returns(GDint)

}
}){

}