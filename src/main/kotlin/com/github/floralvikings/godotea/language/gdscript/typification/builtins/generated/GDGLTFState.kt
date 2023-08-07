
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDGLTFState: GDType("GLTFState", {

"base_path"(GDString)
"buffers"(GDTypedArray(GDPackedByteArray::class))
"create_animations"(GDbool)
"glb_data"(GDPackedByteArray)
"json"(GDDictionary)
"major_version"(GDint)
"minor_version"(GDint)
"root_nodes"(GDPackedInt32Array)
"scene_name"(GDString)
"use_named_skin_binds"(GDbool)
constructor { }

func("add_used_extension") {
returns(GDvoid)
"extension_name"(GDString)
"required"(GDbool)
}

func("get_accessors") {
returns(GDTypedArray(GDGLTFAccessor::class))

}

func("get_additional_data") {
returns(GDVariant)
"extension_name"(GDStringName)
}

func("get_animation_player") {
returns(GDAnimationPlayer)
"idx"(GDint)
}

func("get_animation_players_count") {
returns(GDint)
"idx"(GDint)
}

func("get_animations") {
returns(GDTypedArray(GDGLTFAnimation::class))

}

func("get_buffer_views") {
returns(GDTypedArray(GDGLTFBufferView::class))

}

func("get_cameras") {
returns(GDTypedArray(GDGLTFCamera::class))

}

func("get_handle_binary_image") {
returns(GDint)

}

func("get_images") {
returns(GDTypedArray(GDTexture2D::class))

}

func("get_lights") {
returns(GDTypedArray(GDGLTFLight::class))

}

func("get_materials") {
returns(GDTypedArray(GDMaterial::class))

}

func("get_meshes") {
returns(GDTypedArray(GDGLTFMesh::class))

}

func("get_node_index") {
returns(GDint)
"scene_node"(GDNode)
}

func("get_nodes") {
returns(GDTypedArray(GDGLTFNode::class))

}

func("get_scene_node") {
returns(GDNode)
"idx"(GDint)
}

func("get_skeletons") {
returns(GDTypedArray(GDGLTFSkeleton::class))

}

func("get_skins") {
returns(GDTypedArray(GDGLTFSkin::class))

}

func("get_texture_samplers") {
returns(GDTypedArray(GDGLTFTextureSampler::class))

}

func("get_textures") {
returns(GDTypedArray(GDGLTFTexture::class))

}

func("get_unique_animation_names") {
returns(GDTypedArray(GDString::class))

}

func("get_unique_names") {
returns(GDTypedArray(GDString::class))

}

func("set_accessors") {
returns(GDvoid)
"accessors"(GDTypedArray(GDGLTFAccessor::class))
}

func("set_additional_data") {
returns(GDvoid)
"extension_name"(GDStringName)
"additional_data"(GDVariant)
}

func("set_animations") {
returns(GDvoid)
"animations"(GDTypedArray(GDGLTFAnimation::class))
}

func("set_buffer_views") {
returns(GDvoid)
"buffer_views"(GDTypedArray(GDGLTFBufferView::class))
}

func("set_cameras") {
returns(GDvoid)
"cameras"(GDTypedArray(GDGLTFCamera::class))
}

func("set_handle_binary_image") {
returns(GDvoid)
"method"(GDint)
}

func("set_images") {
returns(GDvoid)
"images"(GDTypedArray(GDTexture2D::class))
}

func("set_lights") {
returns(GDvoid)
"lights"(GDTypedArray(GDGLTFLight::class))
}

func("set_materials") {
returns(GDvoid)
"materials"(GDTypedArray(GDMaterial::class))
}

func("set_meshes") {
returns(GDvoid)
"meshes"(GDTypedArray(GDGLTFMesh::class))
}

func("set_nodes") {
returns(GDvoid)
"nodes"(GDTypedArray(GDGLTFNode::class))
}

func("set_skeletons") {
returns(GDvoid)
"skeletons"(GDTypedArray(GDGLTFSkeleton::class))
}

func("set_skins") {
returns(GDvoid)
"skins"(GDTypedArray(GDGLTFSkin::class))
}

func("set_texture_samplers") {
returns(GDvoid)
"texture_samplers"(GDTypedArray(GDGLTFTextureSampler::class))
}

func("set_textures") {
returns(GDvoid)
"textures"(GDTypedArray(GDGLTFTexture::class))
}

func("set_unique_animation_names") {
returns(GDvoid)
"unique_animation_names"(GDTypedArray(GDString::class))
}

func("set_unique_names") {
returns(GDvoid)
"unique_names"(GDTypedArray(GDString::class))
}
}){

}