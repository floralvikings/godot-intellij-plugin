
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDScriptExtension: GDType("ScriptExtension", {


constructor { }

func("_can_instantiate") {
returns(GDbool)

}

func("_editor_can_reload_from_file") {
returns(GDbool)

}

func("_get_base_script") {
returns(GDScript)

}

func("_get_constants") {
returns(GDDictionary)

}

func("_get_documentation") {
returns(GDTypedArray(GDDictionary::class))

}

func("_get_global_name") {
returns(GDStringName)

}

func("_get_instance_base_type") {
returns(GDStringName)

}

func("_get_language") {
returns(GDScriptLanguage)

}

func("_get_member_line") {
returns(GDint)
"member"(GDStringName)
}

func("_get_members") {
returns(GDTypedArray(GDStringName::class))

}

func("_get_method_info") {
returns(GDDictionary)
"method"(GDStringName)
}

func("_get_property_default_value") {
returns(GDVariant)
"property"(GDStringName)
}

func("_get_rpc_config") {
returns(GDVariant)

}

func("_get_script_method_list") {
returns(GDTypedArray(GDDictionary::class))

}

func("_get_script_property_list") {
returns(GDTypedArray(GDDictionary::class))

}

func("_get_script_signal_list") {
returns(GDTypedArray(GDDictionary::class))

}

func("_get_source_code") {
returns(GDString)

}

func("_has_method") {
returns(GDbool)
"method"(GDStringName)
}

func("_has_property_default_value") {
returns(GDbool)
"property"(GDStringName)
}

func("_has_script_signal") {
returns(GDbool)
"signal"(GDStringName)
}

func("_has_source_code") {
returns(GDbool)

}

func("_inherits_script") {
returns(GDbool)
"script"(GDScript)
}

func("_instance_create") {
returns(GDUnknownType)
"for_object"(GDObject)
}

func("_instance_has") {
returns(GDbool)
"object"(GDObject)
}

func("_is_placeholder_fallback_enabled") {
returns(GDbool)

}

func("_is_tool") {
returns(GDbool)

}

func("_is_valid") {
returns(GDbool)

}

func("_placeholder_erased") {
returns(GDvoid)
"placeholder"(GDUnknownType)
}

func("_placeholder_instance_create") {
returns(GDUnknownType)
"for_object"(GDObject)
}

func("_reload") {
returns(GDError)
"keep_state"(GDbool)
}

func("_set_source_code") {
returns(GDvoid)
"code"(GDString)
}

func("_update_exports") {
returns(GDvoid)

}
}){

}