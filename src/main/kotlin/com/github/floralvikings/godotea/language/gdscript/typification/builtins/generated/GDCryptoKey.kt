
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCryptoKey: GDType("CryptoKey", {


constructor { }

func("is_public_only") {
returns(GDbool)

}

func("load") {
returns(GDError)
"path"(GDString)
"public_only"(GDbool)
}

func("load_from_string") {
returns(GDError)
"string_key"(GDString)
"public_only"(GDbool)
}

func("save") {
returns(GDError)
"path"(GDString)
"public_only"(GDbool)
}

func("save_to_string") {
returns(GDString)
"public_only"(GDbool)
}
}){

}