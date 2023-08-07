
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimationPlayer: GDType("AnimationPlayer", {

"assigned_animation"(GDString)
"audio_max_polyphony"(GDint)
"autoplay"(GDString)
"current_animation"(GDString)
"current_animation_length"(GDfloat)
"current_animation_position"(GDfloat)
"method_call_mode"(GDAnimationMethodCallMode)
"movie_quit_on_finish"(GDbool)
"playback_active"(GDbool)
"playback_default_blend_time"(GDfloat)
"playback_process_mode"(GDAnimationProcessCallback)
"reset_on_save"(GDbool)
"root_node"(GDNodePath)
"speed_scale"(GDfloat)
constructor { }

func("_post_process_key_value") {
returns(GDVariant)
"animation"(GDAnimation)
"track"(GDint)
"value"(GDVariant)
"object"(GDObject)
"object_idx"(GDint)
}

func("add_animation_library") {
returns(GDError)
"name"(GDStringName)
"library"(GDAnimationLibrary)
}

func("advance") {
returns(GDvoid)
"delta"(GDfloat)
}

func("animation_get_next") {
returns(GDStringName)
"anim_from"(GDStringName)
}

func("animation_set_next") {
returns(GDvoid)
"anim_from"(GDStringName)
"anim_to"(GDStringName)
}

func("clear_caches") {
returns(GDvoid)

}

func("clear_queue") {
returns(GDvoid)

}

func("find_animation") {
returns(GDStringName)
"animation"(GDAnimation)
}

func("find_animation_library") {
returns(GDStringName)
"animation"(GDAnimation)
}

func("get_animation") {
returns(GDAnimation)
"name"(GDStringName)
}

func("get_animation_library") {
returns(GDAnimationLibrary)
"name"(GDStringName)
}

func("get_animation_library_list") {
returns(GDTypedArray(GDStringName::class))

}

func("get_animation_list") {
returns(GDPackedStringArray)

}

func("get_blend_time") {
returns(GDfloat)
"anim_from"(GDStringName)
"anim_to"(GDStringName)
}

func("get_playing_speed") {
returns(GDfloat)

}

func("get_queue") {
returns(GDPackedStringArray)

}

func("has_animation") {
returns(GDbool)
"name"(GDStringName)
}

func("has_animation_library") {
returns(GDbool)
"name"(GDStringName)
}

func("is_playing") {
returns(GDbool)

}

func("pause") {
returns(GDvoid)

}

func("play") {
returns(GDvoid)
"name"(GDStringName)
"custom_blend"(GDfloat)
"custom_speed"(GDfloat)
"from_end"(GDbool)
}

func("play_backwards") {
returns(GDvoid)
"name"(GDStringName)
"custom_blend"(GDfloat)
}

func("queue") {
returns(GDvoid)
"name"(GDStringName)
}

func("remove_animation_library") {
returns(GDvoid)
"name"(GDStringName)
}

func("rename_animation_library") {
returns(GDvoid)
"name"(GDStringName)
"newname"(GDStringName)
}

func("seek") {
returns(GDvoid)
"seconds"(GDfloat)
"update"(GDbool)
}

func("set_blend_time") {
returns(GDvoid)
"anim_from"(GDStringName)
"anim_to"(GDStringName)
"sec"(GDfloat)
}

func("stop") {
returns(GDvoid)
"keep_state"(GDbool)
}
}){

}