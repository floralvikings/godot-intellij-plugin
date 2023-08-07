
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSpringArm3D: GDType("SpringArm3D", {

"collision_mask"(GDint)
"margin"(GDfloat)
"shape"(GDShape3D)
"spring_length"(GDfloat)
constructor { }

func("add_excluded_object") {
returns(GDvoid)
"RID"(GDRID)
}

func("clear_excluded_objects") {
returns(GDvoid)

}

func("get_hit_length") {
returns(GDfloat)

}

func("remove_excluded_object") {
returns(GDbool)
"RID"(GDRID)
}
}){

}