
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDScriptLanguageExtension: GDType("ScriptLanguageExtension", {


constructor { }

func("_add_global_constant") {
returns(GDvoid)
"name"(GDStringName)
"value"(GDVariant)
}

func("_add_named_global_constant") {
returns(GDvoid)
"name"(GDStringName)
"value"(GDVariant)
}

func("_auto_indent_code") {
returns(GDString)
"code"(GDString)
"from_line"(GDint)
"to_line"(GDint)
}

func("_can_inherit_from_file") {
returns(GDbool)

}

func("_complete_code") {
returns(GDDictionary)
"code"(GDString)
"path"(GDString)
"owner"(GDObject)
}

func("_create_script") {
returns(GDObject)

}

func("_debug_get_current_stack_info") {
returns(GDTypedArray(GDDictionary::class))

}

func("_debug_get_error") {
returns(GDString)

}

func("_debug_get_globals") {
returns(GDDictionary)
"max_subitems"(GDint)
"max_depth"(GDint)
}

func("_debug_get_stack_level_count") {
returns(GDint)

}

func("_debug_get_stack_level_function") {
returns(GDString)
"level"(GDint)
}

func("_debug_get_stack_level_instance") {
returns(GDUnknownType)
"level"(GDint)
}

func("_debug_get_stack_level_line") {
returns(GDint)
"level"(GDint)
}

func("_debug_get_stack_level_locals") {
returns(GDDictionary)
"level"(GDint)
"max_subitems"(GDint)
"max_depth"(GDint)
}

func("_debug_get_stack_level_members") {
returns(GDDictionary)
"level"(GDint)
"max_subitems"(GDint)
"max_depth"(GDint)
}

func("_debug_parse_stack_level_expression") {
returns(GDString)
"level"(GDint)
"expression"(GDString)
"max_subitems"(GDint)
"max_depth"(GDint)
}

func("_find_function") {
returns(GDint)
"class_name"(GDString)
"function_name"(GDString)
}

func("_finish") {
returns(GDvoid)

}

func("_frame") {
returns(GDvoid)

}

func("_get_built_in_templates") {
returns(GDTypedArray(GDDictionary::class))
"object"(GDStringName)
}

func("_get_comment_delimiters") {
returns(GDPackedStringArray)

}

func("_get_extension") {
returns(GDString)

}

func("_get_global_class_name") {
returns(GDDictionary)
"path"(GDString)
}

func("_get_name") {
returns(GDString)

}

func("_get_public_annotations") {
returns(GDTypedArray(GDDictionary::class))

}

func("_get_public_constants") {
returns(GDDictionary)

}

func("_get_public_functions") {
returns(GDTypedArray(GDDictionary::class))

}

func("_get_recognized_extensions") {
returns(GDPackedStringArray)

}

func("_get_reserved_words") {
returns(GDPackedStringArray)

}

func("_get_string_delimiters") {
returns(GDPackedStringArray)

}

func("_get_type") {
returns(GDString)

}

func("_handles_global_class_type") {
returns(GDbool)
"type"(GDString)
}

func("_has_named_classes") {
returns(GDbool)

}

func("_init") {
returns(GDvoid)

}

func("_is_control_flow_keyword") {
returns(GDbool)
"keyword"(GDString)
}

func("_is_using_templates") {
returns(GDbool)

}

func("_lookup_code") {
returns(GDDictionary)
"code"(GDString)
"symbol"(GDString)
"path"(GDString)
"owner"(GDObject)
}

func("_make_function") {
returns(GDString)
"class_name"(GDString)
"function_name"(GDString)
"function_args"(GDPackedStringArray)
}

func("_make_template") {
returns(GDScript)
"template"(GDString)
"class_name"(GDString)
"base_class_name"(GDString)
}

func("_open_in_external_editor") {
returns(GDError)
"script"(GDScript)
"line"(GDint)
"column"(GDint)
}

func("_overrides_external_editor") {
returns(GDbool)

}

func("_profiling_get_accumulated_data") {
returns(GDint)
"info_array"(GDUnknownType)
"info_max"(GDint)
}

func("_profiling_get_frame_data") {
returns(GDint)
"info_array"(GDUnknownType)
"info_max"(GDint)
}

func("_profiling_start") {
returns(GDvoid)

}

func("_profiling_stop") {
returns(GDvoid)

}

func("_reload_all_scripts") {
returns(GDvoid)

}

func("_reload_tool_script") {
returns(GDvoid)
"script"(GDScript)
"soft_reload"(GDbool)
}

func("_remove_named_global_constant") {
returns(GDvoid)
"name"(GDStringName)
}

func("_supports_builtin_mode") {
returns(GDbool)

}

func("_supports_documentation") {
returns(GDbool)

}

func("_thread_enter") {
returns(GDvoid)

}

func("_thread_exit") {
returns(GDvoid)

}

func("_validate") {
returns(GDDictionary)
"script"(GDString)
"path"(GDString)
"validate_functions"(GDbool)
"validate_errors"(GDbool)
"validate_warnings"(GDbool)
"validate_safe_lines"(GDbool)
}

func("_validate_path") {
returns(GDString)
"path"(GDString)
}
}){

}