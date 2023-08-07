
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsTestMotionParameters2D: GDType("PhysicsTestMotionParameters2D", {

"collide_separation_ray"(GDbool)
"exclude_bodies"(GDTypedArray(GDRID::class))
"exclude_objects"(GDTypedArray(GDint::class))
"from"(GDTransform2D)
"margin"(GDfloat)
"motion"(GDVector2)
"recovery_as_collision"(GDbool)
constructor { }

}){

}