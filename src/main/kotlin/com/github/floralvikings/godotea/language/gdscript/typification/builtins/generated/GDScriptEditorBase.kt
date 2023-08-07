
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDScriptEditorBase: GDType("ScriptEditorBase", {


constructor { }

func("add_syntax_highlighter") {
returns(GDvoid)
"highlighter"(GDEditorSyntaxHighlighter)
}

func("get_base_editor") {
returns(GDControl)

}
}){

}