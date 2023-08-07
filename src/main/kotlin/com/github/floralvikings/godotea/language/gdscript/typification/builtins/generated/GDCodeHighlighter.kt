
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCodeHighlighter: GDType("CodeHighlighter", {

"color_regions"(GDDictionary)
"function_color"(GDColor)
"keyword_colors"(GDDictionary)
"member_keyword_colors"(GDDictionary)
"member_variable_color"(GDColor)
"number_color"(GDColor)
"symbol_color"(GDColor)
constructor { }

func("add_color_region") {
returns(GDvoid)
"start_key"(GDString)
"end_key"(GDString)
"color"(GDColor)
"line_only"(GDbool)
}

func("add_keyword_color") {
returns(GDvoid)
"keyword"(GDString)
"color"(GDColor)
}

func("add_member_keyword_color") {
returns(GDvoid)
"member_keyword"(GDString)
"color"(GDColor)
}

func("clear_color_regions") {
returns(GDvoid)

}

func("clear_keyword_colors") {
returns(GDvoid)

}

func("clear_member_keyword_colors") {
returns(GDvoid)

}

func("get_keyword_color") {
returns(GDColor)
"keyword"(GDString)
}

func("get_member_keyword_color") {
returns(GDColor)
"member_keyword"(GDString)
}

func("has_color_region") {
returns(GDbool)
"start_key"(GDString)
}

func("has_keyword_color") {
returns(GDbool)
"keyword"(GDString)
}

func("has_member_keyword_color") {
returns(GDbool)
"member_keyword"(GDString)
}

func("remove_color_region") {
returns(GDvoid)
"start_key"(GDString)
}

func("remove_keyword_color") {
returns(GDvoid)
"keyword"(GDString)
}

func("remove_member_keyword_color") {
returns(GDvoid)
"member_keyword"(GDString)
}
}){

}