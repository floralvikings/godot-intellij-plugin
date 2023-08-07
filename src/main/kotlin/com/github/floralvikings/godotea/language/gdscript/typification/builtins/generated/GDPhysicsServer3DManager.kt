
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsServer3DManager: GDType("PhysicsServer3DManager", {


constructor { }

func("register_server") {
returns(GDvoid)
"name"(GDString)
"create_callback"(GDCallable)
}

func("set_default_server") {
returns(GDvoid)
"name"(GDString)
"priority"(GDint)
}
}){

}