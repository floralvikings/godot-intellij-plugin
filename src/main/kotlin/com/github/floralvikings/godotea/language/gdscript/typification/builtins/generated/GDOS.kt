
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDOS: GDType("OS", {

"delta_smoothing"(GDbool)
"low_processor_usage_mode"(GDbool)
"low_processor_usage_mode_sleep_usec"(GDint)
constructor { }

func("alert") {
returns(GDvoid)
"text"(GDString)
"title"(GDString)
}

func("close_midi_inputs") {
returns(GDvoid)

}

func("crash") {
returns(GDvoid)
"message"(GDString)
}

func("create_instance") {
returns(GDint)
"arguments"(GDPackedStringArray)
}

func("create_process") {
returns(GDint)
"path"(GDString)
"arguments"(GDPackedStringArray)
"open_console"(GDbool)
}

func("delay_msec") {
returns(GDvoid)
"msec"(GDint)
}

func("delay_usec") {
returns(GDvoid)
"usec"(GDint)
}

func("execute") {
returns(GDint)
"path"(GDString)
"arguments"(GDPackedStringArray)
"output"(GDArray)
"read_stderr"(GDbool)
"open_console"(GDbool)
}

func("find_keycode_from_string") {
returns(GDKey)
"string"(GDString)
}

func("get_cache_dir") {
returns(GDString)

}

func("get_cmdline_args") {
returns(GDPackedStringArray)

}

func("get_cmdline_user_args") {
returns(GDPackedStringArray)

}

func("get_config_dir") {
returns(GDString)

}

func("get_connected_midi_inputs") {
returns(GDPackedStringArray)

}

func("get_data_dir") {
returns(GDString)

}

func("get_distribution_name") {
returns(GDString)

}

func("get_environment") {
returns(GDString)
"variable"(GDString)
}

func("get_executable_path") {
returns(GDString)

}

func("get_granted_permissions") {
returns(GDPackedStringArray)

}

func("get_keycode_string") {
returns(GDString)
"code"(GDKey)
}

func("get_locale") {
returns(GDString)

}

func("get_locale_language") {
returns(GDString)

}

func("get_main_thread_id") {
returns(GDint)

}

func("get_memory_info") {
returns(GDDictionary)

}

func("get_model_name") {
returns(GDString)

}

func("get_name") {
returns(GDString)

}

func("get_process_id") {
returns(GDint)

}

func("get_processor_count") {
returns(GDint)

}

func("get_processor_name") {
returns(GDString)

}

func("get_restart_on_exit_arguments") {
returns(GDPackedStringArray)

}

func("get_static_memory_peak_usage") {
returns(GDint)

}

func("get_static_memory_usage") {
returns(GDint)

}

func("get_system_dir") {
returns(GDString)
"dir"(GDSystemDir)
"shared_storage"(GDbool)
}

func("get_system_font_path") {
returns(GDString)
"font_name"(GDString)
"weight"(GDint)
"stretch"(GDint)
"italic"(GDbool)
}

func("get_system_font_path_for_text") {
returns(GDPackedStringArray)
"font_name"(GDString)
"text"(GDString)
"locale"(GDString)
"script"(GDString)
"weight"(GDint)
"stretch"(GDint)
"italic"(GDbool)
}

func("get_system_fonts") {
returns(GDPackedStringArray)

}

func("get_thread_caller_id") {
returns(GDint)

}

func("get_unique_id") {
returns(GDString)

}

func("get_user_data_dir") {
returns(GDString)

}

func("get_version") {
returns(GDString)

}

func("get_video_adapter_driver_info") {
returns(GDPackedStringArray)

}

func("has_environment") {
returns(GDbool)
"variable"(GDString)
}

func("has_feature") {
returns(GDbool)
"tag_name"(GDString)
}

func("is_debug_build") {
returns(GDbool)

}

func("is_keycode_unicode") {
returns(GDbool)
"code"(GDint)
}

func("is_process_running") {
returns(GDbool)
"pid"(GDint)
}

func("is_restart_on_exit_set") {
returns(GDbool)

}

func("is_stdout_verbose") {
returns(GDbool)

}

func("is_userfs_persistent") {
returns(GDbool)

}

func("kill") {
returns(GDError)
"pid"(GDint)
}

func("move_to_trash") {
returns(GDError)
"path"(GDString)
}

func("open_midi_inputs") {
returns(GDvoid)

}

func("read_string_from_stdin") {
returns(GDString)

}

func("request_permission") {
returns(GDbool)
"name"(GDString)
}

func("request_permissions") {
returns(GDbool)

}

func("set_environment") {
returns(GDvoid)
"variable"(GDString)
"value"(GDString)
}

func("set_restart_on_exit") {
returns(GDvoid)
"restart"(GDbool)
"arguments"(GDPackedStringArray)
}

func("set_thread_name") {
returns(GDError)
"name"(GDString)
}

func("set_use_file_access_save_and_swap") {
returns(GDvoid)
"enabled"(GDbool)
}

func("shell_open") {
returns(GDError)
"uri"(GDString)
}

func("shell_show_in_file_manager") {
returns(GDError)
"file_or_dir_path"(GDString)
"open_folder"(GDbool)
}

func("unset_environment") {
returns(GDvoid)
"variable"(GDString)
}
}){

}