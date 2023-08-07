
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCameraFeed: GDType("CameraFeed", {

"feed_is_active"(GDbool)
"feed_transform"(GDTransform2D)
constructor { }

func("get_datatype") {
returns(GDFeedDataType)

}

func("get_id") {
returns(GDint)

}

func("get_name") {
returns(GDString)

}

func("get_position") {
returns(GDFeedPosition)

}
}){

}