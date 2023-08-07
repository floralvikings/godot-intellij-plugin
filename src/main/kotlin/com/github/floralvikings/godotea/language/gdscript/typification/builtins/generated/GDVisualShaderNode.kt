
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVisualShaderNode: GDType("VisualShaderNode", {

"output_port_for_preview"(GDint)
constructor { }

func("clear_default_input_values") {
returns(GDvoid)

}

func("get_default_input_values") {
returns(GDArray)

}

func("get_input_port_default_value") {
returns(GDVariant)
"port"(GDint)
}

func("remove_input_port_default_value") {
returns(GDvoid)
"port"(GDint)
}

func("set_default_input_values") {
returns(GDvoid)
"values"(GDArray)
}

func("set_input_port_default_value") {
returns(GDvoid)
"port"(GDint)
"value"(GDVariant)
"prev_value"(GDVariant)
}
}){

}