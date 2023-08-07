
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPolygon2D: GDType("Polygon2D", {

"antialiased"(GDbool)
"bones"(GDArray)
"color"(GDColor)
"internal_vertex_count"(GDint)
"invert_border"(GDfloat)
"invert_enabled"(GDbool)
"offset"(GDVector2)
"polygon"(GDPackedVector2Array)
"polygons"(GDArray)
"skeleton"(GDNodePath)
"texture"(GDTexture2D)
"texture_offset"(GDVector2)
"texture_rotation"(GDfloat)
"texture_scale"(GDVector2)
"uv"(GDPackedVector2Array)
"vertex_colors"(GDPackedColorArray)
constructor { }

func("add_bone") {
returns(GDvoid)
"path"(GDNodePath)
"weights"(GDPackedFloat32Array)
}

func("clear_bones") {
returns(GDvoid)

}

func("erase_bone") {
returns(GDvoid)
"index"(GDint)
}

func("get_bone_count") {
returns(GDint)

}

func("get_bone_path") {
returns(GDNodePath)
"index"(GDint)
}

func("get_bone_weights") {
returns(GDPackedFloat32Array)
"index"(GDint)
}

func("set_bone_path") {
returns(GDvoid)
"index"(GDint)
"path"(GDNodePath)
}

func("set_bone_weights") {
returns(GDvoid)
"index"(GDint)
"weights"(GDPackedFloat32Array)
}
}){

}