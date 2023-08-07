
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorResourcePreviewGenerator: GDType("EditorResourcePreviewGenerator", {


constructor { }

func("_can_generate_small_preview") {
returns(GDbool)

}

func("_generate") {
returns(GDTexture2D)
"resource"(GDResource)
"size"(GDVector2i)
"metadata"(GDDictionary)
}

func("_generate_from_path") {
returns(GDTexture2D)
"path"(GDString)
"size"(GDVector2i)
"metadata"(GDDictionary)
}

func("_generate_small_preview_automatically") {
returns(GDbool)

}

func("_handles") {
returns(GDbool)
"type"(GDString)
}
}){

}