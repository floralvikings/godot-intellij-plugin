
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSkin: GDType("Skin", {


constructor { }

func("add_bind") {
returns(GDvoid)
"bone"(GDint)
"pose"(GDTransform3D)
}

func("add_named_bind") {
returns(GDvoid)
"name"(GDString)
"pose"(GDTransform3D)
}

func("clear_binds") {
returns(GDvoid)

}

func("get_bind_bone") {
returns(GDint)
"bind_index"(GDint)
}

func("get_bind_count") {
returns(GDint)

}

func("get_bind_name") {
returns(GDStringName)
"bind_index"(GDint)
}

func("get_bind_pose") {
returns(GDTransform3D)
"bind_index"(GDint)
}

func("set_bind_bone") {
returns(GDvoid)
"bind_index"(GDint)
"bone"(GDint)
}

func("set_bind_count") {
returns(GDvoid)
"bind_count"(GDint)
}

func("set_bind_name") {
returns(GDvoid)
"bind_index"(GDint)
"name"(GDStringName)
}

func("set_bind_pose") {
returns(GDvoid)
"bind_index"(GDint)
"pose"(GDTransform3D)
}
}){

}