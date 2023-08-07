
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorInspectorPlugin: GDType("EditorInspectorPlugin", {


constructor { }

func("_can_handle") {
returns(GDbool)
"object"(GDObject)
}

func("_parse_begin") {
returns(GDvoid)
"object"(GDObject)
}

func("_parse_category") {
returns(GDvoid)
"object"(GDObject)
"category"(GDString)
}

func("_parse_end") {
returns(GDvoid)
"object"(GDObject)
}

func("_parse_group") {
returns(GDvoid)
"object"(GDObject)
"group"(GDString)
}

func("_parse_property") {
returns(GDbool)
"object"(GDObject)
"type"(GDVariantType)
"name"(GDString)
"hint_type"(GDPropertyHint)
"hint_string"(GDString)
"usage_flags"(GDUnknownType)
"wide"(GDbool)
}

func("add_custom_control") {
returns(GDvoid)
"control"(GDControl)
}

func("add_property_editor") {
returns(GDvoid)
"property"(GDString)
"editor"(GDControl)
"add_to_end"(GDbool)
}

func("add_property_editor_for_multiple_properties") {
returns(GDvoid)
"label"(GDString)
"properties"(GDPackedStringArray)
"editor"(GDControl)
}
}){

}