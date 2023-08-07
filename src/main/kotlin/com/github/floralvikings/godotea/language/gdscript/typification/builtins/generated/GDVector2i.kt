
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVector2i: GDType("Vector2i", {

"x"(GDint)
"y"(GDint)

constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"from"(GDVector2)
}

constructor {
"x"(GDint)
"y"(GDint)
}

func("abs") {
returns(GDSameType)

}

func("aspect") {
returns(GDfloat)

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