
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsTestMotionParameters3D: GDType("PhysicsTestMotionParameters3D", {

"collide_separation_ray"(GDbool)
"exclude_bodies"(GDTypedArray(GDRID::class))
"exclude_objects"(GDTypedArray(GDint::class))
"from"(GDTransform3D)
"margin"(GDfloat)
"max_collisions"(GDint)
"motion"(GDVector3)
"recovery_as_collision"(GDbool)
constructor { }

}){

}