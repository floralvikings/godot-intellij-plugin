
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDZIPPacker: GDType("ZIPPacker", {


constructor { }

func("close") {
returns(GDError)

}

func("close_file") {
returns(GDError)

}

func("open") {
returns(GDError)
"path"(GDString)
"append"(GDZipAppend)
}

func("start_file") {
returns(GDError)
"path"(GDString)
}

func("write_file") {
returns(GDError)
"data"(GDPackedByteArray)
}
}){

}