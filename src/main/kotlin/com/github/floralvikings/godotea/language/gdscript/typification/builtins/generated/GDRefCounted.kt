
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRefCounted: GDType("RefCounted", {


constructor { }

func("get_reference_count") {
returns(GDint)

}

func("init_ref") {
returns(GDbool)

}

func("reference") {
returns(GDbool)

}

func("unreference") {
returns(GDbool)

}
}){

}