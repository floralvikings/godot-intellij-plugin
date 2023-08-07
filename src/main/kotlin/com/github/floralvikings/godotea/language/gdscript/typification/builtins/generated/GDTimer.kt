
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTimer: GDType("Timer", {

"autostart"(GDbool)
"one_shot"(GDbool)
"paused"(GDbool)
"process_callback"(GDTimerProcessCallback)
"time_left"(GDfloat)
"wait_time"(GDfloat)
constructor { }

func("is_stopped") {
returns(GDbool)

}

func("start") {
returns(GDvoid)
"time_sec"(GDfloat)
}

func("stop") {
returns(GDvoid)

}
}){

}