
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDScriptEditor: GDType("ScriptEditor", {


constructor { }

func("get_current_editor") {
returns(GDScriptEditorBase)

}

func("get_current_script") {
returns(GDScript)

}

func("get_open_script_editors") {
returns(GDTypedArray(GDScriptEditorBase::class))

}

func("get_open_scripts") {
returns(GDTypedArray(GDScript::class))

}

func("goto_line") {
returns(GDvoid)
"line_number"(GDint)
}

func("open_script_create_dialog") {
returns(GDvoid)
"base_name"(GDString)
"base_path"(GDString)
}

func("register_syntax_highlighter") {
returns(GDvoid)
"syntax_highlighter"(GDEditorSyntaxHighlighter)
}

func("unregister_syntax_highlighter") {
returns(GDvoid)
"syntax_highlighter"(GDEditorSyntaxHighlighter)
}
}){

}