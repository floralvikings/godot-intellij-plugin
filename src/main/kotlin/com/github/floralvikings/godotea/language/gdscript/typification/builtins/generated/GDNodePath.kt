
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDNodePath: GDType("NodePath", {



constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"from"(GDString)
}

func("get_as_property_path") {
returns(GDSameType)

}

func("get_concatenated_names") {
returns(GDStringName)

}

func("get_concatenated_subnames") {
returns(GDStringName)

}

func("get_name") {
returns(GDStringName)
"idx"(GDint)
}

func("get_name_count") {
returns(GDint)

}

func("get_subname") {
returns(GDStringName)
"idx"(GDint)
}

func("get_subname_count") {
returns(GDint)

}

func("hash") {
returns(GDint)

}

func("is_absolute") {
returns(GDbool)

}

func("is_empty") {
returns(GDbool)

}
}){

}