
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorResourceTooltipPlugin: GDType("EditorResourceTooltipPlugin", {


constructor { }

func("_handles") {
returns(GDbool)
"type"(GDString)
}

func("_make_tooltip_for_path") {
returns(GDControl)
"path"(GDString)
"metadata"(GDDictionary)
"base"(GDControl)
}

func("request_thumbnail") {
returns(GDvoid)
"path"(GDString)
"control"(GDTextureRect)
}
}){

}