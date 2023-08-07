
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDUndoRedo: GDType("UndoRedo", {


constructor { }

func("add_do_method") {
returns(GDvoid)
"callable"(GDCallable)
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
"callable"(GDCallable)
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

func("clear_history") {
returns(GDvoid)
"increase_version"(GDbool)
}

func("commit_action") {
returns(GDvoid)
"execute"(GDbool)
}

func("create_action") {
returns(GDvoid)
"name"(GDString)
"merge_mode"(GDMergeMode)
"backward_undo_ops"(GDbool)
}

func("end_force_keep_in_merge_ends") {
returns(GDvoid)

}

func("get_action_name") {
returns(GDString)
"id"(GDint)
}

func("get_current_action") {
returns(GDint)

}

func("get_current_action_name") {
returns(GDString)

}

func("get_history_count") {
returns(GDint)

}

func("get_version") {
returns(GDint)

}

func("has_redo") {
returns(GDbool)

}

func("has_undo") {
returns(GDbool)

}

func("is_committing_action") {
returns(GDbool)

}

func("redo") {
returns(GDbool)

}

func("start_force_keep_in_merge_ends") {
returns(GDvoid)

}

func("undo") {
returns(GDbool)

}
}){

}