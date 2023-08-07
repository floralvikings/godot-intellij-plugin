
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNoise: GDType("Noise", {


constructor { }

func("get_image") {
returns(GDImage)
"width"(GDint)
"height"(GDint)
"invert"(GDbool)
"in_3d_space"(GDbool)
"normalize"(GDbool)
}

func("get_image_3d") {
returns(GDTypedArray(GDImage::class))
"width"(GDint)
"height"(GDint)
"depth"(GDint)
"invert"(GDbool)
"normalize"(GDbool)
}

func("get_noise_1d") {
returns(GDfloat)
"x"(GDfloat)
}

func("get_noise_2d") {
returns(GDfloat)
"x"(GDfloat)
"y"(GDfloat)
}

func("get_noise_2dv") {
returns(GDfloat)
"v"(GDVector2)
}

func("get_noise_3d") {
returns(GDfloat)
"x"(GDfloat)
"y"(GDfloat)
"z"(GDfloat)
}

func("get_noise_3dv") {
returns(GDfloat)
"v"(GDVector3)
}

func("get_seamless_image") {
returns(GDImage)
"width"(GDint)
"height"(GDint)
"invert"(GDbool)
"in_3d_space"(GDbool)
"skirt"(GDfloat)
"normalize"(GDbool)
}

func("get_seamless_image_3d") {
returns(GDTypedArray(GDImage::class))
"width"(GDint)
"height"(GDint)
"depth"(GDint)
"invert"(GDbool)
"skirt"(GDfloat)
"normalize"(GDbool)
}
}){

}