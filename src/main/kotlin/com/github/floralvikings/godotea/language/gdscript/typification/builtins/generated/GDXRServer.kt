
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDXRServer: GDType("XRServer", {

"primary_interface"(GDXRInterface)
"world_origin"(GDTransform3D)
"world_scale"(GDfloat)
constructor { }

func("add_interface") {
returns(GDvoid)
"interface"(GDXRInterface)
}

func("add_tracker") {
returns(GDvoid)
"tracker"(GDXRPositionalTracker)
}

func("center_on_hmd") {
returns(GDvoid)
"rotation_mode"(GDRotationMode)
"keep_height"(GDbool)
}

func("find_interface") {
returns(GDXRInterface)
"name"(GDString)
}

func("get_hmd_transform") {
returns(GDTransform3D)

}

func("get_interface") {
returns(GDXRInterface)
"idx"(GDint)
}

func("get_interface_count") {
returns(GDint)

}

func("get_interfaces") {
returns(GDTypedArray(GDDictionary::class))

}

func("get_reference_frame") {
returns(GDTransform3D)

}

func("get_tracker") {
returns(GDXRPositionalTracker)
"tracker_name"(GDStringName)
}

func("get_trackers") {
returns(GDDictionary)
"tracker_types"(GDint)
}

func("remove_interface") {
returns(GDvoid)
"interface"(GDXRInterface)
}

func("remove_tracker") {
returns(GDvoid)
"tracker"(GDXRPositionalTracker)
}
}){

}