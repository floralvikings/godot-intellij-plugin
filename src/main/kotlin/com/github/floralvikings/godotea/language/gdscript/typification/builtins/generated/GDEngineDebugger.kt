
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEngineDebugger: GDType("EngineDebugger", {


constructor { }

func("has_capture") {
returns(GDbool)
"name"(GDStringName)
}

func("has_profiler") {
returns(GDbool)
"name"(GDStringName)
}

func("is_active") {
returns(GDbool)

}

func("is_profiling") {
returns(GDbool)
"name"(GDStringName)
}

func("profiler_add_frame_data") {
returns(GDvoid)
"name"(GDStringName)
"data"(GDArray)
}

func("profiler_enable") {
returns(GDvoid)
"name"(GDStringName)
"enable"(GDbool)
"arguments"(GDArray)
}

func("register_message_capture") {
returns(GDvoid)
"name"(GDStringName)
"callable"(GDCallable)
}

func("register_profiler") {
returns(GDvoid)
"name"(GDStringName)
"profiler"(GDEngineProfiler)
}

func("send_message") {
returns(GDvoid)
"message"(GDString)
"data"(GDArray)
}

func("unregister_message_capture") {
returns(GDvoid)
"name"(GDStringName)
}

func("unregister_profiler") {
returns(GDvoid)
"name"(GDStringName)
}
}){

}