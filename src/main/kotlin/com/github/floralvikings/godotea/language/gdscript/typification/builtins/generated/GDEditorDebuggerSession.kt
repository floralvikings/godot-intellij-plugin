
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorDebuggerSession: GDType("EditorDebuggerSession", {


constructor { }

func("add_session_tab") {
returns(GDvoid)
"control"(GDControl)
}

func("is_active") {
returns(GDbool)

}

func("is_breaked") {
returns(GDbool)

}

func("is_debuggable") {
returns(GDbool)

}

func("remove_session_tab") {
returns(GDvoid)
"control"(GDControl)
}

func("send_message") {
returns(GDvoid)
"message"(GDString)
"data"(GDArray)
}

func("toggle_profiler") {
returns(GDvoid)
"profiler"(GDString)
"enable"(GDbool)
"data"(GDArray)
}
}){

}