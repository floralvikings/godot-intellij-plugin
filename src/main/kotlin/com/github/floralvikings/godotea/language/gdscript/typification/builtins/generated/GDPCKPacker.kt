
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPCKPacker: GDType("PCKPacker", {


constructor { }

func("add_file") {
returns(GDError)
"pck_path"(GDString)
"source_path"(GDString)
"encrypt"(GDbool)
}

func("flush") {
returns(GDError)
"verbose"(GDbool)
}

func("pck_start") {
returns(GDError)
"pck_name"(GDString)
"alignment"(GDint)
"key"(GDString)
"encrypt_directory"(GDbool)
}
}){

}