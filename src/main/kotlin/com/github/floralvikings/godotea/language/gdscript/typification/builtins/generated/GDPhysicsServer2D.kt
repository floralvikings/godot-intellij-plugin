
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsServer2D: GDType("PhysicsServer2D", {


constructor { }

func("area_add_shape") {
returns(GDvoid)
"area"(GDRID)
"shape"(GDRID)
"transform"(GDTransform2D)
"disabled"(GDbool)
}

func("area_attach_canvas_instance_id") {
returns(GDvoid)
"area"(GDRID)
"id"(GDint)
}

func("area_attach_object_instance_id") {
returns(GDvoid)
"area"(GDRID)
"id"(GDint)
}

func("area_clear_shapes") {
returns(GDvoid)
"area"(GDRID)
}

func("area_create") {
returns(GDRID)

}

func("area_get_canvas_instance_id") {
returns(GDint)
"area"(GDRID)
}

func("area_get_collision_layer") {
returns(GDint)
"area"(GDRID)
}

func("area_get_collision_mask") {
returns(GDint)
"area"(GDRID)
}

func("area_get_object_instance_id") {
returns(GDint)
"area"(GDRID)
}

func("area_get_param") {
returns(GDVariant)
"area"(GDRID)
"param"(GDAreaParameter)
}

func("area_get_shape") {
returns(GDRID)
"area"(GDRID)
"shape_idx"(GDint)
}

func("area_get_shape_count") {
returns(GDint)
"area"(GDRID)
}

func("area_get_shape_transform") {
returns(GDTransform2D)
"area"(GDRID)
"shape_idx"(GDint)
}

func("area_get_space") {
returns(GDRID)
"area"(GDRID)
}

func("area_get_transform") {
returns(GDTransform2D)
"area"(GDRID)
}

func("area_remove_shape") {
returns(GDvoid)
"area"(GDRID)
"shape_idx"(GDint)
}

func("area_set_area_monitor_callback") {
returns(GDvoid)
"area"(GDRID)
"callback"(GDCallable)
}

func("area_set_collision_layer") {
returns(GDvoid)
"area"(GDRID)
"layer"(GDint)
}

func("area_set_collision_mask") {
returns(GDvoid)
"area"(GDRID)
"mask"(GDint)
}

func("area_set_monitor_callback") {
returns(GDvoid)
"area"(GDRID)
"callback"(GDCallable)
}

func("area_set_monitorable") {
returns(GDvoid)
"area"(GDRID)
"monitorable"(GDbool)
}

func("area_set_param") {
returns(GDvoid)
"area"(GDRID)
"param"(GDAreaParameter)
"value"(GDVariant)
}

func("area_set_shape") {
returns(GDvoid)
"area"(GDRID)
"shape_idx"(GDint)
"shape"(GDRID)
}

func("area_set_shape_disabled") {
returns(GDvoid)
"area"(GDRID)
"shape_idx"(GDint)
"disabled"(GDbool)
}

func("area_set_shape_transform") {
returns(GDvoid)
"area"(GDRID)
"shape_idx"(GDint)
"transform"(GDTransform2D)
}

func("area_set_space") {
returns(GDvoid)
"area"(GDRID)
"space"(GDRID)
}

func("area_set_transform") {
returns(GDvoid)
"area"(GDRID)
"transform"(GDTransform2D)
}

func("body_add_collision_exception") {
returns(GDvoid)
"body"(GDRID)
"excepted_body"(GDRID)
}

func("body_add_constant_central_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector2)
}

func("body_add_constant_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector2)
"position"(GDVector2)
}

func("body_add_constant_torque") {
returns(GDvoid)
"body"(GDRID)
"torque"(GDfloat)
}

func("body_add_shape") {
returns(GDvoid)
"body"(GDRID)
"shape"(GDRID)
"transform"(GDTransform2D)
"disabled"(GDbool)
}

func("body_apply_central_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector2)
}

func("body_apply_central_impulse") {
returns(GDvoid)
"body"(GDRID)
"impulse"(GDVector2)
}

func("body_apply_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector2)
"position"(GDVector2)
}

func("body_apply_impulse") {
returns(GDvoid)
"body"(GDRID)
"impulse"(GDVector2)
"position"(GDVector2)
}

func("body_apply_torque") {
returns(GDvoid)
"body"(GDRID)
"torque"(GDfloat)
}

func("body_apply_torque_impulse") {
returns(GDvoid)
"body"(GDRID)
"impulse"(GDfloat)
}

func("body_attach_canvas_instance_id") {
returns(GDvoid)
"body"(GDRID)
"id"(GDint)
}

func("body_attach_object_instance_id") {
returns(GDvoid)
"body"(GDRID)
"id"(GDint)
}

func("body_clear_shapes") {
returns(GDvoid)
"body"(GDRID)
}

func("body_create") {
returns(GDRID)

}

func("body_get_canvas_instance_id") {
returns(GDint)
"body"(GDRID)
}

func("body_get_collision_layer") {
returns(GDint)
"body"(GDRID)
}

func("body_get_collision_mask") {
returns(GDint)
"body"(GDRID)
}

func("body_get_collision_priority") {
returns(GDfloat)
"body"(GDRID)
}

func("body_get_constant_force") {
returns(GDVector2)
"body"(GDRID)
}

func("body_get_constant_torque") {
returns(GDfloat)
"body"(GDRID)
}

func("body_get_continuous_collision_detection_mode") {
returns(GDCCDMode)
"body"(GDRID)
}

func("body_get_direct_state") {
returns(GDPhysicsDirectBodyState2D)
"body"(GDRID)
}

func("body_get_max_contacts_reported") {
returns(GDint)
"body"(GDRID)
}

func("body_get_mode") {
returns(GDBodyMode)
"body"(GDRID)
}

func("body_get_object_instance_id") {
returns(GDint)
"body"(GDRID)
}

func("body_get_param") {
returns(GDVariant)
"body"(GDRID)
"param"(GDBodyParameter)
}

func("body_get_shape") {
returns(GDRID)
"body"(GDRID)
"shape_idx"(GDint)
}

func("body_get_shape_count") {
returns(GDint)
"body"(GDRID)
}

func("body_get_shape_transform") {
returns(GDTransform2D)
"body"(GDRID)
"shape_idx"(GDint)
}

func("body_get_space") {
returns(GDRID)
"body"(GDRID)
}

func("body_get_state") {
returns(GDVariant)
"body"(GDRID)
"state"(GDBodyState)
}

func("body_is_omitting_force_integration") {
returns(GDbool)
"body"(GDRID)
}

func("body_remove_collision_exception") {
returns(GDvoid)
"body"(GDRID)
"excepted_body"(GDRID)
}

func("body_remove_shape") {
returns(GDvoid)
"body"(GDRID)
"shape_idx"(GDint)
}

func("body_reset_mass_properties") {
returns(GDvoid)
"body"(GDRID)
}

func("body_set_axis_velocity") {
returns(GDvoid)
"body"(GDRID)
"axis_velocity"(GDVector2)
}

func("body_set_collision_layer") {
returns(GDvoid)
"body"(GDRID)
"layer"(GDint)
}

func("body_set_collision_mask") {
returns(GDvoid)
"body"(GDRID)
"mask"(GDint)
}

func("body_set_collision_priority") {
returns(GDvoid)
"body"(GDRID)
"priority"(GDfloat)
}

func("body_set_constant_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector2)
}

func("body_set_constant_torque") {
returns(GDvoid)
"body"(GDRID)
"torque"(GDfloat)
}

func("body_set_continuous_collision_detection_mode") {
returns(GDvoid)
"body"(GDRID)
"mode"(GDCCDMode)
}

func("body_set_force_integration_callback") {
returns(GDvoid)
"body"(GDRID)
"callable"(GDCallable)
"userdata"(GDVariant)
}

func("body_set_max_contacts_reported") {
returns(GDvoid)
"body"(GDRID)
"amount"(GDint)
}

func("body_set_mode") {
returns(GDvoid)
"body"(GDRID)
"mode"(GDBodyMode)
}

func("body_set_omit_force_integration") {
returns(GDvoid)
"body"(GDRID)
"enable"(GDbool)
}

func("body_set_param") {
returns(GDvoid)
"body"(GDRID)
"param"(GDBodyParameter)
"value"(GDVariant)
}

func("body_set_shape") {
returns(GDvoid)
"body"(GDRID)
"shape_idx"(GDint)
"shape"(GDRID)
}

func("body_set_shape_as_one_way_collision") {
returns(GDvoid)
"body"(GDRID)
"shape_idx"(GDint)
"enable"(GDbool)
"margin"(GDfloat)
}

func("body_set_shape_disabled") {
returns(GDvoid)
"body"(GDRID)
"shape_idx"(GDint)
"disabled"(GDbool)
}

func("body_set_shape_transform") {
returns(GDvoid)
"body"(GDRID)
"shape_idx"(GDint)
"transform"(GDTransform2D)
}

func("body_set_space") {
returns(GDvoid)
"body"(GDRID)
"space"(GDRID)
}

func("body_set_state") {
returns(GDvoid)
"body"(GDRID)
"state"(GDBodyState)
"value"(GDVariant)
}

func("body_test_motion") {
returns(GDbool)
"body"(GDRID)
"parameters"(GDPhysicsTestMotionParameters2D)
"result"(GDPhysicsTestMotionResult2D)
}

func("capsule_shape_create") {
returns(GDRID)

}

func("circle_shape_create") {
returns(GDRID)

}

func("concave_polygon_shape_create") {
returns(GDRID)

}

func("convex_polygon_shape_create") {
returns(GDRID)

}

func("damped_spring_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDDampedSpringParam)
}

func("damped_spring_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDDampedSpringParam)
"value"(GDfloat)
}

func("free_rid") {
returns(GDvoid)
"rid"(GDRID)
}

func("get_process_info") {
returns(GDint)
"process_info"(GDProcessInfo)
}

func("joint_clear") {
returns(GDvoid)
"joint"(GDRID)
}

func("joint_create") {
returns(GDRID)

}

func("joint_disable_collisions_between_bodies") {
returns(GDvoid)
"joint"(GDRID)
"disable"(GDbool)
}

func("joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDJointParam)
}

func("joint_get_type") {
returns(GDJointType)
"joint"(GDRID)
}

func("joint_is_disabled_collisions_between_bodies") {
returns(GDbool)
"joint"(GDRID)
}

func("joint_make_damped_spring") {
returns(GDvoid)
"joint"(GDRID)
"anchor_a"(GDVector2)
"anchor_b"(GDVector2)
"body_a"(GDRID)
"body_b"(GDRID)
}

func("joint_make_groove") {
returns(GDvoid)
"joint"(GDRID)
"groove1_a"(GDVector2)
"groove2_a"(GDVector2)
"anchor_b"(GDVector2)
"body_a"(GDRID)
"body_b"(GDRID)
}

func("joint_make_pin") {
returns(GDvoid)
"joint"(GDRID)
"anchor"(GDVector2)
"body_a"(GDRID)
"body_b"(GDRID)
}

func("joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDJointParam)
"value"(GDfloat)
}

func("pin_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDPinJointParam)
}

func("pin_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDPinJointParam)
"value"(GDfloat)
}

func("rectangle_shape_create") {
returns(GDRID)

}

func("segment_shape_create") {
returns(GDRID)

}

func("separation_ray_shape_create") {
returns(GDRID)

}

func("set_active") {
returns(GDvoid)
"active"(GDbool)
}

func("shape_get_data") {
returns(GDVariant)
"shape"(GDRID)
}

func("shape_get_type") {
returns(GDShapeType)
"shape"(GDRID)
}

func("shape_set_data") {
returns(GDvoid)
"shape"(GDRID)
"data"(GDVariant)
}

func("space_create") {
returns(GDRID)

}

func("space_get_direct_state") {
returns(GDPhysicsDirectSpaceState2D)
"space"(GDRID)
}

func("space_get_param") {
returns(GDfloat)
"space"(GDRID)
"param"(GDSpaceParameter)
}

func("space_is_active") {
returns(GDbool)
"space"(GDRID)
}

func("space_set_active") {
returns(GDvoid)
"space"(GDRID)
"active"(GDbool)
}

func("space_set_param") {
returns(GDvoid)
"space"(GDRID)
"param"(GDSpaceParameter)
"value"(GDfloat)
}

func("world_boundary_shape_create") {
returns(GDRID)

}
}){

}