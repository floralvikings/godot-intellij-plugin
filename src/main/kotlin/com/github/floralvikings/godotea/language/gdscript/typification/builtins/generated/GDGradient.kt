
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGradient: GDType("Gradient", {

"colors"(GDPackedColorArray)
"interpolation_color_space"(GDColorSpace)
"interpolation_mode"(GDInterpolationMode)
"offsets"(GDPackedFloat32Array)
constructor { }

func("add_point") {
returns(GDvoid)
"offset"(GDfloat)
"color"(GDColor)
}

func("get_color") {
returns(GDColor)
"point"(GDint)
}

func("get_offset") {
returns(GDfloat)
"point"(GDint)
}

func("get_point_count") {
returns(GDint)

}

func("remove_point") {
returns(GDvoid)
"point"(GDint)
}

func("reverse") {
returns(GDvoid)

}

func("sample") {
returns(GDColor)
"offset"(GDfloat)
}

func("set_color") {
returns(GDvoid)
"point"(GDint)
"color"(GDColor)
}

func("set_offset") {
returns(GDvoid)
"point"(GDint)
"offset"(GDfloat)
}
}){

}