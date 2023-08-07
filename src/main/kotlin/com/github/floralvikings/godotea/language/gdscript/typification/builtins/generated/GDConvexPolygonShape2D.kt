
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDConvexPolygonShape2D: GDType("ConvexPolygonShape2D", {

"points"(GDPackedVector2Array)
constructor { }

func("set_point_cloud") {
returns(GDvoid)
"point_cloud"(GDPackedVector2Array)
}
}){

}