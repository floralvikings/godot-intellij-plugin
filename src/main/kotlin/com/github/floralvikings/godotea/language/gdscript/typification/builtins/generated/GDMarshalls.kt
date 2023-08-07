
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMarshalls: GDType("Marshalls", {


constructor { }

func("base64_to_raw") {
returns(GDPackedByteArray)
"base64_str"(GDString)
}

func("base64_to_utf8") {
returns(GDString)
"base64_str"(GDString)
}

func("base64_to_variant") {
returns(GDVariant)
"base64_str"(GDString)
"allow_objects"(GDbool)
}

func("raw_to_base64") {
returns(GDString)
"array"(GDPackedByteArray)
}

func("utf8_to_base64") {
returns(GDString)
"utf8_str"(GDString)
}

func("variant_to_base64") {
returns(GDString)
"variant"(GDVariant)
"full_objects"(GDbool)
}
}){

}