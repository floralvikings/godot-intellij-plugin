
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTextServerManager: GDType("TextServerManager", {


constructor { }

func("add_interface") {
returns(GDvoid)
"interface"(GDTextServer)
}

func("find_interface") {
returns(GDTextServer)
"name"(GDString)
}

func("get_interface") {
returns(GDTextServer)
"idx"(GDint)
}

func("get_interface_count") {
returns(GDint)

}

func("get_interfaces") {
returns(GDTypedArray(GDDictionary::class))

}

func("get_primary_interface") {
returns(GDTextServer)

}

func("remove_interface") {
returns(GDvoid)
"interface"(GDTextServer)
}

func("set_primary_interface") {
returns(GDvoid)
"index"(GDTextServer)
}
}){

}