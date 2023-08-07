
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDImageTextureLayered: GDType("ImageTextureLayered", {


constructor { }

func("create_from_images") {
returns(GDError)
"images"(GDTypedArray(GDImage::class))
}

func("update_layer") {
returns(GDvoid)
"image"(GDImage)
"layer"(GDint)
}
}){

}