
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsRayQueryParameters3D: GDType("PhysicsRayQueryParameters3D", {

"collide_with_areas"(GDbool)
"collide_with_bodies"(GDbool)
"collision_mask"(GDint)
"exclude"(GDTypedArray(GDRID::class))
"from"(GDVector3)
"hit_back_faces"(GDbool)
"hit_from_inside"(GDbool)
"to"(GDVector3)
constructor { }

func("create") {
returns(GDSameType)
"from"(GDVector3)
"to"(GDVector3)
"collision_mask"(GDint)
"exclude"(GDTypedArray(GDRID::class))
}
}){

}