
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimationLibrary: GDType("AnimationLibrary", {

"_data"(GDDictionary)
constructor { }

func("add_animation") {
returns(GDError)
"name"(GDStringName)
"animation"(GDAnimation)
}

func("get_animation") {
returns(GDAnimation)
"name"(GDStringName)
}

func("get_animation_list") {
returns(GDTypedArray(GDStringName::class))

}

func("has_animation") {
returns(GDbool)
"name"(GDStringName)
}

func("remove_animation") {
returns(GDvoid)
"name"(GDStringName)
}

func("rename_animation") {
returns(GDvoid)
"name"(GDStringName)
"newname"(GDStringName)
}
}){

}