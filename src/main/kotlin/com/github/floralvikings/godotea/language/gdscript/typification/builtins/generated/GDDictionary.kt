
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDDictionary: GDType("Dictionary", {



constructor {

}

constructor {
"from"(GDSameType)
}

func("clear") {
returns(GDvoid)

}

func("duplicate") {
returns(GDSameType)
"deep"(GDbool)
}

func("erase") {
returns(GDbool)
"key"(GDVariant)
}

func("find_key") {
returns(GDVariant)
"value"(GDVariant)
}

func("get") {
returns(GDVariant)
"key"(GDVariant)
"default"(GDVariant)
}

func("has") {
returns(GDbool)
"key"(GDVariant)
}

func("has_all") {
returns(GDbool)
"keys"(GDArray)
}

func("hash") {
returns(GDint)

}

func("is_empty") {
returns(GDbool)

}

func("is_read_only") {
returns(GDbool)

}

func("keys") {
returns(GDArray)

}

func("make_read_only") {
returns(GDvoid)

}

func("merge") {
returns(GDvoid)
"dictionary"(GDSameType)
"overwrite"(GDbool)
}

func("size") {
returns(GDint)

}

func("values") {
returns(GDArray)

}
}){

}