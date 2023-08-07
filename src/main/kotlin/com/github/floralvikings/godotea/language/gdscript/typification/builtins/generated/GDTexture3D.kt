
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTexture3D: GDType("Texture3D", {


constructor { }

func("_get_data") {
returns(GDTypedArray(GDImage::class))

}

func("_get_depth") {
returns(GDint)

}

func("_get_format") {
returns(GDFormat)

}

func("_get_height") {
returns(GDint)

}

func("_get_width") {
returns(GDint)

}

func("_has_mipmaps") {
returns(GDbool)

}

func("create_placeholder") {
returns(GDResource)

}

func("get_data") {
returns(GDTypedArray(GDImage::class))

}

func("get_depth") {
returns(GDint)

}

func("get_format") {
returns(GDFormat)

}

func("get_height") {
returns(GDint)

}

func("get_width") {
returns(GDint)

}

func("has_mipmaps") {
returns(GDbool)

}
}){

}