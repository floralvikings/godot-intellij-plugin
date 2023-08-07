
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDOpenXRActionMap: GDType("OpenXRActionMap", {

"action_sets"(GDArray)
"interaction_profiles"(GDArray)
constructor { }

func("add_action_set") {
returns(GDvoid)
"action_set"(GDOpenXRActionSet)
}

func("add_interaction_profile") {
returns(GDvoid)
"interaction_profile"(GDOpenXRInteractionProfile)
}

func("create_default_action_sets") {
returns(GDvoid)

}

func("find_action_set") {
returns(GDOpenXRActionSet)
"name"(GDString)
}

func("find_interaction_profile") {
returns(GDOpenXRInteractionProfile)
"name"(GDString)
}

func("get_action_set") {
returns(GDOpenXRActionSet)
"idx"(GDint)
}

func("get_action_set_count") {
returns(GDint)

}

func("get_interaction_profile") {
returns(GDOpenXRInteractionProfile)
"idx"(GDint)
}

func("get_interaction_profile_count") {
returns(GDint)

}

func("remove_action_set") {
returns(GDvoid)
"action_set"(GDOpenXRActionSet)
}

func("remove_interaction_profile") {
returns(GDvoid)
"interaction_profile"(GDOpenXRInteractionProfile)
}
}){

}