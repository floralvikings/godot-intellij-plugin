
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRegEx: GDType("RegEx", {


constructor { }

func("clear") {
returns(GDvoid)

}

func("compile") {
returns(GDError)
"pattern"(GDString)
}

func("create_from_string") {
returns(GDSameType)
"pattern"(GDString)
}

func("get_group_count") {
returns(GDint)

}

func("get_names") {
returns(GDPackedStringArray)

}

func("get_pattern") {
returns(GDString)

}

func("is_valid") {
returns(GDbool)

}

func("search") {
returns(GDRegExMatch)
"subject"(GDString)
"offset"(GDint)
"end"(GDint)
}

func("search_all") {
returns(GDTypedArray(GDRegExMatch::class))
"subject"(GDString)
"offset"(GDint)
"end"(GDint)
}

func("sub") {
returns(GDString)
"subject"(GDString)
"replacement"(GDString)
"all"(GDbool)
"offset"(GDint)
"end"(GDint)
}
}){

}