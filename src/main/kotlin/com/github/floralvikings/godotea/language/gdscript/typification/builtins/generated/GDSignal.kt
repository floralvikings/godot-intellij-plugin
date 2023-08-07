
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSignal: GDType("Signal", {



constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"object"(GDObject)
"signal"(GDStringName)
}

func("connect") {
returns(GDint)
"callable"(GDCallable)
"flags"(GDint)
}

func("disconnect") {
returns(GDvoid)
"callable"(GDCallable)
}

func("emit") {
returns(GDvoid)

}

func("get_connections") {
returns(GDArray)

}

func("get_name") {
returns(GDStringName)

}

func("get_object") {
returns(GDObject)

}

func("get_object_id") {
returns(GDint)

}

func("is_connected") {
returns(GDbool)
"callable"(GDCallable)
}

func("is_null") {
returns(GDbool)

}
}){

}