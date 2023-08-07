
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioEffectCapture: GDType("AudioEffectCapture", {

"buffer_length"(GDfloat)
constructor { }

func("can_get_buffer") {
returns(GDbool)
"frames"(GDint)
}

func("clear_buffer") {
returns(GDvoid)

}

func("get_buffer") {
returns(GDPackedVector2Array)
"frames"(GDint)
}

func("get_buffer_length_frames") {
returns(GDint)

}

func("get_discarded_frames") {
returns(GDint)

}

func("get_frames_available") {
returns(GDint)

}

func("get_pushed_frames") {
returns(GDint)

}
}){

}