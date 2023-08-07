
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDClassDB: GDType("ClassDB", {


constructor { }

func("can_instantiate") {
returns(GDbool)
"class"(GDStringName)
}

func("class_exists") {
returns(GDbool)
"class"(GDStringName)
}

func("class_get_enum_constants") {
returns(GDPackedStringArray)
"class"(GDStringName)
"enum"(GDStringName)
"no_inheritance"(GDbool)
}

func("class_get_enum_list") {
returns(GDPackedStringArray)
"class"(GDStringName)
"no_inheritance"(GDbool)
}

func("class_get_integer_constant") {
returns(GDint)
"class"(GDStringName)
"name"(GDStringName)
}

func("class_get_integer_constant_enum") {
returns(GDStringName)
"class"(GDStringName)
"name"(GDStringName)
"no_inheritance"(GDbool)
}

func("class_get_integer_constant_list") {
returns(GDPackedStringArray)
"class"(GDStringName)
"no_inheritance"(GDbool)
}

func("class_get_method_list") {
returns(GDTypedArray(GDDictionary::class))
"class"(GDStringName)
"no_inheritance"(GDbool)
}

func("class_get_property") {
returns(GDVariant)
"object"(GDObject)
"property"(GDStringName)
}

func("class_get_property_list") {
returns(GDTypedArray(GDDictionary::class))
"class"(GDStringName)
"no_inheritance"(GDbool)
}

func("class_get_signal") {
returns(GDDictionary)
"class"(GDStringName)
"signal"(GDStringName)
}

func("class_get_signal_list") {
returns(GDTypedArray(GDDictionary::class))
"class"(GDStringName)
"no_inheritance"(GDbool)
}

func("class_has_enum") {
returns(GDbool)
"class"(GDStringName)
"name"(GDStringName)
"no_inheritance"(GDbool)
}

func("class_has_integer_constant") {
returns(GDbool)
"class"(GDStringName)
"name"(GDStringName)
}

func("class_has_method") {
returns(GDbool)
"class"(GDStringName)
"method"(GDStringName)
"no_inheritance"(GDbool)
}

func("class_has_signal") {
returns(GDbool)
"class"(GDStringName)
"signal"(GDStringName)
}

func("class_set_property") {
returns(GDError)
"object"(GDObject)
"property"(GDStringName)
"value"(GDVariant)
}

func("get_class_list") {
returns(GDPackedStringArray)

}

func("get_inheriters_from_class") {
returns(GDPackedStringArray)
"class"(GDStringName)
}

func("get_parent_class") {
returns(GDStringName)
"class"(GDStringName)
}

func("instantiate") {
returns(GDVariant)
"class"(GDStringName)
}

func("is_class_enabled") {
returns(GDbool)
"class"(GDStringName)
}

func("is_parent_class") {
returns(GDbool)
"class"(GDStringName)
"inherits"(GDStringName)
}
}){

}