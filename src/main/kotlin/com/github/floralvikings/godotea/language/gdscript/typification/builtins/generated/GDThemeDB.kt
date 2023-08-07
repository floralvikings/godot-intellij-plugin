
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDThemeDB: GDType("ThemeDB", {

"fallback_base_scale"(GDfloat)
"fallback_font"(GDFont)
"fallback_font_size"(GDint)
"fallback_icon"(GDTexture2D)
"fallback_stylebox"(GDStyleBox)
constructor { }

func("get_default_theme") {
returns(GDTheme)

}

func("get_project_theme") {
returns(GDTheme)

}
}){

}