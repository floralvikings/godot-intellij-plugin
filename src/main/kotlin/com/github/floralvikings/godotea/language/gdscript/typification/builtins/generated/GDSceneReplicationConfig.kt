
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSceneReplicationConfig: GDType("SceneReplicationConfig", {


constructor { }

func("add_property") {
returns(GDvoid)
"path"(GDNodePath)
"index"(GDint)
}

func("get_properties") {
returns(GDTypedArray(GDNodePath::class))

}

func("has_property") {
returns(GDbool)
"path"(GDNodePath)
}

func("property_get_index") {
returns(GDint)
"path"(GDNodePath)
}

func("property_get_spawn") {
returns(GDbool)
"path"(GDNodePath)
}

func("property_get_sync") {
returns(GDbool)
"path"(GDNodePath)
}

func("property_get_watch") {
returns(GDbool)
"path"(GDNodePath)
}

func("property_set_spawn") {
returns(GDvoid)
"path"(GDNodePath)
"enabled"(GDbool)
}

func("property_set_sync") {
returns(GDvoid)
"path"(GDNodePath)
"enabled"(GDbool)
}

func("property_set_watch") {
returns(GDvoid)
"path"(GDNodePath)
"enabled"(GDbool)
}

func("remove_property") {
returns(GDvoid)
"path"(GDNodePath)
}
}){

}