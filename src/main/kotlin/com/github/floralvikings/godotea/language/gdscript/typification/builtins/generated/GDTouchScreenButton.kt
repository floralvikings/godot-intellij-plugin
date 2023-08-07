
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTouchScreenButton: GDType("TouchScreenButton", {

"action"(GDString)
"bitmask"(GDBitMap)
"passby_press"(GDbool)
"shape"(GDShape2D)
"shape_centered"(GDbool)
"shape_visible"(GDbool)
"texture_normal"(GDTexture2D)
"texture_pressed"(GDTexture2D)
"visibility_mode"(GDVisibilityMode)
constructor { }

func("is_pressed") {
returns(GDbool)

}
}){

}