
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPackedFloat32Array: GDType("PackedFloat32Array", {



constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"from"(GDArray)
}

func("append") {
returns(GDbool)
"value"(GDfloat)
}

func("append_array") {
returns(GDvoid)
"array"(GDSameType)
}

func("bsearch") {
returns(GDint)
"value"(GDfloat)
"before"(GDbool)
}

func("clear") {
returns(GDvoid)

}

func("count") {
returns(GDint)
"value"(GDfloat)
}

func("duplicate") {
returns(GDSameType)

}

func("fill") {
returns(GDvoid)
"value"(GDfloat)
}

func("find") {
returns(GDint)
"value"(GDfloat)
"from"(GDint)
}

func("has") {
returns(GDbool)
"value"(GDfloat)
}

func("insert") {
returns(GDint)
"at_index"(GDint)
"value"(GDfloat)
}

func("is_empty") {
returns(GDbool)

}

func("push_back") {
returns(GDbool)
"value"(GDfloat)
}

func("remove_at") {
returns(GDvoid)
"index"(GDint)
}

func("resize") {
returns(GDint)
"new_size"(GDint)
}

func("reverse") {
returns(GDvoid)

}

func("rfind") {
returns(GDint)
"value"(GDfloat)
"from"(GDint)
}

func("set") {
returns(GDvoid)
"index"(GDint)
"value"(GDfloat)
}

func("size") {
returns(GDint)

}

func("slice") {
returns(GDSameType)
"begin"(GDint)
"end"(GDint)
}

func("sort") {
returns(GDvoid)

}

func("to_byte_array") {
returns(GDPackedByteArray)

}
}){

}