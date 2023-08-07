
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTextureLayered: GDType("TextureLayered", {


constructor { }

func("_get_format") {
returns(GDFormat)

}

func("_get_height") {
returns(GDint)

}

func("_get_layer_data") {
returns(GDImage)
"layer_index"(GDint)
}

func("_get_layered_type") {
returns(GDint)

}

func("_get_layers") {
returns(GDint)

}

func("_get_width") {
returns(GDint)

}

func("_has_mipmaps") {
returns(GDbool)

}

func("get_format") {
returns(GDFormat)

}

func("get_height") {
returns(GDint)

}

func("get_layer_data") {
returns(GDImage)
"layer"(GDint)
}

func("get_layered_type") {
returns(GDLayeredType)

}

func("get_layers") {
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