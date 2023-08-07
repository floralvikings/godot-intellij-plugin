
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGDExtensionManager: GDType("GDExtensionManager", {


constructor { }

func("get_extension") {
returns(GDGDExtension)
"path"(GDString)
}

func("get_loaded_extensions") {
returns(GDPackedStringArray)

}

func("is_extension_loaded") {
returns(GDbool)
"path"(GDString)
}

func("load_extension") {
returns(GDLoadStatus)
"path"(GDString)
}

func("reload_extension") {
returns(GDLoadStatus)
"path"(GDString)
}

func("unload_extension") {
returns(GDLoadStatus)
"path"(GDString)
}
}){

}