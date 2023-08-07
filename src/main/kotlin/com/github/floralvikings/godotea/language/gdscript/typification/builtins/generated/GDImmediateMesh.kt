
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDImmediateMesh: GDType("ImmediateMesh", {


constructor { }

func("clear_surfaces") {
returns(GDvoid)

}

func("surface_add_vertex") {
returns(GDvoid)
"vertex"(GDVector3)
}

func("surface_add_vertex_2d") {
returns(GDvoid)
"vertex"(GDVector2)
}

func("surface_begin") {
returns(GDvoid)
"primitive"(GDPrimitiveType)
"material"(GDMaterial)
}

func("surface_end") {
returns(GDvoid)

}

func("surface_set_color") {
returns(GDvoid)
"color"(GDColor)
}

func("surface_set_normal") {
returns(GDvoid)
"normal"(GDVector3)
}

func("surface_set_tangent") {
returns(GDvoid)
"tangent"(GDPlane)
}

func("surface_set_uv") {
returns(GDvoid)
"uv"(GDVector2)
}

func("surface_set_uv2") {
returns(GDvoid)
"uv2"(GDVector2)
}
}){

}