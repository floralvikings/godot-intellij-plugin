
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDContainer: GDType("Container", {

"mouse_filter"(GDMouseFilter)
constructor { }

func("_get_allowed_size_flags_horizontal") {
returns(GDPackedInt32Array)

}

func("_get_allowed_size_flags_vertical") {
returns(GDPackedInt32Array)

}

func("fit_child_in_rect") {
returns(GDvoid)
"child"(GDControl)
"rect"(GDRect2)
}

func("queue_sort") {
returns(GDvoid)

}
}){

}