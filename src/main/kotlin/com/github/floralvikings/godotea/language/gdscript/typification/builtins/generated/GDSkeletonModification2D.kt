
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeletonModification2D: GDType("SkeletonModification2D", {

"enabled"(GDbool)
"execution_mode"(GDint)
constructor { }

func("_draw_editor_gizmo") {
returns(GDvoid)

}

func("_execute") {
returns(GDvoid)
"delta"(GDfloat)
}

func("_setup_modification") {
returns(GDvoid)
"modification_stack"(GDSkeletonModificationStack2D)
}

func("clamp_angle") {
returns(GDfloat)
"angle"(GDfloat)
"min"(GDfloat)
"max"(GDfloat)
"invert"(GDbool)
}

func("get_editor_draw_gizmo") {
returns(GDbool)

}

func("get_is_setup") {
returns(GDbool)

}

func("get_modification_stack") {
returns(GDSkeletonModificationStack2D)

}

func("set_editor_draw_gizmo") {
returns(GDvoid)
"draw_gizmo"(GDbool)
}

func("set_is_setup") {
returns(GDvoid)
"is_setup"(GDbool)
}
}){

}