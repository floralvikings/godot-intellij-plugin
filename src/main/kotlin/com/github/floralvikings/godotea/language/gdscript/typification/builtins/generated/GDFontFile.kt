
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDFontFile: GDType("FontFile", {

"allow_system_fallback"(GDbool)
"antialiasing"(GDFontAntialiasing)
"data"(GDPackedByteArray)
"fallbacks"(GDTypedArray(GDFont::class))
"fixed_size"(GDint)
"font_name"(GDString)
"font_stretch"(GDint)
"font_style"(GDUnknownType)
"font_weight"(GDint)
"force_autohinter"(GDbool)
"generate_mipmaps"(GDbool)
"hinting"(GDHinting)
"msdf_pixel_range"(GDint)
"msdf_size"(GDint)
"multichannel_signed_distance_field"(GDbool)
"opentype_feature_overrides"(GDDictionary)
"oversampling"(GDfloat)
"style_name"(GDString)
"subpixel_positioning"(GDSubpixelPositioning)
constructor { }

func("clear_cache") {
returns(GDvoid)

}

func("clear_glyphs") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
}

func("clear_kerning_map") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDint)
}

func("clear_size_cache") {
returns(GDvoid)
"cache_index"(GDint)
}

func("clear_textures") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
}

func("get_cache_ascent") {
returns(GDfloat)
"cache_index"(GDint)
"size"(GDint)
}

func("get_cache_count") {
returns(GDint)

}

func("get_cache_descent") {
returns(GDfloat)
"cache_index"(GDint)
"size"(GDint)
}

func("get_cache_scale") {
returns(GDfloat)
"cache_index"(GDint)
"size"(GDint)
}

func("get_cache_underline_position") {
returns(GDfloat)
"cache_index"(GDint)
"size"(GDint)
}

func("get_cache_underline_thickness") {
returns(GDfloat)
"cache_index"(GDint)
"size"(GDint)
}

func("get_char_from_glyph_index") {
returns(GDint)
"size"(GDint)
"glyph_index"(GDint)
}

func("get_embolden") {
returns(GDfloat)
"cache_index"(GDint)
}

func("get_face_index") {
returns(GDint)
"cache_index"(GDint)
}

func("get_glyph_advance") {
returns(GDVector2)
"cache_index"(GDint)
"size"(GDint)
"glyph"(GDint)
}

func("get_glyph_index") {
returns(GDint)
"size"(GDint)
"char"(GDint)
"variation_selector"(GDint)
}

func("get_glyph_list") {
returns(GDPackedInt32Array)
"cache_index"(GDint)
"size"(GDVector2i)
}

func("get_glyph_offset") {
returns(GDVector2)
"cache_index"(GDint)
"size"(GDVector2i)
"glyph"(GDint)
}

func("get_glyph_size") {
returns(GDVector2)
"cache_index"(GDint)
"size"(GDVector2i)
"glyph"(GDint)
}

func("get_glyph_texture_idx") {
returns(GDint)
"cache_index"(GDint)
"size"(GDVector2i)
"glyph"(GDint)
}

func("get_glyph_uv_rect") {
returns(GDRect2)
"cache_index"(GDint)
"size"(GDVector2i)
"glyph"(GDint)
}

func("get_kerning") {
returns(GDVector2)
"cache_index"(GDint)
"size"(GDint)
"glyph_pair"(GDVector2i)
}

func("get_kerning_list") {
returns(GDTypedArray(GDVector2i::class))
"cache_index"(GDint)
"size"(GDint)
}

func("get_language_support_override") {
returns(GDbool)
"language"(GDString)
}

func("get_language_support_overrides") {
returns(GDPackedStringArray)

}

func("get_script_support_override") {
returns(GDbool)
"script"(GDString)
}

func("get_script_support_overrides") {
returns(GDPackedStringArray)

}

func("get_size_cache_list") {
returns(GDTypedArray(GDVector2i::class))
"cache_index"(GDint)
}

func("get_texture_count") {
returns(GDint)
"cache_index"(GDint)
"size"(GDVector2i)
}

func("get_texture_image") {
returns(GDImage)
"cache_index"(GDint)
"size"(GDVector2i)
"texture_index"(GDint)
}

func("get_texture_offsets") {
returns(GDPackedInt32Array)
"cache_index"(GDint)
"size"(GDVector2i)
"texture_index"(GDint)
}

func("get_transform") {
returns(GDTransform2D)
"cache_index"(GDint)
}

func("get_variation_coordinates") {
returns(GDDictionary)
"cache_index"(GDint)
}

func("load_bitmap_font") {
returns(GDError)
"path"(GDString)
}

func("load_dynamic_font") {
returns(GDError)
"path"(GDString)
}

func("remove_cache") {
returns(GDvoid)
"cache_index"(GDint)
}

func("remove_glyph") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
"glyph"(GDint)
}

func("remove_kerning") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDint)
"glyph_pair"(GDVector2i)
}

func("remove_language_support_override") {
returns(GDvoid)
"language"(GDString)
}

func("remove_script_support_override") {
returns(GDvoid)
"script"(GDString)
}

func("remove_size_cache") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
}

func("remove_texture") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
"texture_index"(GDint)
}

func("render_glyph") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
"index"(GDint)
}

func("render_range") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
"start"(GDint)
"end"(GDint)
}

func("set_cache_ascent") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDint)
"ascent"(GDfloat)
}

func("set_cache_descent") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDint)
"descent"(GDfloat)
}

func("set_cache_scale") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDint)
"scale"(GDfloat)
}

func("set_cache_underline_position") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDint)
"underline_position"(GDfloat)
}

func("set_cache_underline_thickness") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDint)
"underline_thickness"(GDfloat)
}

func("set_embolden") {
returns(GDvoid)
"cache_index"(GDint)
"strength"(GDfloat)
}

func("set_face_index") {
returns(GDvoid)
"cache_index"(GDint)
"face_index"(GDint)
}

func("set_glyph_advance") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDint)
"glyph"(GDint)
"advance"(GDVector2)
}

func("set_glyph_offset") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
"glyph"(GDint)
"offset"(GDVector2)
}

func("set_glyph_size") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
"glyph"(GDint)
"gl_size"(GDVector2)
}

func("set_glyph_texture_idx") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
"glyph"(GDint)
"texture_idx"(GDint)
}

func("set_glyph_uv_rect") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
"glyph"(GDint)
"uv_rect"(GDRect2)
}

func("set_kerning") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDint)
"glyph_pair"(GDVector2i)
"kerning"(GDVector2)
}

func("set_language_support_override") {
returns(GDvoid)
"language"(GDString)
"supported"(GDbool)
}

func("set_script_support_override") {
returns(GDvoid)
"script"(GDString)
"supported"(GDbool)
}

func("set_texture_image") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
"texture_index"(GDint)
"image"(GDImage)
}

func("set_texture_offsets") {
returns(GDvoid)
"cache_index"(GDint)
"size"(GDVector2i)
"texture_index"(GDint)
"offset"(GDPackedInt32Array)
}

func("set_transform") {
returns(GDvoid)
"cache_index"(GDint)
"transform"(GDTransform2D)
}

func("set_variation_coordinates") {
returns(GDvoid)
"cache_index"(GDint)
"variation_coordinates"(GDDictionary)
}
}){

}