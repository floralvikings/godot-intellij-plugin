
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorResourceConversionPlugin: GDType("EditorResourceConversionPlugin", {


constructor { }

func("_convert") {
returns(GDResource)
"resource"(GDResource)
}

func("_converts_to") {
returns(GDString)

}

func("_handles") {
returns(GDbool)
"resource"(GDResource)
}
}){

}