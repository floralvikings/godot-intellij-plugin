
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVector4i: GDType("Vector4i", {

"w"(GDint)
"x"(GDint)
"y"(GDint)
"z"(GDint)

constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"from"(GDVector4)
}

constructor {
"x"(GDint)
"y"(GDint)
"z"(GDint)
"w"(GDint)
}

func("abs") {
returns(GDSameType)

}

func("clamp") {
returns(GDSameType)
"min"(GDSameType)
"max"(GDSameType)
}

func("length") {
returns(GDfloat)

}

func("length_squared") {
returns(GDint)

}

func("max_axis_index") {
returns(GDint)

}

func("min_axis_index") {
returns(GDint)

}

func("sign") {
returns(GDSameType)

}

func("snapped") {
returns(GDSameType)
"step"(GDSameType)
}
}){

}