
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDMovieWriter: GDType("MovieWriter", {


constructor { }

func("_get_audio_mix_rate") {
returns(GDint)

}

func("_get_audio_speaker_mode") {
returns(GDSpeakerMode)

}

func("_handles_file") {
returns(GDbool)
"path"(GDString)
}

func("_write_begin") {
returns(GDError)
"movie_size"(GDVector2i)
"fps"(GDint)
"base_path"(GDString)
}

func("_write_end") {
returns(GDvoid)

}

func("_write_frame") {
returns(GDError)
"frame_image"(GDImage)
}

func("add_writer") {
returns(GDvoid)
"writer"(GDSameType)
}
}){

}