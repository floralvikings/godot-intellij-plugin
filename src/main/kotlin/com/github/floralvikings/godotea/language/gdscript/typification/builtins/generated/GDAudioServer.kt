
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAudioServer: GDType("AudioServer", {

"bus_count"(GDint)
"input_device"(GDString)
"output_device"(GDString)
"playback_speed_scale"(GDfloat)
constructor { }

func("add_bus") {
returns(GDvoid)
"at_position"(GDint)
}

func("add_bus_effect") {
returns(GDvoid)
"bus_idx"(GDint)
"effect"(GDAudioEffect)
"at_position"(GDint)
}

func("generate_bus_layout") {
returns(GDAudioBusLayout)

}

func("get_bus_channels") {
returns(GDint)
"bus_idx"(GDint)
}

func("get_bus_effect") {
returns(GDAudioEffect)
"bus_idx"(GDint)
"effect_idx"(GDint)
}

func("get_bus_effect_count") {
returns(GDint)
"bus_idx"(GDint)
}

func("get_bus_effect_instance") {
returns(GDAudioEffectInstance)
"bus_idx"(GDint)
"effect_idx"(GDint)
"channel"(GDint)
}

func("get_bus_index") {
returns(GDint)
"bus_name"(GDStringName)
}

func("get_bus_name") {
returns(GDString)
"bus_idx"(GDint)
}

func("get_bus_peak_volume_left_db") {
returns(GDfloat)
"bus_idx"(GDint)
"channel"(GDint)
}

func("get_bus_peak_volume_right_db") {
returns(GDfloat)
"bus_idx"(GDint)
"channel"(GDint)
}

func("get_bus_send") {
returns(GDStringName)
"bus_idx"(GDint)
}

func("get_bus_volume_db") {
returns(GDfloat)
"bus_idx"(GDint)
}

func("get_input_device_list") {
returns(GDPackedStringArray)

}

func("get_mix_rate") {
returns(GDfloat)

}

func("get_output_device_list") {
returns(GDPackedStringArray)

}

func("get_output_latency") {
returns(GDfloat)

}

func("get_speaker_mode") {
returns(GDSpeakerMode)

}

func("get_time_since_last_mix") {
returns(GDfloat)

}

func("get_time_to_next_mix") {
returns(GDfloat)

}

func("is_bus_bypassing_effects") {
returns(GDbool)
"bus_idx"(GDint)
}

func("is_bus_effect_enabled") {
returns(GDbool)
"bus_idx"(GDint)
"effect_idx"(GDint)
}

func("is_bus_mute") {
returns(GDbool)
"bus_idx"(GDint)
}

func("is_bus_solo") {
returns(GDbool)
"bus_idx"(GDint)
}

func("lock") {
returns(GDvoid)

}

func("move_bus") {
returns(GDvoid)
"index"(GDint)
"to_index"(GDint)
}

func("remove_bus") {
returns(GDvoid)
"index"(GDint)
}

func("remove_bus_effect") {
returns(GDvoid)
"bus_idx"(GDint)
"effect_idx"(GDint)
}

func("set_bus_bypass_effects") {
returns(GDvoid)
"bus_idx"(GDint)
"enable"(GDbool)
}

func("set_bus_effect_enabled") {
returns(GDvoid)
"bus_idx"(GDint)
"effect_idx"(GDint)
"enabled"(GDbool)
}

func("set_bus_layout") {
returns(GDvoid)
"bus_layout"(GDAudioBusLayout)
}

func("set_bus_mute") {
returns(GDvoid)
"bus_idx"(GDint)
"enable"(GDbool)
}

func("set_bus_name") {
returns(GDvoid)
"bus_idx"(GDint)
"name"(GDString)
}

func("set_bus_send") {
returns(GDvoid)
"bus_idx"(GDint)
"send"(GDStringName)
}

func("set_bus_solo") {
returns(GDvoid)
"bus_idx"(GDint)
"enable"(GDbool)
}

func("set_bus_volume_db") {
returns(GDvoid)
"bus_idx"(GDint)
"volume_db"(GDfloat)
}

func("set_enable_tagging_used_audio_streams") {
returns(GDvoid)
"enable"(GDbool)
}

func("swap_bus_effects") {
returns(GDvoid)
"bus_idx"(GDint)
"effect_idx"(GDint)
"by_effect_idx"(GDint)
}

func("unlock") {
returns(GDvoid)

}
}){

}