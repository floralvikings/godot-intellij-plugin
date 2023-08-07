
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVisualShaderNodeCustom: GDType("VisualShaderNodeCustom", {


constructor { }

func("_get_category") {
returns(GDString)

}

func("_get_code") {
returns(GDString)
"input_vars"(GDTypedArray(GDString::class))
"output_vars"(GDTypedArray(GDString::class))
"mode"(GDMode)
"type"(GDTypeEnum)
}

func("_get_description") {
returns(GDString)

}

func("_get_func_code") {
returns(GDString)
"mode"(GDMode)
"type"(GDTypeEnum)
}

func("_get_global_code") {
returns(GDString)
"mode"(GDMode)
}

func("_get_input_port_count") {
returns(GDint)

}

func("_get_input_port_name") {
returns(GDString)
"port"(GDint)
}

func("_get_input_port_type") {
returns(GDPortType)
"port"(GDint)
}

func("_get_name") {
returns(GDString)

}

func("_get_output_port_count") {
returns(GDint)

}

func("_get_output_port_name") {
returns(GDString)
"port"(GDint)
}

func("_get_output_port_type") {
returns(GDPortType)
"port"(GDint)
}

func("_get_return_icon_type") {
returns(GDPortType)

}

func("_is_available") {
returns(GDbool)
"mode"(GDMode)
"type"(GDTypeEnum)
}

func("_is_highend") {
returns(GDbool)

}
}){

}