
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDInput: GDType("Input", {

"mouse_mode"(GDMouseMode)
"use_accumulated_input"(GDbool)
constructor { }

func("action_press") {
returns(GDvoid)
"action"(GDStringName)
"strength"(GDfloat)
}

func("action_release") {
returns(GDvoid)
"action"(GDStringName)
}

func("add_joy_mapping") {
returns(GDvoid)
"mapping"(GDString)
"update_existing"(GDbool)
}

func("flush_buffered_events") {
returns(GDvoid)

}

func("get_accelerometer") {
returns(GDVector3)

}

func("get_action_raw_strength") {
returns(GDfloat)
"action"(GDStringName)
"exact_match"(GDbool)
}

func("get_action_strength") {
returns(GDfloat)
"action"(GDStringName)
"exact_match"(GDbool)
}

func("get_axis") {
returns(GDfloat)
"negative_action"(GDStringName)
"positive_action"(GDStringName)
}

func("get_connected_joypads") {
returns(GDTypedArray(GDint::class))

}

func("get_current_cursor_shape") {
returns(GDCursorShape)

}

func("get_gravity") {
returns(GDVector3)

}

func("get_gyroscope") {
returns(GDVector3)

}

func("get_joy_axis") {
returns(GDfloat)
"device"(GDint)
"axis"(GDJoyAxis)
}

func("get_joy_guid") {
returns(GDString)
"device"(GDint)
}

func("get_joy_name") {
returns(GDString)
"device"(GDint)
}

func("get_joy_vibration_duration") {
returns(GDfloat)
"device"(GDint)
}

func("get_joy_vibration_strength") {
returns(GDVector2)
"device"(GDint)
}

func("get_last_mouse_velocity") {
returns(GDVector2)

}

func("get_magnetometer") {
returns(GDVector3)

}

func("get_mouse_button_mask") {
returns(GDUnknownType)

}

func("get_vector") {
returns(GDVector2)
"negative_x"(GDStringName)
"positive_x"(GDStringName)
"negative_y"(GDStringName)
"positive_y"(GDStringName)
"deadzone"(GDfloat)
}

func("is_action_just_pressed") {
returns(GDbool)
"action"(GDStringName)
"exact_match"(GDbool)
}

func("is_action_just_released") {
returns(GDbool)
"action"(GDStringName)
"exact_match"(GDbool)
}

func("is_action_pressed") {
returns(GDbool)
"action"(GDStringName)
"exact_match"(GDbool)
}

func("is_anything_pressed") {
returns(GDbool)

}

func("is_joy_button_pressed") {
returns(GDbool)
"device"(GDint)
"button"(GDJoyButton)
}

func("is_joy_known") {
returns(GDbool)
"device"(GDint)
}

func("is_key_label_pressed") {
returns(GDbool)
"keycode"(GDKey)
}

func("is_key_pressed") {
returns(GDbool)
"keycode"(GDKey)
}

func("is_mouse_button_pressed") {
returns(GDbool)
"button"(GDMouseButton)
}

func("is_physical_key_pressed") {
returns(GDbool)
"keycode"(GDKey)
}

func("parse_input_event") {
returns(GDvoid)
"event"(GDInputEvent)
}

func("remove_joy_mapping") {
returns(GDvoid)
"guid"(GDString)
}

func("set_accelerometer") {
returns(GDvoid)
"value"(GDVector3)
}

func("set_custom_mouse_cursor") {
returns(GDvoid)
"image"(GDResource)
"shape"(GDCursorShape)
"hotspot"(GDVector2)
}

func("set_default_cursor_shape") {
returns(GDvoid)
"shape"(GDCursorShape)
}

func("set_gravity") {
returns(GDvoid)
"value"(GDVector3)
}

func("set_gyroscope") {
returns(GDvoid)
"value"(GDVector3)
}

func("set_magnetometer") {
returns(GDvoid)
"value"(GDVector3)
}

func("start_joy_vibration") {
returns(GDvoid)
"device"(GDint)
"weak_magnitude"(GDfloat)
"strong_magnitude"(GDfloat)
"duration"(GDfloat)
}

func("stop_joy_vibration") {
returns(GDvoid)
"device"(GDint)
}

func("vibrate_handheld") {
returns(GDvoid)
"duration_ms"(GDint)
}

func("warp_mouse") {
returns(GDvoid)
"position"(GDVector2)
}
}){

}