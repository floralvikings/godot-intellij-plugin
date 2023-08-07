
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGLTFPhysicsBody: GDType("GLTFPhysicsBody", {

"angular_velocity"(GDVector3)
"body_type"(GDString)
"inertia_tensor"(GDBasis)
"linear_velocity"(GDVector3)
"mass"(GDfloat)
constructor { }

func("from_dictionary") {
returns(GDSameType)
"dictionary"(GDDictionary)
}

func("from_node") {
returns(GDSameType)
"body_node"(GDCollisionObject3D)
}

func("to_dictionary") {
returns(GDDictionary)

}

func("to_node") {
returns(GDCollisionObject3D)

}
}){

}