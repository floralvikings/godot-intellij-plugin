
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDResource: GDType("Resource", {

"resource_local_to_scene"(GDbool)
"resource_name"(GDString)
"resource_path"(GDString)
constructor { }

func("_get_rid") {
returns(GDRID)

}

func("duplicate") {
returns(GDSameType)
"subresources"(GDbool)
}

func("emit_changed") {
returns(GDvoid)

}

func("get_local_scene") {
returns(GDNode)

}

func("get_rid") {
returns(GDRID)

}

func("setup_local_to_scene") {
returns(GDvoid)

}

func("take_over_path") {
returns(GDvoid)
"path"(GDString)
}
}){

}