
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDLightmapGIData: GDType("LightmapGIData", {

"light_texture"(GDTextureLayered)
constructor { }

func("add_user") {
returns(GDvoid)
"path"(GDNodePath)
"uv_scale"(GDRect2)
"slice_index"(GDint)
"sub_instance"(GDint)
}

func("clear_users") {
returns(GDvoid)

}

func("get_user_count") {
returns(GDint)

}

func("get_user_path") {
returns(GDNodePath)
"user_idx"(GDint)
}

func("is_using_spherical_harmonics") {
returns(GDbool)

}

func("set_uses_spherical_harmonics") {
returns(GDvoid)
"uses_spherical_harmonics"(GDbool)
}
}){

}