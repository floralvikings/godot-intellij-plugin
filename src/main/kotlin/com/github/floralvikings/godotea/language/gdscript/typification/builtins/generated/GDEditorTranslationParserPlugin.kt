
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorTranslationParserPlugin: GDType("EditorTranslationParserPlugin", {


constructor { }

func("_get_recognized_extensions") {
returns(GDPackedStringArray)

}

func("_parse_file") {
returns(GDvoid)
"path"(GDString)
"msgids"(GDTypedArray(GDString::class))
"msgids_context_plural"(GDTypedArray(GDArray::class))
}
}){

}