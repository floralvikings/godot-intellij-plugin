
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorResourcePicker: GDType("EditorResourcePicker", {

"base_type"(GDString)
"editable"(GDbool)
"edited_resource"(GDResource)
"toggle_mode"(GDbool)
constructor { }

func("_handle_menu_selected") {
returns(GDbool)
"id"(GDint)
}

func("_set_create_options") {
returns(GDvoid)
"menu_node"(GDObject)
}

func("get_allowed_types") {
returns(GDPackedStringArray)

}

func("set_toggle_pressed") {
returns(GDvoid)
"pressed"(GDbool)
}
}){

}