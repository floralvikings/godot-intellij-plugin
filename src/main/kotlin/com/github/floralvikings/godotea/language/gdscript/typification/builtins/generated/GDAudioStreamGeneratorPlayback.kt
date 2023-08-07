
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioStreamGeneratorPlayback: GDType("AudioStreamGeneratorPlayback", {


constructor { }

func("can_push_buffer") {
returns(GDbool)
"amount"(GDint)
}

func("clear_buffer") {
returns(GDvoid)

}

func("get_frames_available") {
returns(GDint)

}

func("get_skips") {
returns(GDint)

}

func("push_buffer") {
returns(GDbool)
"frames"(GDPackedVector2Array)
}

func("push_frame") {
returns(GDbool)
"frame"(GDVector2)
}
}){

}