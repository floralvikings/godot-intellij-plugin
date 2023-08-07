
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDConcavePolygonShape3D: GDType("ConcavePolygonShape3D", {

"backface_collision"(GDbool)
constructor { }

func("get_faces") {
returns(GDPackedVector3Array)

}

func("set_faces") {
returns(GDvoid)
"faces"(GDPackedVector3Array)
}
}){

}