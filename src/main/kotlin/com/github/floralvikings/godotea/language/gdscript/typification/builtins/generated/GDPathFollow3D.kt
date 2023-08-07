
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPathFollow3D: GDType("PathFollow3D", {

"cubic_interp"(GDbool)
"h_offset"(GDfloat)
"loop"(GDbool)
"progress"(GDfloat)
"progress_ratio"(GDfloat)
"rotation_mode"(GDRotationMode)
"tilt_enabled"(GDbool)
"use_model_front"(GDbool)
"v_offset"(GDfloat)
constructor { }

func("correct_posture") {
returns(GDTransform3D)
"transform"(GDTransform3D)
"rotation_mode"(GDRotationMode)
}
}){

}