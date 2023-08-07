
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorCommandPalette: GDType("EditorCommandPalette", {

"dialog_hide_on_ok"(GDbool)
constructor { }

func("add_command") {
returns(GDvoid)
"command_name"(GDString)
"key_name"(GDString)
"binded_callable"(GDCallable)
"shortcut_text"(GDString)
}

func("remove_command") {
returns(GDvoid)
"key_name"(GDString)
}
}){

}