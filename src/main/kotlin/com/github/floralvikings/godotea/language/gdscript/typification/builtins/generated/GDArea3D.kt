
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDArea3D: GDType("Area3D", {

"angular_damp"(GDfloat)
"angular_damp_space_override"(GDSpaceOverride)
"audio_bus_name"(GDStringName)
"audio_bus_override"(GDbool)
"gravity"(GDfloat)
"gravity_direction"(GDVector3)
"gravity_point"(GDbool)
"gravity_point_center"(GDVector3)
"gravity_point_unit_distance"(GDfloat)
"gravity_space_override"(GDSpaceOverride)
"linear_damp"(GDfloat)
"linear_damp_space_override"(GDSpaceOverride)
"monitorable"(GDbool)
"monitoring"(GDbool)
"priority"(GDint)
"reverb_bus_amount"(GDfloat)
"reverb_bus_enabled"(GDbool)
"reverb_bus_name"(GDStringName)
"reverb_bus_uniformity"(GDfloat)
"wind_attenuation_factor"(GDfloat)
"wind_force_magnitude"(GDfloat)
"wind_source_path"(GDNodePath)
constructor { }

func("get_overlapping_areas") {
returns(GDTypedArray(GDSameType::class))

}

func("get_overlapping_bodies") {
returns(GDTypedArray(GDNode3D::class))

}

func("has_overlapping_areas") {
returns(GDbool)

}

func("has_overlapping_bodies") {
returns(GDbool)

}

func("overlaps_area") {
returns(GDbool)
"area"(GDNode)
}

func("overlaps_body") {
returns(GDbool)
"body"(GDNode)
}
}){

}