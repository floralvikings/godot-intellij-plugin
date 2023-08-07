
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsServer3DExtension: GDType("PhysicsServer3DExtension", {


constructor { }

func("_area_add_shape") {
returns(GDvoid)
"area"(GDRID)
"shape"(GDRID)
"transform"(GDTransform3D)
"disabled"(GDbool)
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
returns(GDTransform3D)
"area"(GDRID)
"shape_idx"(GDint)
}

func("_area_get_space") {
returns(GDRID)
"area"(GDRID)
}

func("_area_get_transform") {
returns(GDTransform3D)
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

func("_area_set_ray_pickable") {
returns(GDvoid)
"area"(GDRID)
"enable"(GDbool)
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
"transform"(GDTransform3D)
}

func("_area_set_space") {
returns(GDvoid)
"area"(GDRID)
"space"(GDRID)
}

func("_area_set_transform") {
returns(GDvoid)
"area"(GDRID)
"transform"(GDTransform3D)
}

func("_body_add_collision_exception") {
returns(GDvoid)
"body"(GDRID)
"excepted_body"(GDRID)
}

func("_body_add_constant_central_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector3)
}

func("_body_add_constant_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector3)
"position"(GDVector3)
}

func("_body_add_constant_torque") {
returns(GDvoid)
"body"(GDRID)
"torque"(GDVector3)
}

func("_body_add_shape") {
returns(GDvoid)
"body"(GDRID)
"shape"(GDRID)
"transform"(GDTransform3D)
"disabled"(GDbool)
}

func("_body_apply_central_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector3)
}

func("_body_apply_central_impulse") {
returns(GDvoid)
"body"(GDRID)
"impulse"(GDVector3)
}

func("_body_apply_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector3)
"position"(GDVector3)
}

func("_body_apply_impulse") {
returns(GDvoid)
"body"(GDRID)
"impulse"(GDVector3)
"position"(GDVector3)
}

func("_body_apply_torque") {
returns(GDvoid)
"body"(GDRID)
"torque"(GDVector3)
}

func("_body_apply_torque_impulse") {
returns(GDvoid)
"body"(GDRID)
"impulse"(GDVector3)
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

func("_body_create") {
returns(GDRID)

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
returns(GDVector3)
"body"(GDRID)
}

func("_body_get_constant_torque") {
returns(GDVector3)
"body"(GDRID)
}

func("_body_get_contacts_reported_depth_threshold") {
returns(GDfloat)
"body"(GDRID)
}

func("_body_get_direct_state") {
returns(GDPhysicsDirectBodyState3D)
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
returns(GDTransform3D)
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

func("_body_get_user_flags") {
returns(GDint)
"body"(GDRID)
}

func("_body_is_axis_locked") {
returns(GDbool)
"body"(GDRID)
"axis"(GDBodyAxis)
}

func("_body_is_continuous_collision_detection_enabled") {
returns(GDbool)
"body"(GDRID)
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

func("_body_set_axis_lock") {
returns(GDvoid)
"body"(GDRID)
"axis"(GDBodyAxis)
"lock"(GDbool)
}

func("_body_set_axis_velocity") {
returns(GDvoid)
"body"(GDRID)
"axis_velocity"(GDVector3)
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
"force"(GDVector3)
}

func("_body_set_constant_torque") {
returns(GDvoid)
"body"(GDRID)
"torque"(GDVector3)
}

func("_body_set_contacts_reported_depth_threshold") {
returns(GDvoid)
"body"(GDRID)
"threshold"(GDfloat)
}

func("_body_set_enable_continuous_collision_detection") {
returns(GDvoid)
"body"(GDRID)
"enable"(GDbool)
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

func("_body_set_ray_pickable") {
returns(GDvoid)
"body"(GDRID)
"enable"(GDbool)
}

func("_body_set_shape") {
returns(GDvoid)
"body"(GDRID)
"shape_idx"(GDint)
"shape"(GDRID)
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
"transform"(GDTransform3D)
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

func("_body_set_user_flags") {
returns(GDvoid)
"body"(GDRID)
"flags"(GDint)
}

func("_body_test_motion") {
returns(GDbool)
"body"(GDRID)
"from"(GDTransform3D)
"motion"(GDVector3)
"margin"(GDfloat)
"max_collisions"(GDint)
"collide_separation_ray"(GDbool)
"recovery_as_collision"(GDbool)
"result"(GDUnknownType)
}

func("_box_shape_create") {
returns(GDRID)

}

func("_capsule_shape_create") {
returns(GDRID)

}

func("_concave_polygon_shape_create") {
returns(GDRID)

}

func("_cone_twist_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDConeTwistJointParam)
}

func("_cone_twist_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDConeTwistJointParam)
"value"(GDfloat)
}

func("_convex_polygon_shape_create") {
returns(GDRID)

}

func("_custom_shape_create") {
returns(GDRID)

}

func("_cylinder_shape_create") {
returns(GDRID)

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

func("_generic_6dof_joint_get_flag") {
returns(GDbool)
"joint"(GDRID)
"axis"(GDVector3Axis)
"flag"(GDG6DOFJointAxisFlag)
}

func("_generic_6dof_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"axis"(GDVector3Axis)
"param"(GDG6DOFJointAxisParam)
}

func("_generic_6dof_joint_set_flag") {
returns(GDvoid)
"joint"(GDRID)
"axis"(GDVector3Axis)
"flag"(GDG6DOFJointAxisFlag)
"enable"(GDbool)
}

func("_generic_6dof_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"axis"(GDVector3Axis)
"param"(GDG6DOFJointAxisParam)
"value"(GDfloat)
}

func("_get_process_info") {
returns(GDint)
"process_info"(GDProcessInfo)
}

func("_heightmap_shape_create") {
returns(GDRID)

}

func("_hinge_joint_get_flag") {
returns(GDbool)
"joint"(GDRID)
"flag"(GDHingeJointFlag)
}

func("_hinge_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDHingeJointParam)
}

func("_hinge_joint_set_flag") {
returns(GDvoid)
"joint"(GDRID)
"flag"(GDHingeJointFlag)
"enabled"(GDbool)
}

func("_hinge_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDHingeJointParam)
"value"(GDfloat)
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

func("_joint_get_solver_priority") {
returns(GDint)
"joint"(GDRID)
}

func("_joint_get_type") {
returns(GDJointType)
"joint"(GDRID)
}

func("_joint_is_disabled_collisions_between_bodies") {
returns(GDbool)
"joint"(GDRID)
}

func("_joint_make_cone_twist") {
returns(GDvoid)
"joint"(GDRID)
"body_A"(GDRID)
"local_ref_A"(GDTransform3D)
"body_B"(GDRID)
"local_ref_B"(GDTransform3D)
}

func("_joint_make_generic_6dof") {
returns(GDvoid)
"joint"(GDRID)
"body_A"(GDRID)
"local_ref_A"(GDTransform3D)
"body_B"(GDRID)
"local_ref_B"(GDTransform3D)
}

func("_joint_make_hinge") {
returns(GDvoid)
"joint"(GDRID)
"body_A"(GDRID)
"hinge_A"(GDTransform3D)
"body_B"(GDRID)
"hinge_B"(GDTransform3D)
}

func("_joint_make_hinge_simple") {
returns(GDvoid)
"joint"(GDRID)
"body_A"(GDRID)
"pivot_A"(GDVector3)
"axis_A"(GDVector3)
"body_B"(GDRID)
"pivot_B"(GDVector3)
"axis_B"(GDVector3)
}

func("_joint_make_pin") {
returns(GDvoid)
"joint"(GDRID)
"body_A"(GDRID)
"local_A"(GDVector3)
"body_B"(GDRID)
"local_B"(GDVector3)
}

func("_joint_make_slider") {
returns(GDvoid)
"joint"(GDRID)
"body_A"(GDRID)
"local_ref_A"(GDTransform3D)
"body_B"(GDRID)
"local_ref_B"(GDTransform3D)
}

func("_joint_set_solver_priority") {
returns(GDvoid)
"joint"(GDRID)
"priority"(GDint)
}

func("_pin_joint_get_local_a") {
returns(GDVector3)
"joint"(GDRID)
}

func("_pin_joint_get_local_b") {
returns(GDVector3)
"joint"(GDRID)
}

func("_pin_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDPinJointParam)
}

func("_pin_joint_set_local_a") {
returns(GDvoid)
"joint"(GDRID)
"local_A"(GDVector3)
}

func("_pin_joint_set_local_b") {
returns(GDvoid)
"joint"(GDRID)
"local_B"(GDVector3)
}

func("_pin_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDPinJointParam)
"value"(GDfloat)
}

func("_separation_ray_shape_create") {
returns(GDRID)

}

func("_set_active") {
returns(GDvoid)
"active"(GDbool)
}

func("_shape_get_custom_solver_bias") {
returns(GDfloat)
"shape"(GDRID)
}

func("_shape_get_data") {
returns(GDVariant)
"shape"(GDRID)
}

func("_shape_get_margin") {
returns(GDfloat)
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

func("_shape_set_margin") {
returns(GDvoid)
"shape"(GDRID)
"margin"(GDfloat)
}

func("_slider_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDSliderJointParam)
}

func("_slider_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDSliderJointParam)
"value"(GDfloat)
}

func("_soft_body_add_collision_exception") {
returns(GDvoid)
"body"(GDRID)
"body_b"(GDRID)
}

func("_soft_body_create") {
returns(GDRID)

}

func("_soft_body_get_bounds") {
returns(GDAABB)
"body"(GDRID)
}

func("_soft_body_get_collision_exceptions") {
returns(GDTypedArray(GDRID::class))
"body"(GDRID)
}

func("_soft_body_get_collision_layer") {
returns(GDint)
"body"(GDRID)
}

func("_soft_body_get_collision_mask") {
returns(GDint)
"body"(GDRID)
}

func("_soft_body_get_damping_coefficient") {
returns(GDfloat)
"body"(GDRID)
}

func("_soft_body_get_drag_coefficient") {
returns(GDfloat)
"body"(GDRID)
}

func("_soft_body_get_linear_stiffness") {
returns(GDfloat)
"body"(GDRID)
}

func("_soft_body_get_point_global_position") {
returns(GDVector3)
"body"(GDRID)
"point_index"(GDint)
}

func("_soft_body_get_pressure_coefficient") {
returns(GDfloat)
"body"(GDRID)
}

func("_soft_body_get_simulation_precision") {
returns(GDint)
"body"(GDRID)
}

func("_soft_body_get_space") {
returns(GDRID)
"body"(GDRID)
}

func("_soft_body_get_state") {
returns(GDVariant)
"body"(GDRID)
"state"(GDBodyState)
}

func("_soft_body_get_total_mass") {
returns(GDfloat)
"body"(GDRID)
}

func("_soft_body_is_point_pinned") {
returns(GDbool)
"body"(GDRID)
"point_index"(GDint)
}

func("_soft_body_move_point") {
returns(GDvoid)
"body"(GDRID)
"point_index"(GDint)
"global_position"(GDVector3)
}

func("_soft_body_pin_point") {
returns(GDvoid)
"body"(GDRID)
"point_index"(GDint)
"pin"(GDbool)
}

func("_soft_body_remove_all_pinned_points") {
returns(GDvoid)
"body"(GDRID)
}

func("_soft_body_remove_collision_exception") {
returns(GDvoid)
"body"(GDRID)
"body_b"(GDRID)
}

func("_soft_body_set_collision_layer") {
returns(GDvoid)
"body"(GDRID)
"layer"(GDint)
}

func("_soft_body_set_collision_mask") {
returns(GDvoid)
"body"(GDRID)
"mask"(GDint)
}

func("_soft_body_set_damping_coefficient") {
returns(GDvoid)
"body"(GDRID)
"damping_coefficient"(GDfloat)
}

func("_soft_body_set_drag_coefficient") {
returns(GDvoid)
"body"(GDRID)
"drag_coefficient"(GDfloat)
}

func("_soft_body_set_linear_stiffness") {
returns(GDvoid)
"body"(GDRID)
"linear_stiffness"(GDfloat)
}

func("_soft_body_set_mesh") {
returns(GDvoid)
"body"(GDRID)
"mesh"(GDRID)
}

func("_soft_body_set_pressure_coefficient") {
returns(GDvoid)
"body"(GDRID)
"pressure_coefficient"(GDfloat)
}

func("_soft_body_set_ray_pickable") {
returns(GDvoid)
"body"(GDRID)
"enable"(GDbool)
}

func("_soft_body_set_simulation_precision") {
returns(GDvoid)
"body"(GDRID)
"simulation_precision"(GDint)
}

func("_soft_body_set_space") {
returns(GDvoid)
"body"(GDRID)
"space"(GDRID)
}

func("_soft_body_set_state") {
returns(GDvoid)
"body"(GDRID)
"state"(GDBodyState)
"variant"(GDVariant)
}

func("_soft_body_set_total_mass") {
returns(GDvoid)
"body"(GDRID)
"total_mass"(GDfloat)
}

func("_soft_body_set_transform") {
returns(GDvoid)
"body"(GDRID)
"transform"(GDTransform3D)
}

func("_soft_body_update_rendering_server") {
returns(GDvoid)
"body"(GDRID)
"rendering_server_handler"(GDPhysicsServer3DRenderingServerHandler)
}

func("_space_create") {
returns(GDRID)

}

func("_space_get_contact_count") {
returns(GDint)
"space"(GDRID)
}

func("_space_get_contacts") {
returns(GDPackedVector3Array)
"space"(GDRID)
}

func("_space_get_direct_state") {
returns(GDPhysicsDirectSpaceState3D)
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

func("_sphere_shape_create") {
returns(GDRID)

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