
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDThread: GDType("Thread", {


constructor { }

func("get_id") {
returns(GDString)

}

func("is_alive") {
returns(GDbool)

}

func("is_started") {
returns(GDbool)

}

func("set_thread_safety_checks_enabled") {
returns(GDvoid)
"enabled"(GDbool)
}

func("start") {
returns(GDError)
"callable"(GDCallable)
"priority"(GDPriority)
}

func("wait_to_finish") {
returns(GDVariant)

}
}){

}