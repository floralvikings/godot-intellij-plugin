
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDViewport: GDType("Viewport", {

"audio_listener_enable_2d"(GDbool)
"audio_listener_enable_3d"(GDbool)
"canvas_cull_mask"(GDint)
"canvas_item_default_texture_filter"(GDDefaultCanvasItemTextureFilter)
"canvas_item_default_texture_repeat"(GDDefaultCanvasItemTextureRepeat)
"canvas_transform"(GDTransform2D)
"debug_draw"(GDDebugDraw)
"disable_3d"(GDbool)
"fsr_sharpness"(GDfloat)
"global_canvas_transform"(GDTransform2D)
"gui_disable_input"(GDbool)
"gui_embed_subwindows"(GDbool)
"gui_snap_controls_to_pixels"(GDbool)
"handle_input_locally"(GDbool)
"mesh_lod_threshold"(GDfloat)
"msaa_2d"(GDMSAA)
"msaa_3d"(GDMSAA)
"own_world_3d"(GDbool)
"physics_object_picking"(GDbool)
"physics_object_picking_sort"(GDbool)
"positional_shadow_atlas_16_bits"(GDbool)
"positional_shadow_atlas_quad_0"(GDPositionalShadowAtlasQuadrantSubdiv)
"positional_shadow_atlas_quad_1"(GDPositionalShadowAtlasQuadrantSubdiv)
"positional_shadow_atlas_quad_2"(GDPositionalShadowAtlasQuadrantSubdiv)
"positional_shadow_atlas_quad_3"(GDPositionalShadowAtlasQuadrantSubdiv)
"positional_shadow_atlas_size"(GDint)
"scaling_3d_mode"(GDScaling3DMode)
"scaling_3d_scale"(GDfloat)
"screen_space_aa"(GDScreenSpaceAA)
"sdf_oversize"(GDSDFOversize)
"sdf_scale"(GDSDFScale)
"snap_2d_transforms_to_pixel"(GDbool)
"snap_2d_vertices_to_pixel"(GDbool)
"texture_mipmap_bias"(GDfloat)
"transparent_bg"(GDbool)
"use_debanding"(GDbool)
"use_occlusion_culling"(GDbool)
"use_taa"(GDbool)
"use_xr"(GDbool)
"vrs_mode"(GDVRSMode)
"vrs_texture"(GDTexture2D)
"world_2d"(GDWorld2D)
"world_3d"(GDWorld3D)
constructor { }

func("find_world_2d") {
returns(GDWorld2D)

}

func("find_world_3d") {
returns(GDWorld3D)

}

func("get_camera_2d") {
returns(GDCamera2D)

}

func("get_camera_3d") {
returns(GDCamera3D)

}

func("get_canvas_cull_mask_bit") {
returns(GDbool)
"layer"(GDint)
}

func("get_final_transform") {
returns(GDTransform2D)

}

func("get_mouse_position") {
returns(GDVector2)

}

func("get_positional_shadow_atlas_quadrant_subdiv") {
returns(GDPositionalShadowAtlasQuadrantSubdiv)
"quadrant"(GDint)
}

func("get_render_info") {
returns(GDint)
"type"(GDRenderInfoType)
"info"(GDRenderInfo)
}

func("get_screen_transform") {
returns(GDTransform2D)

}

func("get_texture") {
returns(GDViewportTexture)

}

func("get_viewport_rid") {
returns(GDRID)

}

func("get_visible_rect") {
returns(GDRect2)

}

func("gui_get_drag_data") {
returns(GDVariant)

}

func("gui_get_focus_owner") {
returns(GDControl)

}

func("gui_is_drag_successful") {
returns(GDbool)

}

func("gui_is_dragging") {
returns(GDbool)

}

func("gui_release_focus") {
returns(GDvoid)

}

func("is_input_handled") {
returns(GDbool)

}

func("push_input") {
returns(GDvoid)
"event"(GDInputEvent)
"in_local_coords"(GDbool)
}

func("push_text_input") {
returns(GDvoid)
"text"(GDString)
}

func("push_unhandled_input") {
returns(GDvoid)
"event"(GDInputEvent)
"in_local_coords"(GDbool)
}

func("set_canvas_cull_mask_bit") {
returns(GDvoid)
"layer"(GDint)
"enable"(GDbool)
}

func("set_input_as_handled") {
returns(GDvoid)

}

func("set_positional_shadow_atlas_quadrant_subdiv") {
returns(GDvoid)
"quadrant"(GDint)
"subdiv"(GDPositionalShadowAtlasQuadrantSubdiv)
}

func("update_mouse_cursor_state") {
returns(GDvoid)

}

func("warp_mouse") {
returns(GDvoid)
"position"(GDVector2)
}
}){

}