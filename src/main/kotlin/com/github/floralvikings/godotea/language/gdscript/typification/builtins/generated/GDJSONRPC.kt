
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDJSONRPC: GDType("JSONRPC", {


constructor { }

func("make_notification") {
returns(GDDictionary)
"method"(GDString)
"params"(GDVariant)
}

func("make_request") {
returns(GDDictionary)
"method"(GDString)
"params"(GDVariant)
"id"(GDVariant)
}

func("make_response") {
returns(GDDictionary)
"result"(GDVariant)
"id"(GDVariant)
}

func("make_response_error") {
returns(GDDictionary)
"code"(GDint)
"message"(GDString)
"id"(GDVariant)
}

func("process_action") {
returns(GDVariant)
"action"(GDVariant)
"recurse"(GDbool)
}

func("process_string") {
returns(GDString)
"action"(GDString)
}

func("set_scope") {
returns(GDvoid)
"scope"(GDString)
"target"(GDObject)
}
}){

}