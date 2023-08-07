
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorProperty: GDType("EditorProperty", {

"checkable"(GDbool)
"checked"(GDbool)
"deletable"(GDbool)
"draw_warning"(GDbool)
"keying"(GDbool)
"label"(GDString)
"read_only"(GDbool)
constructor { }

func("_set_read_only") {
returns(GDvoid)
"read_only"(GDbool)
}

func("_update_property") {
returns(GDvoid)

}

func("add_focusable") {
returns(GDvoid)
"control"(GDControl)
}

func("emit_changed") {
returns(GDvoid)
"property"(GDStringName)
"value"(GDVariant)
"field"(GDStringName)
"changing"(GDbool)
}

func("get_edited_object") {
returns(GDObject)

}

func("get_edited_property") {
returns(GDStringName)

}

func("set_bottom_editor") {
returns(GDvoid)
"editor"(GDControl)
}

func("update_property") {
returns(GDvoid)

}
}){

}