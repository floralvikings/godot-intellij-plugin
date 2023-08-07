
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNavigationPathQueryResult2D: GDType("NavigationPathQueryResult2D", {

"path"(GDPackedVector2Array)
"path_owner_ids"(GDPackedInt64Array)
"path_rids"(GDTypedArray(GDRID::class))
"path_types"(GDPackedInt32Array)
constructor { }

func("reset") {
returns(GDvoid)

}
}){

}