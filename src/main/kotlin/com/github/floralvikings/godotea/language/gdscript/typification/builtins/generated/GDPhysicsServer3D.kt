
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPhysicsServer3D: GDType("PhysicsServer3D", {


constructor { }

func("area_add_shape") {
returns(GDvoid)
"area"(GDRID)
"shape"(GDRID)
"transform"(GDTransform3D)
"disabled"(GDbool)
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
returns(GDTransform3D)
"area"(GDRID)
"shape_idx"(GDint)
}

func("area_get_space") {
returns(GDRID)
"area"(GDRID)
}

func("area_get_transform") {
returns(GDTransform3D)
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

func("area_set_ray_pickable") {
returns(GDvoid)
"area"(GDRID)
"enable"(GDbool)
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
"transform"(GDTransform3D)
}

func("area_set_space") {
returns(GDvoid)
"area"(GDRID)
"space"(GDRID)
}

func("area_set_transform") {
returns(GDvoid)
"area"(GDRID)
"transform"(GDTransform3D)
}

func("body_add_collision_exception") {
returns(GDvoid)
"body"(GDRID)
"excepted_body"(GDRID)
}

func("body_add_constant_central_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector3)
}

func("body_add_constant_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector3)
"position"(GDVector3)
}

func("body_add_constant_torque") {
returns(GDvoid)
"body"(GDRID)
"torque"(GDVector3)
}

func("body_add_shape") {
returns(GDvoid)
"body"(GDRID)
"shape"(GDRID)
"transform"(GDTransform3D)
"disabled"(GDbool)
}

func("body_apply_central_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector3)
}

func("body_apply_central_impulse") {
returns(GDvoid)
"body"(GDRID)
"impulse"(GDVector3)
}

func("body_apply_force") {
returns(GDvoid)
"body"(GDRID)
"force"(GDVector3)
"position"(GDVector3)
}

func("body_apply_impulse") {
returns(GDvoid)
"body"(GDRID)
"impulse"(GDVector3)
"position"(GDVector3)
}

func("body_apply_torque") {
returns(GDvoid)
"body"(GDRID)
"torque"(GDVector3)
}

func("body_apply_torque_impulse") {
returns(GDvoid)
"body"(GDRID)
"impulse"(GDVector3)
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
returns(GDVector3)
"body"(GDRID)
}

func("body_get_constant_torque") {
returns(GDVector3)
"body"(GDRID)
}

func("body_get_direct_state") {
returns(GDPhysicsDirectBodyState3D)
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
returns(GDTransform3D)
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

func("body_is_axis_locked") {
returns(GDbool)
"body"(GDRID)
"axis"(GDBodyAxis)
}

func("body_is_continuous_collision_detection_enabled") {
returns(GDbool)
"body"(GDRID)
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

func("body_set_axis_lock") {
returns(GDvoid)
"body"(GDRID)
"axis"(GDBodyAxis)
"lock"(GDbool)
}

func("body_set_axis_velocity") {
returns(GDvoid)
"body"(GDRID)
"axis_velocity"(GDVector3)
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
"force"(GDVector3)
}

func("body_set_constant_torque") {
returns(GDvoid)
"body"(GDRID)
"torque"(GDVector3)
}

func("body_set_enable_continuous_collision_detection") {
returns(GDvoid)
"body"(GDRID)
"enable"(GDbool)
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

func("body_set_ray_pickable") {
returns(GDvoid)
"body"(GDRID)
"enable"(GDbool)
}

func("body_set_shape") {
returns(GDvoid)
"body"(GDRID)
"shape_idx"(GDint)
"shape"(GDRID)
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
"transform"(GDTransform3D)
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
"parameters"(GDPhysicsTestMotionParameters3D)
"result"(GDPhysicsTestMotionResult3D)
}

func("box_shape_create") {
returns(GDRID)

}

func("capsule_shape_create") {
returns(GDRID)

}

func("concave_polygon_shape_create") {
returns(GDRID)

}

func("cone_twist_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDConeTwistJointParam)
}

func("cone_twist_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDConeTwistJointParam)
"value"(GDfloat)
}

func("convex_polygon_shape_create") {
returns(GDRID)

}

func("custom_shape_create") {
returns(GDRID)

}

func("cylinder_shape_create") {
returns(GDRID)

}

func("free_rid") {
returns(GDvoid)
"rid"(GDRID)
}

func("generic_6dof_joint_get_flag") {
returns(GDbool)
"joint"(GDRID)
"axis"(GDVector3Axis)
"flag"(GDG6DOFJointAxisFlag)
}

func("generic_6dof_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"axis"(GDVector3Axis)
"param"(GDG6DOFJointAxisParam)
}

func("generic_6dof_joint_set_flag") {
returns(GDvoid)
"joint"(GDRID)
"axis"(GDVector3Axis)
"flag"(GDG6DOFJointAxisFlag)
"enable"(GDbool)
}

func("generic_6dof_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"axis"(GDVector3Axis)
"param"(GDG6DOFJointAxisParam)
"value"(GDfloat)
}

func("get_process_info") {
returns(GDint)
"process_info"(GDProcessInfo)
}

func("heightmap_shape_create") {
returns(GDRID)

}

func("hinge_joint_get_flag") {
returns(GDbool)
"joint"(GDRID)
"flag"(GDHingeJointFlag)
}

func("hinge_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDHingeJointParam)
}

func("hinge_joint_set_flag") {
returns(GDvoid)
"joint"(GDRID)
"flag"(GDHingeJointFlag)
"enabled"(GDbool)
}

func("hinge_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDHingeJointParam)
"value"(GDfloat)
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

func("joint_get_solver_priority") {
returns(GDint)
"joint"(GDRID)
}

func("joint_get_type") {
returns(GDJointType)
"joint"(GDRID)
}

func("joint_is_disabled_collisions_between_bodies") {
returns(GDbool)
"joint"(GDRID)
}

func("joint_make_cone_twist") {
returns(GDvoid)
"joint"(GDRID)
"body_A"(GDRID)
"local_ref_A"(GDTransform3D)
"body_B"(GDRID)
"local_ref_B"(GDTransform3D)
}

func("joint_make_generic_6dof") {
returns(GDvoid)
"joint"(GDRID)
"body_A"(GDRID)
"local_ref_A"(GDTransform3D)
"body_B"(GDRID)
"local_ref_B"(GDTransform3D)
}

func("joint_make_hinge") {
returns(GDvoid)
"joint"(GDRID)
"body_A"(GDRID)
"hinge_A"(GDTransform3D)
"body_B"(GDRID)
"hinge_B"(GDTransform3D)
}

func("joint_make_pin") {
returns(GDvoid)
"joint"(GDRID)
"body_A"(GDRID)
"local_A"(GDVector3)
"body_B"(GDRID)
"local_B"(GDVector3)
}

func("joint_make_slider") {
returns(GDvoid)
"joint"(GDRID)
"body_A"(GDRID)
"local_ref_A"(GDTransform3D)
"body_B"(GDRID)
"local_ref_B"(GDTransform3D)
}

func("joint_set_solver_priority") {
returns(GDvoid)
"joint"(GDRID)
"priority"(GDint)
}

func("pin_joint_get_local_a") {
returns(GDVector3)
"joint"(GDRID)
}

func("pin_joint_get_local_b") {
returns(GDVector3)
"joint"(GDRID)
}

func("pin_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDPinJointParam)
}

func("pin_joint_set_local_a") {
returns(GDvoid)
"joint"(GDRID)
"local_A"(GDVector3)
}

func("pin_joint_set_local_b") {
returns(GDvoid)
"joint"(GDRID)
"local_B"(GDVector3)
}

func("pin_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDPinJointParam)
"value"(GDfloat)
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

func("slider_joint_get_param") {
returns(GDfloat)
"joint"(GDRID)
"param"(GDSliderJointParam)
}

func("slider_joint_set_param") {
returns(GDvoid)
"joint"(GDRID)
"param"(GDSliderJointParam)
"value"(GDfloat)
}

func("soft_body_get_bounds") {
returns(GDAABB)
"body"(GDRID)
}

func("space_create") {
returns(GDRID)

}

func("space_get_direct_state") {
returns(GDPhysicsDirectSpaceState3D)
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

func("sphere_shape_create") {
returns(GDRID)

}

func("world_boundary_shape_create") {
returns(GDRID)

}
}){

}