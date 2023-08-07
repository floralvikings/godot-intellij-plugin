
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMultiplayerSpawner: GDType("MultiplayerSpawner", {

"spawn_function"(GDCallable)
"spawn_limit"(GDint)
"spawn_path"(GDNodePath)
constructor { }

func("add_spawnable_scene") {
returns(GDvoid)
"path"(GDString)
}

func("clear_spawnable_scenes") {
returns(GDvoid)

}

func("get_spawnable_scene") {
returns(GDString)
"index"(GDint)
}

func("get_spawnable_scene_count") {
returns(GDint)

}

func("spawn") {
returns(GDNode)
"data"(GDVariant)
}
}){

}