
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDResourcePreloader: GDType("ResourcePreloader", {


constructor { }

func("add_resource") {
returns(GDvoid)
"name"(GDStringName)
"resource"(GDResource)
}

func("get_resource") {
returns(GDResource)
"name"(GDStringName)
}

func("get_resource_list") {
returns(GDPackedStringArray)

}

func("has_resource") {
returns(GDbool)
"name"(GDStringName)
}

func("remove_resource") {
returns(GDvoid)
"name"(GDStringName)
}

func("rename_resource") {
returns(GDvoid)
"name"(GDStringName)
"newname"(GDStringName)
}
}){

}