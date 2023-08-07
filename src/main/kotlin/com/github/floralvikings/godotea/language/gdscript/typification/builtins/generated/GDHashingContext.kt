
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDHashingContext: GDType("HashingContext", {


constructor { }

func("finish") {
returns(GDPackedByteArray)

}

func("start") {
returns(GDError)
"type"(GDHashType)
}

func("update") {
returns(GDError)
"chunk"(GDPackedByteArray)
}
}){

}