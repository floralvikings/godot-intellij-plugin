
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRemoteTransform2D: GDType("RemoteTransform2D", {

"remote_path"(GDNodePath)
"update_position"(GDbool)
"update_rotation"(GDbool)
"update_scale"(GDbool)
"use_global_coordinates"(GDbool)
constructor { }

func("force_update_cache") {
returns(GDvoid)

}
}){

}