
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDResourceUID: GDType("ResourceUID", {


constructor { }

func("add_id") {
returns(GDvoid)
"id"(GDint)
"path"(GDString)
}

func("create_id") {
returns(GDint)

}

func("get_id_path") {
returns(GDString)
"id"(GDint)
}

func("has_id") {
returns(GDbool)
"id"(GDint)
}

func("id_to_text") {
returns(GDString)
"id"(GDint)
}

func("remove_id") {
returns(GDvoid)
"id"(GDint)
}

func("set_id") {
returns(GDvoid)
"id"(GDint)
"path"(GDString)
}

func("text_to_id") {
returns(GDint)
"text_id"(GDString)
}
}){

}