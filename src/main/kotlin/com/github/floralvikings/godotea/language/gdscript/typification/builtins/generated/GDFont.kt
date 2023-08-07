
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDFont: GDType("Font", {


constructor { }

func("draw_char") {
returns(GDfloat)
"canvas_item"(GDRID)
"pos"(GDVector2)
"char"(GDint)
"font_size"(GDint)
"modulate"(GDColor)
}

func("draw_char_outline") {
returns(GDfloat)
"canvas_item"(GDRID)
"pos"(GDVector2)
"char"(GDint)
"font_size"(GDint)
"size"(GDint)
"modulate"(GDColor)
}

func("draw_multiline_string") {
returns(GDvoid)
"canvas_item"(GDRID)
"pos"(GDVector2)
"text"(GDString)
"alignment"(GDHorizontalAlignment)
"width"(GDfloat)
"font_size"(GDint)
"max_lines"(GDint)
"modulate"(GDColor)
"brk_flags"(GDUnknownType)
"justification_flags"(GDUnknownType)
"direction"(GDDirection)
"orientation"(GDOrientation)
}

func("draw_multiline_string_outline") {
returns(GDvoid)
"canvas_item"(GDRID)
"pos"(GDVector2)
"text"(GDString)
"alignment"(GDHorizontalAlignment)
"width"(GDfloat)
"font_size"(GDint)
"max_lines"(GDint)
"size"(GDint)
"modulate"(GDColor)
"brk_flags"(GDUnknownType)
"justification_flags"(GDUnknownType)
"direction"(GDDirection)
"orientation"(GDOrientation)
}

func("draw_string") {
returns(GDvoid)
"canvas_item"(GDRID)
"pos"(GDVector2)
"text"(GDString)
"alignment"(GDHorizontalAlignment)
"width"(GDfloat)
"font_size"(GDint)
"modulate"(GDColor)
"justification_flags"(GDUnknownType)
"direction"(GDDirection)
"orientation"(GDOrientation)
}

func("draw_string_outline") {
returns(GDvoid)
"canvas_item"(GDRID)
"pos"(GDVector2)
"text"(GDString)
"alignment"(GDHorizontalAlignment)
"width"(GDfloat)
"font_size"(GDint)
"size"(GDint)
"modulate"(GDColor)
"justification_flags"(GDUnknownType)
"direction"(GDDirection)
"orientation"(GDOrientation)
}

func("find_variation") {
returns(GDRID)
"variation_coordinates"(GDDictionary)
"face_index"(GDint)
"strength"(GDfloat)
"transform"(GDTransform2D)
}

func("get_ascent") {
returns(GDfloat)
"font_size"(GDint)
}

func("get_char_size") {
returns(GDVector2)
"char"(GDint)
"font_size"(GDint)
}

func("get_descent") {
returns(GDfloat)
"font_size"(GDint)
}

func("get_face_count") {
returns(GDint)

}

func("get_fallbacks") {
returns(GDTypedArray(GDSameType::class))

}

func("get_font_name") {
returns(GDString)

}

func("get_font_stretch") {
returns(GDint)

}

func("get_font_style") {
returns(GDUnknownType)

}

func("get_font_style_name") {
returns(GDString)

}

func("get_font_weight") {
returns(GDint)

}

func("get_height") {
returns(GDfloat)
"font_size"(GDint)
}

func("get_multiline_string_size") {
returns(GDVector2)
"text"(GDString)
"alignment"(GDHorizontalAlignment)
"width"(GDfloat)
"font_size"(GDint)
"max_lines"(GDint)
"brk_flags"(GDUnknownType)
"justification_flags"(GDUnknownType)
"direction"(GDDirection)
"orientation"(GDOrientation)
}

func("get_opentype_features") {
returns(GDDictionary)

}

func("get_ot_name_strings") {
returns(GDDictionary)

}

func("get_rids") {
returns(GDTypedArray(GDRID::class))

}

func("get_spacing") {
returns(GDint)
"spacing"(GDSpacingType)
}

func("get_string_size") {
returns(GDVector2)
"text"(GDString)
"alignment"(GDHorizontalAlignment)
"width"(GDfloat)
"font_size"(GDint)
"justification_flags"(GDUnknownType)
"direction"(GDDirection)
"orientation"(GDOrientation)
}

func("get_supported_chars") {
returns(GDString)

}

func("get_supported_feature_list") {
returns(GDDictionary)

}

func("get_supported_variation_list") {
returns(GDDictionary)

}

func("get_underline_position") {
returns(GDfloat)
"font_size"(GDint)
}

func("get_underline_thickness") {
returns(GDfloat)
"font_size"(GDint)
}

func("has_char") {
returns(GDbool)
"char"(GDint)
}

func("is_language_supported") {
returns(GDbool)
"language"(GDString)
}

func("is_script_supported") {
returns(GDbool)
"script"(GDString)
}

func("set_cache_capacity") {
returns(GDvoid)
"single_line"(GDint)
"multi_line"(GDint)
}

func("set_fallbacks") {
returns(GDvoid)
"fallbacks"(GDTypedArray(GDSameType::class))
}
}){

}