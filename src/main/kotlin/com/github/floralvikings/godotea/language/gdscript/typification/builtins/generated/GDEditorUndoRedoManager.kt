
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorUndoRedoManager: GDType("EditorUndoRedoManager", {


constructor { }

func("add_do_method") {
returns(GDvoid)
"object"(GDObject)
"method"(GDStringName)
}

func("add_do_property") {
returns(GDvoid)
"object"(GDObject)
"property"(GDStringName)
"value"(GDVariant)
}

func("add_do_reference") {
returns(GDvoid)
"object"(GDObject)
}

func("add_undo_method") {
returns(GDvoid)
"object"(GDObject)
"method"(GDStringName)
}

func("add_undo_property") {
returns(GDvoid)
"object"(GDObject)
"property"(GDStringName)
"value"(GDVariant)
}

func("add_undo_reference") {
returns(GDvoid)
"object"(GDObject)
}

func("commit_action") {
returns(GDvoid)
"execute"(GDbool)
}

func("create_action") {
returns(GDvoid)
"name"(GDString)
"merge_mode"(GDMergeMode)
"custom_context"(GDObject)
"backward_undo_ops"(GDbool)
}

func("get_history_undo_redo") {
returns(GDUndoRedo)
"id"(GDint)
}

func("get_object_history_id") {
returns(GDint)
"object"(GDObject)
}

func("is_committing_action") {
returns(GDbool)

}
}){

}