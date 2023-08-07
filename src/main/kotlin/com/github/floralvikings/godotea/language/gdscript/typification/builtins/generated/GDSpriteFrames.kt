
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDSpriteFrames: GDType("SpriteFrames", {


constructor { }

func("add_animation") {
returns(GDvoid)
"anim"(GDStringName)
}

func("add_frame") {
returns(GDvoid)
"anim"(GDStringName)
"texture"(GDTexture2D)
"duration"(GDfloat)
"at_position"(GDint)
}

func("clear") {
returns(GDvoid)
"anim"(GDStringName)
}

func("clear_all") {
returns(GDvoid)

}

func("get_animation_loop") {
returns(GDbool)
"anim"(GDStringName)
}

func("get_animation_names") {
returns(GDPackedStringArray)

}

func("get_animation_speed") {
returns(GDfloat)
"anim"(GDStringName)
}

func("get_frame_count") {
returns(GDint)
"anim"(GDStringName)
}

func("get_frame_duration") {
returns(GDfloat)
"anim"(GDStringName)
"idx"(GDint)
}

func("get_frame_texture") {
returns(GDTexture2D)
"anim"(GDStringName)
"idx"(GDint)
}

func("has_animation") {
returns(GDbool)
"anim"(GDStringName)
}

func("remove_animation") {
returns(GDvoid)
"anim"(GDStringName)
}

func("remove_frame") {
returns(GDvoid)
"anim"(GDStringName)
"idx"(GDint)
}

func("rename_animation") {
returns(GDvoid)
"anim"(GDStringName)
"newname"(GDStringName)
}

func("set_animation_loop") {
returns(GDvoid)
"anim"(GDStringName)
"loop"(GDbool)
}

func("set_animation_speed") {
returns(GDvoid)
"anim"(GDStringName)
"fps"(GDfloat)
}

func("set_frame") {
returns(GDvoid)
"anim"(GDStringName)
"idx"(GDint)
"texture"(GDTexture2D)
"duration"(GDfloat)
}
}){

}