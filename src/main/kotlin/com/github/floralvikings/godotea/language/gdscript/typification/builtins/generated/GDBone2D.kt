
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDBone2D: GDType("Bone2D", {

"rest"(GDTransform2D)
constructor { }

func("apply_rest") {
returns(GDvoid)

}

func("get_autocalculate_length_and_angle") {
returns(GDbool)

}

func("get_bone_angle") {
returns(GDfloat)

}

func("get_index_in_skeleton") {
returns(GDint)

}

func("get_length") {
returns(GDfloat)

}

func("get_skeleton_rest") {
returns(GDTransform2D)

}

func("set_autocalculate_length_and_angle") {
returns(GDvoid)
"auto_calculate"(GDbool)
}

func("set_bone_angle") {
returns(GDvoid)
"angle"(GDfloat)
}

func("set_length") {
returns(GDvoid)
"length"(GDfloat)
}
}){

}