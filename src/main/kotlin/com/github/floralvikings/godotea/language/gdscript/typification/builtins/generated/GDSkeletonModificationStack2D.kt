
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeletonModificationStack2D: GDType("SkeletonModificationStack2D", {

"enabled"(GDbool)
"modification_count"(GDint)
"strength"(GDfloat)
constructor { }

func("add_modification") {
returns(GDvoid)
"modification"(GDSkeletonModification2D)
}

func("delete_modification") {
returns(GDvoid)
"mod_idx"(GDint)
}

func("enable_all_modifications") {
returns(GDvoid)
"enabled"(GDbool)
}

func("execute") {
returns(GDvoid)
"delta"(GDfloat)
"execution_mode"(GDint)
}

func("get_is_setup") {
returns(GDbool)

}

func("get_modification") {
returns(GDSkeletonModification2D)
"mod_idx"(GDint)
}

func("get_skeleton") {
returns(GDSkeleton2D)

}

func("set_modification") {
returns(GDvoid)
"mod_idx"(GDint)
"modification"(GDSkeletonModification2D)
}

func("setup") {
returns(GDvoid)

}
}){

}