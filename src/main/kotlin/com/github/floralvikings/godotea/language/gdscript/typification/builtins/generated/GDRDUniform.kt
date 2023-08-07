
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRDUniform: GDType("RDUniform", {

"binding"(GDint)
"uniform_type"(GDUniformType)
constructor { }

func("add_id") {
returns(GDvoid)
"id"(GDRID)
}

func("clear_ids") {
returns(GDvoid)

}

func("get_ids") {
returns(GDTypedArray(GDRID::class))

}
}){

}