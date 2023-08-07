
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTreeItem: GDType("TreeItem", {

"collapsed"(GDbool)
"custom_minimum_height"(GDint)
"disable_folding"(GDbool)
"visible"(GDbool)
constructor { }

func("add_button") {
returns(GDvoid)
"column"(GDint)
"button"(GDTexture2D)
"id"(GDint)
"disabled"(GDbool)
"tooltip_text"(GDString)
}

func("add_child") {
returns(GDvoid)
"child"(GDSameType)
}

func("call_recursive") {
returns(GDvoid)
"method"(GDStringName)
}

func("clear_custom_bg_color") {
returns(GDvoid)
"column"(GDint)
}

func("clear_custom_color") {
returns(GDvoid)
"column"(GDint)
}

func("create_child") {
returns(GDSameType)
"index"(GDint)
}

func("deselect") {
returns(GDvoid)
"column"(GDint)
}

func("erase_button") {
returns(GDvoid)
"column"(GDint)
"button_index"(GDint)
}

func("get_autowrap_mode") {
returns(GDAutowrapMode)
"column"(GDint)
}

func("get_button") {
returns(GDTexture2D)
"column"(GDint)
"button_index"(GDint)
}

func("get_button_by_id") {
returns(GDint)
"column"(GDint)
"id"(GDint)
}

func("get_button_count") {
returns(GDint)
"column"(GDint)
}

func("get_button_id") {
returns(GDint)
"column"(GDint)
"button_index"(GDint)
}

func("get_button_tooltip_text") {
returns(GDString)
"column"(GDint)
"button_index"(GDint)
}

func("get_cell_mode") {
returns(GDTreeCellMode)
"column"(GDint)
}

func("get_child") {
returns(GDSameType)
"index"(GDint)
}

func("get_child_count") {
returns(GDint)

}

func("get_children") {
returns(GDTypedArray(GDSameType::class))

}

func("get_custom_bg_color") {
returns(GDColor)
"column"(GDint)
}

func("get_custom_color") {
returns(GDColor)
"column"(GDint)
}

func("get_custom_font") {
returns(GDFont)
"column"(GDint)
}

func("get_custom_font_size") {
returns(GDint)
"column"(GDint)
}

func("get_expand_right") {
returns(GDbool)
"column"(GDint)
}

func("get_first_child") {
returns(GDSameType)

}

func("get_icon") {
returns(GDTexture2D)
"column"(GDint)
}

func("get_icon_max_width") {
returns(GDint)
"column"(GDint)
}

func("get_icon_modulate") {
returns(GDColor)
"column"(GDint)
}

func("get_icon_region") {
returns(GDRect2)
"column"(GDint)
}

func("get_index") {
returns(GDint)

}

func("get_language") {
returns(GDString)
"column"(GDint)
}

func("get_metadata") {
returns(GDVariant)
"column"(GDint)
}

func("get_next") {
returns(GDSameType)

}

func("get_next_in_tree") {
returns(GDSameType)
"wrap"(GDbool)
}

func("get_next_visible") {
returns(GDSameType)
"wrap"(GDbool)
}

func("get_parent") {
returns(GDSameType)

}

func("get_prev") {
returns(GDSameType)

}

func("get_prev_in_tree") {
returns(GDSameType)
"wrap"(GDbool)
}

func("get_prev_visible") {
returns(GDSameType)
"wrap"(GDbool)
}

func("get_range") {
returns(GDfloat)
"column"(GDint)
}

func("get_range_config") {
returns(GDDictionary)
"column"(GDint)
}

func("get_structured_text_bidi_override") {
returns(GDStructuredTextParser)
"column"(GDint)
}

func("get_structured_text_bidi_override_options") {
returns(GDArray)
"column"(GDint)
}

func("get_suffix") {
returns(GDString)
"column"(GDint)
}

func("get_text") {
returns(GDString)
"column"(GDint)
}

func("get_text_alignment") {
returns(GDHorizontalAlignment)
"column"(GDint)
}

func("get_text_direction") {
returns(GDTextDirection)
"column"(GDint)
}

func("get_tooltip_text") {
returns(GDString)
"column"(GDint)
}

func("get_tree") {
returns(GDTree)

}

func("is_any_collapsed") {
returns(GDbool)
"only_visible"(GDbool)
}

func("is_button_disabled") {
returns(GDbool)
"column"(GDint)
"button_index"(GDint)
}

func("is_checked") {
returns(GDbool)
"column"(GDint)
}

func("is_custom_set_as_button") {
returns(GDbool)
"column"(GDint)
}

func("is_edit_multiline") {
returns(GDbool)
"column"(GDint)
}

func("is_editable") {
returns(GDbool)
"column"(GDint)
}

func("is_indeterminate") {
returns(GDbool)
"column"(GDint)
}

func("is_selectable") {
returns(GDbool)
"column"(GDint)
}

func("is_selected") {
returns(GDbool)
"column"(GDint)
}

func("move_after") {
returns(GDvoid)
"item"(GDSameType)
}

func("move_before") {
returns(GDvoid)
"item"(GDSameType)
}

func("propagate_check") {
returns(GDvoid)
"column"(GDint)
"emit_signal"(GDbool)
}

func("remove_child") {
returns(GDvoid)
"child"(GDSameType)
}

func("select") {
returns(GDvoid)
"column"(GDint)
}

func("set_autowrap_mode") {
returns(GDvoid)
"column"(GDint)
"autowrap_mode"(GDAutowrapMode)
}

func("set_button") {
returns(GDvoid)
"column"(GDint)
"button_index"(GDint)
"button"(GDTexture2D)
}

func("set_button_color") {
returns(GDvoid)
"column"(GDint)
"button_index"(GDint)
"color"(GDColor)
}

func("set_button_disabled") {
returns(GDvoid)
"column"(GDint)
"button_index"(GDint)
"disabled"(GDbool)
}

func("set_cell_mode") {
returns(GDvoid)
"column"(GDint)
"mode"(GDTreeCellMode)
}

func("set_checked") {
returns(GDvoid)
"column"(GDint)
"checked"(GDbool)
}

func("set_collapsed_recursive") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_custom_as_button") {
returns(GDvoid)
"column"(GDint)
"enable"(GDbool)
}

func("set_custom_bg_color") {
returns(GDvoid)
"column"(GDint)
"color"(GDColor)
"just_outline"(GDbool)
}

func("set_custom_color") {
returns(GDvoid)
"column"(GDint)
"color"(GDColor)
}

func("set_custom_draw") {
returns(GDvoid)
"column"(GDint)
"object"(GDObject)
"callback"(GDStringName)
}

func("set_custom_font") {
returns(GDvoid)
"column"(GDint)
"font"(GDFont)
}

func("set_custom_font_size") {
returns(GDvoid)
"column"(GDint)
"font_size"(GDint)
}

func("set_edit_multiline") {
returns(GDvoid)
"column"(GDint)
"multiline"(GDbool)
}

func("set_editable") {
returns(GDvoid)
"column"(GDint)
"enabled"(GDbool)
}

func("set_expand_right") {
returns(GDvoid)
"column"(GDint)
"enable"(GDbool)
}

func("set_icon") {
returns(GDvoid)
"column"(GDint)
"texture"(GDTexture2D)
}

func("set_icon_max_width") {
returns(GDvoid)
"column"(GDint)
"width"(GDint)
}

func("set_icon_modulate") {
returns(GDvoid)
"column"(GDint)
"modulate"(GDColor)
}

func("set_icon_region") {
returns(GDvoid)
"column"(GDint)
"region"(GDRect2)
}

func("set_indeterminate") {
returns(GDvoid)
"column"(GDint)
"indeterminate"(GDbool)
}

func("set_language") {
returns(GDvoid)
"column"(GDint)
"language"(GDString)
}

func("set_metadata") {
returns(GDvoid)
"column"(GDint)
"meta"(GDVariant)
}

func("set_range") {
returns(GDvoid)
"column"(GDint)
"value"(GDfloat)
}

func("set_range_config") {
returns(GDvoid)
"column"(GDint)
"min"(GDfloat)
"max"(GDfloat)
"step"(GDfloat)
"expr"(GDbool)
}

func("set_selectable") {
returns(GDvoid)
"column"(GDint)
"selectable"(GDbool)
}

func("set_structured_text_bidi_override") {
returns(GDvoid)
"column"(GDint)
"parser"(GDStructuredTextParser)
}

func("set_structured_text_bidi_override_options") {
returns(GDvoid)
"column"(GDint)
"args"(GDArray)
}

func("set_suffix") {
returns(GDvoid)
"column"(GDint)
"text"(GDString)
}

func("set_text") {
returns(GDvoid)
"column"(GDint)
"text"(GDString)
}

func("set_text_alignment") {
returns(GDvoid)
"column"(GDint)
"text_alignment"(GDHorizontalAlignment)
}

func("set_text_direction") {
returns(GDvoid)
"column"(GDint)
"direction"(GDTextDirection)
}

func("set_tooltip_text") {
returns(GDvoid)
"column"(GDint)
"tooltip"(GDString)
}

func("uncollapse_tree") {
returns(GDvoid)

}
}){

}