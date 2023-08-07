
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPropertyTweener: GDType("PropertyTweener", {


constructor { }

func("as_relative") {
returns(GDSameType)

}

func("from") {
returns(GDSameType)
"value"(GDVariant)
}

func("from_current") {
returns(GDSameType)

}

func("set_delay") {
returns(GDSameType)
"delay"(GDfloat)
}

func("set_ease") {
returns(GDSameType)
"ease"(GDEaseType)
}

func("set_trans") {
returns(GDSameType)
"trans"(GDTransitionType)
}
}){

}