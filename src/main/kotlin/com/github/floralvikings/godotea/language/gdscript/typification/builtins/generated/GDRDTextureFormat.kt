
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRDTextureFormat: GDType("RDTextureFormat", {

"array_layers"(GDint)
"depth"(GDint)
"format"(GDDataFormat)
"height"(GDint)
"mipmaps"(GDint)
"samples"(GDTextureSamples)
"texture_type"(GDTextureType)
"usage_bits"(GDUnknownType)
"width"(GDint)
constructor { }

func("add_shareable_format") {
returns(GDvoid)
"format"(GDDataFormat)
}

func("remove_shareable_format") {
returns(GDvoid)
"format"(GDDataFormat)
}
}){

}