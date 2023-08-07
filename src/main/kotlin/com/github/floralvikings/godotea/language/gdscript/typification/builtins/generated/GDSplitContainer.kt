
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSplitContainer: GDType("SplitContainer", {

"autohide"(GDint)
"minimum_grab_thickness"(GDint)
"separation"(GDint)
"h_grabber"(GDTexture2D)
"v_grabber"(GDTexture2D)
"collapsed"(GDbool)
"dragger_visibility"(GDDraggerVisibility)
"split_offset"(GDint)
"vertical"(GDbool)
constructor { }

func("clamp_split_offset") {
returns(GDvoid)

}
}){

}