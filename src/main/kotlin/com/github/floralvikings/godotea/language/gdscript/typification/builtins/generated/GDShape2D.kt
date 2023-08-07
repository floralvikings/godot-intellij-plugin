
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDShape2D: GDType("Shape2D", {

"custom_solver_bias"(GDfloat)
constructor { }

func("collide") {
returns(GDbool)
"local_xform"(GDTransform2D)
"with_shape"(GDSameType)
"shape_xform"(GDTransform2D)
}

func("collide_and_get_contacts") {
returns(GDPackedVector2Array)
"local_xform"(GDTransform2D)
"with_shape"(GDSameType)
"shape_xform"(GDTransform2D)
}

func("collide_with_motion") {
returns(GDbool)
"local_xform"(GDTransform2D)
"local_motion"(GDVector2)
"with_shape"(GDSameType)
"shape_xform"(GDTransform2D)
"shape_motion"(GDVector2)
}

func("collide_with_motion_and_get_contacts") {
returns(GDPackedVector2Array)
"local_xform"(GDTransform2D)
"local_motion"(GDVector2)
"with_shape"(GDSameType)
"shape_xform"(GDTransform2D)
"shape_motion"(GDVector2)
}

func("draw") {
returns(GDvoid)
"canvas_item"(GDRID)
"color"(GDColor)
}

func("get_rect") {
returns(GDRect2)

}
}){

}