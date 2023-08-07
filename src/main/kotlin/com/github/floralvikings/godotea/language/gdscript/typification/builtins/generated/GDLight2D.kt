
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDLight2D: GDType("Light2D", {

"blend_mode"(GDBlendMode)
"color"(GDColor)
"editor_only"(GDbool)
"enabled"(GDbool)
"energy"(GDfloat)
"range_item_cull_mask"(GDint)
"range_layer_max"(GDint)
"range_layer_min"(GDint)
"range_z_max"(GDint)
"range_z_min"(GDint)
"shadow_color"(GDColor)
"shadow_enabled"(GDbool)
"shadow_filter"(GDShadowFilter)
"shadow_filter_smooth"(GDfloat)
"shadow_item_cull_mask"(GDint)
constructor { }

func("get_height") {
returns(GDfloat)

}

func("set_height") {
returns(GDvoid)
"height"(GDfloat)
}
}){

}