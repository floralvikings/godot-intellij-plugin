
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDFileDialog: GDType("FileDialog", {

"file_disabled_color"(GDColor)
"file_icon_color"(GDColor)
"folder_icon_color"(GDColor)
"back_folder"(GDTexture2D)
"file"(GDTexture2D)
"folder"(GDTexture2D)
"forward_folder"(GDTexture2D)
"parent_folder"(GDTexture2D)
"reload"(GDTexture2D)
"toggle_hidden"(GDTexture2D)
"access"(GDAccess)
"current_dir"(GDString)
"current_file"(GDString)
"current_path"(GDString)
"dialog_hide_on_ok"(GDbool)
"file_mode"(GDFileMode)
"filters"(GDPackedStringArray)
"mode_overrides_title"(GDbool)
"root_subfolder"(GDString)
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

func("deselect_all") {
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