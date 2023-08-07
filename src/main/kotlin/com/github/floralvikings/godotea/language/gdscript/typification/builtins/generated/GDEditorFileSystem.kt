
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorFileSystem: GDType("EditorFileSystem", {


constructor { }

func("get_file_type") {
returns(GDString)
"path"(GDString)
}

func("get_filesystem") {
returns(GDEditorFileSystemDirectory)

}

func("get_filesystem_path") {
returns(GDEditorFileSystemDirectory)
"path"(GDString)
}

func("get_scanning_progress") {
returns(GDfloat)

}

func("is_scanning") {
returns(GDbool)

}

func("reimport_files") {
returns(GDvoid)
"files"(GDPackedStringArray)
}

func("scan") {
returns(GDvoid)

}

func("scan_sources") {
returns(GDvoid)

}

func("update_file") {
returns(GDvoid)
"path"(GDString)
}
}){

}