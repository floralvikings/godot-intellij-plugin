
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPackedInt64Array: GDType("PackedInt64Array", {



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
"value"(GDint)
}

func("append_array") {
returns(GDvoid)
"array"(GDSameType)
}

func("bsearch") {
returns(GDint)
"value"(GDint)
"before"(GDbool)
}

func("clear") {
returns(GDvoid)

}

func("count") {
returns(GDint)
"value"(GDint)
}

func("duplicate") {
returns(GDSameType)

}

func("fill") {
returns(GDvoid)
"value"(GDint)
}

func("find") {
returns(GDint)
"value"(GDint)
"from"(GDint)
}

func("has") {
returns(GDbool)
"value"(GDint)
}

func("insert") {
returns(GDint)
"at_index"(GDint)
"value"(GDint)
}

func("is_empty") {
returns(GDbool)

}

func("push_back") {
returns(GDbool)
"value"(GDint)
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
"value"(GDint)
"from"(GDint)
}

func("set") {
returns(GDvoid)
"index"(GDint)
"value"(GDint)
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