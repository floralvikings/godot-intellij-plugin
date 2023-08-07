
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimationNodeBlendSpace1D: GDType("AnimationNodeBlendSpace1D", {

"blend_mode"(GDBlendMode)
"max_space"(GDfloat)
"min_space"(GDfloat)
"snap"(GDfloat)
"sync"(GDbool)
"value_label"(GDString)
constructor { }

func("add_blend_point") {
returns(GDvoid)
"node"(GDAnimationRootNode)
"pos"(GDfloat)
"at_index"(GDint)
}

func("get_blend_point_count") {
returns(GDint)

}

func("get_blend_point_node") {
returns(GDAnimationRootNode)
"point"(GDint)
}

func("get_blend_point_position") {
returns(GDfloat)
"point"(GDint)
}

func("remove_blend_point") {
returns(GDvoid)
"point"(GDint)
}

func("set_blend_point_node") {
returns(GDvoid)
"point"(GDint)
"node"(GDAnimationRootNode)
}

func("set_blend_point_position") {
returns(GDvoid)
"point"(GDint)
"pos"(GDfloat)
}
}){

}