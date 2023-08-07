
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDRenderingServer: GDType("RenderingServer", {

"render_loop_enabled"(GDbool)
constructor { }

func("bake_render_uv2") {
returns(GDTypedArray(GDImage::class))
"base"(GDRID)
"material_overrides"(GDTypedArray(GDRID::class))
"image_size"(GDVector2i)
}

func("camera_attributes_create") {
returns(GDRID)

}

func("camera_attributes_set_auto_exposure") {
returns(GDvoid)
"camera_attributes"(GDRID)
"enable"(GDbool)
"min_sensitivity"(GDfloat)
"max_sensitivity"(GDfloat)
"speed"(GDfloat)
"scale"(GDfloat)
}

func("camera_attributes_set_dof_blur") {
returns(GDvoid)
"camera_attributes"(GDRID)
"far_enable"(GDbool)
"far_distance"(GDfloat)
"far_transition"(GDfloat)
"near_enable"(GDbool)
"near_distance"(GDfloat)
"near_transition"(GDfloat)
"amount"(GDfloat)
}

func("camera_attributes_set_dof_blur_bokeh_shape") {
returns(GDvoid)
"shape"(GDDOFBokehShape)
}

func("camera_attributes_set_dof_blur_quality") {
returns(GDvoid)
"quality"(GDDOFBlurQuality)
"use_jitter"(GDbool)
}

func("camera_attributes_set_exposure") {
returns(GDvoid)
"camera_attributes"(GDRID)
"multiplier"(GDfloat)
"normalization"(GDfloat)
}

func("camera_create") {
returns(GDRID)

}

func("camera_set_camera_attributes") {
returns(GDvoid)
"camera"(GDRID)
"effects"(GDRID)
}

func("camera_set_cull_mask") {
returns(GDvoid)
"camera"(GDRID)
"layers"(GDint)
}

func("camera_set_environment") {
returns(GDvoid)
"camera"(GDRID)
"env"(GDRID)
}

func("camera_set_frustum") {
returns(GDvoid)
"camera"(GDRID)
"size"(GDfloat)
"offset"(GDVector2)
"z_near"(GDfloat)
"z_far"(GDfloat)
}

func("camera_set_orthogonal") {
returns(GDvoid)
"camera"(GDRID)
"size"(GDfloat)
"z_near"(GDfloat)
"z_far"(GDfloat)
}

func("camera_set_perspective") {
returns(GDvoid)
"camera"(GDRID)
"fovy_degrees"(GDfloat)
"z_near"(GDfloat)
"z_far"(GDfloat)
}

func("camera_set_transform") {
returns(GDvoid)
"camera"(GDRID)
"transform"(GDTransform3D)
}

func("camera_set_use_vertical_aspect") {
returns(GDvoid)
"camera"(GDRID)
"enable"(GDbool)
}

func("canvas_create") {
returns(GDRID)

}

func("canvas_item_add_animation_slice") {
returns(GDvoid)
"item"(GDRID)
"animation_length"(GDfloat)
"slice_begin"(GDfloat)
"slice_end"(GDfloat)
"offset"(GDfloat)
}

func("canvas_item_add_circle") {
returns(GDvoid)
"item"(GDRID)
"pos"(GDVector2)
"radius"(GDfloat)
"color"(GDColor)
}

func("canvas_item_add_clip_ignore") {
returns(GDvoid)
"item"(GDRID)
"ignore"(GDbool)
}

func("canvas_item_add_lcd_texture_rect_region") {
returns(GDvoid)
"item"(GDRID)
"rect"(GDRect2)
"texture"(GDRID)
"src_rect"(GDRect2)
"modulate"(GDColor)
}

func("canvas_item_add_line") {
returns(GDvoid)
"item"(GDRID)
"from"(GDVector2)
"to"(GDVector2)
"color"(GDColor)
"width"(GDfloat)
"antialiased"(GDbool)
}

func("canvas_item_add_mesh") {
returns(GDvoid)
"item"(GDRID)
"mesh"(GDRID)
"transform"(GDTransform2D)
"modulate"(GDColor)
"texture"(GDRID)
}

func("canvas_item_add_msdf_texture_rect_region") {
returns(GDvoid)
"item"(GDRID)
"rect"(GDRect2)
"texture"(GDRID)
"src_rect"(GDRect2)
"modulate"(GDColor)
"outline_size"(GDint)
"px_range"(GDfloat)
"scale"(GDfloat)
}

func("canvas_item_add_multiline") {
returns(GDvoid)
"item"(GDRID)
"points"(GDPackedVector2Array)
"colors"(GDPackedColorArray)
"width"(GDfloat)
}

func("canvas_item_add_multimesh") {
returns(GDvoid)
"item"(GDRID)
"mesh"(GDRID)
"texture"(GDRID)
}

func("canvas_item_add_nine_patch") {
returns(GDvoid)
"item"(GDRID)
"rect"(GDRect2)
"source"(GDRect2)
"texture"(GDRID)
"topleft"(GDVector2)
"bottomright"(GDVector2)
"x_axis_mode"(GDNinePatchAxisMode)
"y_axis_mode"(GDNinePatchAxisMode)
"draw_center"(GDbool)
"modulate"(GDColor)
}

func("canvas_item_add_particles") {
returns(GDvoid)
"item"(GDRID)
"particles"(GDRID)
"texture"(GDRID)
}

func("canvas_item_add_polygon") {
returns(GDvoid)
"item"(GDRID)
"points"(GDPackedVector2Array)
"colors"(GDPackedColorArray)
"uvs"(GDPackedVector2Array)
"texture"(GDRID)
}

func("canvas_item_add_polyline") {
returns(GDvoid)
"item"(GDRID)
"points"(GDPackedVector2Array)
"colors"(GDPackedColorArray)
"width"(GDfloat)
"antialiased"(GDbool)
}

func("canvas_item_add_primitive") {
returns(GDvoid)
"item"(GDRID)
"points"(GDPackedVector2Array)
"colors"(GDPackedColorArray)
"uvs"(GDPackedVector2Array)
"texture"(GDRID)
}

func("canvas_item_add_rect") {
returns(GDvoid)
"item"(GDRID)
"rect"(GDRect2)
"color"(GDColor)
}

func("canvas_item_add_set_transform") {
returns(GDvoid)
"item"(GDRID)
"transform"(GDTransform2D)
}

func("canvas_item_add_texture_rect") {
returns(GDvoid)
"item"(GDRID)
"rect"(GDRect2)
"texture"(GDRID)
"tile"(GDbool)
"modulate"(GDColor)
"transpose"(GDbool)
}

func("canvas_item_add_texture_rect_region") {
returns(GDvoid)
"item"(GDRID)
"rect"(GDRect2)
"texture"(GDRID)
"src_rect"(GDRect2)
"modulate"(GDColor)
"transpose"(GDbool)
"clip_uv"(GDbool)
}

func("canvas_item_add_triangle_array") {
returns(GDvoid)
"item"(GDRID)
"indices"(GDPackedInt32Array)
"points"(GDPackedVector2Array)
"colors"(GDPackedColorArray)
"uvs"(GDPackedVector2Array)
"bones"(GDPackedInt32Array)
"weights"(GDPackedFloat32Array)
"texture"(GDRID)
"count"(GDint)
}

func("canvas_item_clear") {
returns(GDvoid)
"item"(GDRID)
}

func("canvas_item_create") {
returns(GDRID)

}

func("canvas_item_set_canvas_group_mode") {
returns(GDvoid)
"item"(GDRID)
"mode"(GDCanvasGroupMode)
"clear_margin"(GDfloat)
"fit_empty"(GDbool)
"fit_margin"(GDfloat)
"blur_mipmaps"(GDbool)
}

func("canvas_item_set_clip") {
returns(GDvoid)
"item"(GDRID)
"clip"(GDbool)
}

func("canvas_item_set_copy_to_backbuffer") {
returns(GDvoid)
"item"(GDRID)
"enabled"(GDbool)
"rect"(GDRect2)
}

func("canvas_item_set_custom_rect") {
returns(GDvoid)
"item"(GDRID)
"use_custom_rect"(GDbool)
"rect"(GDRect2)
}

func("canvas_item_set_default_texture_filter") {
returns(GDvoid)
"item"(GDRID)
"filter"(GDCanvasItemTextureFilter)
}

func("canvas_item_set_default_texture_repeat") {
returns(GDvoid)
"item"(GDRID)
"repeat"(GDCanvasItemTextureRepeat)
}

func("canvas_item_set_distance_field_mode") {
returns(GDvoid)
"item"(GDRID)
"enabled"(GDbool)
}

func("canvas_item_set_draw_behind_parent") {
returns(GDvoid)
"item"(GDRID)
"enabled"(GDbool)
}

func("canvas_item_set_draw_index") {
returns(GDvoid)
"item"(GDRID)
"index"(GDint)
}

func("canvas_item_set_light_mask") {
returns(GDvoid)
"item"(GDRID)
"mask"(GDint)
}

func("canvas_item_set_material") {
returns(GDvoid)
"item"(GDRID)
"material"(GDRID)
}

func("canvas_item_set_modulate") {
returns(GDvoid)
"item"(GDRID)
"color"(GDColor)
}

func("canvas_item_set_parent") {
returns(GDvoid)
"item"(GDRID)
"parent"(GDRID)
}

func("canvas_item_set_self_modulate") {
returns(GDvoid)
"item"(GDRID)
"color"(GDColor)
}

func("canvas_item_set_sort_children_by_y") {
returns(GDvoid)
"item"(GDRID)
"enabled"(GDbool)
}

func("canvas_item_set_transform") {
returns(GDvoid)
"item"(GDRID)
"transform"(GDTransform2D)
}

func("canvas_item_set_use_parent_material") {
returns(GDvoid)
"item"(GDRID)
"enabled"(GDbool)
}

func("canvas_item_set_visibility_layer") {
returns(GDvoid)
"item"(GDRID)
"visibility_layer"(GDint)
}

func("canvas_item_set_visibility_notifier") {
returns(GDvoid)
"item"(GDRID)
"enable"(GDbool)
"area"(GDRect2)
"enter_callable"(GDCallable)
"exit_callable"(GDCallable)
}

func("canvas_item_set_visible") {
returns(GDvoid)
"item"(GDRID)
"visible"(GDbool)
}

func("canvas_item_set_z_as_relative_to_parent") {
returns(GDvoid)
"item"(GDRID)
"enabled"(GDbool)
}

func("canvas_item_set_z_index") {
returns(GDvoid)
"item"(GDRID)
"z_index"(GDint)
}

func("canvas_light_attach_to_canvas") {
returns(GDvoid)
"light"(GDRID)
"canvas"(GDRID)
}

func("canvas_light_create") {
returns(GDRID)

}

func("canvas_light_occluder_attach_to_canvas") {
returns(GDvoid)
"occluder"(GDRID)
"canvas"(GDRID)
}

func("canvas_light_occluder_create") {
returns(GDRID)

}

func("canvas_light_occluder_set_as_sdf_collision") {
returns(GDvoid)
"occluder"(GDRID)
"enable"(GDbool)
}

func("canvas_light_occluder_set_enabled") {
returns(GDvoid)
"occluder"(GDRID)
"enabled"(GDbool)
}

func("canvas_light_occluder_set_light_mask") {
returns(GDvoid)
"occluder"(GDRID)
"mask"(GDint)
}

func("canvas_light_occluder_set_polygon") {
returns(GDvoid)
"occluder"(GDRID)
"polygon"(GDRID)
}

func("canvas_light_occluder_set_transform") {
returns(GDvoid)
"occluder"(GDRID)
"transform"(GDTransform2D)
}

func("canvas_light_set_blend_mode") {
returns(GDvoid)
"light"(GDRID)
"mode"(GDCanvasLightBlendMode)
}

func("canvas_light_set_color") {
returns(GDvoid)
"light"(GDRID)
"color"(GDColor)
}

func("canvas_light_set_enabled") {
returns(GDvoid)
"light"(GDRID)
"enabled"(GDbool)
}

func("canvas_light_set_energy") {
returns(GDvoid)
"light"(GDRID)
"energy"(GDfloat)
}

func("canvas_light_set_height") {
returns(GDvoid)
"light"(GDRID)
"height"(GDfloat)
}

func("canvas_light_set_item_cull_mask") {
returns(GDvoid)
"light"(GDRID)
"mask"(GDint)
}

func("canvas_light_set_item_shadow_cull_mask") {
returns(GDvoid)
"light"(GDRID)
"mask"(GDint)
}

func("canvas_light_set_layer_range") {
returns(GDvoid)
"light"(GDRID)
"min_layer"(GDint)
"max_layer"(GDint)
}

func("canvas_light_set_mode") {
returns(GDvoid)
"light"(GDRID)
"mode"(GDCanvasLightMode)
}

func("canvas_light_set_shadow_color") {
returns(GDvoid)
"light"(GDRID)
"color"(GDColor)
}

func("canvas_light_set_shadow_enabled") {
returns(GDvoid)
"light"(GDRID)
"enabled"(GDbool)
}

func("canvas_light_set_shadow_filter") {
returns(GDvoid)
"light"(GDRID)
"filter"(GDCanvasLightShadowFilter)
}

func("canvas_light_set_shadow_smooth") {
returns(GDvoid)
"light"(GDRID)
"smooth"(GDfloat)
}

func("canvas_light_set_texture") {
returns(GDvoid)
"light"(GDRID)
"texture"(GDRID)
}

func("canvas_light_set_texture_offset") {
returns(GDvoid)
"light"(GDRID)
"offset"(GDVector2)
}

func("canvas_light_set_texture_scale") {
returns(GDvoid)
"light"(GDRID)
"scale"(GDfloat)
}

func("canvas_light_set_transform") {
returns(GDvoid)
"light"(GDRID)
"transform"(GDTransform2D)
}

func("canvas_light_set_z_range") {
returns(GDvoid)
"light"(GDRID)
"min_z"(GDint)
"max_z"(GDint)
}

func("canvas_occluder_polygon_create") {
returns(GDRID)

}

func("canvas_occluder_polygon_set_cull_mode") {
returns(GDvoid)
"occluder_polygon"(GDRID)
"mode"(GDCanvasOccluderPolygonCullMode)
}

func("canvas_occluder_polygon_set_shape") {
returns(GDvoid)
"occluder_polygon"(GDRID)
"shape"(GDPackedVector2Array)
"closed"(GDbool)
}

func("canvas_set_disable_scale") {
returns(GDvoid)
"disable"(GDbool)
}

func("canvas_set_item_mirroring") {
returns(GDvoid)
"canvas"(GDRID)
"item"(GDRID)
"mirroring"(GDVector2)
}

func("canvas_set_modulate") {
returns(GDvoid)
"canvas"(GDRID)
"color"(GDColor)
}

func("canvas_set_shadow_texture_size") {
returns(GDvoid)
"size"(GDint)
}

func("canvas_texture_create") {
returns(GDRID)

}

func("canvas_texture_set_channel") {
returns(GDvoid)
"canvas_texture"(GDRID)
"channel"(GDCanvasTextureChannel)
"texture"(GDRID)
}

func("canvas_texture_set_shading_parameters") {
returns(GDvoid)
"canvas_texture"(GDRID)
"base_color"(GDColor)
"shininess"(GDfloat)
}

func("canvas_texture_set_texture_filter") {
returns(GDvoid)
"canvas_texture"(GDRID)
"filter"(GDCanvasItemTextureFilter)
}

func("canvas_texture_set_texture_repeat") {
returns(GDvoid)
"canvas_texture"(GDRID)
"repeat"(GDCanvasItemTextureRepeat)
}

func("create_local_rendering_device") {
returns(GDRenderingDevice)

}

func("decal_create") {
returns(GDRID)

}

func("decal_set_albedo_mix") {
returns(GDvoid)
"decal"(GDRID)
"albedo_mix"(GDfloat)
}

func("decal_set_cull_mask") {
returns(GDvoid)
"decal"(GDRID)
"mask"(GDint)
}

func("decal_set_distance_fade") {
returns(GDvoid)
"decal"(GDRID)
"enabled"(GDbool)
"begin"(GDfloat)
"length"(GDfloat)
}

func("decal_set_emission_energy") {
returns(GDvoid)
"decal"(GDRID)
"energy"(GDfloat)
}

func("decal_set_fade") {
returns(GDvoid)
"decal"(GDRID)
"above"(GDfloat)
"below"(GDfloat)
}

func("decal_set_modulate") {
returns(GDvoid)
"decal"(GDRID)
"color"(GDColor)
}

func("decal_set_normal_fade") {
returns(GDvoid)
"decal"(GDRID)
"fade"(GDfloat)
}

func("decal_set_size") {
returns(GDvoid)
"decal"(GDRID)
"size"(GDVector3)
}

func("decal_set_texture") {
returns(GDvoid)
"decal"(GDRID)
"type"(GDDecalTexture)
"texture"(GDRID)
}

func("decals_set_filter") {
returns(GDvoid)
"filter"(GDDecalFilter)
}

func("directional_light_create") {
returns(GDRID)

}

func("directional_shadow_atlas_set_size") {
returns(GDvoid)
"size"(GDint)
"is_16bits"(GDbool)
}

func("directional_soft_shadow_filter_set_quality") {
returns(GDvoid)
"quality"(GDShadowQuality)
}

func("environment_bake_panorama") {
returns(GDImage)
"environment"(GDRID)
"bake_irradiance"(GDbool)
"size"(GDVector2i)
}

func("environment_create") {
returns(GDRID)

}

func("environment_glow_set_use_bicubic_upscale") {
returns(GDvoid)
"enable"(GDbool)
}

func("environment_set_adjustment") {
returns(GDvoid)
"env"(GDRID)
"enable"(GDbool)
"brightness"(GDfloat)
"contrast"(GDfloat)
"saturation"(GDfloat)
"use_1d_color_correction"(GDbool)
"color_correction"(GDRID)
}

func("environment_set_ambient_light") {
returns(GDvoid)
"env"(GDRID)
"color"(GDColor)
"ambient"(GDEnvironmentAmbientSource)
"energy"(GDfloat)
"sky_contibution"(GDfloat)
"reflection_source"(GDEnvironmentReflectionSource)
}

func("environment_set_background") {
returns(GDvoid)
"env"(GDRID)
"bg"(GDEnvironmentBG)
}

func("environment_set_bg_color") {
returns(GDvoid)
"env"(GDRID)
"color"(GDColor)
}

func("environment_set_bg_energy") {
returns(GDvoid)
"env"(GDRID)
"multiplier"(GDfloat)
"exposure_value"(GDfloat)
}

func("environment_set_canvas_max_layer") {
returns(GDvoid)
"env"(GDRID)
"max_layer"(GDint)
}

func("environment_set_fog") {
returns(GDvoid)
"env"(GDRID)
"enable"(GDbool)
"light_color"(GDColor)
"light_energy"(GDfloat)
"sun_scatter"(GDfloat)
"density"(GDfloat)
"height"(GDfloat)
"height_density"(GDfloat)
"aerial_perspective"(GDfloat)
"sky_affect"(GDfloat)
}

func("environment_set_glow") {
returns(GDvoid)
"env"(GDRID)
"enable"(GDbool)
"levels"(GDPackedFloat32Array)
"intensity"(GDfloat)
"strength"(GDfloat)
"mix"(GDfloat)
"bloom_threshold"(GDfloat)
"blend_mode"(GDEnvironmentGlowBlendMode)
"hdr_bleed_threshold"(GDfloat)
"hdr_bleed_scale"(GDfloat)
"hdr_luminance_cap"(GDfloat)
"glow_map_strength"(GDfloat)
"glow_map"(GDRID)
}

func("environment_set_sdfgi") {
returns(GDvoid)
"env"(GDRID)
"enable"(GDbool)
"cascades"(GDint)
"min_cell_size"(GDfloat)
"y_scale"(GDEnvironmentSDFGIYScale)
"use_occlusion"(GDbool)
"bounce_feedback"(GDfloat)
"read_sky"(GDbool)
"energy"(GDfloat)
"normal_bias"(GDfloat)
"probe_bias"(GDfloat)
}

func("environment_set_sdfgi_frames_to_converge") {
returns(GDvoid)
"frames"(GDEnvironmentSDFGIFramesToConverge)
}

func("environment_set_sdfgi_frames_to_update_light") {
returns(GDvoid)
"frames"(GDEnvironmentSDFGIFramesToUpdateLight)
}

func("environment_set_sdfgi_ray_count") {
returns(GDvoid)
"ray_count"(GDEnvironmentSDFGIRayCount)
}

func("environment_set_sky") {
returns(GDvoid)
"env"(GDRID)
"sky"(GDRID)
}

func("environment_set_sky_custom_fov") {
returns(GDvoid)
"env"(GDRID)
"scale"(GDfloat)
}

func("environment_set_sky_orientation") {
returns(GDvoid)
"env"(GDRID)
"orientation"(GDBasis)
}

func("environment_set_ssao") {
returns(GDvoid)
"env"(GDRID)
"enable"(GDbool)
"radius"(GDfloat)
"intensity"(GDfloat)
"power"(GDfloat)
"detail"(GDfloat)
"horizon"(GDfloat)
"sharpness"(GDfloat)
"light_affect"(GDfloat)
"ao_channel_affect"(GDfloat)
}

func("environment_set_ssao_quality") {
returns(GDvoid)
"quality"(GDEnvironmentSSAOQuality)
"half_size"(GDbool)
"adaptive_target"(GDfloat)
"blur_passes"(GDint)
"fadeout_from"(GDfloat)
"fadeout_to"(GDfloat)
}

func("environment_set_ssil_quality") {
returns(GDvoid)
"quality"(GDEnvironmentSSILQuality)
"half_size"(GDbool)
"adaptive_target"(GDfloat)
"blur_passes"(GDint)
"fadeout_from"(GDfloat)
"fadeout_to"(GDfloat)
}

func("environment_set_ssr") {
returns(GDvoid)
"env"(GDRID)
"enable"(GDbool)
"max_steps"(GDint)
"fade_in"(GDfloat)
"fade_out"(GDfloat)
"depth_tolerance"(GDfloat)
}

func("environment_set_ssr_roughness_quality") {
returns(GDvoid)
"quality"(GDEnvironmentSSRRoughnessQuality)
}

func("environment_set_tonemap") {
returns(GDvoid)
"env"(GDRID)
"tone_mapper"(GDEnvironmentToneMapper)
"exposure"(GDfloat)
"white"(GDfloat)
}

func("environment_set_volumetric_fog") {
returns(GDvoid)
"env"(GDRID)
"enable"(GDbool)
"density"(GDfloat)
"albedo"(GDColor)
"emission"(GDColor)
"emission_energy"(GDfloat)
"anisotropy"(GDfloat)
"length"(GDfloat)
"p_detail_spread"(GDfloat)
"gi_inject"(GDfloat)
"temporal_reprojection"(GDbool)
"temporal_reprojection_amount"(GDfloat)
"ambient_inject"(GDfloat)
"sky_affect"(GDfloat)
}

func("environment_set_volumetric_fog_filter_active") {
returns(GDvoid)
"active"(GDbool)
}

func("environment_set_volumetric_fog_volume_size") {
returns(GDvoid)
"size"(GDint)
"depth"(GDint)
}

func("fog_volume_create") {
returns(GDRID)

}

func("fog_volume_set_material") {
returns(GDvoid)
"fog_volume"(GDRID)
"material"(GDRID)
}

func("fog_volume_set_shape") {
returns(GDvoid)
"fog_volume"(GDRID)
"shape"(GDFogVolumeShape)
}

func("fog_volume_set_size") {
returns(GDvoid)
"fog_volume"(GDRID)
"size"(GDVector3)
}

func("force_draw") {
returns(GDvoid)
"swap_buffers"(GDbool)
"frame_step"(GDfloat)
}

func("force_sync") {
returns(GDvoid)

}

func("free_rid") {
returns(GDvoid)
"rid"(GDRID)
}

func("get_default_clear_color") {
returns(GDColor)

}

func("get_frame_setup_time_cpu") {
returns(GDfloat)

}

func("get_rendering_device") {
returns(GDRenderingDevice)

}

func("get_rendering_info") {
returns(GDint)
"info"(GDRenderingInfo)
}

func("get_shader_parameter_list") {
returns(GDTypedArray(GDDictionary::class))
"shader"(GDRID)
}

func("get_test_cube") {
returns(GDRID)

}

func("get_test_texture") {
returns(GDRID)

}

func("get_video_adapter_api_version") {
returns(GDString)

}

func("get_video_adapter_name") {
returns(GDString)

}

func("get_video_adapter_type") {
returns(GDDeviceType)

}

func("get_video_adapter_vendor") {
returns(GDString)

}

func("get_white_texture") {
returns(GDRID)

}

func("gi_set_use_half_resolution") {
returns(GDvoid)
"half_resolution"(GDbool)
}

func("global_shader_parameter_add") {
returns(GDvoid)
"name"(GDStringName)
"type"(GDGlobalShaderParameterType)
"default_value"(GDVariant)
}

func("global_shader_parameter_get") {
returns(GDVariant)
"name"(GDStringName)
}

func("global_shader_parameter_get_list") {
returns(GDTypedArray(GDStringName::class))

}

func("global_shader_parameter_get_type") {
returns(GDGlobalShaderParameterType)
"name"(GDStringName)
}

func("global_shader_parameter_remove") {
returns(GDvoid)
"name"(GDStringName)
}

func("global_shader_parameter_set") {
returns(GDvoid)
"name"(GDStringName)
"value"(GDVariant)
}

func("global_shader_parameter_set_override") {
returns(GDvoid)
"name"(GDStringName)
"value"(GDVariant)
}

func("has_changed") {
returns(GDbool)

}

func("has_feature") {
returns(GDbool)
"feature"(GDFeatures)
}

func("has_os_feature") {
returns(GDbool)
"feature"(GDString)
}

func("instance_attach_object_instance_id") {
returns(GDvoid)
"instance"(GDRID)
"id"(GDint)
}

func("instance_attach_skeleton") {
returns(GDvoid)
"instance"(GDRID)
"skeleton"(GDRID)
}

func("instance_create") {
returns(GDRID)

}

func("instance_create2") {
returns(GDRID)
"base"(GDRID)
"scenario"(GDRID)
}

func("instance_geometry_get_shader_parameter") {
returns(GDVariant)
"instance"(GDRID)
"parameter"(GDStringName)
}

func("instance_geometry_get_shader_parameter_default_value") {
returns(GDVariant)
"instance"(GDRID)
"parameter"(GDStringName)
}

func("instance_geometry_get_shader_parameter_list") {
returns(GDTypedArray(GDDictionary::class))
"instance"(GDRID)
}

func("instance_geometry_set_cast_shadows_setting") {
returns(GDvoid)
"instance"(GDRID)
"shadow_casting_setting"(GDShadowCastingSetting)
}

func("instance_geometry_set_flag") {
returns(GDvoid)
"instance"(GDRID)
"flag"(GDInstanceFlags)
"enabled"(GDbool)
}

func("instance_geometry_set_lightmap") {
returns(GDvoid)
"instance"(GDRID)
"lightmap"(GDRID)
"lightmap_uv_scale"(GDRect2)
"lightmap_slice"(GDint)
}

func("instance_geometry_set_lod_bias") {
returns(GDvoid)
"instance"(GDRID)
"lod_bias"(GDfloat)
}

func("instance_geometry_set_material_overlay") {
returns(GDvoid)
"instance"(GDRID)
"material"(GDRID)
}

func("instance_geometry_set_material_override") {
returns(GDvoid)
"instance"(GDRID)
"material"(GDRID)
}

func("instance_geometry_set_shader_parameter") {
returns(GDvoid)
"instance"(GDRID)
"parameter"(GDStringName)
"value"(GDVariant)
}

func("instance_geometry_set_transparency") {
returns(GDvoid)
"instance"(GDRID)
"transparency"(GDfloat)
}

func("instance_geometry_set_visibility_range") {
returns(GDvoid)
"instance"(GDRID)
"min"(GDfloat)
"max"(GDfloat)
"min_margin"(GDfloat)
"max_margin"(GDfloat)
"fade_mode"(GDVisibilityRangeFadeMode)
}

func("instance_set_base") {
returns(GDvoid)
"instance"(GDRID)
"base"(GDRID)
}

func("instance_set_blend_shape_weight") {
returns(GDvoid)
"instance"(GDRID)
"shape"(GDint)
"weight"(GDfloat)
}

func("instance_set_custom_aabb") {
returns(GDvoid)
"instance"(GDRID)
"aabb"(GDAABB)
}

func("instance_set_extra_visibility_margin") {
returns(GDvoid)
"instance"(GDRID)
"margin"(GDfloat)
}

func("instance_set_ignore_culling") {
returns(GDvoid)
"instance"(GDRID)
"enabled"(GDbool)
}

func("instance_set_layer_mask") {
returns(GDvoid)
"instance"(GDRID)
"mask"(GDint)
}

func("instance_set_pivot_data") {
returns(GDvoid)
"instance"(GDRID)
"sorting_offset"(GDfloat)
"use_aabb_center"(GDbool)
}

func("instance_set_scenario") {
returns(GDvoid)
"instance"(GDRID)
"scenario"(GDRID)
}

func("instance_set_surface_override_material") {
returns(GDvoid)
"instance"(GDRID)
"surface"(GDint)
"material"(GDRID)
}

func("instance_set_transform") {
returns(GDvoid)
"instance"(GDRID)
"transform"(GDTransform3D)
}

func("instance_set_visibility_parent") {
returns(GDvoid)
"instance"(GDRID)
"parent"(GDRID)
}

func("instance_set_visible") {
returns(GDvoid)
"instance"(GDRID)
"visible"(GDbool)
}

func("instances_cull_aabb") {
returns(GDPackedInt64Array)
"aabb"(GDAABB)
"scenario"(GDRID)
}

func("instances_cull_convex") {
returns(GDPackedInt64Array)
"convex"(GDTypedArray(GDPlane::class))
"scenario"(GDRID)
}

func("instances_cull_ray") {
returns(GDPackedInt64Array)
"from"(GDVector3)
"to"(GDVector3)
"scenario"(GDRID)
}

func("light_directional_set_blend_splits") {
returns(GDvoid)
"light"(GDRID)
"enable"(GDbool)
}

func("light_directional_set_shadow_mode") {
returns(GDvoid)
"light"(GDRID)
"mode"(GDLightDirectionalShadowMode)
}

func("light_directional_set_sky_mode") {
returns(GDvoid)
"light"(GDRID)
"mode"(GDLightDirectionalSkyMode)
}

func("light_omni_set_shadow_mode") {
returns(GDvoid)
"light"(GDRID)
"mode"(GDLightOmniShadowMode)
}

func("light_projectors_set_filter") {
returns(GDvoid)
"filter"(GDLightProjectorFilter)
}

func("light_set_bake_mode") {
returns(GDvoid)
"light"(GDRID)
"bake_mode"(GDLightBakeMode)
}

func("light_set_color") {
returns(GDvoid)
"light"(GDRID)
"color"(GDColor)
}

func("light_set_cull_mask") {
returns(GDvoid)
"light"(GDRID)
"mask"(GDint)
}

func("light_set_distance_fade") {
returns(GDvoid)
"decal"(GDRID)
"enabled"(GDbool)
"begin"(GDfloat)
"shadow"(GDfloat)
"length"(GDfloat)
}

func("light_set_max_sdfgi_cascade") {
returns(GDvoid)
"light"(GDRID)
"cascade"(GDint)
}

func("light_set_negative") {
returns(GDvoid)
"light"(GDRID)
"enable"(GDbool)
}

func("light_set_param") {
returns(GDvoid)
"light"(GDRID)
"param"(GDLightParam)
"value"(GDfloat)
}

func("light_set_projector") {
returns(GDvoid)
"light"(GDRID)
"texture"(GDRID)
}

func("light_set_reverse_cull_face_mode") {
returns(GDvoid)
"light"(GDRID)
"enabled"(GDbool)
}

func("light_set_shadow") {
returns(GDvoid)
"light"(GDRID)
"enabled"(GDbool)
}

func("lightmap_create") {
returns(GDRID)

}

func("lightmap_get_probe_capture_bsp_tree") {
returns(GDPackedInt32Array)
"lightmap"(GDRID)
}

func("lightmap_get_probe_capture_points") {
returns(GDPackedVector3Array)
"lightmap"(GDRID)
}

func("lightmap_get_probe_capture_sh") {
returns(GDPackedColorArray)
"lightmap"(GDRID)
}

func("lightmap_get_probe_capture_tetrahedra") {
returns(GDPackedInt32Array)
"lightmap"(GDRID)
}

func("lightmap_set_baked_exposure_normalization") {
returns(GDvoid)
"lightmap"(GDRID)
"baked_exposure"(GDfloat)
}

func("lightmap_set_probe_bounds") {
returns(GDvoid)
"lightmap"(GDRID)
"bounds"(GDAABB)
}

func("lightmap_set_probe_capture_data") {
returns(GDvoid)
"lightmap"(GDRID)
"points"(GDPackedVector3Array)
"point_sh"(GDPackedColorArray)
"tetrahedra"(GDPackedInt32Array)
"bsp_tree"(GDPackedInt32Array)
}

func("lightmap_set_probe_capture_update_speed") {
returns(GDvoid)
"speed"(GDfloat)
}

func("lightmap_set_probe_interior") {
returns(GDvoid)
"lightmap"(GDRID)
"interior"(GDbool)
}

func("lightmap_set_textures") {
returns(GDvoid)
"lightmap"(GDRID)
"light"(GDRID)
"uses_sh"(GDbool)
}

func("make_sphere_mesh") {
returns(GDRID)
"latitudes"(GDint)
"longitudes"(GDint)
"radius"(GDfloat)
}

func("material_create") {
returns(GDRID)

}

func("material_get_param") {
returns(GDVariant)
"material"(GDRID)
"parameter"(GDStringName)
}

func("material_set_next_pass") {
returns(GDvoid)
"material"(GDRID)
"next_material"(GDRID)
}

func("material_set_param") {
returns(GDvoid)
"material"(GDRID)
"parameter"(GDStringName)
"value"(GDVariant)
}

func("material_set_render_priority") {
returns(GDvoid)
"material"(GDRID)
"priority"(GDint)
}

func("material_set_shader") {
returns(GDvoid)
"shader_material"(GDRID)
"shader"(GDRID)
}

func("mesh_add_surface") {
returns(GDvoid)
"mesh"(GDRID)
"surface"(GDDictionary)
}

func("mesh_add_surface_from_arrays") {
returns(GDvoid)
"mesh"(GDRID)
"primitive"(GDPrimitiveType)
"arrays"(GDArray)
"blend_shapes"(GDArray)
"lods"(GDDictionary)
"compress_format"(GDUnknownType)
}

func("mesh_clear") {
returns(GDvoid)
"mesh"(GDRID)
}

func("mesh_create") {
returns(GDRID)

}

func("mesh_create_from_surfaces") {
returns(GDRID)
"surfaces"(GDTypedArray(GDDictionary::class))
"blend_shape_count"(GDint)
}

func("mesh_get_blend_shape_count") {
returns(GDint)
"mesh"(GDRID)
}

func("mesh_get_blend_shape_mode") {
returns(GDBlendShapeMode)
"mesh"(GDRID)
}

func("mesh_get_custom_aabb") {
returns(GDAABB)
"mesh"(GDRID)
}

func("mesh_get_surface") {
returns(GDDictionary)
"mesh"(GDRID)
"surface"(GDint)
}

func("mesh_get_surface_count") {
returns(GDint)
"mesh"(GDRID)
}

func("mesh_set_blend_shape_mode") {
returns(GDvoid)
"mesh"(GDRID)
"mode"(GDBlendShapeMode)
}

func("mesh_set_custom_aabb") {
returns(GDvoid)
"mesh"(GDRID)
"aabb"(GDAABB)
}

func("mesh_set_shadow_mesh") {
returns(GDvoid)
"mesh"(GDRID)
"shadow_mesh"(GDRID)
}

func("mesh_surface_get_arrays") {
returns(GDArray)
"mesh"(GDRID)
"surface"(GDint)
}

func("mesh_surface_get_blend_shape_arrays") {
returns(GDTypedArray(GDArray::class))
"mesh"(GDRID)
"surface"(GDint)
}

func("mesh_surface_get_format_attribute_stride") {
returns(GDint)
"format"(GDUnknownType)
"vertex_count"(GDint)
}

func("mesh_surface_get_format_offset") {
returns(GDint)
"format"(GDUnknownType)
"vertex_count"(GDint)
"array_index"(GDint)
}

func("mesh_surface_get_format_skin_stride") {
returns(GDint)
"format"(GDUnknownType)
"vertex_count"(GDint)
}

func("mesh_surface_get_format_vertex_stride") {
returns(GDint)
"format"(GDUnknownType)
"vertex_count"(GDint)
}

func("mesh_surface_get_material") {
returns(GDRID)
"mesh"(GDRID)
"surface"(GDint)
}

func("mesh_surface_set_material") {
returns(GDvoid)
"mesh"(GDRID)
"surface"(GDint)
"material"(GDRID)
}

func("mesh_surface_update_attribute_region") {
returns(GDvoid)
"mesh"(GDRID)
"surface"(GDint)
"offset"(GDint)
"data"(GDPackedByteArray)
}

func("mesh_surface_update_skin_region") {
returns(GDvoid)
"mesh"(GDRID)
"surface"(GDint)
"offset"(GDint)
"data"(GDPackedByteArray)
}

func("mesh_surface_update_vertex_region") {
returns(GDvoid)
"mesh"(GDRID)
"surface"(GDint)
"offset"(GDint)
"data"(GDPackedByteArray)
}

func("multimesh_allocate_data") {
returns(GDvoid)
"multimesh"(GDRID)
"instances"(GDint)
"transform_format"(GDMultimeshTransformFormat)
"color_format"(GDbool)
"custom_data_format"(GDbool)
}

func("multimesh_create") {
returns(GDRID)

}

func("multimesh_get_aabb") {
returns(GDAABB)
"multimesh"(GDRID)
}

func("multimesh_get_buffer") {
returns(GDPackedFloat32Array)
"multimesh"(GDRID)
}

func("multimesh_get_instance_count") {
returns(GDint)
"multimesh"(GDRID)
}

func("multimesh_get_mesh") {
returns(GDRID)
"multimesh"(GDRID)
}

func("multimesh_get_visible_instances") {
returns(GDint)
"multimesh"(GDRID)
}

func("multimesh_instance_get_color") {
returns(GDColor)
"multimesh"(GDRID)
"index"(GDint)
}

func("multimesh_instance_get_custom_data") {
returns(GDColor)
"multimesh"(GDRID)
"index"(GDint)
}

func("multimesh_instance_get_transform") {
returns(GDTransform3D)
"multimesh"(GDRID)
"index"(GDint)
}

func("multimesh_instance_get_transform_2d") {
returns(GDTransform2D)
"multimesh"(GDRID)
"index"(GDint)
}

func("multimesh_instance_set_color") {
returns(GDvoid)
"multimesh"(GDRID)
"index"(GDint)
"color"(GDColor)
}

func("multimesh_instance_set_custom_data") {
returns(GDvoid)
"multimesh"(GDRID)
"index"(GDint)
"custom_data"(GDColor)
}

func("multimesh_instance_set_transform") {
returns(GDvoid)
"multimesh"(GDRID)
"index"(GDint)
"transform"(GDTransform3D)
}

func("multimesh_instance_set_transform_2d") {
returns(GDvoid)
"multimesh"(GDRID)
"index"(GDint)
"transform"(GDTransform2D)
}

func("multimesh_set_buffer") {
returns(GDvoid)
"multimesh"(GDRID)
"buffer"(GDPackedFloat32Array)
}

func("multimesh_set_mesh") {
returns(GDvoid)
"multimesh"(GDRID)
"mesh"(GDRID)
}

func("multimesh_set_visible_instances") {
returns(GDvoid)
"multimesh"(GDRID)
"visible"(GDint)
}

func("occluder_create") {
returns(GDRID)

}

func("occluder_set_mesh") {
returns(GDvoid)
"occluder"(GDRID)
"vertices"(GDPackedVector3Array)
"indices"(GDPackedInt32Array)
}

func("omni_light_create") {
returns(GDRID)

}

func("particles_collision_create") {
returns(GDRID)

}

func("particles_collision_height_field_update") {
returns(GDvoid)
"particles_collision"(GDRID)
}

func("particles_collision_set_attractor_attenuation") {
returns(GDvoid)
"particles_collision"(GDRID)
"curve"(GDfloat)
}

func("particles_collision_set_attractor_directionality") {
returns(GDvoid)
"particles_collision"(GDRID)
"amount"(GDfloat)
}

func("particles_collision_set_attractor_strength") {
returns(GDvoid)
"particles_collision"(GDRID)
"strength"(GDfloat)
}

func("particles_collision_set_box_extents") {
returns(GDvoid)
"particles_collision"(GDRID)
"extents"(GDVector3)
}

func("particles_collision_set_collision_type") {
returns(GDvoid)
"particles_collision"(GDRID)
"type"(GDParticlesCollisionType)
}

func("particles_collision_set_cull_mask") {
returns(GDvoid)
"particles_collision"(GDRID)
"mask"(GDint)
}

func("particles_collision_set_field_texture") {
returns(GDvoid)
"particles_collision"(GDRID)
"texture"(GDRID)
}

func("particles_collision_set_height_field_resolution") {
returns(GDvoid)
"particles_collision"(GDRID)
"resolution"(GDParticlesCollisionHeightfieldResolution)
}

func("particles_collision_set_sphere_radius") {
returns(GDvoid)
"particles_collision"(GDRID)
"radius"(GDfloat)
}

func("particles_create") {
returns(GDRID)

}

func("particles_emit") {
returns(GDvoid)
"particles"(GDRID)
"transform"(GDTransform3D)
"velocity"(GDVector3)
"color"(GDColor)
"custom"(GDColor)
"emit_flags"(GDint)
}

func("particles_get_current_aabb") {
returns(GDAABB)
"particles"(GDRID)
}

func("particles_get_emitting") {
returns(GDbool)
"particles"(GDRID)
}

func("particles_is_inactive") {
returns(GDbool)
"particles"(GDRID)
}

func("particles_request_process") {
returns(GDvoid)
"particles"(GDRID)
}

func("particles_restart") {
returns(GDvoid)
"particles"(GDRID)
}

func("particles_set_amount") {
returns(GDvoid)
"particles"(GDRID)
"amount"(GDint)
}

func("particles_set_collision_base_size") {
returns(GDvoid)
"particles"(GDRID)
"size"(GDfloat)
}

func("particles_set_custom_aabb") {
returns(GDvoid)
"particles"(GDRID)
"aabb"(GDAABB)
}

func("particles_set_draw_order") {
returns(GDvoid)
"particles"(GDRID)
"order"(GDParticlesDrawOrder)
}

func("particles_set_draw_pass_mesh") {
returns(GDvoid)
"particles"(GDRID)
"pass"(GDint)
"mesh"(GDRID)
}

func("particles_set_draw_passes") {
returns(GDvoid)
"particles"(GDRID)
"count"(GDint)
}

func("particles_set_emission_transform") {
returns(GDvoid)
"particles"(GDRID)
"transform"(GDTransform3D)
}

func("particles_set_emitting") {
returns(GDvoid)
"particles"(GDRID)
"emitting"(GDbool)
}

func("particles_set_explosiveness_ratio") {
returns(GDvoid)
"particles"(GDRID)
"ratio"(GDfloat)
}

func("particles_set_fixed_fps") {
returns(GDvoid)
"particles"(GDRID)
"fps"(GDint)
}

func("particles_set_fractional_delta") {
returns(GDvoid)
"particles"(GDRID)
"enable"(GDbool)
}

func("particles_set_interpolate") {
returns(GDvoid)
"particles"(GDRID)
"enable"(GDbool)
}

func("particles_set_lifetime") {
returns(GDvoid)
"particles"(GDRID)
"lifetime"(GDfloat)
}

func("particles_set_mode") {
returns(GDvoid)
"particles"(GDRID)
"mode"(GDParticlesMode)
}

func("particles_set_one_shot") {
returns(GDvoid)
"particles"(GDRID)
"one_shot"(GDbool)
}

func("particles_set_pre_process_time") {
returns(GDvoid)
"particles"(GDRID)
"time"(GDfloat)
}

func("particles_set_process_material") {
returns(GDvoid)
"particles"(GDRID)
"material"(GDRID)
}

func("particles_set_randomness_ratio") {
returns(GDvoid)
"particles"(GDRID)
"ratio"(GDfloat)
}

func("particles_set_speed_scale") {
returns(GDvoid)
"particles"(GDRID)
"scale"(GDfloat)
}

func("particles_set_subemitter") {
returns(GDvoid)
"particles"(GDRID)
"subemitter_particles"(GDRID)
}

func("particles_set_trail_bind_poses") {
returns(GDvoid)
"particles"(GDRID)
"bind_poses"(GDTypedArray(GDTransform3D::class))
}

func("particles_set_trails") {
returns(GDvoid)
"particles"(GDRID)
"enable"(GDbool)
"length_sec"(GDfloat)
}

func("particles_set_transform_align") {
returns(GDvoid)
"particles"(GDRID)
"align"(GDParticlesTransformAlign)
}

func("particles_set_use_local_coordinates") {
returns(GDvoid)
"particles"(GDRID)
"enable"(GDbool)
}

func("positional_soft_shadow_filter_set_quality") {
returns(GDvoid)
"quality"(GDShadowQuality)
}

func("reflection_probe_create") {
returns(GDRID)

}

func("reflection_probe_set_ambient_color") {
returns(GDvoid)
"probe"(GDRID)
"color"(GDColor)
}

func("reflection_probe_set_ambient_energy") {
returns(GDvoid)
"probe"(GDRID)
"energy"(GDfloat)
}

func("reflection_probe_set_ambient_mode") {
returns(GDvoid)
"probe"(GDRID)
"mode"(GDReflectionProbeAmbientMode)
}

func("reflection_probe_set_as_interior") {
returns(GDvoid)
"probe"(GDRID)
"enable"(GDbool)
}

func("reflection_probe_set_cull_mask") {
returns(GDvoid)
"probe"(GDRID)
"layers"(GDint)
}

func("reflection_probe_set_enable_box_projection") {
returns(GDvoid)
"probe"(GDRID)
"enable"(GDbool)
}

func("reflection_probe_set_enable_shadows") {
returns(GDvoid)
"probe"(GDRID)
"enable"(GDbool)
}

func("reflection_probe_set_intensity") {
returns(GDvoid)
"probe"(GDRID)
"intensity"(GDfloat)
}

func("reflection_probe_set_max_distance") {
returns(GDvoid)
"probe"(GDRID)
"distance"(GDfloat)
}

func("reflection_probe_set_mesh_lod_threshold") {
returns(GDvoid)
"probe"(GDRID)
"pixels"(GDfloat)
}

func("reflection_probe_set_origin_offset") {
returns(GDvoid)
"probe"(GDRID)
"offset"(GDVector3)
}

func("reflection_probe_set_resolution") {
returns(GDvoid)
"probe"(GDRID)
"resolution"(GDint)
}

func("reflection_probe_set_size") {
returns(GDvoid)
"probe"(GDRID)
"size"(GDVector3)
}

func("reflection_probe_set_update_mode") {
returns(GDvoid)
"probe"(GDRID)
"mode"(GDReflectionProbeUpdateMode)
}

func("request_frame_drawn_callback") {
returns(GDvoid)
"callable"(GDCallable)
}

func("scenario_create") {
returns(GDRID)

}

func("scenario_set_camera_attributes") {
returns(GDvoid)
"scenario"(GDRID)
"effects"(GDRID)
}

func("scenario_set_environment") {
returns(GDvoid)
"scenario"(GDRID)
"environment"(GDRID)
}

func("scenario_set_fallback_environment") {
returns(GDvoid)
"scenario"(GDRID)
"environment"(GDRID)
}

func("screen_space_roughness_limiter_set_active") {
returns(GDvoid)
"enable"(GDbool)
"amount"(GDfloat)
"limit"(GDfloat)
}

func("set_boot_image") {
returns(GDvoid)
"image"(GDImage)
"color"(GDColor)
"scale"(GDbool)
"use_filter"(GDbool)
}

func("set_debug_generate_wireframes") {
returns(GDvoid)
"generate"(GDbool)
}

func("set_default_clear_color") {
returns(GDvoid)
"color"(GDColor)
}

func("shader_create") {
returns(GDRID)

}

func("shader_get_code") {
returns(GDString)
"shader"(GDRID)
}

func("shader_get_default_texture_parameter") {
returns(GDRID)
"shader"(GDRID)
"name"(GDStringName)
"index"(GDint)
}

func("shader_get_parameter_default") {
returns(GDVariant)
"shader"(GDRID)
"name"(GDStringName)
}

func("shader_set_code") {
returns(GDvoid)
"shader"(GDRID)
"code"(GDString)
}

func("shader_set_default_texture_parameter") {
returns(GDvoid)
"shader"(GDRID)
"name"(GDStringName)
"texture"(GDRID)
"index"(GDint)
}

func("shader_set_path_hint") {
returns(GDvoid)
"shader"(GDRID)
"path"(GDString)
}

func("skeleton_allocate_data") {
returns(GDvoid)
"skeleton"(GDRID)
"bones"(GDint)
"is_2d_skeleton"(GDbool)
}

func("skeleton_bone_get_transform") {
returns(GDTransform3D)
"skeleton"(GDRID)
"bone"(GDint)
}

func("skeleton_bone_get_transform_2d") {
returns(GDTransform2D)
"skeleton"(GDRID)
"bone"(GDint)
}

func("skeleton_bone_set_transform") {
returns(GDvoid)
"skeleton"(GDRID)
"bone"(GDint)
"transform"(GDTransform3D)
}

func("skeleton_bone_set_transform_2d") {
returns(GDvoid)
"skeleton"(GDRID)
"bone"(GDint)
"transform"(GDTransform2D)
}

func("skeleton_create") {
returns(GDRID)

}

func("skeleton_get_bone_count") {
returns(GDint)
"skeleton"(GDRID)
}

func("skeleton_set_base_transform_2d") {
returns(GDvoid)
"skeleton"(GDRID)
"base_transform"(GDTransform2D)
}

func("sky_bake_panorama") {
returns(GDImage)
"sky"(GDRID)
"energy"(GDfloat)
"bake_irradiance"(GDbool)
"size"(GDVector2i)
}

func("sky_create") {
returns(GDRID)

}

func("sky_set_material") {
returns(GDvoid)
"sky"(GDRID)
"material"(GDRID)
}

func("sky_set_mode") {
returns(GDvoid)
"sky"(GDRID)
"mode"(GDSkyMode)
}

func("sky_set_radiance_size") {
returns(GDvoid)
"sky"(GDRID)
"radiance_size"(GDint)
}

func("spot_light_create") {
returns(GDRID)

}

func("sub_surface_scattering_set_quality") {
returns(GDvoid)
"quality"(GDSubSurfaceScatteringQuality)
}

func("sub_surface_scattering_set_scale") {
returns(GDvoid)
"scale"(GDfloat)
"depth_scale"(GDfloat)
}

func("texture_2d_create") {
returns(GDRID)
"image"(GDImage)
}

func("texture_2d_get") {
returns(GDImage)
"texture"(GDRID)
}

func("texture_2d_layer_get") {
returns(GDImage)
"texture"(GDRID)
"layer"(GDint)
}

func("texture_2d_layered_create") {
returns(GDRID)
"layers"(GDTypedArray(GDImage::class))
"layered_type"(GDTextureLayeredType)
}

func("texture_2d_layered_placeholder_create") {
returns(GDRID)
"layered_type"(GDTextureLayeredType)
}

func("texture_2d_placeholder_create") {
returns(GDRID)

}

func("texture_2d_update") {
returns(GDvoid)
"texture"(GDRID)
"image"(GDImage)
"layer"(GDint)
}

func("texture_3d_create") {
returns(GDRID)
"format"(GDFormat)
"width"(GDint)
"height"(GDint)
"depth"(GDint)
"mipmaps"(GDbool)
"data"(GDTypedArray(GDImage::class))
}

func("texture_3d_get") {
returns(GDTypedArray(GDImage::class))
"texture"(GDRID)
}

func("texture_3d_placeholder_create") {
returns(GDRID)

}

func("texture_3d_update") {
returns(GDvoid)
"texture"(GDRID)
"data"(GDTypedArray(GDImage::class))
}

func("texture_get_native_handle") {
returns(GDint)
"texture"(GDRID)
"srgb"(GDbool)
}

func("texture_get_path") {
returns(GDString)
"texture"(GDRID)
}

func("texture_get_rd_texture") {
returns(GDRID)
"texture"(GDRID)
"srgb"(GDbool)
}

func("texture_proxy_create") {
returns(GDRID)
"base"(GDRID)
}

func("texture_proxy_update") {
returns(GDvoid)
"texture"(GDRID)
"proxy_to"(GDRID)
}

func("texture_replace") {
returns(GDvoid)
"texture"(GDRID)
"by_texture"(GDRID)
}

func("texture_set_force_redraw_if_visible") {
returns(GDvoid)
"texture"(GDRID)
"enable"(GDbool)
}

func("texture_set_path") {
returns(GDvoid)
"texture"(GDRID)
"path"(GDString)
}

func("texture_set_size_override") {
returns(GDvoid)
"texture"(GDRID)
"width"(GDint)
"height"(GDint)
}

func("viewport_attach_camera") {
returns(GDvoid)
"viewport"(GDRID)
"camera"(GDRID)
}

func("viewport_attach_canvas") {
returns(GDvoid)
"viewport"(GDRID)
"canvas"(GDRID)
}

func("viewport_attach_to_screen") {
returns(GDvoid)
"viewport"(GDRID)
"rect"(GDRect2)
"screen"(GDint)
}

func("viewport_create") {
returns(GDRID)

}

func("viewport_get_measured_render_time_cpu") {
returns(GDfloat)
"viewport"(GDRID)
}

func("viewport_get_measured_render_time_gpu") {
returns(GDfloat)
"viewport"(GDRID)
}

func("viewport_get_render_info") {
returns(GDint)
"viewport"(GDRID)
"type"(GDViewportRenderInfoType)
"info"(GDViewportRenderInfo)
}

func("viewport_get_render_target") {
returns(GDRID)
"viewport"(GDRID)
}

func("viewport_get_texture") {
returns(GDRID)
"viewport"(GDRID)
}

func("viewport_remove_canvas") {
returns(GDvoid)
"viewport"(GDRID)
"canvas"(GDRID)
}

func("viewport_set_active") {
returns(GDvoid)
"viewport"(GDRID)
"active"(GDbool)
}

func("viewport_set_canvas_cull_mask") {
returns(GDvoid)
"viewport"(GDRID)
"canvas_cull_mask"(GDint)
}

func("viewport_set_canvas_stacking") {
returns(GDvoid)
"viewport"(GDRID)
"canvas"(GDRID)
"layer"(GDint)
"sublayer"(GDint)
}

func("viewport_set_canvas_transform") {
returns(GDvoid)
"viewport"(GDRID)
"canvas"(GDRID)
"offset"(GDTransform2D)
}

func("viewport_set_clear_mode") {
returns(GDvoid)
"viewport"(GDRID)
"clear_mode"(GDViewportClearMode)
}

func("viewport_set_debug_draw") {
returns(GDvoid)
"viewport"(GDRID)
"draw"(GDViewportDebugDraw)
}

func("viewport_set_default_canvas_item_texture_filter") {
returns(GDvoid)
"viewport"(GDRID)
"filter"(GDCanvasItemTextureFilter)
}

func("viewport_set_default_canvas_item_texture_repeat") {
returns(GDvoid)
"viewport"(GDRID)
"repeat"(GDCanvasItemTextureRepeat)
}

func("viewport_set_disable_2d") {
returns(GDvoid)
"viewport"(GDRID)
"disable"(GDbool)
}

func("viewport_set_disable_3d") {
returns(GDvoid)
"viewport"(GDRID)
"disable"(GDbool)
}

func("viewport_set_environment_mode") {
returns(GDvoid)
"viewport"(GDRID)
"mode"(GDViewportEnvironmentMode)
}

func("viewport_set_fsr_sharpness") {
returns(GDvoid)
"viewport"(GDRID)
"sharpness"(GDfloat)
}

func("viewport_set_global_canvas_transform") {
returns(GDvoid)
"viewport"(GDRID)
"transform"(GDTransform2D)
}

func("viewport_set_measure_render_time") {
returns(GDvoid)
"viewport"(GDRID)
"enable"(GDbool)
}

func("viewport_set_msaa_2d") {
returns(GDvoid)
"viewport"(GDRID)
"msaa"(GDViewportMSAA)
}

func("viewport_set_msaa_3d") {
returns(GDvoid)
"viewport"(GDRID)
"msaa"(GDViewportMSAA)
}

func("viewport_set_occlusion_culling_build_quality") {
returns(GDvoid)
"quality"(GDViewportOcclusionCullingBuildQuality)
}

func("viewport_set_occlusion_rays_per_thread") {
returns(GDvoid)
"rays_per_thread"(GDint)
}

func("viewport_set_parent_viewport") {
returns(GDvoid)
"viewport"(GDRID)
"parent_viewport"(GDRID)
}

func("viewport_set_positional_shadow_atlas_quadrant_subdivision") {
returns(GDvoid)
"viewport"(GDRID)
"quadrant"(GDint)
"subdivision"(GDint)
}

func("viewport_set_positional_shadow_atlas_size") {
returns(GDvoid)
"viewport"(GDRID)
"size"(GDint)
"use_16_bits"(GDbool)
}

func("viewport_set_render_direct_to_screen") {
returns(GDvoid)
"viewport"(GDRID)
"enabled"(GDbool)
}

func("viewport_set_scaling_3d_mode") {
returns(GDvoid)
"viewport"(GDRID)
"scaling_3d_mode"(GDViewportScaling3DMode)
}

func("viewport_set_scaling_3d_scale") {
returns(GDvoid)
"viewport"(GDRID)
"scale"(GDfloat)
}

func("viewport_set_scenario") {
returns(GDvoid)
"viewport"(GDRID)
"scenario"(GDRID)
}

func("viewport_set_screen_space_aa") {
returns(GDvoid)
"viewport"(GDRID)
"mode"(GDViewportScreenSpaceAA)
}

func("viewport_set_sdf_oversize_and_scale") {
returns(GDvoid)
"viewport"(GDRID)
"oversize"(GDViewportSDFOversize)
"scale"(GDViewportSDFScale)
}

func("viewport_set_size") {
returns(GDvoid)
"viewport"(GDRID)
"width"(GDint)
"height"(GDint)
}

func("viewport_set_snap_2d_transforms_to_pixel") {
returns(GDvoid)
"viewport"(GDRID)
"enabled"(GDbool)
}

func("viewport_set_snap_2d_vertices_to_pixel") {
returns(GDvoid)
"viewport"(GDRID)
"enabled"(GDbool)
}

func("viewport_set_texture_mipmap_bias") {
returns(GDvoid)
"viewport"(GDRID)
"mipmap_bias"(GDfloat)
}

func("viewport_set_transparent_background") {
returns(GDvoid)
"viewport"(GDRID)
"enabled"(GDbool)
}

func("viewport_set_update_mode") {
returns(GDvoid)
"viewport"(GDRID)
"update_mode"(GDViewportUpdateMode)
}

func("viewport_set_use_debanding") {
returns(GDvoid)
"viewport"(GDRID)
"enable"(GDbool)
}

func("viewport_set_use_occlusion_culling") {
returns(GDvoid)
"viewport"(GDRID)
"enable"(GDbool)
}

func("viewport_set_use_taa") {
returns(GDvoid)
"viewport"(GDRID)
"enable"(GDbool)
}

func("viewport_set_use_xr") {
returns(GDvoid)
"viewport"(GDRID)
"use_xr"(GDbool)
}

func("viewport_set_vrs_mode") {
returns(GDvoid)
"viewport"(GDRID)
"mode"(GDViewportVRSMode)
}

func("viewport_set_vrs_texture") {
returns(GDvoid)
"viewport"(GDRID)
"texture"(GDRID)
}

func("visibility_notifier_create") {
returns(GDRID)

}

func("visibility_notifier_set_aabb") {
returns(GDvoid)
"notifier"(GDRID)
"aabb"(GDAABB)
}

func("visibility_notifier_set_callbacks") {
returns(GDvoid)
"notifier"(GDRID)
"enter_callable"(GDCallable)
"exit_callable"(GDCallable)
}

func("voxel_gi_allocate_data") {
returns(GDvoid)
"voxel_gi"(GDRID)
"to_cell_xform"(GDTransform3D)
"aabb"(GDAABB)
"octree_size"(GDVector3i)
"octree_cells"(GDPackedByteArray)
"data_cells"(GDPackedByteArray)
"distance_field"(GDPackedByteArray)
"level_counts"(GDPackedInt32Array)
}

func("voxel_gi_create") {
returns(GDRID)

}

func("voxel_gi_get_data_cells") {
returns(GDPackedByteArray)
"voxel_gi"(GDRID)
}

func("voxel_gi_get_distance_field") {
returns(GDPackedByteArray)
"voxel_gi"(GDRID)
}

func("voxel_gi_get_level_counts") {
returns(GDPackedInt32Array)
"voxel_gi"(GDRID)
}

func("voxel_gi_get_octree_cells") {
returns(GDPackedByteArray)
"voxel_gi"(GDRID)
}

func("voxel_gi_get_octree_size") {
returns(GDVector3i)
"voxel_gi"(GDRID)
}

func("voxel_gi_get_to_cell_xform") {
returns(GDTransform3D)
"voxel_gi"(GDRID)
}

func("voxel_gi_set_baked_exposure_normalization") {
returns(GDvoid)
"voxel_gi"(GDRID)
"baked_exposure"(GDfloat)
}

func("voxel_gi_set_bias") {
returns(GDvoid)
"voxel_gi"(GDRID)
"bias"(GDfloat)
}

func("voxel_gi_set_dynamic_range") {
returns(GDvoid)
"voxel_gi"(GDRID)
"range"(GDfloat)
}

func("voxel_gi_set_energy") {
returns(GDvoid)
"voxel_gi"(GDRID)
"energy"(GDfloat)
}

func("voxel_gi_set_interior") {
returns(GDvoid)
"voxel_gi"(GDRID)
"enable"(GDbool)
}

func("voxel_gi_set_normal_bias") {
returns(GDvoid)
"voxel_gi"(GDRID)
"bias"(GDfloat)
}

func("voxel_gi_set_propagation") {
returns(GDvoid)
"voxel_gi"(GDRID)
"amount"(GDfloat)
}

func("voxel_gi_set_quality") {
returns(GDvoid)
"quality"(GDVoxelGIQuality)
}

func("voxel_gi_set_use_two_bounces") {
returns(GDvoid)
"voxel_gi"(GDRID)
"enable"(GDbool)
}
}){

}