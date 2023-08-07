
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCollisionShape3D: GDType("CollisionShape3D", {

"disabled"(GDbool)
"shape"(GDShape3D)
constructor { }

func("make_convex_from_siblings") {
returns(GDvoid)

}

func("resource_changed") {
returns(GDvoid)
"resource"(GDResource)
}
}){

}