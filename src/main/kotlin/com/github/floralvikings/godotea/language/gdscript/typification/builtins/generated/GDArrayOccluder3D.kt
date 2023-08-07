
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDArrayOccluder3D: GDType("ArrayOccluder3D", {

"indices"(GDPackedInt32Array)
"vertices"(GDPackedVector3Array)
constructor { }

func("set_arrays") {
returns(GDvoid)
"vertices"(GDPackedVector3Array)
"indices"(GDPackedInt32Array)
}
}){

}