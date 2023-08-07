
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimatedSprite3D: GDType("AnimatedSprite3D", {

"animation"(GDStringName)
"autoplay"(GDString)
"frame"(GDint)
"frame_progress"(GDfloat)
"speed_scale"(GDfloat)
"sprite_frames"(GDSpriteFrames)
constructor { }

func("get_playing_speed") {
returns(GDfloat)

}

func("is_playing") {
returns(GDbool)

}

func("pause") {
returns(GDvoid)

}

func("play") {
returns(GDvoid)
"name"(GDStringName)
"custom_speed"(GDfloat)
"from_end"(GDbool)
}

func("play_backwards") {
returns(GDvoid)
"name"(GDStringName)
}

func("set_frame_and_progress") {
returns(GDvoid)
"frame"(GDint)
"progress"(GDfloat)
}

func("stop") {
returns(GDvoid)

}
}){

}