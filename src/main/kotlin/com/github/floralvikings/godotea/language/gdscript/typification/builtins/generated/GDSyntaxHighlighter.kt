
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSyntaxHighlighter: GDType("SyntaxHighlighter", {


constructor { }

func("_clear_highlighting_cache") {
returns(GDvoid)

}

func("_get_line_syntax_highlighting") {
returns(GDDictionary)
"line"(GDint)
}

func("_update_cache") {
returns(GDvoid)

}

func("clear_highlighting_cache") {
returns(GDvoid)

}

func("get_line_syntax_highlighting") {
returns(GDDictionary)
"line"(GDint)
}

func("get_text_edit") {
returns(GDTextEdit)

}

func("update_cache") {
returns(GDvoid)

}
}){

}