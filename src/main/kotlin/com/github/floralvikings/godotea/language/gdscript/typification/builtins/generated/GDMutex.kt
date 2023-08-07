
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMutex: GDType("Mutex", {


constructor { }

func("lock") {
returns(GDvoid)

}

func("try_lock") {
returns(GDbool)

}

func("unlock") {
returns(GDvoid)

}
}){

}