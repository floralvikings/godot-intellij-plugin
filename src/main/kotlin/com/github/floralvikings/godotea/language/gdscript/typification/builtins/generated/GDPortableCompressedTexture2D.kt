
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPortableCompressedTexture2D: GDType("PortableCompressedTexture2D", {

"_data"(GDPackedByteArray)
"keep_compressed_buffer"(GDbool)
"resource_local_to_scene"(GDbool)
"size_override"(GDVector2)
constructor { }

func("create_from_image") {
returns(GDvoid)
"image"(GDImage)
"compression_mode"(GDCompressionMode)
"normal_map"(GDbool)
"lossy_quality"(GDfloat)
}

func("get_compression_mode") {
returns(GDCompressionMode)

}

func("get_format") {
returns(GDFormat)

}

func("is_keeping_all_compressed_buffers") {
returns(GDbool)

}

func("set_keep_all_compressed_buffers") {
returns(GDvoid)
"keep"(GDbool)
}
}){

}