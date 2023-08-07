
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkeletonModification2DStackHolder: GDType("SkeletonModification2DStackHolder", {


constructor { }

func("get_held_modification_stack") {
returns(GDSkeletonModificationStack2D)

}

func("set_held_modification_stack") {
returns(GDvoid)
"held_modification_stack"(GDSkeletonModificationStack2D)
}
}){

}