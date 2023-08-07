
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDFontVariation: GDType("FontVariation", {

"base_font"(GDFont)
"fallbacks"(GDTypedArray(GDFont::class))
"opentype_features"(GDDictionary)
"spacing_bottom"(GDint)
"spacing_glyph"(GDint)
"spacing_space"(GDint)
"spacing_top"(GDint)
"variation_embolden"(GDfloat)
"variation_face_index"(GDint)
"variation_opentype"(GDDictionary)
"variation_transform"(GDTransform2D)
constructor { }

func("set_spacing") {
returns(GDvoid)
"spacing"(GDSpacingType)
"value"(GDint)
}
}){

}