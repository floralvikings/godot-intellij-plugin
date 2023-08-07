
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorScenePostImportPlugin: GDType("EditorScenePostImportPlugin", {


constructor { }

func("_get_import_options") {
returns(GDvoid)
"path"(GDString)
}

func("_get_internal_import_options") {
returns(GDvoid)
"category"(GDint)
}

func("_get_internal_option_update_view_required") {
returns(GDVariant)
"category"(GDint)
"option"(GDString)
}

func("_get_internal_option_visibility") {
returns(GDVariant)
"category"(GDint)
"for_animation"(GDbool)
"option"(GDString)
}

func("_get_option_visibility") {
returns(GDVariant)
"path"(GDString)
"for_animation"(GDbool)
"option"(GDString)
}

func("_internal_process") {
returns(GDvoid)
"category"(GDint)
"base_node"(GDNode)
"node"(GDNode)
"resource"(GDResource)
}

func("_post_process") {
returns(GDvoid)
"scene"(GDNode)
}

func("_pre_process") {
returns(GDvoid)
"scene"(GDNode)
}

func("add_import_option") {
returns(GDvoid)
"name"(GDString)
"value"(GDVariant)
}

func("add_import_option_advanced") {
returns(GDvoid)
"type"(GDVariantType)
"name"(GDString)
"default_value"(GDVariant)
"hint"(GDPropertyHint)
"hint_string"(GDString)
"usage_flags"(GDint)
}

func("get_option_value") {
returns(GDVariant)
"name"(GDStringName)
}
}){

}