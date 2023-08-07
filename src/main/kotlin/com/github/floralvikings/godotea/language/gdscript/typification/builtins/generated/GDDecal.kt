
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDDecal: GDType("Decal", {

"albedo_mix"(GDfloat)
"cull_mask"(GDint)
"distance_fade_begin"(GDfloat)
"distance_fade_enabled"(GDbool)
"distance_fade_length"(GDfloat)
"emission_energy"(GDfloat)
"lower_fade"(GDfloat)
"modulate"(GDColor)
"normal_fade"(GDfloat)
"size"(GDVector3)
"texture_albedo"(GDTexture2D)
"texture_emission"(GDTexture2D)
"texture_normal"(GDTexture2D)
"texture_orm"(GDTexture2D)
"upper_fade"(GDfloat)
constructor { }

func("get_texture") {
returns(GDTexture2D)
"type"(GDDecalTexture)
}

func("set_texture") {
returns(GDvoid)
"type"(GDDecalTexture)
"texture"(GDTexture2D)
}
}){

}