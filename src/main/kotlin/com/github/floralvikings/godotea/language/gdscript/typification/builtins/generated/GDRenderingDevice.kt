
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRenderingDevice: GDType("RenderingDevice", {


constructor { }

func("barrier") {
returns(GDvoid)
"from"(GDUnknownType)
"to"(GDUnknownType)
}

func("buffer_clear") {
returns(GDError)
"buffer"(GDRID)
"offset"(GDint)
"size_bytes"(GDint)
"post_barrier"(GDUnknownType)
}

func("buffer_get_data") {
returns(GDPackedByteArray)
"buffer"(GDRID)
"offset_bytes"(GDint)
"size_bytes"(GDint)
}

func("buffer_update") {
returns(GDError)
"buffer"(GDRID)
"offset"(GDint)
"size_bytes"(GDint)
"data"(GDPackedByteArray)
"post_barrier"(GDUnknownType)
}

func("capture_timestamp") {
returns(GDvoid)
"name"(GDString)
}

func("compute_list_add_barrier") {
returns(GDvoid)
"compute_list"(GDint)
}

func("compute_list_begin") {
returns(GDint)
"allow_draw_overlap"(GDbool)
}

func("compute_list_bind_compute_pipeline") {
returns(GDvoid)
"compute_list"(GDint)
"compute_pipeline"(GDRID)
}

func("compute_list_bind_uniform_set") {
returns(GDvoid)
"compute_list"(GDint)
"uniform_set"(GDRID)
"set_index"(GDint)
}

func("compute_list_dispatch") {
returns(GDvoid)
"compute_list"(GDint)
"x_groups"(GDint)
"y_groups"(GDint)
"z_groups"(GDint)
}

func("compute_list_end") {
returns(GDvoid)
"post_barrier"(GDUnknownType)
}

func("compute_list_set_push_constant") {
returns(GDvoid)
"compute_list"(GDint)
"buffer"(GDPackedByteArray)
"size_bytes"(GDint)
}

func("compute_pipeline_create") {
returns(GDRID)
"shader"(GDRID)
"specialization_constants"(GDTypedArray(GDRDPipelineSpecializationConstant::class))
}

func("compute_pipeline_is_valid") {
returns(GDbool)
"compute_pipeline"(GDRID)
}

func("create_local_device") {
returns(GDSameType)

}

func("draw_command_begin_label") {
returns(GDvoid)
"name"(GDString)
"color"(GDColor)
}

func("draw_command_end_label") {
returns(GDvoid)

}

func("draw_command_insert_label") {
returns(GDvoid)
"name"(GDString)
"color"(GDColor)
}

func("draw_list_begin") {
returns(GDint)
"framebuffer"(GDRID)
"initial_color_action"(GDInitialAction)
"final_color_action"(GDFinalAction)
"initial_depth_action"(GDInitialAction)
"final_depth_action"(GDFinalAction)
"clear_color_values"(GDPackedColorArray)
"clear_depth"(GDfloat)
"clear_stencil"(GDint)
"region"(GDRect2)
"storage_textures"(GDTypedArray(GDRID::class))
}

func("draw_list_begin_for_screen") {
returns(GDint)
"screen"(GDint)
"clear_color"(GDColor)
}

func("draw_list_begin_split") {
returns(GDPackedInt64Array)
"framebuffer"(GDRID)
"splits"(GDint)
"initial_color_action"(GDInitialAction)
"final_color_action"(GDFinalAction)
"initial_depth_action"(GDInitialAction)
"final_depth_action"(GDFinalAction)
"clear_color_values"(GDPackedColorArray)
"clear_depth"(GDfloat)
"clear_stencil"(GDint)
"region"(GDRect2)
"storage_textures"(GDTypedArray(GDRID::class))
}

func("draw_list_bind_index_array") {
returns(GDvoid)
"draw_list"(GDint)
"index_array"(GDRID)
}

func("draw_list_bind_render_pipeline") {
returns(GDvoid)
"draw_list"(GDint)
"render_pipeline"(GDRID)
}

func("draw_list_bind_uniform_set") {
returns(GDvoid)
"draw_list"(GDint)
"uniform_set"(GDRID)
"set_index"(GDint)
}

func("draw_list_bind_vertex_array") {
returns(GDvoid)
"draw_list"(GDint)
"vertex_array"(GDRID)
}

func("draw_list_disable_scissor") {
returns(GDvoid)
"draw_list"(GDint)
}

func("draw_list_draw") {
returns(GDvoid)
"draw_list"(GDint)
"use_indices"(GDbool)
"instances"(GDint)
"procedural_vertex_count"(GDint)
}

func("draw_list_enable_scissor") {
returns(GDvoid)
"draw_list"(GDint)
"rect"(GDRect2)
}

func("draw_list_end") {
returns(GDvoid)
"post_barrier"(GDUnknownType)
}

func("draw_list_set_blend_constants") {
returns(GDvoid)
"draw_list"(GDint)
"color"(GDColor)
}

func("draw_list_set_push_constant") {
returns(GDvoid)
"draw_list"(GDint)
"buffer"(GDPackedByteArray)
"size_bytes"(GDint)
}

func("draw_list_switch_to_next_pass") {
returns(GDint)

}

func("draw_list_switch_to_next_pass_split") {
returns(GDPackedInt64Array)
"splits"(GDint)
}

func("framebuffer_create") {
returns(GDRID)
"textures"(GDTypedArray(GDRID::class))
"validate_with_format"(GDint)
"view_count"(GDint)
}

func("framebuffer_create_empty") {
returns(GDRID)
"size"(GDVector2i)
"samples"(GDTextureSamples)
"validate_with_format"(GDint)
}

func("framebuffer_create_multipass") {
returns(GDRID)
"textures"(GDTypedArray(GDRID::class))
"passes"(GDTypedArray(GDRDFramebufferPass::class))
"validate_with_format"(GDint)
"view_count"(GDint)
}

func("framebuffer_format_create") {
returns(GDint)
"attachments"(GDTypedArray(GDRDAttachmentFormat::class))
"view_count"(GDint)
}

func("framebuffer_format_create_empty") {
returns(GDint)
"samples"(GDTextureSamples)
}

func("framebuffer_format_create_multipass") {
returns(GDint)
"attachments"(GDTypedArray(GDRDAttachmentFormat::class))
"passes"(GDTypedArray(GDRDFramebufferPass::class))
"view_count"(GDint)
}

func("framebuffer_format_get_texture_samples") {
returns(GDTextureSamples)
"format"(GDint)
"render_pass"(GDint)
}

func("framebuffer_get_format") {
returns(GDint)
"framebuffer"(GDRID)
}

func("framebuffer_is_valid") {
returns(GDbool)
"framebuffer"(GDRID)
}

func("free_rid") {
returns(GDvoid)
"rid"(GDRID)
}

func("full_barrier") {
returns(GDvoid)

}

func("get_captured_timestamp_cpu_time") {
returns(GDint)
"index"(GDint)
}

func("get_captured_timestamp_gpu_time") {
returns(GDint)
"index"(GDint)
}

func("get_captured_timestamp_name") {
returns(GDString)
"index"(GDint)
}

func("get_captured_timestamps_count") {
returns(GDint)

}

func("get_captured_timestamps_frame") {
returns(GDint)

}

func("get_device_name") {
returns(GDString)

}

func("get_device_pipeline_cache_uuid") {
returns(GDString)

}

func("get_device_vendor_name") {
returns(GDString)

}

func("get_driver_resource") {
returns(GDint)
"resource"(GDDriverResource)
"rid"(GDRID)
"index"(GDint)
}

func("get_frame_delay") {
returns(GDint)

}

func("get_memory_usage") {
returns(GDint)
"type"(GDMemoryType)
}

func("index_array_create") {
returns(GDRID)
"index_buffer"(GDRID)
"index_offset"(GDint)
"index_count"(GDint)
}

func("index_buffer_create") {
returns(GDRID)
"size_indices"(GDint)
"format"(GDIndexBufferFormat)
"data"(GDPackedByteArray)
"use_restart_indices"(GDbool)
}

func("limit_get") {
returns(GDint)
"limit"(GDLimit)
}

func("render_pipeline_create") {
returns(GDRID)
"shader"(GDRID)
"framebuffer_format"(GDint)
"vertex_format"(GDint)
"primitive"(GDRenderPrimitive)
"rasterization_state"(GDRDPipelineRasterizationState)
"multisample_state"(GDRDPipelineMultisampleState)
"stencil_state"(GDRDPipelineDepthStencilState)
"color_blend_state"(GDRDPipelineColorBlendState)
"dynamic_state_flags"(GDUnknownType)
"for_render_pass"(GDint)
"specialization_constants"(GDTypedArray(GDRDPipelineSpecializationConstant::class))
}

func("render_pipeline_is_valid") {
returns(GDbool)
"render_pipeline"(GDRID)
}

func("sampler_create") {
returns(GDRID)
"state"(GDRDSamplerState)
}

func("sampler_is_format_supported_for_filter") {
returns(GDbool)
"format"(GDDataFormat)
"sampler_filter"(GDSamplerFilter)
}

func("screen_get_framebuffer_format") {
returns(GDint)

}

func("screen_get_height") {
returns(GDint)
"screen"(GDint)
}

func("screen_get_width") {
returns(GDint)
"screen"(GDint)
}

func("set_resource_name") {
returns(GDvoid)
"id"(GDRID)
"name"(GDString)
}

func("shader_compile_binary_from_spirv") {
returns(GDPackedByteArray)
"spirv_data"(GDRDShaderSPIRV)
"name"(GDString)
}

func("shader_compile_spirv_from_source") {
returns(GDRDShaderSPIRV)
"shader_source"(GDRDShaderSource)
"allow_cache"(GDbool)
}

func("shader_create_from_bytecode") {
returns(GDRID)
"binary_data"(GDPackedByteArray)
}

func("shader_create_from_spirv") {
returns(GDRID)
"spirv_data"(GDRDShaderSPIRV)
"name"(GDString)
}

func("shader_get_vertex_input_attribute_mask") {
returns(GDint)
"shader"(GDRID)
}

func("storage_buffer_create") {
returns(GDRID)
"size_bytes"(GDint)
"data"(GDPackedByteArray)
"usage"(GDUnknownType)
}

func("submit") {
returns(GDvoid)

}

func("sync") {
returns(GDvoid)

}

func("texture_buffer_create") {
returns(GDRID)
"size_bytes"(GDint)
"format"(GDDataFormat)
"data"(GDPackedByteArray)
}

func("texture_clear") {
returns(GDError)
"texture"(GDRID)
"color"(GDColor)
"base_mipmap"(GDint)
"mipmap_count"(GDint)
"base_layer"(GDint)
"layer_count"(GDint)
"post_barrier"(GDUnknownType)
}

func("texture_copy") {
returns(GDError)
"from_texture"(GDRID)
"to_texture"(GDRID)
"from_pos"(GDVector3)
"to_pos"(GDVector3)
"size"(GDVector3)
"src_mipmap"(GDint)
"dst_mipmap"(GDint)
"src_layer"(GDint)
"dst_layer"(GDint)
"post_barrier"(GDUnknownType)
}

func("texture_create") {
returns(GDRID)
"format"(GDRDTextureFormat)
"view"(GDRDTextureView)
"data"(GDTypedArray(GDPackedByteArray::class))
}

func("texture_create_shared") {
returns(GDRID)
"view"(GDRDTextureView)
"with_texture"(GDRID)
}

func("texture_create_shared_from_slice") {
returns(GDRID)
"view"(GDRDTextureView)
"with_texture"(GDRID)
"layer"(GDint)
"mipmap"(GDint)
"mipmaps"(GDint)
"slice_type"(GDTextureSliceType)
}

func("texture_get_data") {
returns(GDPackedByteArray)
"texture"(GDRID)
"layer"(GDint)
}

func("texture_get_native_handle") {
returns(GDint)
"texture"(GDRID)
}

func("texture_is_format_supported_for_usage") {
returns(GDbool)
"format"(GDDataFormat)
"usage_flags"(GDUnknownType)
}

func("texture_is_shared") {
returns(GDbool)
"texture"(GDRID)
}

func("texture_is_valid") {
returns(GDbool)
"texture"(GDRID)
}

func("texture_resolve_multisample") {
returns(GDError)
"from_texture"(GDRID)
"to_texture"(GDRID)
"post_barrier"(GDUnknownType)
}

func("texture_update") {
returns(GDError)
"texture"(GDRID)
"layer"(GDint)
"data"(GDPackedByteArray)
"post_barrier"(GDUnknownType)
}

func("uniform_buffer_create") {
returns(GDRID)
"size_bytes"(GDint)
"data"(GDPackedByteArray)
}

func("uniform_set_create") {
returns(GDRID)
"uniforms"(GDTypedArray(GDRDUniform::class))
"shader"(GDRID)
"shader_set"(GDint)
}

func("uniform_set_is_valid") {
returns(GDbool)
"uniform_set"(GDRID)
}

func("vertex_array_create") {
returns(GDRID)
"vertex_count"(GDint)
"vertex_format"(GDint)
"src_buffers"(GDTypedArray(GDRID::class))
"offsets"(GDPackedInt64Array)
}

func("vertex_buffer_create") {
returns(GDRID)
"size_bytes"(GDint)
"data"(GDPackedByteArray)
"use_as_storage"(GDbool)
}

func("vertex_format_create") {
returns(GDint)
"vertex_descriptions"(GDTypedArray(GDRDVertexAttribute::class))
}
}){

}