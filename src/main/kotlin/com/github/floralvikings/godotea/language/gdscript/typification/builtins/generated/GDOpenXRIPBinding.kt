
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDOpenXRIPBinding: GDType("OpenXRIPBinding", {

"action"(GDOpenXRAction)
"paths"(GDPackedStringArray)
constructor { }

func("add_path") {
returns(GDvoid)
"path"(GDString)
}

func("get_path_count") {
returns(GDint)

}

func("has_path") {
returns(GDbool)
"path"(GDString)
}

func("remove_path") {
returns(GDvoid)
"path"(GDString)
}
}){

}