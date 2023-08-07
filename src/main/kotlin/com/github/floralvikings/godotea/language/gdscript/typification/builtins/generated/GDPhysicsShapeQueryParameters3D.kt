
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsShapeQueryParameters3D: GDType("PhysicsShapeQueryParameters3D", {

"collide_with_areas"(GDbool)
"collide_with_bodies"(GDbool)
"collision_mask"(GDint)
"exclude"(GDTypedArray(GDRID::class))
"margin"(GDfloat)
"motion"(GDVector3)
"shape"(GDResource)
"shape_rid"(GDRID)
"transform"(GDTransform3D)
constructor { }

}){

}