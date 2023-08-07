
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDConfigFile: GDType("ConfigFile", {


constructor { }

func("clear") {
returns(GDvoid)

}

func("encode_to_text") {
returns(GDString)

}

func("erase_section") {
returns(GDvoid)
"section"(GDString)
}

func("erase_section_key") {
returns(GDvoid)
"section"(GDString)
"key"(GDString)
}

func("get_section_keys") {
returns(GDPackedStringArray)
"section"(GDString)
}

func("get_sections") {
returns(GDPackedStringArray)

}

func("get_value") {
returns(GDVariant)
"section"(GDString)
"key"(GDString)
"default"(GDVariant)
}

func("has_section") {
returns(GDbool)
"section"(GDString)
}

func("has_section_key") {
returns(GDbool)
"section"(GDString)
"key"(GDString)
}

func("load") {
returns(GDError)
"path"(GDString)
}

func("load_encrypted") {
returns(GDError)
"path"(GDString)
"key"(GDPackedByteArray)
}

func("load_encrypted_pass") {
returns(GDError)
"path"(GDString)
"password"(GDString)
}

func("parse") {
returns(GDError)
"data"(GDString)
}

func("save") {
returns(GDError)
"path"(GDString)
}

func("save_encrypted") {
returns(GDError)
"path"(GDString)
"key"(GDPackedByteArray)
}

func("save_encrypted_pass") {
returns(GDError)
"path"(GDString)
"password"(GDString)
}

func("set_value") {
returns(GDvoid)
"section"(GDString)
"key"(GDString)
"value"(GDVariant)
}
}){

}