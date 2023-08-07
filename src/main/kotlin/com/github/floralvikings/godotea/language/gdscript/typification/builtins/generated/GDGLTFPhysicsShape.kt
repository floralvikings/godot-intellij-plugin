
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGLTFPhysicsShape: GDType("GLTFPhysicsShape", {

"height"(GDfloat)
"importer_mesh"(GDImporterMesh)
"is_trigger"(GDbool)
"mesh_index"(GDint)
"radius"(GDfloat)
"shape_type"(GDString)
"size"(GDVector3)
constructor { }

func("from_dictionary") {
returns(GDSameType)
"dictionary"(GDDictionary)
}

func("from_node") {
returns(GDSameType)
"shape_node"(GDCollisionShape3D)
}

func("to_dictionary") {
returns(GDDictionary)

}

func("to_node") {
returns(GDCollisionShape3D)
"cache_shapes"(GDbool)
}
}){

}