
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGDExtension: GDType("GDExtension", {


constructor { }

func("close_library") {
returns(GDvoid)

}

func("get_minimum_library_initialization_level") {
returns(GDInitializationLevel)

}

func("initialize_library") {
returns(GDvoid)
"level"(GDInitializationLevel)
}

func("is_library_open") {
returns(GDbool)

}

func("open_library") {
returns(GDError)
"path"(GDString)
"entry_symbol"(GDString)
}
}){

}