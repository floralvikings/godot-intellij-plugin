
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDX509Certificate: GDType("X509Certificate", {


constructor { }

func("load") {
returns(GDError)
"path"(GDString)
}

func("load_from_string") {
returns(GDError)
"string"(GDString)
}

func("save") {
returns(GDError)
"path"(GDString)
}

func("save_to_string") {
returns(GDString)

}
}){

}