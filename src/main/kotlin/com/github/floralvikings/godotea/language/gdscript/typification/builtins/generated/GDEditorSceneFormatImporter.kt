
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorSceneFormatImporter: GDType("EditorSceneFormatImporter", {


constructor { }

func("_get_extensions") {
returns(GDPackedStringArray)

}

func("_get_import_flags") {
returns(GDint)

}

func("_get_import_options") {
returns(GDvoid)
"path"(GDString)
}

func("_get_option_visibility") {
returns(GDVariant)
"path"(GDString)
"for_animation"(GDbool)
"option"(GDString)
}

func("_import_scene") {
returns(GDObject)
"path"(GDString)
"flags"(GDint)
"options"(GDDictionary)
}
}){

}