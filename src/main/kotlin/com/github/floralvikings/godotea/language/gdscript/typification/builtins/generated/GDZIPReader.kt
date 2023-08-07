
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDZIPReader: GDType("ZIPReader", {


constructor { }

func("close") {
returns(GDError)

}

func("get_files") {
returns(GDPackedStringArray)

}

func("open") {
returns(GDError)
"path"(GDString)
}

func("read_file") {
returns(GDPackedByteArray)
"path"(GDString)
"case_sensitive"(GDbool)
}
}){

}