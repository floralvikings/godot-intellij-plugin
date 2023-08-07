
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTheme: GDType("Theme", {

"default_base_scale"(GDfloat)
"default_font"(GDFont)
"default_font_size"(GDint)
constructor { }

func("add_type") {
returns(GDvoid)
"theme_type"(GDStringName)
}

func("clear") {
returns(GDvoid)

}

func("clear_color") {
returns(GDvoid)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("clear_constant") {
returns(GDvoid)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("clear_font") {
returns(GDvoid)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("clear_font_size") {
returns(GDvoid)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("clear_icon") {
returns(GDvoid)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("clear_stylebox") {
returns(GDvoid)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("clear_theme_item") {
returns(GDvoid)
"data_type"(GDDataType)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("clear_type_variation") {
returns(GDvoid)
"theme_type"(GDStringName)
}

func("get_color") {
returns(GDColor)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_color_list") {
returns(GDPackedStringArray)
"theme_type"(GDString)
}

func("get_color_type_list") {
returns(GDPackedStringArray)

}

func("get_constant") {
returns(GDint)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_constant_list") {
returns(GDPackedStringArray)
"theme_type"(GDString)
}

func("get_constant_type_list") {
returns(GDPackedStringArray)

}

func("get_font") {
returns(GDFont)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_font_list") {
returns(GDPackedStringArray)
"theme_type"(GDString)
}

func("get_font_size") {
returns(GDint)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_font_size_list") {
returns(GDPackedStringArray)
"theme_type"(GDString)
}

func("get_font_size_type_list") {
returns(GDPackedStringArray)

}

func("get_font_type_list") {
returns(GDPackedStringArray)

}

func("get_icon") {
returns(GDTexture2D)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_icon_list") {
returns(GDPackedStringArray)
"theme_type"(GDString)
}

func("get_icon_type_list") {
returns(GDPackedStringArray)

}

func("get_stylebox") {
returns(GDStyleBox)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_stylebox_list") {
returns(GDPackedStringArray)
"theme_type"(GDString)
}

func("get_stylebox_type_list") {
returns(GDPackedStringArray)

}

func("get_theme_item") {
returns(GDVariant)
"data_type"(GDDataType)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("get_theme_item_list") {
returns(GDPackedStringArray)
"data_type"(GDDataType)
"theme_type"(GDString)
}

func("get_theme_item_type_list") {
returns(GDPackedStringArray)
"data_type"(GDDataType)
}

func("get_type_list") {
returns(GDPackedStringArray)

}

func("get_type_variation_base") {
returns(GDStringName)
"theme_type"(GDStringName)
}

func("get_type_variation_list") {
returns(GDPackedStringArray)
"base_type"(GDStringName)
}

func("has_color") {
returns(GDbool)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("has_constant") {
returns(GDbool)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("has_default_base_scale") {
returns(GDbool)

}

func("has_default_font") {
returns(GDbool)

}

func("has_default_font_size") {
returns(GDbool)

}

func("has_font") {
returns(GDbool)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("has_font_size") {
returns(GDbool)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("has_icon") {
returns(GDbool)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("has_stylebox") {
returns(GDbool)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("has_theme_item") {
returns(GDbool)
"data_type"(GDDataType)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("is_type_variation") {
returns(GDbool)
"theme_type"(GDStringName)
"base_type"(GDStringName)
}

func("merge_with") {
returns(GDvoid)
"other"(GDSameType)
}

func("remove_type") {
returns(GDvoid)
"theme_type"(GDStringName)
}

func("rename_color") {
returns(GDvoid)
"old_name"(GDStringName)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("rename_constant") {
returns(GDvoid)
"old_name"(GDStringName)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("rename_font") {
returns(GDvoid)
"old_name"(GDStringName)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("rename_font_size") {
returns(GDvoid)
"old_name"(GDStringName)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("rename_icon") {
returns(GDvoid)
"old_name"(GDStringName)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("rename_stylebox") {
returns(GDvoid)
"old_name"(GDStringName)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("rename_theme_item") {
returns(GDvoid)
"data_type"(GDDataType)
"old_name"(GDStringName)
"name"(GDStringName)
"theme_type"(GDStringName)
}

func("set_color") {
returns(GDvoid)
"name"(GDStringName)
"theme_type"(GDStringName)
"color"(GDColor)
}

func("set_constant") {
returns(GDvoid)
"name"(GDStringName)
"theme_type"(GDStringName)
"constant"(GDint)
}

func("set_font") {
returns(GDvoid)
"name"(GDStringName)
"theme_type"(GDStringName)
"font"(GDFont)
}

func("set_font_size") {
returns(GDvoid)
"name"(GDStringName)
"theme_type"(GDStringName)
"font_size"(GDint)
}

func("set_icon") {
returns(GDvoid)
"name"(GDStringName)
"theme_type"(GDStringName)
"texture"(GDTexture2D)
}

func("set_stylebox") {
returns(GDvoid)
"name"(GDStringName)
"theme_type"(GDStringName)
"texture"(GDStyleBox)
}

func("set_theme_item") {
returns(GDvoid)
"data_type"(GDDataType)
"name"(GDStringName)
"theme_type"(GDStringName)
"value"(GDVariant)
}

func("set_type_variation") {
returns(GDvoid)
"theme_type"(GDStringName)
"base_type"(GDStringName)
}
}){

}