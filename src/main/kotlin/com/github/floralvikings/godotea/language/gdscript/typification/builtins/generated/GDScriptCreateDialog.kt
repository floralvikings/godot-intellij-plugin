
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDScriptCreateDialog: GDType("ScriptCreateDialog", {

"dialog_hide_on_ok"(GDbool)
"ok_button_text"(GDString)
"title"(GDString)
constructor { }

func("config") {
returns(GDvoid)
"inherits"(GDString)
"path"(GDString)
"built_in_enabled"(GDbool)
"load_enabled"(GDbool)
}
}){

}