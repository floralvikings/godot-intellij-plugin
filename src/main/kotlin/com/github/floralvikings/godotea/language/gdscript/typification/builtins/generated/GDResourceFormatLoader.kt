
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDResourceFormatLoader: GDType("ResourceFormatLoader", {


constructor { }

func("_exists") {
returns(GDbool)
"path"(GDString)
}

func("_get_classes_used") {
returns(GDPackedStringArray)
"path"(GDString)
}

func("_get_dependencies") {
returns(GDPackedStringArray)
"path"(GDString)
"add_types"(GDbool)
}

func("_get_recognized_extensions") {
returns(GDPackedStringArray)

}

func("_get_resource_script_class") {
returns(GDString)
"path"(GDString)
}

func("_get_resource_type") {
returns(GDString)
"path"(GDString)
}

func("_get_resource_uid") {
returns(GDint)
"path"(GDString)
}

func("_handles_type") {
returns(GDbool)
"type"(GDStringName)
}

func("_load") {
returns(GDVariant)
"path"(GDString)
"original_path"(GDString)
"use_sub_threads"(GDbool)
"cache_mode"(GDint)
}

func("_recognize_path") {
returns(GDbool)
"path"(GDString)
"type"(GDStringName)
}

func("_rename_dependencies") {
returns(GDError)
"path"(GDString)
"renames"(GDDictionary)
}
}){

}