
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCallable: GDType("Callable", {



constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"object"(GDObject)
"method"(GDStringName)
}

func("bind") {
returns(GDSameType)

}

func("bindv") {
returns(GDSameType)
"arguments"(GDArray)
}

func("call") {
returns(GDVariant)

}

func("call_deferred") {
returns(GDvoid)

}

func("callv") {
returns(GDVariant)
"arguments"(GDArray)
}

func("get_bound_arguments") {
returns(GDArray)

}

func("get_bound_arguments_count") {
returns(GDint)

}

func("get_method") {
returns(GDStringName)

}

func("get_object") {
returns(GDObject)

}

func("get_object_id") {
returns(GDint)

}

func("hash") {
returns(GDint)

}

func("is_custom") {
returns(GDbool)

}

func("is_null") {
returns(GDbool)

}

func("is_standard") {
returns(GDbool)

}

func("is_valid") {
returns(GDbool)

}

func("rpc") {
returns(GDvoid)

}

func("rpc_id") {
returns(GDvoid)
"peer_id"(GDint)
}

func("unbind") {
returns(GDSameType)
"argcount"(GDint)
}
}){

}