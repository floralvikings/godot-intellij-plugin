
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCollisionObject3D: GDType("CollisionObject3D", {

"collision_layer"(GDint)
"collision_mask"(GDint)
"collision_priority"(GDfloat)
"disable_mode"(GDDisableMode)
"input_capture_on_drag"(GDbool)
"input_ray_pickable"(GDbool)
constructor { }

func("_input_event") {
returns(GDvoid)
"camera"(GDCamera3D)
"event"(GDInputEvent)
"position"(GDVector3)
"normal"(GDVector3)
"shape_idx"(GDint)
}

func("_mouse_enter") {
returns(GDvoid)

}

func("_mouse_exit") {
returns(GDvoid)

}

func("create_shape_owner") {
returns(GDint)
"owner"(GDObject)
}

func("get_collision_layer_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_collision_mask_value") {
returns(GDbool)
"layer_number"(GDint)
}

func("get_rid") {
returns(GDRID)

}

func("get_shape_owners") {
returns(GDPackedInt32Array)

}

func("is_shape_owner_disabled") {
returns(GDbool)
"owner_id"(GDint)
}

func("remove_shape_owner") {
returns(GDvoid)
"owner_id"(GDint)
}

func("set_collision_layer_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("set_collision_mask_value") {
returns(GDvoid)
"layer_number"(GDint)
"value"(GDbool)
}

func("shape_find_owner") {
returns(GDint)
"shape_index"(GDint)
}

func("shape_owner_add_shape") {
returns(GDvoid)
"owner_id"(GDint)
"shape"(GDShape3D)
}

func("shape_owner_clear_shapes") {
returns(GDvoid)
"owner_id"(GDint)
}

func("shape_owner_get_owner") {
returns(GDObject)
"owner_id"(GDint)
}

func("shape_owner_get_shape") {
returns(GDShape3D)
"owner_id"(GDint)
"shape_id"(GDint)
}

func("shape_owner_get_shape_count") {
returns(GDint)
"owner_id"(GDint)
}

func("shape_owner_get_shape_index") {
returns(GDint)
"owner_id"(GDint)
"shape_id"(GDint)
}

func("shape_owner_get_transform") {
returns(GDTransform3D)
"owner_id"(GDint)
}

func("shape_owner_remove_shape") {
returns(GDvoid)
"owner_id"(GDint)
"shape_id"(GDint)
}

func("shape_owner_set_disabled") {
returns(GDvoid)
"owner_id"(GDint)
"disabled"(GDbool)
}

func("shape_owner_set_transform") {
returns(GDvoid)
"owner_id"(GDint)
"transform"(GDTransform3D)
}
}){

}