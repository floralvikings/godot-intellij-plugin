
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTime: GDType("Time", {


constructor { }

func("get_date_dict_from_system") {
returns(GDDictionary)
"utc"(GDbool)
}

func("get_date_dict_from_unix_time") {
returns(GDDictionary)
"unix_time_val"(GDint)
}

func("get_date_string_from_system") {
returns(GDString)
"utc"(GDbool)
}

func("get_date_string_from_unix_time") {
returns(GDString)
"unix_time_val"(GDint)
}

func("get_datetime_dict_from_datetime_string") {
returns(GDDictionary)
"datetime"(GDString)
"weekday"(GDbool)
}

func("get_datetime_dict_from_system") {
returns(GDDictionary)
"utc"(GDbool)
}

func("get_datetime_dict_from_unix_time") {
returns(GDDictionary)
"unix_time_val"(GDint)
}

func("get_datetime_string_from_datetime_dict") {
returns(GDString)
"datetime"(GDDictionary)
"use_space"(GDbool)
}

func("get_datetime_string_from_system") {
returns(GDString)
"utc"(GDbool)
"use_space"(GDbool)
}

func("get_datetime_string_from_unix_time") {
returns(GDString)
"unix_time_val"(GDint)
"use_space"(GDbool)
}

func("get_offset_string_from_offset_minutes") {
returns(GDString)
"offset_minutes"(GDint)
}

func("get_ticks_msec") {
returns(GDint)

}

func("get_ticks_usec") {
returns(GDint)

}

func("get_time_dict_from_system") {
returns(GDDictionary)
"utc"(GDbool)
}

func("get_time_dict_from_unix_time") {
returns(GDDictionary)
"unix_time_val"(GDint)
}

func("get_time_string_from_system") {
returns(GDString)
"utc"(GDbool)
}

func("get_time_string_from_unix_time") {
returns(GDString)
"unix_time_val"(GDint)
}

func("get_time_zone_from_system") {
returns(GDDictionary)

}

func("get_unix_time_from_datetime_dict") {
returns(GDint)
"datetime"(GDDictionary)
}

func("get_unix_time_from_datetime_string") {
returns(GDint)
"datetime"(GDString)
}

func("get_unix_time_from_system") {
returns(GDfloat)

}
}){

}