
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRect2i: GDType("Rect2i", {

"end"(GDVector2i)
"position"(GDVector2i)
"size"(GDVector2i)

constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"from"(GDRect2)
}

constructor {
"position"(GDVector2i)
"size"(GDVector2i)
}

constructor {
"x"(GDint)
"y"(GDint)
"width"(GDint)
"height"(GDint)
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
"to"(GDVector2i)
}

func("get_area") {
returns(GDint)

}

func("get_center") {
returns(GDVector2i)

}

func("grow") {
returns(GDSameType)
"amount"(GDint)
}

func("grow_individual") {
returns(GDSameType)
"left"(GDint)
"top"(GDint)
"right"(GDint)
"bottom"(GDint)
}

func("grow_side") {
returns(GDSameType)
"side"(GDint)
"amount"(GDint)
}

func("has_area") {
returns(GDbool)

}

func("has_point") {
returns(GDbool)
"point"(GDVector2i)
}

func("intersection") {
returns(GDSameType)
"b"(GDSameType)
}

func("intersects") {
returns(GDbool)
"b"(GDSameType)
}

func("merge") {
returns(GDSameType)
"b"(GDSameType)
}
}){

}