
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRect2: GDType("Rect2", {

"end"(GDVector2)
"position"(GDVector2)
"size"(GDVector2)

constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"from"(GDRect2i)
}

constructor {
"position"(GDVector2)
"size"(GDVector2)
}

constructor {
"x"(GDfloat)
"y"(GDfloat)
"width"(GDfloat)
"height"(GDfloat)
}

func("abs") {
returns(GDSameType)

}

func("encloses") {
returns(GDbool)
"b"(GDSameType)
}

func("expand") {
returns(GDSameType)
"to"(GDVector2)
}

func("get_area") {
returns(GDfloat)

}

func("get_center") {
returns(GDVector2)

}

func("grow") {
returns(GDSameType)
"amount"(GDfloat)
}

func("grow_individual") {
returns(GDSameType)
"left"(GDfloat)
"top"(GDfloat)
"right"(GDfloat)
"bottom"(GDfloat)
}

func("grow_side") {
returns(GDSameType)
"side"(GDint)
"amount"(GDfloat)
}

func("has_area") {
returns(GDbool)

}

func("has_point") {
returns(GDbool)
"point"(GDVector2)
}

func("intersection") {
returns(GDSameType)
"b"(GDSameType)
}

func("intersects") {
returns(GDbool)
"b"(GDSameType)
"include_borders"(GDbool)
}

func("is_equal_approx") {
returns(GDbool)
"rect"(GDSameType)
}

func("is_finite") {
returns(GDbool)

}

func("merge") {
returns(GDSameType)
"b"(GDSameType)
}
}){

}