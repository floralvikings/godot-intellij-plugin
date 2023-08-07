
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDScript: GDType("Script", {

"source_code"(GDString)
constructor { }

func("can_instantiate") {
returns(GDbool)

}

func("get_base_script") {
returns(GDSameType)

}

func("get_instance_base_type") {
returns(GDStringName)

}

func("get_property_default_value") {
returns(GDVariant)
"property"(GDStringName)
}

func("get_script_constant_map") {
returns(GDDictionary)

}

func("get_script_method_list") {
returns(GDTypedArray(GDDictionary::class))

}

func("get_script_property_list") {
returns(GDTypedArray(GDDictionary::class))

}

func("get_script_signal_list") {
returns(GDTypedArray(GDDictionary::class))

}

func("has_script_signal") {
returns(GDbool)
"signal_name"(GDStringName)
}

func("has_source_code") {
returns(GDbool)

}

func("instance_has") {
returns(GDbool)
"base_object"(GDObject)
}

func("is_tool") {
returns(GDbool)

}

func("reload") {
returns(GDError)
"keep_state"(GDbool)
}
}){

}