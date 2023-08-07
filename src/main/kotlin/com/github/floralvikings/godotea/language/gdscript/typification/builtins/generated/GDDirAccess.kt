
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDDirAccess: GDType("DirAccess", {

"include_hidden"(GDbool)
"include_navigational"(GDbool)
constructor { }

func("change_dir") {
returns(GDError)
"to_dir"(GDString)
}

func("copy") {
returns(GDError)
"from"(GDString)
"to"(GDString)
"chmod_flags"(GDint)
}

func("copy_absolute") {
returns(GDError)
"from"(GDString)
"to"(GDString)
"chmod_flags"(GDint)
}

func("current_is_dir") {
returns(GDbool)

}

func("dir_exists") {
returns(GDbool)
"path"(GDString)
}

func("dir_exists_absolute") {
returns(GDbool)
"path"(GDString)
}

func("file_exists") {
returns(GDbool)
"path"(GDString)
}

func("get_current_dir") {
returns(GDString)
"include_drive"(GDbool)
}

func("get_current_drive") {
returns(GDint)

}

func("get_directories") {
returns(GDPackedStringArray)

}

func("get_directories_at") {
returns(GDPackedStringArray)
"path"(GDString)
}

func("get_drive_count") {
returns(GDint)

}

func("get_drive_name") {
returns(GDString)
"idx"(GDint)
}

func("get_files") {
returns(GDPackedStringArray)

}

func("get_files_at") {
returns(GDPackedStringArray)
"path"(GDString)
}

func("get_next") {
returns(GDString)

}

func("get_open_error") {
returns(GDError)

}

func("get_space_left") {
returns(GDint)

}

func("list_dir_begin") {
returns(GDError)

}

func("list_dir_end") {
returns(GDvoid)

}

func("make_dir") {
returns(GDError)
"path"(GDString)
}

func("make_dir_absolute") {
returns(GDError)
"path"(GDString)
}

func("make_dir_recursive") {
returns(GDError)
"path"(GDString)
}

func("make_dir_recursive_absolute") {
returns(GDError)
"path"(GDString)
}

func("open") {
returns(GDSameType)
"path"(GDString)
}

func("remove") {
returns(GDError)
"path"(GDString)
}

func("remove_absolute") {
returns(GDError)
"path"(GDString)
}

func("rename") {
returns(GDError)
"from"(GDString)
"to"(GDString)
}

func("rename_absolute") {
returns(GDError)
"from"(GDString)
"to"(GDString)
}
}){

}