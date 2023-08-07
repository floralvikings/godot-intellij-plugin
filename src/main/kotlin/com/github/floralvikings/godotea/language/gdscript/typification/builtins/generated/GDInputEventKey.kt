
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDInputEventKey: GDType("InputEventKey", {

"echo"(GDbool)
"key_label"(GDKey)
"keycode"(GDKey)
"physical_keycode"(GDKey)
"pressed"(GDbool)
"unicode"(GDint)
constructor { }

func("as_text_key_label") {
returns(GDString)

}

func("as_text_keycode") {
returns(GDString)

}

func("as_text_physical_keycode") {
returns(GDString)

}

func("get_key_label_with_modifiers") {
returns(GDKey)

}

func("get_keycode_with_modifiers") {
returns(GDKey)

}

func("get_physical_keycode_with_modifiers") {
returns(GDKey)

}
}){

}