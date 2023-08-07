
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRegExMatch: GDType("RegExMatch", {

"names"(GDDictionary)
"strings"(GDPackedStringArray)
"subject"(GDString)
constructor { }

func("get_end") {
returns(GDint)
"name"(GDVariant)
}

func("get_group_count") {
returns(GDint)

}

func("get_start") {
returns(GDint)
"name"(GDVariant)
}

func("get_string") {
returns(GDString)
"name"(GDVariant)
}
}){

}