
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCameraAttributesPhysical: GDType("CameraAttributesPhysical", {

"auto_exposure_max_exposure_value"(GDfloat)
"auto_exposure_min_exposure_value"(GDfloat)
"exposure_aperture"(GDfloat)
"exposure_shutter_speed"(GDfloat)
"frustum_far"(GDfloat)
"frustum_focal_length"(GDfloat)
"frustum_focus_distance"(GDfloat)
"frustum_near"(GDfloat)
constructor { }

func("get_fov") {
returns(GDfloat)

}
}){

}