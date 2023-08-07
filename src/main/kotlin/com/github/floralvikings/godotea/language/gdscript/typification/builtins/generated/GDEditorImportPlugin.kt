
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorImportPlugin: GDType("EditorImportPlugin", {


constructor { }

func("_get_import_options") {
returns(GDTypedArray(GDDictionary::class))
"path"(GDString)
"preset_index"(GDint)
}

func("_get_import_order") {
returns(GDint)

}

func("_get_importer_name") {
returns(GDString)

}

func("_get_option_visibility") {
returns(GDbool)
"path"(GDString)
"option_name"(GDStringName)
"options"(GDDictionary)
}

func("_get_preset_count") {
returns(GDint)

}

func("_get_preset_name") {
returns(GDString)
"preset_index"(GDint)
}

func("_get_priority") {
returns(GDfloat)

}

func("_get_recognized_extensions") {
returns(GDPackedStringArray)

}

func("_get_resource_type") {
returns(GDString)

}

func("_get_save_extension") {
returns(GDString)

}

func("_get_visible_name") {
returns(GDString)

}

func("_import") {
returns(GDError)
"source_file"(GDString)
"save_path"(GDString)
"options"(GDDictionary)
"platform_variants"(GDTypedArray(GDString::class))
"gen_files"(GDTypedArray(GDString::class))
}

func("append_import_external_resource") {
returns(GDError)
"path"(GDString)
"custom_options"(GDDictionary)
"custom_importer"(GDString)
"generator_parameters"(GDVariant)
}
}){

}