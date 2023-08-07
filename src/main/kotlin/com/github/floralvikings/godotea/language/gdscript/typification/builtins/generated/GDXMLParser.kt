
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDXMLParser: GDType("XMLParser", {


constructor { }

func("get_attribute_count") {
returns(GDint)

}

func("get_attribute_name") {
returns(GDString)
"idx"(GDint)
}

func("get_attribute_value") {
returns(GDString)
"idx"(GDint)
}

func("get_current_line") {
returns(GDint)

}

func("get_named_attribute_value") {
returns(GDString)
"name"(GDString)
}

func("get_named_attribute_value_safe") {
returns(GDString)
"name"(GDString)
}

func("get_node_data") {
returns(GDString)

}

func("get_node_name") {
returns(GDString)

}

func("get_node_offset") {
returns(GDint)

}

func("get_node_type") {
returns(GDNodeType)

}

func("has_attribute") {
returns(GDbool)
"name"(GDString)
}

func("is_empty") {
returns(GDbool)

}

func("open") {
returns(GDError)
"file"(GDString)
}

func("open_buffer") {
returns(GDError)
"buffer"(GDPackedByteArray)
}

func("read") {
returns(GDError)

}

func("seek") {
returns(GDError)
"position"(GDint)
}

func("skip_section") {
returns(GDvoid)

}
}){

}