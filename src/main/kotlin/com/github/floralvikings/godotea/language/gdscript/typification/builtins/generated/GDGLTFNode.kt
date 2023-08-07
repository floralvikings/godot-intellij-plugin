
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGLTFNode: GDType("GLTFNode", {

"camera"(GDint)
"children"(GDPackedInt32Array)
"height"(GDint)
"light"(GDint)
"mesh"(GDint)
"parent"(GDint)
"position"(GDVector3)
"rotation"(GDQuaternion)
"scale"(GDVector3)
"skeleton"(GDint)
"skin"(GDint)
"xform"(GDTransform3D)
constructor { }

func("get_additional_data") {
returns(GDVariant)
"extension_name"(GDStringName)
}

func("set_additional_data") {
returns(GDvoid)
"extension_name"(GDStringName)
"additional_data"(GDVariant)
}
}){

}