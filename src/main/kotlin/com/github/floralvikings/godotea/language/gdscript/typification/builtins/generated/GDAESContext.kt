
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAESContext: GDType("AESContext", {


constructor { }

func("finish") {
returns(GDvoid)

}

func("get_iv_state") {
returns(GDPackedByteArray)

}

func("start") {
returns(GDError)
"mode"(GDMode)
"key"(GDPackedByteArray)
"iv"(GDPackedByteArray)
}

func("update") {
returns(GDPackedByteArray)
"src"(GDPackedByteArray)
}
}){

}