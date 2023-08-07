
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDResourceSaver: GDType("ResourceSaver", {


constructor { }

func("add_resource_format_saver") {
returns(GDvoid)
"format_saver"(GDResourceFormatSaver)
"at_front"(GDbool)
}

func("get_recognized_extensions") {
returns(GDPackedStringArray)
"type"(GDResource)
}

func("remove_resource_format_saver") {
returns(GDvoid)
"format_saver"(GDResourceFormatSaver)
}

func("save") {
returns(GDError)
"resource"(GDResource)
"path"(GDString)
"flags"(GDUnknownType)
}
}){

}