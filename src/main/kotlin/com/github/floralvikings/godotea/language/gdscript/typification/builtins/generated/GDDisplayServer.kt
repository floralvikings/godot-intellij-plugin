
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDDisplayServer: GDType("DisplayServer", {


constructor { }

func("clipboard_get") {
returns(GDString)

}

func("clipboard_get_primary") {
returns(GDString)

}

func("clipboard_has") {
returns(GDbool)

}

func("clipboard_set") {
returns(GDvoid)
"clipboard"(GDString)
}

func("clipboard_set_primary") {
returns(GDvoid)
"clipboard_primary"(GDString)
}

func("cursor_get_shape") {
returns(GDCursorShape)

}

func("cursor_set_custom_image") {
returns(GDvoid)
"cursor"(GDResource)
"shape"(GDCursorShape)
"hotspot"(GDVector2)
}

func("cursor_set_shape") {
returns(GDvoid)
"shape"(GDCursorShape)
}

func("dialog_input_text") {
returns(GDError)
"title"(GDString)
"description"(GDString)
"existing_text"(GDString)
"callback"(GDCallable)
}

func("dialog_show") {
returns(GDError)
"title"(GDString)
"description"(GDString)
"buttons"(GDPackedStringArray)
"callback"(GDCallable)
}

func("enable_for_stealing_focus") {
returns(GDvoid)
"process_id"(GDint)
}

func("force_process_and_drop_events") {
returns(GDvoid)

}

func("get_accent_color") {
returns(GDColor)

}

func("get_display_cutouts") {
returns(GDTypedArray(GDRect2::class))

}

func("get_display_safe_area") {
returns(GDRect2i)

}

func("get_keyboard_focus_screen") {
returns(GDint)

}

func("get_name") {
returns(GDString)

}

func("get_primary_screen") {
returns(GDint)

}

func("get_screen_count") {
returns(GDint)

}

func("get_screen_from_rect") {
returns(GDint)
"rect"(GDRect2)
}

func("get_swap_cancel_ok") {
returns(GDbool)

}

func("get_window_at_screen_position") {
returns(GDint)
"position"(GDVector2i)
}

func("get_window_list") {
returns(GDPackedInt32Array)

}

func("global_menu_add_check_item") {
returns(GDint)
"menu_root"(GDString)
"label"(GDString)
"callback"(GDCallable)
"key_callback"(GDCallable)
"tag"(GDVariant)
"accelerator"(GDKey)
"index"(GDint)
}

func("global_menu_add_icon_check_item") {
returns(GDint)
"menu_root"(GDString)
"icon"(GDTexture2D)
"label"(GDString)
"callback"(GDCallable)
"key_callback"(GDCallable)
"tag"(GDVariant)
"accelerator"(GDKey)
"index"(GDint)
}

func("global_menu_add_icon_item") {
returns(GDint)
"menu_root"(GDString)
"icon"(GDTexture2D)
"label"(GDString)
"callback"(GDCallable)
"key_callback"(GDCallable)
"tag"(GDVariant)
"accelerator"(GDKey)
"index"(GDint)
}

func("global_menu_add_icon_radio_check_item") {
returns(GDint)
"menu_root"(GDString)
"icon"(GDTexture2D)
"label"(GDString)
"callback"(GDCallable)
"key_callback"(GDCallable)
"tag"(GDVariant)
"accelerator"(GDKey)
"index"(GDint)
}

func("global_menu_add_item") {
returns(GDint)
"menu_root"(GDString)
"label"(GDString)
"callback"(GDCallable)
"key_callback"(GDCallable)
"tag"(GDVariant)
"accelerator"(GDKey)
"index"(GDint)
}

func("global_menu_add_multistate_item") {
returns(GDint)
"menu_root"(GDString)
"label"(GDString)
"max_states"(GDint)
"default_state"(GDint)
"callback"(GDCallable)
"key_callback"(GDCallable)
"tag"(GDVariant)
"accelerator"(GDKey)
"index"(GDint)
}

func("global_menu_add_radio_check_item") {
returns(GDint)
"menu_root"(GDString)
"label"(GDString)
"callback"(GDCallable)
"key_callback"(GDCallable)
"tag"(GDVariant)
"accelerator"(GDKey)
"index"(GDint)
}

func("global_menu_add_separator") {
returns(GDint)
"menu_root"(GDString)
"index"(GDint)
}

func("global_menu_add_submenu_item") {
returns(GDint)
"menu_root"(GDString)
"label"(GDString)
"submenu"(GDString)
"index"(GDint)
}

func("global_menu_clear") {
returns(GDvoid)
"menu_root"(GDString)
}

func("global_menu_get_item_accelerator") {
returns(GDKey)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_get_item_callback") {
returns(GDCallable)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_get_item_count") {
returns(GDint)
"menu_root"(GDString)
}

func("global_menu_get_item_icon") {
returns(GDTexture2D)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_get_item_indentation_level") {
returns(GDint)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_get_item_index_from_tag") {
returns(GDint)
"menu_root"(GDString)
"tag"(GDVariant)
}

func("global_menu_get_item_index_from_text") {
returns(GDint)
"menu_root"(GDString)
"text"(GDString)
}

func("global_menu_get_item_key_callback") {
returns(GDCallable)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_get_item_max_states") {
returns(GDint)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_get_item_state") {
returns(GDint)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_get_item_submenu") {
returns(GDString)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_get_item_tag") {
returns(GDVariant)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_get_item_text") {
returns(GDString)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_get_item_tooltip") {
returns(GDString)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_is_item_checkable") {
returns(GDbool)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_is_item_checked") {
returns(GDbool)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_is_item_disabled") {
returns(GDbool)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_is_item_radio_checkable") {
returns(GDbool)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_remove_item") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
}

func("global_menu_set_item_accelerator") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"keycode"(GDKey)
}

func("global_menu_set_item_callback") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"callback"(GDCallable)
}

func("global_menu_set_item_checkable") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"checkable"(GDbool)
}

func("global_menu_set_item_checked") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"checked"(GDbool)
}

func("global_menu_set_item_disabled") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"disabled"(GDbool)
}

func("global_menu_set_item_icon") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"icon"(GDTexture2D)
}

func("global_menu_set_item_indentation_level") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"level"(GDint)
}

func("global_menu_set_item_key_callback") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"key_callback"(GDCallable)
}

func("global_menu_set_item_max_states") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"max_states"(GDint)
}

func("global_menu_set_item_radio_checkable") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"checkable"(GDbool)
}

func("global_menu_set_item_state") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"state"(GDint)
}

func("global_menu_set_item_submenu") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"submenu"(GDString)
}

func("global_menu_set_item_tag") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"tag"(GDVariant)
}

func("global_menu_set_item_text") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"text"(GDString)
}

func("global_menu_set_item_tooltip") {
returns(GDvoid)
"menu_root"(GDString)
"idx"(GDint)
"tooltip"(GDString)
}

func("has_feature") {
returns(GDbool)
"feature"(GDFeature)
}

func("ime_get_selection") {
returns(GDVector2i)

}

func("ime_get_text") {
returns(GDString)

}

func("is_dark_mode") {
returns(GDbool)

}

func("is_dark_mode_supported") {
returns(GDbool)

}

func("is_touchscreen_available") {
returns(GDbool)

}

func("keyboard_get_current_layout") {
returns(GDint)

}

func("keyboard_get_keycode_from_physical") {
returns(GDKey)
"keycode"(GDKey)
}

func("keyboard_get_layout_count") {
returns(GDint)

}

func("keyboard_get_layout_language") {
returns(GDString)
"index"(GDint)
}

func("keyboard_get_layout_name") {
returns(GDString)
"index"(GDint)
}

func("keyboard_set_current_layout") {
returns(GDvoid)
"index"(GDint)
}

func("mouse_get_button_state") {
returns(GDUnknownType)

}

func("mouse_get_mode") {
returns(GDMouseMode)

}

func("mouse_get_position") {
returns(GDVector2i)

}

func("mouse_set_mode") {
returns(GDvoid)
"mouse_mode"(GDMouseMode)
}

func("process_events") {
returns(GDvoid)

}

func("screen_get_dpi") {
returns(GDint)
"screen"(GDint)
}

func("screen_get_image") {
returns(GDImage)
"screen"(GDint)
}

func("screen_get_max_scale") {
returns(GDfloat)

}

func("screen_get_orientation") {
returns(GDScreenOrientation)
"screen"(GDint)
}

func("screen_get_pixel") {
returns(GDColor)
"position"(GDVector2i)
}

func("screen_get_position") {
returns(GDVector2i)
"screen"(GDint)
}

func("screen_get_refresh_rate") {
returns(GDfloat)
"screen"(GDint)
}

func("screen_get_scale") {
returns(GDfloat)
"screen"(GDint)
}

func("screen_get_size") {
returns(GDVector2i)
"screen"(GDint)
}

func("screen_get_usable_rect") {
returns(GDRect2i)
"screen"(GDint)
}

func("screen_is_kept_on") {
returns(GDbool)

}

func("screen_set_keep_on") {
returns(GDvoid)
"enable"(GDbool)
}

func("screen_set_orientation") {
returns(GDvoid)
"orientation"(GDScreenOrientation)
"screen"(GDint)
}

func("set_icon") {
returns(GDvoid)
"image"(GDImage)
}

func("set_native_icon") {
returns(GDvoid)
"filename"(GDString)
}

func("tablet_get_current_driver") {
returns(GDString)

}

func("tablet_get_driver_count") {
returns(GDint)

}

func("tablet_get_driver_name") {
returns(GDString)
"idx"(GDint)
}

func("tablet_set_current_driver") {
returns(GDvoid)
"name"(GDString)
}

func("tts_get_voices") {
returns(GDTypedArray(GDDictionary::class))

}

func("tts_get_voices_for_language") {
returns(GDPackedStringArray)
"language"(GDString)
}

func("tts_is_paused") {
returns(GDbool)

}

func("tts_is_speaking") {
returns(GDbool)

}

func("tts_pause") {
returns(GDvoid)

}

func("tts_resume") {
returns(GDvoid)

}

func("tts_set_utterance_callback") {
returns(GDvoid)
"event"(GDTTSUtteranceEvent)
"callable"(GDCallable)
}

func("tts_speak") {
returns(GDvoid)
"text"(GDString)
"voice"(GDString)
"volume"(GDint)
"pitch"(GDfloat)
"rate"(GDfloat)
"utterance_id"(GDint)
"interrupt"(GDbool)
}

func("tts_stop") {
returns(GDvoid)

}

func("virtual_keyboard_get_height") {
returns(GDint)

}

func("virtual_keyboard_hide") {
returns(GDvoid)

}

func("virtual_keyboard_show") {
returns(GDvoid)
"existing_text"(GDString)
"position"(GDRect2)
"type"(GDVirtualKeyboardType)
"max_length"(GDint)
"cursor_start"(GDint)
"cursor_end"(GDint)
}

func("warp_mouse") {
returns(GDvoid)
"position"(GDVector2i)
}

func("window_can_draw") {
returns(GDbool)
"window_id"(GDint)
}

func("window_get_active_popup") {
returns(GDint)

}

func("window_get_attached_instance_id") {
returns(GDint)
"window_id"(GDint)
}

func("window_get_current_screen") {
returns(GDint)
"window_id"(GDint)
}

func("window_get_flag") {
returns(GDbool)
"flag"(GDWindowFlags)
"window_id"(GDint)
}

func("window_get_max_size") {
returns(GDVector2i)
"window_id"(GDint)
}

func("window_get_min_size") {
returns(GDVector2i)
"window_id"(GDint)
}

func("window_get_mode") {
returns(GDWindowMode)
"window_id"(GDint)
}

func("window_get_native_handle") {
returns(GDint)
"handle_type"(GDHandleType)
"window_id"(GDint)
}

func("window_get_popup_safe_rect") {
returns(GDRect2i)
"window"(GDint)
}

func("window_get_position") {
returns(GDVector2i)
"window_id"(GDint)
}

func("window_get_position_with_decorations") {
returns(GDVector2i)
"window_id"(GDint)
}

func("window_get_safe_title_margins") {
returns(GDVector3i)
"window_id"(GDint)
}

func("window_get_size") {
returns(GDVector2i)
"window_id"(GDint)
}

func("window_get_size_with_decorations") {
returns(GDVector2i)
"window_id"(GDint)
}

func("window_get_vsync_mode") {
returns(GDVSyncMode)
"window_id"(GDint)
}

func("window_is_focused") {
returns(GDbool)
"window_id"(GDint)
}

func("window_is_maximize_allowed") {
returns(GDbool)
"window_id"(GDint)
}

func("window_maximize_on_title_dbl_click") {
returns(GDbool)

}

func("window_minimize_on_title_dbl_click") {
returns(GDbool)

}

func("window_move_to_foreground") {
returns(GDvoid)
"window_id"(GDint)
}

func("window_request_attention") {
returns(GDvoid)
"window_id"(GDint)
}

func("window_set_current_screen") {
returns(GDvoid)
"screen"(GDint)
"window_id"(GDint)
}

func("window_set_drop_files_callback") {
returns(GDvoid)
"callback"(GDCallable)
"window_id"(GDint)
}

func("window_set_exclusive") {
returns(GDvoid)
"window_id"(GDint)
"exclusive"(GDbool)
}

func("window_set_flag") {
returns(GDvoid)
"flag"(GDWindowFlags)
"enabled"(GDbool)
"window_id"(GDint)
}

func("window_set_ime_active") {
returns(GDvoid)
"active"(GDbool)
"window_id"(GDint)
}

func("window_set_ime_position") {
returns(GDvoid)
"position"(GDVector2i)
"window_id"(GDint)
}

func("window_set_input_event_callback") {
returns(GDvoid)
"callback"(GDCallable)
"window_id"(GDint)
}

func("window_set_input_text_callback") {
returns(GDvoid)
"callback"(GDCallable)
"window_id"(GDint)
}

func("window_set_max_size") {
returns(GDvoid)
"max_size"(GDVector2i)
"window_id"(GDint)
}

func("window_set_min_size") {
returns(GDvoid)
"min_size"(GDVector2i)
"window_id"(GDint)
}

func("window_set_mode") {
returns(GDvoid)
"mode"(GDWindowMode)
"window_id"(GDint)
}

func("window_set_mouse_passthrough") {
returns(GDvoid)
"region"(GDPackedVector2Array)
"window_id"(GDint)
}

func("window_set_popup_safe_rect") {
returns(GDvoid)
"window"(GDint)
"rect"(GDRect2i)
}

func("window_set_position") {
returns(GDvoid)
"position"(GDVector2i)
"window_id"(GDint)
}

func("window_set_rect_changed_callback") {
returns(GDvoid)
"callback"(GDCallable)
"window_id"(GDint)
}

func("window_set_size") {
returns(GDvoid)
"size"(GDVector2i)
"window_id"(GDint)
}

func("window_set_title") {
returns(GDvoid)
"title"(GDString)
"window_id"(GDint)
}

func("window_set_transient") {
returns(GDvoid)
"window_id"(GDint)
"parent_window_id"(GDint)
}

func("window_set_vsync_mode") {
returns(GDvoid)
"vsync_mode"(GDVSyncMode)
"window_id"(GDint)
}

func("window_set_window_buttons_offset") {
returns(GDvoid)
"offset"(GDVector2i)
"window_id"(GDint)
}

func("window_set_window_event_callback") {
returns(GDvoid)
"callback"(GDCallable)
"window_id"(GDint)
}
}){

}