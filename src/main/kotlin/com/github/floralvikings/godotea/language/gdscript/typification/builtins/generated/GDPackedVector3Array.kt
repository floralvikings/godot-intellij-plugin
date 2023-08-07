
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPackedVector3Array: GDType("PackedVector3Array", {



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
"value"(GDVector3)
}

func("append_array") {
returns(GDvoid)
"array"(GDSameType)
}

func("bsearch") {
returns(GDint)
"value"(GDVector3)
"before"(GDbool)
}

func("clear") {
returns(GDvoid)

}

func("count") {
returns(GDint)
"value"(GDVector3)
}

func("duplicate") {
returns(GDSameType)

}

func("fill") {
returns(GDvoid)
"value"(GDVector3)
}

func("find") {
returns(GDint)
"value"(GDVector3)
"from"(GDint)
}

func("has") {
returns(GDbool)
"value"(GDVector3)
}

func("insert") {
returns(GDint)
"at_index"(GDint)
"value"(GDVector3)
}

func("is_empty") {
returns(GDbool)

}

func("push_back") {
returns(GDbool)
"value"(GDVector3)
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
"value"(GDVector3)
"from"(GDint)
}

func("set") {
returns(GDvoid)
"index"(GDint)
"value"(GDVector3)
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