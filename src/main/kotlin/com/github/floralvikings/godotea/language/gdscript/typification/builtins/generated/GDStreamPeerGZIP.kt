
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDStreamPeerGZIP: GDType("StreamPeerGZIP", {


constructor { }

func("clear") {
returns(GDvoid)

}

func("finish") {
returns(GDError)

}

func("start_compression") {
returns(GDError)
"use_deflate"(GDbool)
"buffer_size"(GDint)
}

func("start_decompression") {
returns(GDError)
"use_deflate"(GDbool)
"buffer_size"(GDint)
}
}){

}