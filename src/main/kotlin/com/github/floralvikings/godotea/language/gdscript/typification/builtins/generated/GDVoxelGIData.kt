
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDVoxelGIData: GDType("VoxelGIData", {

"bias"(GDfloat)
"dynamic_range"(GDfloat)
"energy"(GDfloat)
"interior"(GDbool)
"normal_bias"(GDfloat)
"propagation"(GDfloat)
"use_two_bounces"(GDbool)
constructor { }

func("allocate") {
returns(GDvoid)
"to_cell_xform"(GDTransform3D)
"aabb"(GDAABB)
"octree_size"(GDVector3)
"octree_cells"(GDPackedByteArray)
"data_cells"(GDPackedByteArray)
"distance_field"(GDPackedByteArray)
"level_counts"(GDPackedInt32Array)
}

func("get_bounds") {
returns(GDAABB)

}

func("get_data_cells") {
returns(GDPackedByteArray)

}

func("get_level_counts") {
returns(GDPackedInt32Array)

}

func("get_octree_cells") {
returns(GDPackedByteArray)

}

func("get_octree_size") {
returns(GDVector3)

}

func("get_to_cell_xform") {
returns(GDTransform3D)

}
}){

}