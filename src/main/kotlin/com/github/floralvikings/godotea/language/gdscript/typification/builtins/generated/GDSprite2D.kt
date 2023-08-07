
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSprite2D: GDType("Sprite2D", {

"centered"(GDbool)
"flip_h"(GDbool)
"flip_v"(GDbool)
"frame"(GDint)
"frame_coords"(GDVector2i)
"hframes"(GDint)
"offset"(GDVector2)
"region_enabled"(GDbool)
"region_filter_clip_enabled"(GDbool)
"region_rect"(GDRect2)
"texture"(GDTexture2D)
"vframes"(GDint)
constructor { }

func("get_rect") {
returns(GDRect2)

}

func("is_pixel_opaque") {
returns(GDbool)
"pos"(GDVector2)
}
}){

}