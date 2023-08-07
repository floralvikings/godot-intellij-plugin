
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorDebuggerPlugin: GDType("EditorDebuggerPlugin", {


constructor { }

func("_capture") {
returns(GDbool)
"message"(GDString)
"data"(GDArray)
"session_id"(GDint)
}

func("_has_capture") {
returns(GDbool)
"capture"(GDString)
}

func("_setup_session") {
returns(GDvoid)
"session_id"(GDint)
}

func("get_session") {
returns(GDEditorDebuggerSession)
"id"(GDint)
}

func("get_sessions") {
returns(GDArray)

}
}){

}