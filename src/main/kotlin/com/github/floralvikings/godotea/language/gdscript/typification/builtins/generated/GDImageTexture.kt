
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDImageTexture: GDType("ImageTexture", {

"resource_local_to_scene"(GDbool)
constructor { }

func("create_from_image") {
returns(GDSameType)
"image"(GDImage)
}

func("get_format") {
returns(GDFormat)

}

func("set_image") {
returns(GDvoid)
"image"(GDImage)
}

func("set_size_override") {
returns(GDvoid)
"size"(GDVector2i)
}

func("update") {
returns(GDvoid)
"image"(GDImage)
}
}){

}