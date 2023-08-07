
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorFileDialog: GDType("EditorFileDialog", {

"access"(GDAccess)
"current_dir"(GDString)
"current_file"(GDString)
"current_path"(GDString)
"dialog_hide_on_ok"(GDbool)
"disable_overwrite_warning"(GDbool)
"display_mode"(GDDisplayMode)
"file_mode"(GDFileMode)
"filters"(GDPackedStringArray)
"show_hidden_files"(GDbool)
"title"(GDString)
constructor { }

func("add_filter") {
returns(GDvoid)
"filter"(GDString)
"description"(GDString)
}

func("clear_filters") {
returns(GDvoid)

}

func("get_line_edit") {
returns(GDLineEdit)

}

func("get_vbox") {
returns(GDVBoxContainer)

}

func("invalidate") {
returns(GDvoid)

}
}){

}