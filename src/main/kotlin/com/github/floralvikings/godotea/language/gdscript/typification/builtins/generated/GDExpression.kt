
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDExpression: GDType("Expression", {


constructor { }

func("execute") {
returns(GDVariant)
"inputs"(GDArray)
"base_instance"(GDObject)
"show_error"(GDbool)
"const_calls_only"(GDbool)
}

func("get_error_text") {
returns(GDString)

}

func("has_execute_failed") {
returns(GDbool)

}

func("parse") {
returns(GDError)
"expression"(GDString)
"input_names"(GDPackedStringArray)
}
}){

}