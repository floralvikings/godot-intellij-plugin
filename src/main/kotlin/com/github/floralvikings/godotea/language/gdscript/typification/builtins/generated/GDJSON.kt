
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDJSON: GDType("JSON", {

"data"(GDVariant)
constructor { }

func("get_error_line") {
returns(GDint)

}

func("get_error_message") {
returns(GDString)

}

func("get_parsed_text") {
returns(GDString)

}

func("parse") {
returns(GDError)
"json_text"(GDString)
"keep_text"(GDbool)
}

func("parse_string") {
returns(GDVariant)
"json_string"(GDString)
}

func("stringify") {
returns(GDString)
"data"(GDVariant)
"indent"(GDString)
"sort_keys"(GDbool)
"full_precision"(GDbool)
}
}){

}