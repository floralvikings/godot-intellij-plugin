
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVisualShaderNodeGroupBase: GDType("VisualShaderNodeGroupBase", {


constructor { }

func("add_input_port") {
returns(GDvoid)
"id"(GDint)
"type"(GDint)
"name"(GDString)
}

func("add_output_port") {
returns(GDvoid)
"id"(GDint)
"type"(GDint)
"name"(GDString)
}

func("clear_input_ports") {
returns(GDvoid)

}

func("clear_output_ports") {
returns(GDvoid)

}

func("get_free_input_port_id") {
returns(GDint)

}

func("get_free_output_port_id") {
returns(GDint)

}

func("get_input_port_count") {
returns(GDint)

}

func("get_inputs") {
returns(GDString)

}

func("get_output_port_count") {
returns(GDint)

}

func("get_outputs") {
returns(GDString)

}

func("has_input_port") {
returns(GDbool)
"id"(GDint)
}

func("has_output_port") {
returns(GDbool)
"id"(GDint)
}

func("is_valid_port_name") {
returns(GDbool)
"name"(GDString)
}

func("remove_input_port") {
returns(GDvoid)
"id"(GDint)
}

func("remove_output_port") {
returns(GDvoid)
"id"(GDint)
}

func("set_input_port_name") {
returns(GDvoid)
"id"(GDint)
"name"(GDString)
}

func("set_input_port_type") {
returns(GDvoid)
"id"(GDint)
"type"(GDint)
}

func("set_inputs") {
returns(GDvoid)
"inputs"(GDString)
}

func("set_output_port_name") {
returns(GDvoid)
"id"(GDint)
"name"(GDString)
}

func("set_output_port_type") {
returns(GDvoid)
"id"(GDint)
"type"(GDint)
}

func("set_outputs") {
returns(GDvoid)
"outputs"(GDString)
}
}){

}