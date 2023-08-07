
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDHMACContext: GDType("HMACContext", {


constructor { }

func("finish") {
returns(GDPackedByteArray)

}

func("start") {
returns(GDError)
"hash_type"(GDHashType)
"key"(GDPackedByteArray)
}

func("update") {
returns(GDError)
"data"(GDPackedByteArray)
}
}){

}