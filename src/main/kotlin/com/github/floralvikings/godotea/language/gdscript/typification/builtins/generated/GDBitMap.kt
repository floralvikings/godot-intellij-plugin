
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDBitMap: GDType("BitMap", {


constructor { }

func("convert_to_image") {
returns(GDImage)

}

func("create") {
returns(GDvoid)
"size"(GDVector2i)
}

func("create_from_image_alpha") {
returns(GDvoid)
"image"(GDImage)
"threshold"(GDfloat)
}

func("get_bit") {
returns(GDbool)
"x"(GDint)
"y"(GDint)
}

func("get_bitv") {
returns(GDbool)
"position"(GDVector2i)
}

func("get_size") {
returns(GDVector2i)

}

func("get_true_bit_count") {
returns(GDint)

}

func("grow_mask") {
returns(GDvoid)
"pixels"(GDint)
"rect"(GDRect2i)
}

func("opaque_to_polygons") {
returns(GDTypedArray(GDPackedVector2Array::class))
"rect"(GDRect2i)
"epsilon"(GDfloat)
}

func("resize") {
returns(GDvoid)
"new_size"(GDVector2i)
}

func("set_bit") {
returns(GDvoid)
"x"(GDint)
"y"(GDint)
"bit"(GDbool)
}

func("set_bit_rect") {
returns(GDvoid)
"rect"(GDRect2i)
"bit"(GDbool)
}

func("set_bitv") {
returns(GDvoid)
"position"(GDVector2i)
"bit"(GDbool)
}
}){

}