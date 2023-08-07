
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDWebXRInterface: GDType("WebXRInterface", {

"optional_features"(GDString)
"reference_space_type"(GDString)
"requested_reference_space_types"(GDString)
"required_features"(GDString)
"session_mode"(GDString)
"visibility_state"(GDString)
constructor { }

func("get_available_display_refresh_rates") {
returns(GDArray)

}

func("get_display_refresh_rate") {
returns(GDfloat)

}

func("get_input_source_target_ray_mode") {
returns(GDTargetRayMode)
"input_source_id"(GDint)
}

func("get_input_source_tracker") {
returns(GDXRPositionalTracker)
"input_source_id"(GDint)
}

func("is_input_source_active") {
returns(GDbool)
"input_source_id"(GDint)
}

func("is_session_supported") {
returns(GDvoid)
"session_mode"(GDString)
}

func("set_display_refresh_rate") {
returns(GDvoid)
"refresh_rate"(GDfloat)
}
}){

}