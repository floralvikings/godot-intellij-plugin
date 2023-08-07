
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMaterial: GDType("Material", {

"next_pass"(GDSameType)
"render_priority"(GDint)
constructor { }

func("_can_do_next_pass") {
returns(GDbool)

}

func("_can_use_render_priority") {
returns(GDbool)

}

func("_get_shader_mode") {
returns(GDMode)

}

func("_get_shader_rid") {
returns(GDRID)

}

func("create_placeholder") {
returns(GDResource)

}

func("inspect_native_shader_code") {
returns(GDvoid)

}
}){

}