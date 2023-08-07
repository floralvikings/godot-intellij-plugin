
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGLTFDocument: GDType("GLTFDocument", {


constructor { }

func("append_from_buffer") {
returns(GDError)
"bytes"(GDPackedByteArray)
"base_path"(GDString)
"state"(GDGLTFState)
"flags"(GDint)
}

func("append_from_file") {
returns(GDError)
"path"(GDString)
"state"(GDGLTFState)
"flags"(GDint)
"base_path"(GDString)
}

func("append_from_scene") {
returns(GDError)
"node"(GDNode)
"state"(GDGLTFState)
"flags"(GDint)
}

func("generate_buffer") {
returns(GDPackedByteArray)
"state"(GDGLTFState)
}

func("generate_scene") {
returns(GDNode)
"state"(GDGLTFState)
"bake_fps"(GDfloat)
"trimming"(GDbool)
"remove_immutable_tracks"(GDbool)
}

func("register_gltf_document_extension") {
returns(GDvoid)
"extension"(GDGLTFDocumentExtension)
"first_priority"(GDbool)
}

func("unregister_gltf_document_extension") {
returns(GDvoid)
"extension"(GDGLTFDocumentExtension)
}

func("write_to_filesystem") {
returns(GDError)
"state"(GDGLTFState)
"path"(GDString)
}
}){

}