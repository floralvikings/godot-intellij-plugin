
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDLabel: GDType("Label", {

"font_color"(GDColor)
"font_outline_color"(GDColor)
"font_shadow_color"(GDColor)
"line_spacing"(GDint)
"outline_size"(GDint)
"shadow_offset_x"(GDint)
"shadow_offset_y"(GDint)
"shadow_outline_size"(GDint)
"font"(GDFont)
"font_size"(GDint)
"normal"(GDStyleBox)
"autowrap_mode"(GDAutowrapMode)
"clip_text"(GDbool)
"horizontal_alignment"(GDHorizontalAlignment)
"justification_flags"(GDUnknownType)
"label_settings"(GDLabelSettings)
"language"(GDString)
"lines_skipped"(GDint)
"max_lines_visible"(GDint)
"mouse_filter"(GDMouseFilter)
"size_flags_vertical"(GDUnknownType)
"structured_text_bidi_override"(GDStructuredTextParser)
"structured_text_bidi_override_options"(GDArray)
"tab_stops"(GDPackedFloat32Array)
"text"(GDString)
"text_direction"(GDTextDirection)
"text_overrun_behavior"(GDOverrunBehavior)
"uppercase"(GDbool)
"vertical_alignment"(GDVerticalAlignment)
"visible_characters"(GDint)
"visible_characters_behavior"(GDVisibleCharactersBehavior)
"visible_ratio"(GDfloat)
constructor { }

func("get_line_count") {
returns(GDint)

}

func("get_line_height") {
returns(GDint)
"line"(GDint)
}

func("get_total_character_count") {
returns(GDint)

}

func("get_visible_line_count") {
returns(GDint)

}
}){

}