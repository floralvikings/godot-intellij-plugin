
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDResourceFormatSaver: GDType("ResourceFormatSaver", {


constructor { }

func("_get_recognized_extensions") {
returns(GDPackedStringArray)
"resource"(GDResource)
}

func("_recognize") {
returns(GDbool)
"resource"(GDResource)
}

func("_recognize_path") {
returns(GDbool)
"resource"(GDResource)
"path"(GDString)
}

func("_save") {
returns(GDError)
"resource"(GDResource)
"path"(GDString)
"flags"(GDint)
}

func("_set_uid") {
returns(GDError)
"path"(GDString)
"uid"(GDint)
}
}){

}