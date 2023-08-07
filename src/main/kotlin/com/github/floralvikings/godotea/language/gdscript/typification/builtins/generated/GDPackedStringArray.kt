
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPackedStringArray: GDType("PackedStringArray", {



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
"value"(GDString)
}

func("append_array") {
returns(GDvoid)
"array"(GDSameType)
}

func("bsearch") {
returns(GDint)
"value"(GDString)
"before"(GDbool)
}

func("clear") {
returns(GDvoid)

}

func("count") {
returns(GDint)
"value"(GDString)
}

func("duplicate") {
returns(GDSameType)

}

func("fill") {
returns(GDvoid)
"value"(GDString)
}

func("find") {
returns(GDint)
"value"(GDString)
"from"(GDint)
}

func("has") {
returns(GDbool)
"value"(GDString)
}

func("insert") {
returns(GDint)
"at_index"(GDint)
"value"(GDString)
}

func("is_empty") {
returns(GDbool)

}

func("push_back") {
returns(GDbool)
"value"(GDString)
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
"value"(GDString)
"from"(GDint)
}

func("set") {
returns(GDvoid)
"index"(GDint)
"value"(GDString)
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