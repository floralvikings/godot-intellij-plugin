
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsServer2DExtension: GDType("PhysicsServer2DExtension", {


constructor { }

func("_area_add_shape") {
returns(GDvoid)
"area"(GDRID)
"shape"(GDRID)
"transform"(GDTransform2D)
"disabled"(GDbool)
}

func("_area_attach_canvas_instance_id") {
returns(GDvoid)
"area"(GDRID)
"id"(GDint)
}

func("_area_attach_object_instance_id") {
returns(GDvoid)
"area"(GDRID)
"id"(GDint)
}

func("_area_clear_shapes") {
returns(GDvoid)
"area"(GDRID)
}

func("_area_create") {
returns(GDRID)

}

func("_area_get_canvas_instance_id") {
returns(GDint)
"area"(GDRID)
}

func("_area_get_collision_layer") {
returns(GDint)
"area"(GDRID)
}

func("_area_get_collision_mask") {
returns(GDint)
"area"(GDRID)
}

func("_area_get_object_instance_id") {
returns(GDint)
"area"(GDRID)
}

func("_area_get_param") {
returns(GDVariant)
"area"(GDRID)
"param"(GDAreaParameter)
}

func("_area_get_shape") {
returns(GDRID)
"area"(GDRID)
"shape_idx"(GDint)
}

func("_area_get_shape_count") {
returns(GDint)
"area"(GDRID)
}

func("_area_get_shape_transform") {
returns(GDTransform2D)
"area"(GDRID)
"shape_idx"(GDint)
}

func("_area_get_space") {
returns(GDRID)
"area"(GDRID)
}

func("_area_get_transform") {
returns(GDTransform2D)
"area"(GDRID)
}

func("_area_remove_shape") {
returns(GDvoid)
"area"(GDRID)
"shape_idx"(GDint)
}

func("_area_set_area_monitor_callback") {
returns(GDvoid)
"area"(GDRID)
"callback"(GDCallable)
}

func("_area_set_collision_layer") {
returns(GDvoid)
"area"(GDRID)
"layer"(GDint)
}

func("_area_set_collision_mask") {
returns(GDvoid)
"area"(GDRID)
"mask"(GDint)
}

func("_area_set_monitor_callback") {
returns(GDvoid)
"area"(GDRID)
"callback"(GDCallable)
}

func("_area_set_monitorable") {
returns(GDvoid)
"area"(GDRID)
"monitorable"(GDbool)
}

func("_area_set_param") {
returns(GDvoid)
"area"(GDRID)
"param"(GDAreaParameter)
"value"(GDVariant)
}

func("_area_set_pickable") {
returns(GDvoid)
"area"(GDRID)
"pickable"(GDbool)
}

func("_area_set_shape") {
returns(GDvoid)
"area"(GDRID)
"shape_idx"(GDint)
"shape"(GDRID)
}

func("_area_set_shape_disabled") {
returns(GDvoid)
"area"(GDRID)
"shape_idx"(GDint)
"disabled"(GDbool)
}

func("_area_set_shape_transform") {
returns(GDvoid)
"area"(GDRID)
"shape_idx"(GDint)
"transform"(GDTransform2D)
}

func("_area_set_space") {
returns(GDvoid)
"area"(GDRID)
"space"(GDRID)
}

func("_area_set_transform") {
returns(GDvoid)
"area"(GDRID)
"transform"(GDTransform2D)
}

func("_body_add_collision_exception") {
returns(GDvoid)
"body"(GDRID)
"excepted_body"(GDRID)
}

func("_body_add_constant_central_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector2)
}

func("_body_add_constant_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector2)
"position"(GDVector2)
}

func("_body_add_constant_torque") {
returns(GDvoid)
"body"(GDRID)
"torque"(GDfloat)
}

func("_body_add_shape") {
returns(GDvoid)
"body"(GDRID)
"shape"(GDRID)
"transform"(GDTransform2D)
"disabled"(GDbool)
}

func("_body_apply_central_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector2)
}

func("_body_apply_central_impulse") {
returns(GDvoid)
"body"(GDRID)
"impulse"(GDVector2)
}

func("_body_apply_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector2)
"position"(GDVector2)
}

func("_body_apply_impulse") {
returns(GDvoid)
"body"(GDRID)
"impulse"(GDVector2)
"position"(GDVector2)
}

func("_body_apply_torque") {
returns(GDvoid)
"body"(GDRID)
"torque"(GDfloat)
}

func("_body_apply_torque_impulse") {
returns(GDvoid)
"body"(GDRID)
"impulse"(GDfloat)
}

func("_body_attach_canvas_instance_id") {
returns(GDvoid)
"body"(GDRID)
"id"(GDint)
}

func("_body_attach_object_instance_id") {
returns(GDvoid)
"body"(GDRID)
"id"(GDint)
}

func("_body_clear_shapes") {
returns(GDvoid)
"body"(GDRID)
}

func("_body_collide_shape") {
returns(GDbool)
"body"(GDRID)
"body_shape"(GDint)
"shape"(GDRID)
"shape_xform"(GDTransform2D)
"motion"(GDVector2)
"results"(GDUnknownType)
"result_max"(GDint)
"result_count"(GDUnknownType)
}

func("_body_create") {
returns(GDRID)

}

func("_body_get_canvas_instance_id") {
returns(GDint)
"body"(GDRID)
}

func("_body_get_collision_exceptions") {
returns(GDTypedArray(GDRID::class))
"body"(GDRID)
}

func("_body_get_collision_layer") {
returns(GDint)
"body"(GDRID)
}

func("_body_get_collision_mask") {
returns(GDint)
"body"(GDRID)
}

func("_body_get_collision_priority") {
returns(GDfloat)
"body"(GDRID)
}

func("_body_get_constant_force") {
returns(GDVector2)
"body"(GDRID)
}

func("_body_get_constant_torque") {
returns(GDfloat)
"body"(GDRID)
}

func("_body_get_contacts_reported_depth_threshold") {
returns(GDfloat)
"body"(GDRID)
}

func("_body_get_continuous_collision_detection_mode") {
returns(GDCCDMode)
"body"(GDRID)
}

func("_body_get_direct_state") {
returns(GDPhysicsDirectBodyState2D)
"body"(GDRID)
}

func("_body_get_max_contacts_reported") {
returns(GDint)
"body"(GDRID)
}

func("_body_get_mode") {
returns(GDBodyMode)
"body"(GDRID)
}

func("_body_get_object_instance_id") {
returns(GDint)
"body"(GDRID)
}

func("_body_get_param") {
returns(GDVariant)
"body"(GDRID)
"param"(GDBodyParameter)
}

func("_body_get_shape") {
returns(GDRID)
"body"(GDRID)
"shape_idx"(GDint)
}

func("_body_get_shape_count") {
returns(GDint)
"body"(GDRID)
}

func("_body_get_shape_transform") {
returns(GDTransform2D)
"body"(GDRID)
"shape_idx"(GDint)
}

func("_body_get_space") {
returns(GDRID)
"body"(GDRID)
}

func("_body_get_state") {
returns(GDVariant)
"body"(GDRID)
"state"(GDBodyState)
}

func("_body_is_omitting_force_integration") {
returns(GDbool)
"body"(GDRID)
}

func("_body_remove_collision_exception") {
returns(GDvoid)
"body"(GDRID)
"excepted_body"(GDRID)
}

func("_body_remove_shape") {
returns(GDvoid)
"body"(GDRID)
"shape_idx"(GDint)
}

func("_body_reset_mass_properties") {
returns(GDvoid)
"body"(GDRID)
}

func("_body_set_axis_velocity") {
returns(GDvoid)
"body"(GDRID)
"axis_velocity"(GDVector2)
}

func("_body_set_collision_layer") {
returns(GDvoid)
"body"(GDRID)
"layer"(GDint)
}

func("_body_set_collision_mask") {
returns(GDvoid)
"body"(GDRID)
"mask"(GDint)
}

func("_body_set_collision_priority") {
returns(GDvoid)
"body"(GDRID)
"priority"(GDfloat)
}

func("_body_set_constant_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector2)
}

func("_body_set_constant_torque") {
returns(GDvoid)
"body"(GDRID)
"torque"(GDfloat)
}

func("_body_set_contacts_reported_depth_threshold") {
returns(GDvoid)
"body"(GDRID)
"threshold"(GDfloat)
}

func("_body_set_continuous_collision_detection_mode") {
returns(GDvoid)
"body"(GDRID)
"mode"(GDCCDMode)
}

func("_body_set_force_integration_callback") {
returns(GDvoid)
"body"(GDRID)
"callable"(GDCallable)
"userdata"(GDVariant)
}

func("_body_set_max_contacts_reported") {
returns(GDvoid)
"body"(GDRID)
"amount"(GDint)
}

func("_body_set_mode") {
returns(GDvoid)
"body"(GDRID)
"mode"(GDBodyMode)
}

func("_body_set_omit_force_integration") {
returns(GDvoid)
"body"(GDRID)
"enable"(GDbool)
}

func("_body_set_param") {
returns(GDvoid)
"body"(GDRID)
"param"(GDBodyParameter)
"value"(GDVariant)
}

func("_body_set_pickable") {
returns(GDvoid)
"body"(GDRID)
"pickable"(GDbool)
}

func("_body_set_shape") {
returns(GDvoid)
"body"(GDRID)
"shape_idx"(GDint)
"shape"(GDRID)
}

func("_body_set_shape_as_one_way_collision") {
returns(GDvoid)
"body"(GDRID)
"shape_idx"(GDint)
"enable"(GDbool)
"margin"(GDfloat)
}

func("_body_set_shape_disabled") {
returns(GDvoid)
"body"(GDRID)
"shape_idx"(GDint)
"disabled"(GDbool)
}

func("_body_set_shape_transform") {
returns(GDvoid)
"body"(GDRID)
"shape_idx"(GDint)
"transform"(GDTransform2D)
}

func("_body_set_space") {
returns(GDvoid)
"body"(GDRID)
"space"(GDRID)
}

func("_body_set_state") {
returns(GDvoid)
"body"(GDRID)
"state"(GDBodyState)
"value"(GDVariant)
}

func("_body_set_state_sync_callback") {
returns(GDvoid)
"body"(GDRID)
"callable"(GDCallable)
}

func("_body_test_motion") {
returns(GDbool)
"body"(GDRID)
"from"(GDTransform2D)
"motion"(GDVector2)
"margin"(GDfloat)
"collide_separation_ray"(GDbool)
"recovery_as_collision"(GDbool)
"result"(GDUnknownType)
}

func("_capsule_shape_create") {
returns(GDRID)

}

func("_circle_shape_create") {
returns(GDRID)

}

func("_concave_polygon_shape_create") {
returns(GDRID)

}

func("_convex_polygon_shape_create") {
returns(GDRID)

}

func("_damped_spring_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDDampedSpringParam)
}

func("_damped_spring_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDDampedSpringParam)
"value"(GDfloat)
}

func("_end_sync") {
returns(GDvoid)

}

func("_finish") {
returns(GDvoid)

}

func("_flush_queries") {
returns(GDvoid)

}

func("_free_rid") {
returns(GDvoid)
"rid"(GDRID)
}

func("_get_process_info") {
returns(GDint)
"process_info"(GDProcessInfo)
}

func("_init") {
returns(GDvoid)

}

func("_is_flushing_queries") {
returns(GDbool)

}

func("_joint_clear") {
returns(GDvoid)
"joint"(GDRID)
}

func("_joint_create") {
returns(GDRID)

}

func("_joint_disable_collisions_between_bodies") {
returns(GDvoid)
"joint"(GDRID)
"disable"(GDbool)
}

func("_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDJointParam)
}

func("_joint_get_type") {
returns(GDJointType)
"joint"(GDRID)
}

func("_joint_is_disabled_collisions_between_bodies") {
returns(GDbool)
"joint"(GDRID)
}

func("_joint_make_damped_spring") {
returns(GDvoid)
"joint"(GDRID)
"anchor_a"(GDVector2)
"anchor_b"(GDVector2)
"body_a"(GDRID)
"body_b"(GDRID)
}

func("_joint_make_groove") {
returns(GDvoid)
"joint"(GDRID)
"a_groove1"(GDVector2)
"a_groove2"(GDVector2)
"b_anchor"(GDVector2)
"body_a"(GDRID)
"body_b"(GDRID)
}

func("_joint_make_pin") {
returns(GDvoid)
"joint"(GDRID)
"anchor"(GDVector2)
"body_a"(GDRID)
"body_b"(GDRID)
}

func("_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDJointParam)
"value"(GDfloat)
}

func("_pin_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDPinJointParam)
}

func("_pin_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDPinJointParam)
"value"(GDfloat)
}

func("_rectangle_shape_create") {
returns(GDRID)

}

func("_segment_shape_create") {
returns(GDRID)

}

func("_separation_ray_shape_create") {
returns(GDRID)

}

func("_set_active") {
returns(GDvoid)
"active"(GDbool)
}

func("_shape_collide") {
returns(GDbool)
"shape_A"(GDRID)
"xform_A"(GDTransform2D)
"motion_A"(GDVector2)
"shape_B"(GDRID)
"xform_B"(GDTransform2D)
"motion_B"(GDVector2)
"results"(GDUnknownType)
"result_max"(GDint)
"result_count"(GDUnknownType)
}

func("_shape_get_custom_solver_bias") {
returns(GDfloat)
"shape"(GDRID)
}

func("_shape_get_data") {
returns(GDVariant)
"shape"(GDRID)
}

func("_shape_get_type") {
returns(GDShapeType)
"shape"(GDRID)
}

func("_shape_set_custom_solver_bias") {
returns(GDvoid)
"shape"(GDRID)
"bias"(GDfloat)
}

func("_shape_set_data") {
returns(GDvoid)
"shape"(GDRID)
"data"(GDVariant)
}

func("_space_create") {
returns(GDRID)

}

func("_space_get_contact_count") {
returns(GDint)
"space"(GDRID)
}

func("_space_get_contacts") {
returns(GDPackedVector2Array)
"space"(GDRID)
}

func("_space_get_direct_state") {
returns(GDPhysicsDirectSpaceState2D)
"space"(GDRID)
}

func("_space_get_param") {
returns(GDfloat)
"space"(GDRID)
"param"(GDSpaceParameter)
}

func("_space_is_active") {
returns(GDbool)
"space"(GDRID)
}

func("_space_set_active") {
returns(GDvoid)
"space"(GDRID)
"active"(GDbool)
}

func("_space_set_debug_contacts") {
returns(GDvoid)
"space"(GDRID)
"max_contacts"(GDint)
}

func("_space_set_param") {
returns(GDvoid)
"space"(GDRID)
"param"(GDSpaceParameter)
"value"(GDfloat)
}

func("_step") {
returns(GDvoid)
"step"(GDfloat)
}

func("_sync") {
returns(GDvoid)

}

func("_world_boundary_shape_create") {
returns(GDRID)

}

func("body_test_motion_is_excluding_body") {
returns(GDbool)
"body"(GDRID)
}

func("body_test_motion_is_excluding_object") {
returns(GDbool)
"object"(GDint)
}
}){

}