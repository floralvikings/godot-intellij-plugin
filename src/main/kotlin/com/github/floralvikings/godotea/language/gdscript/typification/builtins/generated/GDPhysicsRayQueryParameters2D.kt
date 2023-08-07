
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsRayQueryParameters2D: GDType("PhysicsRayQueryParameters2D", {

"collide_with_areas"(GDbool)
"collide_with_bodies"(GDbool)
"collision_mask"(GDint)
"exclude"(GDTypedArray(GDRID::class))
"from"(GDVector2)
"hit_from_inside"(GDbool)
"to"(GDVector2)
constructor { }

func("create") {
returns(GDSameType)
"from"(GDVector2)
"to"(GDVector2)
"collision_mask"(GDint)
"exclude"(GDTypedArray(GDRID::class))
}
}){

}