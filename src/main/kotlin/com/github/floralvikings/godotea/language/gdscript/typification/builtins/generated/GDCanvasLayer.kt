
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCanvasLayer: GDType("CanvasLayer", {

"custom_viewport"(GDNode)
"follow_viewport_enabled"(GDbool)
"follow_viewport_scale"(GDfloat)
"layer"(GDint)
"offset"(GDVector2)
"rotation"(GDfloat)
"scale"(GDVector2)
"transform"(GDTransform2D)
"visible"(GDbool)
constructor { }

func("get_canvas") {
returns(GDRID)

}

func("get_final_transform") {
returns(GDTransform2D)

}

func("hide") {
returns(GDvoid)

}

func("show") {
returns(GDvoid)

}
}){

}