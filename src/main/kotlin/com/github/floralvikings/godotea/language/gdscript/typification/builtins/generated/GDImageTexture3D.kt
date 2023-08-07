
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDImageTexture3D: GDType("ImageTexture3D", {


constructor { }

func("create") {
returns(GDError)
"format"(GDFormat)
"width"(GDint)
"height"(GDint)
"depth"(GDint)
"use_mipmaps"(GDbool)
"data"(GDTypedArray(GDImage::class))
}

func("update") {
returns(GDvoid)
"data"(GDTypedArray(GDImage::class))
}
}){

}