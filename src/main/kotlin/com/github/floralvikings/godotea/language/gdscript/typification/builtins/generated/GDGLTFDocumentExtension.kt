
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGLTFDocumentExtension: GDType("GLTFDocumentExtension", {


constructor { }

func("_convert_scene_node") {
returns(GDvoid)
"state"(GDGLTFState)
"gltf_node"(GDGLTFNode)
"scene_node"(GDNode)
}

func("_export_node") {
returns(GDError)
"state"(GDGLTFState)
"gltf_node"(GDGLTFNode)
"json"(GDDictionary)
"node"(GDNode)
}

func("_export_post") {
returns(GDError)
"state"(GDGLTFState)
}

func("_export_preflight") {
returns(GDError)
"state"(GDGLTFState)
"root"(GDNode)
}

func("_generate_scene_node") {
returns(GDNode3D)
"state"(GDGLTFState)
"gltf_node"(GDGLTFNode)
"scene_parent"(GDNode)
}

func("_get_supported_extensions") {
returns(GDPackedStringArray)

}

func("_import_node") {
returns(GDError)
"state"(GDGLTFState)
"gltf_node"(GDGLTFNode)
"json"(GDDictionary)
"node"(GDNode)
}

func("_import_post") {
returns(GDError)
"state"(GDGLTFState)
"root"(GDNode)
}

func("_import_post_parse") {
returns(GDError)
"state"(GDGLTFState)
}

func("_import_preflight") {
returns(GDError)
"state"(GDGLTFState)
"extensions"(GDPackedStringArray)
}

func("_parse_image_data") {
returns(GDError)
"state"(GDGLTFState)
"image_data"(GDPackedByteArray)
"mime_type"(GDString)
"ret_image"(GDImage)
}

func("_parse_node_extensions") {
returns(GDError)
"state"(GDGLTFState)
"gltf_node"(GDGLTFNode)
"extensions"(GDDictionary)
}

func("_parse_texture_json") {
returns(GDError)
"state"(GDGLTFState)
"texture_json"(GDDictionary)
"ret_gltf_texture"(GDGLTFTexture)
}
}){

}