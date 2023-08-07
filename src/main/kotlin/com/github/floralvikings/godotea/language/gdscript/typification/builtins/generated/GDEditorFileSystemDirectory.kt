
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorFileSystemDirectory: GDType("EditorFileSystemDirectory", {


constructor { }

func("find_dir_index") {
returns(GDint)
"name"(GDString)
}

func("find_file_index") {
returns(GDint)
"name"(GDString)
}

func("get_file") {
returns(GDString)
"idx"(GDint)
}

func("get_file_count") {
returns(GDint)

}

func("get_file_import_is_valid") {
returns(GDbool)
"idx"(GDint)
}

func("get_file_path") {
returns(GDString)
"idx"(GDint)
}

func("get_file_script_class_extends") {
returns(GDString)
"idx"(GDint)
}

func("get_file_script_class_name") {
returns(GDString)
"idx"(GDint)
}

func("get_file_type") {
returns(GDStringName)
"idx"(GDint)
}

func("get_name") {
returns(GDString)

}

func("get_parent") {
returns(GDSameType)

}

func("get_path") {
returns(GDString)

}

func("get_subdir") {
returns(GDSameType)
"idx"(GDint)
}

func("get_subdir_count") {
returns(GDint)

}
}){

}