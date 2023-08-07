
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMultiMesh: GDType("MultiMesh", {

"buffer"(GDPackedFloat32Array)
"color_array"(GDPackedColorArray)
"custom_data_array"(GDPackedColorArray)
"instance_count"(GDint)
"mesh"(GDMesh)
"transform_2d_array"(GDPackedVector2Array)
"transform_array"(GDPackedVector3Array)
"transform_format"(GDTransformFormat)
"use_colors"(GDbool)
"use_custom_data"(GDbool)
"visible_instance_count"(GDint)
constructor { }

func("get_aabb") {
returns(GDAABB)

}

func("get_instance_color") {
returns(GDColor)
"instance"(GDint)
}

func("get_instance_custom_data") {
returns(GDColor)
"instance"(GDint)
}

func("get_instance_transform") {
returns(GDTransform3D)
"instance"(GDint)
}

func("get_instance_transform_2d") {
returns(GDTransform2D)
"instance"(GDint)
}

func("set_instance_color") {
returns(GDvoid)
"instance"(GDint)
"color"(GDColor)
}

func("set_instance_custom_data") {
returns(GDvoid)
"instance"(GDint)
"custom_data"(GDColor)
}

func("set_instance_transform") {
returns(GDvoid)
"instance"(GDint)
"transform"(GDTransform3D)
}

func("set_instance_transform_2d") {
returns(GDvoid)
"instance"(GDint)
"transform"(GDTransform2D)
}
}){

}