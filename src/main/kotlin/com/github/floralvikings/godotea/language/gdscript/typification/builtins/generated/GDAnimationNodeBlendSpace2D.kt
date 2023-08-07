
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimationNodeBlendSpace2D: GDType("AnimationNodeBlendSpace2D", {

"auto_triangles"(GDbool)
"blend_mode"(GDBlendMode)
"max_space"(GDVector2)
"min_space"(GDVector2)
"snap"(GDVector2)
"sync"(GDbool)
"x_label"(GDString)
"y_label"(GDString)
constructor { }

func("add_blend_point") {
returns(GDvoid)
"node"(GDAnimationRootNode)
"pos"(GDVector2)
"at_index"(GDint)
}

func("add_triangle") {
returns(GDvoid)
"x"(GDint)
"y"(GDint)
"z"(GDint)
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
returns(GDVector2)
"point"(GDint)
}

func("get_triangle_count") {
returns(GDint)

}

func("get_triangle_point") {
returns(GDint)
"triangle"(GDint)
"point"(GDint)
}

func("remove_blend_point") {
returns(GDvoid)
"point"(GDint)
}

func("remove_triangle") {
returns(GDvoid)
"triangle"(GDint)
}

func("set_blend_point_node") {
returns(GDvoid)
"point"(GDint)
"node"(GDAnimationRootNode)
}

func("set_blend_point_position") {
returns(GDvoid)
"point"(GDint)
"pos"(GDVector2)
}
}){

}