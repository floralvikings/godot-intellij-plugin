
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDImageFormatLoaderExtension: GDType("ImageFormatLoaderExtension", {


constructor { }

func("_get_recognized_extensions") {
returns(GDPackedStringArray)

}

func("_load_image") {
returns(GDError)
"image"(GDImage)
"fileaccess"(GDFileAccess)
"flags"(GDUnknownType)
"scale"(GDfloat)
}

func("add_format_loader") {
returns(GDvoid)

}

func("remove_format_loader") {
returns(GDvoid)

}
}){

}