
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTextServerExtension: GDType("TextServerExtension", {


constructor { }

func("_cleanup") {
returns(GDvoid)

}

func("_create_font") {
returns(GDRID)

}

func("_create_shaped_text") {
returns(GDRID)
"direction"(GDDirection)
"orientation"(GDOrientation)
}

func("_draw_hex_code_box") {
returns(GDvoid)
"canvas"(GDRID)
"size"(GDint)
"pos"(GDVector2)
"index"(GDint)
"color"(GDColor)
}

func("_font_clear_glyphs") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
}

func("_font_clear_kerning_map") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDint)
}

func("_font_clear_size_cache") {
returns(GDvoid)
"font_rid"(GDRID)
}

func("_font_clear_textures") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
}

func("_font_draw_glyph") {
returns(GDvoid)
"font_rid"(GDRID)
"canvas"(GDRID)
"size"(GDint)
"pos"(GDVector2)
"index"(GDint)
"color"(GDColor)
}

func("_font_draw_glyph_outline") {
returns(GDvoid)
"font_rid"(GDRID)
"canvas"(GDRID)
"size"(GDint)
"outline_size"(GDint)
"pos"(GDVector2)
"index"(GDint)
"color"(GDColor)
}

func("_font_get_antialiasing") {
returns(GDFontAntialiasing)
"font_rid"(GDRID)
}

func("_font_get_ascent") {
returns(GDfloat)
"font_rid"(GDRID)
"size"(GDint)
}

func("_font_get_char_from_glyph_index") {
returns(GDint)
"font_rid"(GDRID)
"size"(GDint)
"glyph_index"(GDint)
}

func("_font_get_descent") {
returns(GDfloat)
"font_rid"(GDRID)
"size"(GDint)
}

func("_font_get_embolden") {
returns(GDfloat)
"font_rid"(GDRID)
}

func("_font_get_face_count") {
returns(GDint)
"font_rid"(GDRID)
}

func("_font_get_face_index") {
returns(GDint)
"font_rid"(GDRID)
}

func("_font_get_fixed_size") {
returns(GDint)
"font_rid"(GDRID)
}

func("_font_get_generate_mipmaps") {
returns(GDbool)
"font_rid"(GDRID)
}

func("_font_get_global_oversampling") {
returns(GDfloat)

}

func("_font_get_glyph_advance") {
returns(GDVector2)
"font_rid"(GDRID)
"size"(GDint)
"glyph"(GDint)
}

func("_font_get_glyph_contours") {
returns(GDDictionary)
"font_rid"(GDRID)
"size"(GDint)
"index"(GDint)
}

func("_font_get_glyph_index") {
returns(GDint)
"font_rid"(GDRID)
"size"(GDint)
"char"(GDint)
"variation_selector"(GDint)
}

func("_font_get_glyph_list") {
returns(GDPackedInt32Array)
"font_rid"(GDRID)
"size"(GDVector2i)
}

func("_font_get_glyph_offset") {
returns(GDVector2)
"font_rid"(GDRID)
"size"(GDVector2i)
"glyph"(GDint)
}

func("_font_get_glyph_size") {
returns(GDVector2)
"font_rid"(GDRID)
"size"(GDVector2i)
"glyph"(GDint)
}

func("_font_get_glyph_texture_idx") {
returns(GDint)
"font_rid"(GDRID)
"size"(GDVector2i)
"glyph"(GDint)
}

func("_font_get_glyph_texture_rid") {
returns(GDRID)
"font_rid"(GDRID)
"size"(GDVector2i)
"glyph"(GDint)
}

func("_font_get_glyph_texture_size") {
returns(GDVector2)
"font_rid"(GDRID)
"size"(GDVector2i)
"glyph"(GDint)
}

func("_font_get_glyph_uv_rect") {
returns(GDRect2)
"font_rid"(GDRID)
"size"(GDVector2i)
"glyph"(GDint)
}

func("_font_get_hinting") {
returns(GDHinting)
"font_rid"(GDRID)
}

func("_font_get_kerning") {
returns(GDVector2)
"font_rid"(GDRID)
"size"(GDint)
"glyph_pair"(GDVector2i)
}

func("_font_get_kerning_list") {
returns(GDTypedArray(GDVector2i::class))
"font_rid"(GDRID)
"size"(GDint)
}

func("_font_get_language_support_override") {
returns(GDbool)
"font_rid"(GDRID)
"language"(GDString)
}

func("_font_get_language_support_overrides") {
returns(GDPackedStringArray)
"font_rid"(GDRID)
}

func("_font_get_msdf_pixel_range") {
returns(GDint)
"font_rid"(GDRID)
}

func("_font_get_msdf_size") {
returns(GDint)
"font_rid"(GDRID)
}

func("_font_get_name") {
returns(GDString)
"font_rid"(GDRID)
}

func("_font_get_opentype_feature_overrides") {
returns(GDDictionary)
"font_rid"(GDRID)
}

func("_font_get_ot_name_strings") {
returns(GDDictionary)
"font_rid"(GDRID)
}

func("_font_get_oversampling") {
returns(GDfloat)
"font_rid"(GDRID)
}

func("_font_get_scale") {
returns(GDfloat)
"font_rid"(GDRID)
"size"(GDint)
}

func("_font_get_script_support_override") {
returns(GDbool)
"font_rid"(GDRID)
"script"(GDString)
}

func("_font_get_script_support_overrides") {
returns(GDPackedStringArray)
"font_rid"(GDRID)
}

func("_font_get_size_cache_list") {
returns(GDTypedArray(GDVector2i::class))
"font_rid"(GDRID)
}

func("_font_get_stretch") {
returns(GDint)
"font_rid"(GDRID)
}

func("_font_get_style") {
returns(GDUnknownType)
"font_rid"(GDRID)
}

func("_font_get_style_name") {
returns(GDString)
"font_rid"(GDRID)
}

func("_font_get_subpixel_positioning") {
returns(GDSubpixelPositioning)
"font_rid"(GDRID)
}

func("_font_get_supported_chars") {
returns(GDString)
"font_rid"(GDRID)
}

func("_font_get_texture_count") {
returns(GDint)
"font_rid"(GDRID)
"size"(GDVector2i)
}

func("_font_get_texture_image") {
returns(GDImage)
"font_rid"(GDRID)
"size"(GDVector2i)
"texture_index"(GDint)
}

func("_font_get_texture_offsets") {
returns(GDPackedInt32Array)
"font_rid"(GDRID)
"size"(GDVector2i)
"texture_index"(GDint)
}

func("_font_get_transform") {
returns(GDTransform2D)
"font_rid"(GDRID)
}

func("_font_get_underline_position") {
returns(GDfloat)
"font_rid"(GDRID)
"size"(GDint)
}

func("_font_get_underline_thickness") {
returns(GDfloat)
"font_rid"(GDRID)
"size"(GDint)
}

func("_font_get_variation_coordinates") {
returns(GDDictionary)
"font_rid"(GDRID)
}

func("_font_get_weight") {
returns(GDint)
"font_rid"(GDRID)
}

func("_font_has_char") {
returns(GDbool)
"font_rid"(GDRID)
"char"(GDint)
}

func("_font_is_allow_system_fallback") {
returns(GDbool)
"font_rid"(GDRID)
}

func("_font_is_force_autohinter") {
returns(GDbool)
"font_rid"(GDRID)
}

func("_font_is_language_supported") {
returns(GDbool)
"font_rid"(GDRID)
"language"(GDString)
}

func("_font_is_multichannel_signed_distance_field") {
returns(GDbool)
"font_rid"(GDRID)
}

func("_font_is_script_supported") {
returns(GDbool)
"font_rid"(GDRID)
"script"(GDString)
}

func("_font_remove_glyph") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
"glyph"(GDint)
}

func("_font_remove_kerning") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDint)
"glyph_pair"(GDVector2i)
}

func("_font_remove_language_support_override") {
returns(GDvoid)
"font_rid"(GDRID)
"language"(GDString)
}

func("_font_remove_script_support_override") {
returns(GDvoid)
"font_rid"(GDRID)
"script"(GDString)
}

func("_font_remove_size_cache") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
}

func("_font_remove_texture") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
"texture_index"(GDint)
}

func("_font_render_glyph") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
"index"(GDint)
}

func("_font_render_range") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
"start"(GDint)
"end"(GDint)
}

func("_font_set_allow_system_fallback") {
returns(GDvoid)
"font_rid"(GDRID)
"allow_system_fallback"(GDbool)
}

func("_font_set_antialiasing") {
returns(GDvoid)
"font_rid"(GDRID)
"antialiasing"(GDFontAntialiasing)
}

func("_font_set_ascent") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDint)
"ascent"(GDfloat)
}

func("_font_set_data") {
returns(GDvoid)
"font_rid"(GDRID)
"data"(GDPackedByteArray)
}

func("_font_set_data_ptr") {
returns(GDvoid)
"font_rid"(GDRID)
"data_size"(GDint)
}

func("_font_set_descent") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDint)
"descent"(GDfloat)
}

func("_font_set_embolden") {
returns(GDvoid)
"font_rid"(GDRID)
"strength"(GDfloat)
}

func("_font_set_face_index") {
returns(GDvoid)
"font_rid"(GDRID)
"face_index"(GDint)
}

func("_font_set_fixed_size") {
returns(GDvoid)
"font_rid"(GDRID)
"fixed_size"(GDint)
}

func("_font_set_force_autohinter") {
returns(GDvoid)
"font_rid"(GDRID)
"force_autohinter"(GDbool)
}

func("_font_set_generate_mipmaps") {
returns(GDvoid)
"font_rid"(GDRID)
"generate_mipmaps"(GDbool)
}

func("_font_set_global_oversampling") {
returns(GDvoid)
"oversampling"(GDfloat)
}

func("_font_set_glyph_advance") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDint)
"glyph"(GDint)
"advance"(GDVector2)
}

func("_font_set_glyph_offset") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
"glyph"(GDint)
"offset"(GDVector2)
}

func("_font_set_glyph_size") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
"glyph"(GDint)
"gl_size"(GDVector2)
}

func("_font_set_glyph_texture_idx") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
"glyph"(GDint)
"texture_idx"(GDint)
}

func("_font_set_glyph_uv_rect") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
"glyph"(GDint)
"uv_rect"(GDRect2)
}

func("_font_set_hinting") {
returns(GDvoid)
"font_rid"(GDRID)
"hinting"(GDHinting)
}

func("_font_set_kerning") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDint)
"glyph_pair"(GDVector2i)
"kerning"(GDVector2)
}

func("_font_set_language_support_override") {
returns(GDvoid)
"font_rid"(GDRID)
"language"(GDString)
"supported"(GDbool)
}

func("_font_set_msdf_pixel_range") {
returns(GDvoid)
"font_rid"(GDRID)
"msdf_pixel_range"(GDint)
}

func("_font_set_msdf_size") {
returns(GDvoid)
"font_rid"(GDRID)
"msdf_size"(GDint)
}

func("_font_set_multichannel_signed_distance_field") {
returns(GDvoid)
"font_rid"(GDRID)
"msdf"(GDbool)
}

func("_font_set_name") {
returns(GDvoid)
"font_rid"(GDRID)
"name"(GDString)
}

func("_font_set_opentype_feature_overrides") {
returns(GDvoid)
"font_rid"(GDRID)
"overrides"(GDDictionary)
}

func("_font_set_oversampling") {
returns(GDvoid)
"font_rid"(GDRID)
"oversampling"(GDfloat)
}

func("_font_set_scale") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDint)
"scale"(GDfloat)
}

func("_font_set_script_support_override") {
returns(GDvoid)
"font_rid"(GDRID)
"script"(GDString)
"supported"(GDbool)
}

func("_font_set_stretch") {
returns(GDvoid)
"font_rid"(GDRID)
"stretch"(GDint)
}

func("_font_set_style") {
returns(GDvoid)
"font_rid"(GDRID)
"style"(GDUnknownType)
}

func("_font_set_style_name") {
returns(GDvoid)
"font_rid"(GDRID)
"name_style"(GDString)
}

func("_font_set_subpixel_positioning") {
returns(GDvoid)
"font_rid"(GDRID)
"subpixel_positioning"(GDSubpixelPositioning)
}

func("_font_set_texture_image") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
"texture_index"(GDint)
"image"(GDImage)
}

func("_font_set_texture_offsets") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDVector2i)
"texture_index"(GDint)
"offset"(GDPackedInt32Array)
}

func("_font_set_transform") {
returns(GDvoid)
"font_rid"(GDRID)
"transform"(GDTransform2D)
}

func("_font_set_underline_position") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDint)
"underline_position"(GDfloat)
}

func("_font_set_underline_thickness") {
returns(GDvoid)
"font_rid"(GDRID)
"size"(GDint)
"underline_thickness"(GDfloat)
}

func("_font_set_variation_coordinates") {
returns(GDvoid)
"font_rid"(GDRID)
"variation_coordinates"(GDDictionary)
}

func("_font_set_weight") {
returns(GDvoid)
"font_rid"(GDRID)
"weight"(GDint)
}

func("_font_supported_feature_list") {
returns(GDDictionary)
"font_rid"(GDRID)
}

func("_font_supported_variation_list") {
returns(GDDictionary)
"font_rid"(GDRID)
}

func("_format_number") {
returns(GDString)
"string"(GDString)
"language"(GDString)
}

func("_free_rid") {
returns(GDvoid)
"rid"(GDRID)
}

func("_get_features") {
returns(GDint)

}

func("_get_hex_code_box_size") {
returns(GDVector2)
"size"(GDint)
"index"(GDint)
}

func("_get_name") {
returns(GDString)

}

func("_get_support_data_filename") {
returns(GDString)

}

func("_get_support_data_info") {
returns(GDString)

}

func("_has") {
returns(GDbool)
"rid"(GDRID)
}

func("_has_feature") {
returns(GDbool)
"feature"(GDFeature)
}

func("_is_confusable") {
returns(GDint)
"string"(GDString)
"dict"(GDPackedStringArray)
}

func("_is_locale_right_to_left") {
returns(GDbool)
"locale"(GDString)
}

func("_is_valid_identifier") {
returns(GDbool)
"string"(GDString)
}

func("_load_support_data") {
returns(GDbool)
"filename"(GDString)
}

func("_name_to_tag") {
returns(GDint)
"name"(GDString)
}

func("_parse_number") {
returns(GDString)
"string"(GDString)
"language"(GDString)
}

func("_parse_structured_text") {
returns(GDTypedArray(GDVector3i::class))
"parser_type"(GDStructuredTextParser)
"args"(GDArray)
"text"(GDString)
}

func("_percent_sign") {
returns(GDString)
"language"(GDString)
}

func("_save_support_data") {
returns(GDbool)
"filename"(GDString)
}

func("_shaped_get_span_count") {
returns(GDint)
"shaped"(GDRID)
}

func("_shaped_get_span_meta") {
returns(GDVariant)
"shaped"(GDRID)
"index"(GDint)
}

func("_shaped_set_span_update_font") {
returns(GDvoid)
"shaped"(GDRID)
"index"(GDint)
"fonts"(GDTypedArray(GDRID::class))
"size"(GDint)
"opentype_features"(GDDictionary)
}

func("_shaped_text_add_object") {
returns(GDbool)
"shaped"(GDRID)
"key"(GDVariant)
"size"(GDVector2)
"inline_align"(GDInlineAlignment)
"length"(GDint)
"baseline"(GDfloat)
}

func("_shaped_text_add_string") {
returns(GDbool)
"shaped"(GDRID)
"text"(GDString)
"fonts"(GDTypedArray(GDRID::class))
"size"(GDint)
"opentype_features"(GDDictionary)
"language"(GDString)
"meta"(GDVariant)
}

func("_shaped_text_clear") {
returns(GDvoid)
"shaped"(GDRID)
}

func("_shaped_text_draw") {
returns(GDvoid)
"shaped"(GDRID)
"canvas"(GDRID)
"pos"(GDVector2)
"clip_l"(GDfloat)
"clip_r"(GDfloat)
"color"(GDColor)
}

func("_shaped_text_draw_outline") {
returns(GDvoid)
"shaped"(GDRID)
"canvas"(GDRID)
"pos"(GDVector2)
"clip_l"(GDfloat)
"clip_r"(GDfloat)
"outline_size"(GDint)
"color"(GDColor)
}

func("_shaped_text_fit_to_width") {
returns(GDfloat)
"shaped"(GDRID)
"width"(GDfloat)
"justification_flags"(GDUnknownType)
}

func("_shaped_text_get_ascent") {
returns(GDfloat)
"shaped"(GDRID)
}

func("_shaped_text_get_carets") {
returns(GDvoid)
"shaped"(GDRID)
"position"(GDint)
"caret"(GDUnknownType)
}

func("_shaped_text_get_custom_punctuation") {
returns(GDString)
"shaped"(GDRID)
}

func("_shaped_text_get_descent") {
returns(GDfloat)
"shaped"(GDRID)
}

func("_shaped_text_get_direction") {
returns(GDDirection)
"shaped"(GDRID)
}

func("_shaped_text_get_dominant_direction_in_range") {
returns(GDint)
"shaped"(GDRID)
"start"(GDint)
"end"(GDint)
}

func("_shaped_text_get_ellipsis_glyph_count") {
returns(GDint)
"shaped"(GDRID)
}

func("_shaped_text_get_ellipsis_glyphs") {
returns(GDUnknownType)
"shaped"(GDRID)
}

func("_shaped_text_get_ellipsis_pos") {
returns(GDint)
"shaped"(GDRID)
}

func("_shaped_text_get_glyph_count") {
returns(GDint)
"shaped"(GDRID)
}

func("_shaped_text_get_glyphs") {
returns(GDUnknownType)
"shaped"(GDRID)
}

func("_shaped_text_get_grapheme_bounds") {
returns(GDVector2)
"shaped"(GDRID)
"pos"(GDint)
}

func("_shaped_text_get_inferred_direction") {
returns(GDDirection)
"shaped"(GDRID)
}

func("_shaped_text_get_line_breaks") {
returns(GDPackedInt32Array)
"shaped"(GDRID)
"width"(GDfloat)
"start"(GDint)
"break_flags"(GDUnknownType)
}

func("_shaped_text_get_line_breaks_adv") {
returns(GDPackedInt32Array)
"shaped"(GDRID)
"width"(GDPackedFloat32Array)
"start"(GDint)
"once"(GDbool)
"break_flags"(GDUnknownType)
}

func("_shaped_text_get_object_rect") {
returns(GDRect2)
"shaped"(GDRID)
"key"(GDVariant)
}

func("_shaped_text_get_objects") {
returns(GDArray)
"shaped"(GDRID)
}

func("_shaped_text_get_orientation") {
returns(GDOrientation)
"shaped"(GDRID)
}

func("_shaped_text_get_parent") {
returns(GDRID)
"shaped"(GDRID)
}

func("_shaped_text_get_preserve_control") {
returns(GDbool)
"shaped"(GDRID)
}

func("_shaped_text_get_preserve_invalid") {
returns(GDbool)
"shaped"(GDRID)
}

func("_shaped_text_get_range") {
returns(GDVector2i)
"shaped"(GDRID)
}

func("_shaped_text_get_selection") {
returns(GDPackedVector2Array)
"shaped"(GDRID)
"start"(GDint)
"end"(GDint)
}

func("_shaped_text_get_size") {
returns(GDVector2)
"shaped"(GDRID)
}

func("_shaped_text_get_spacing") {
returns(GDint)
"shaped"(GDRID)
"spacing"(GDSpacingType)
}

func("_shaped_text_get_trim_pos") {
returns(GDint)
"shaped"(GDRID)
}

func("_shaped_text_get_underline_position") {
returns(GDfloat)
"shaped"(GDRID)
}

func("_shaped_text_get_underline_thickness") {
returns(GDfloat)
"shaped"(GDRID)
}

func("_shaped_text_get_width") {
returns(GDfloat)
"shaped"(GDRID)
}

func("_shaped_text_get_word_breaks") {
returns(GDPackedInt32Array)
"shaped"(GDRID)
"grapheme_flags"(GDUnknownType)
}

func("_shaped_text_hit_test_grapheme") {
returns(GDint)
"shaped"(GDRID)
"coord"(GDfloat)
}

func("_shaped_text_hit_test_position") {
returns(GDint)
"shaped"(GDRID)
"coord"(GDfloat)
}

func("_shaped_text_is_ready") {
returns(GDbool)
"shaped"(GDRID)
}

func("_shaped_text_next_grapheme_pos") {
returns(GDint)
"shaped"(GDRID)
"pos"(GDint)
}

func("_shaped_text_overrun_trim_to_width") {
returns(GDvoid)
"shaped"(GDRID)
"width"(GDfloat)
"trim_flags"(GDUnknownType)
}

func("_shaped_text_prev_grapheme_pos") {
returns(GDint)
"shaped"(GDRID)
"pos"(GDint)
}

func("_shaped_text_resize_object") {
returns(GDbool)
"shaped"(GDRID)
"key"(GDVariant)
"size"(GDVector2)
"inline_align"(GDInlineAlignment)
"baseline"(GDfloat)
}

func("_shaped_text_set_bidi_override") {
returns(GDvoid)
"shaped"(GDRID)
"override"(GDArray)
}

func("_shaped_text_set_custom_punctuation") {
returns(GDvoid)
"shaped"(GDRID)
"punct"(GDString)
}

func("_shaped_text_set_direction") {
returns(GDvoid)
"shaped"(GDRID)
"direction"(GDDirection)
}

func("_shaped_text_set_orientation") {
returns(GDvoid)
"shaped"(GDRID)
"orientation"(GDOrientation)
}

func("_shaped_text_set_preserve_control") {
returns(GDvoid)
"shaped"(GDRID)
"enabled"(GDbool)
}

func("_shaped_text_set_preserve_invalid") {
returns(GDvoid)
"shaped"(GDRID)
"enabled"(GDbool)
}

func("_shaped_text_set_spacing") {
returns(GDvoid)
"shaped"(GDRID)
"spacing"(GDSpacingType)
"value"(GDint)
}

func("_shaped_text_shape") {
returns(GDbool)
"shaped"(GDRID)
}

func("_shaped_text_sort_logical") {
returns(GDUnknownType)
"shaped"(GDRID)
}

func("_shaped_text_substr") {
returns(GDRID)
"shaped"(GDRID)
"start"(GDint)
"length"(GDint)
}

func("_shaped_text_tab_align") {
returns(GDfloat)
"shaped"(GDRID)
"tab_stops"(GDPackedFloat32Array)
}

func("_shaped_text_update_breaks") {
returns(GDbool)
"shaped"(GDRID)
}

func("_shaped_text_update_justification_ops") {
returns(GDbool)
"shaped"(GDRID)
}

func("_spoof_check") {
returns(GDbool)
"string"(GDString)
}

func("_string_get_word_breaks") {
returns(GDPackedInt32Array)
"string"(GDString)
"language"(GDString)
"chars_per_line"(GDint)
}

func("_string_to_lower") {
returns(GDString)
"string"(GDString)
"language"(GDString)
}

func("_string_to_upper") {
returns(GDString)
"string"(GDString)
"language"(GDString)
}

func("_strip_diacritics") {
returns(GDString)
"string"(GDString)
}

func("_tag_to_name") {
returns(GDString)
"tag"(GDint)
}
}){

}