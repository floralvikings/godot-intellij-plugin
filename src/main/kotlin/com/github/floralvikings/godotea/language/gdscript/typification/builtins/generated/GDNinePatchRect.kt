
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNinePatchRect: GDType("NinePatchRect", {

"axis_stretch_horizontal"(GDAxisStretchMode)
"axis_stretch_vertical"(GDAxisStretchMode)
"draw_center"(GDbool)
"mouse_filter"(GDMouseFilter)
"patch_margin_bottom"(GDint)
"patch_margin_left"(GDint)
"patch_margin_right"(GDint)
"patch_margin_top"(GDint)
"region_rect"(GDRect2)
"texture"(GDTexture2D)
constructor { }

func("get_patch_margin") {
returns(GDint)
"margin"(GDSide)
}

func("set_patch_margin") {
returns(GDvoid)
"margin"(GDSide)
"value"(GDint)
}
}){

}