
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEngine: GDType("Engine", {

"max_fps"(GDint)
"max_physics_steps_per_frame"(GDint)
"physics_jitter_fix"(GDfloat)
"physics_ticks_per_second"(GDint)
"print_error_messages"(GDbool)
"time_scale"(GDfloat)
constructor { }

func("get_architecture_name") {
returns(GDString)

}

func("get_author_info") {
returns(GDDictionary)

}

func("get_copyright_info") {
returns(GDTypedArray(GDDictionary::class))

}

func("get_donor_info") {
returns(GDDictionary)

}

func("get_frames_drawn") {
returns(GDint)

}

func("get_frames_per_second") {
returns(GDfloat)

}

func("get_license_info") {
returns(GDDictionary)

}

func("get_license_text") {
returns(GDString)

}

func("get_main_loop") {
returns(GDMainLoop)

}

func("get_physics_frames") {
returns(GDint)

}

func("get_physics_interpolation_fraction") {
returns(GDfloat)

}

func("get_process_frames") {
returns(GDint)

}

func("get_script_language") {
returns(GDScriptLanguage)
"index"(GDint)
}

func("get_script_language_count") {
returns(GDint)

}

func("get_singleton") {
returns(GDObject)
"name"(GDStringName)
}

func("get_singleton_list") {
returns(GDPackedStringArray)

}

func("get_version_info") {
returns(GDDictionary)

}

func("get_write_movie_path") {
returns(GDString)

}

func("has_singleton") {
returns(GDbool)
"name"(GDStringName)
}

func("is_editor_hint") {
returns(GDbool)

}

func("is_in_physics_frame") {
returns(GDbool)

}

func("register_script_language") {
returns(GDError)
"language"(GDScriptLanguage)
}

func("register_singleton") {
returns(GDvoid)
"name"(GDStringName)
"instance"(GDObject)
}

func("unregister_script_language") {
returns(GDError)
"language"(GDScriptLanguage)
}

func("unregister_singleton") {
returns(GDvoid)
"name"(GDStringName)
}
}){

}