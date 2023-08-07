
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTLSOptions: GDType("TLSOptions", {


constructor { }

func("client") {
returns(GDSameType)
"trusted_chain"(GDX509Certificate)
"common_name_override"(GDString)
}

func("client_unsafe") {
returns(GDSameType)
"trusted_chain"(GDX509Certificate)
}

func("server") {
returns(GDSameType)
"key"(GDCryptoKey)
"certificate"(GDX509Certificate)
}
}){

}