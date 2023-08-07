
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSystemFont: GDType("SystemFont", {

"allow_system_fallback"(GDbool)
"antialiasing"(GDFontAntialiasing)
"fallbacks"(GDTypedArray(GDFont::class))
"font_italic"(GDbool)
"font_names"(GDPackedStringArray)
"font_stretch"(GDint)
"font_weight"(GDint)
"force_autohinter"(GDbool)
"generate_mipmaps"(GDbool)
"hinting"(GDHinting)
"msdf_pixel_range"(GDint)
"msdf_size"(GDint)
"multichannel_signed_distance_field"(GDbool)
"oversampling"(GDfloat)
"subpixel_positioning"(GDSubpixelPositioning)
constructor { }

}){

}