
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimatedTexture: GDType("AnimatedTexture", {

"current_frame"(GDint)
"frames"(GDint)
"one_shot"(GDbool)
"pause"(GDbool)
"resource_local_to_scene"(GDbool)
"speed_scale"(GDfloat)
constructor { }

func("get_frame_duration") {
returns(GDfloat)
"frame"(GDint)
}

func("get_frame_texture") {
returns(GDTexture2D)
"frame"(GDint)
}

func("set_frame_duration") {
returns(GDvoid)
"frame"(GDint)
"duration"(GDfloat)
}

func("set_frame_texture") {
returns(GDvoid)
"frame"(GDint)
"texture"(GDTexture2D)
}
}){

}