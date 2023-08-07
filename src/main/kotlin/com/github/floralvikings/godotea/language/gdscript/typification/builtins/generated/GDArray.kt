
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDArray: GDType("Array", {



constructor {

}

constructor {
"base"(GDSameType)
"type"(GDint)
"class_name"(GDStringName)
"script"(GDVariant)
}

constructor {
"from"(GDSameType)
}

constructor {
"from"(GDPackedByteArray)
}

constructor {
"from"(GDPackedColorArray)
}

constructor {
"from"(GDPackedFloat32Array)
}

constructor {
"from"(GDPackedFloat64Array)
}

constructor {
"from"(GDPackedInt32Array)
}

constructor {
"from"(GDPackedInt64Array)
}

constructor {
"from"(GDPackedStringArray)
}

constructor {
"from"(GDPackedVector2Array)
}

constructor {
"from"(GDPackedVector3Array)
}

func("all") {
returns(GDbool)
"method"(GDCallable)
}

func("any") {
returns(GDbool)
"method"(GDCallable)
}

func("append") {
returns(GDvoid)
"value"(GDVariant)
}

func("append_array") {
returns(GDvoid)
"array"(GDSameType)
}

func("assign") {
returns(GDvoid)
"array"(GDSameType)
}

func("back") {
returns(GDVariant)

}

func("bsearch") {
returns(GDint)
"value"(GDVariant)
"before"(GDbool)
}

func("bsearch_custom") {
returns(GDint)
"value"(GDVariant)
"func"(GDCallable)
"before"(GDbool)
}

func("clear") {
returns(GDvoid)

}

func("count") {
returns(GDint)
"value"(GDVariant)
}

func("duplicate") {
returns(GDSameType)
"deep"(GDbool)
}

func("erase") {
returns(GDvoid)
"value"(GDVariant)
}

func("fill") {
returns(GDvoid)
"value"(GDVariant)
}

func("filter") {
returns(GDSameType)
"method"(GDCallable)
}

func("find") {
returns(GDint)
"what"(GDVariant)
"from"(GDint)
}

func("front") {
returns(GDVariant)

}

func("get_typed_builtin") {
returns(GDint)

}

func("get_typed_class_name") {
returns(GDStringName)

}

func("get_typed_script") {
returns(GDVariant)

}

func("has") {
returns(GDbool)
"value"(GDVariant)
}

func("hash") {
returns(GDint)

}

func("insert") {
returns(GDint)
"position"(GDint)
"value"(GDVariant)
}

func("is_empty") {
returns(GDbool)

}

func("is_read_only") {
returns(GDbool)

}

func("is_same_typed") {
returns(GDbool)
"array"(GDSameType)
}

func("is_typed") {
returns(GDbool)

}

func("make_read_only") {
returns(GDvoid)

}

func("map") {
returns(GDSameType)
"method"(GDCallable)
}

func("max") {
returns(GDVariant)

}

func("min") {
returns(GDVariant)

}

func("pick_random") {
returns(GDVariant)

}

func("pop_at") {
returns(GDVariant)
"position"(GDint)
}

func("pop_back") {
returns(GDVariant)

}

func("pop_front") {
returns(GDVariant)

}

func("push_back") {
returns(GDvoid)
"value"(GDVariant)
}

func("push_front") {
returns(GDvoid)
"value"(GDVariant)
}

func("reduce") {
returns(GDVariant)
"method"(GDCallable)
"accum"(GDVariant)
}

func("remove_at") {
returns(GDvoid)
"position"(GDint)
}

func("resize") {
returns(GDint)
"size"(GDint)
}

func("reverse") {
returns(GDvoid)

}

func("rfind") {
returns(GDint)
"what"(GDVariant)
"from"(GDint)
}

func("shuffle") {
returns(GDvoid)

}

func("size") {
returns(GDint)

}

func("slice") {
returns(GDSameType)
"begin"(GDint)
"end"(GDint)
"step"(GDint)
"deep"(GDbool)
}

func("sort") {
returns(GDvoid)

}

func("sort_custom") {
returns(GDvoid)
"func"(GDCallable)
}
}){

}