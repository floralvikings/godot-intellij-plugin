
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDOpenXRInteractionProfile: GDType("OpenXRInteractionProfile", {

"bindings"(GDArray)
"interaction_profile_path"(GDString)
constructor { }

func("get_binding") {
returns(GDOpenXRIPBinding)
"index"(GDint)
}

func("get_binding_count") {
returns(GDint)

}
}){

}