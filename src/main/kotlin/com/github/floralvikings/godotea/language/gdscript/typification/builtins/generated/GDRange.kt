
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRange: GDType("Range", {

"allow_greater"(GDbool)
"allow_lesser"(GDbool)
"exp_edit"(GDbool)
"max_value"(GDfloat)
"min_value"(GDfloat)
"page"(GDfloat)
"ratio"(GDfloat)
"rounded"(GDbool)
"size_flags_vertical"(GDUnknownType)
"step"(GDfloat)
"value"(GDfloat)
constructor { }

func("_value_changed") {
returns(GDvoid)
"new_value"(GDfloat)
}

func("set_value_no_signal") {
returns(GDvoid)
"value"(GDfloat)
}

func("share") {
returns(GDvoid)
"with"(GDNode)
}

func("unshare") {
returns(GDvoid)

}
}){

}