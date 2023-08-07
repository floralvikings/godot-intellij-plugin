
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCompressedTexture2D: GDType("CompressedTexture2D", {

"load_path"(GDString)
"resource_local_to_scene"(GDbool)
constructor { }

func("load") {
returns(GDError)
"path"(GDString)
}
}){

}