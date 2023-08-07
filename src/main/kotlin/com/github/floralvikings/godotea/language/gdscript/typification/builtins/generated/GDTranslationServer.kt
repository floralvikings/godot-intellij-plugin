
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTranslationServer: GDType("TranslationServer", {

"pseudolocalization_enabled"(GDbool)
constructor { }

func("add_translation") {
returns(GDvoid)
"translation"(GDTranslation)
}

func("clear") {
returns(GDvoid)

}

func("compare_locales") {
returns(GDint)
"locale_a"(GDString)
"locale_b"(GDString)
}

func("get_all_countries") {
returns(GDPackedStringArray)

}

func("get_all_languages") {
returns(GDPackedStringArray)

}

func("get_all_scripts") {
returns(GDPackedStringArray)

}

func("get_country_name") {
returns(GDString)
"country"(GDString)
}

func("get_language_name") {
returns(GDString)
"language"(GDString)
}

func("get_loaded_locales") {
returns(GDPackedStringArray)

}

func("get_locale") {
returns(GDString)

}

func("get_locale_name") {
returns(GDString)
"locale"(GDString)
}

func("get_script_name") {
returns(GDString)
"script"(GDString)
}

func("get_tool_locale") {
returns(GDString)

}

func("get_translation_object") {
returns(GDTranslation)
"locale"(GDString)
}

func("pseudolocalize") {
returns(GDStringName)
"message"(GDStringName)
}

func("reload_pseudolocalization") {
returns(GDvoid)

}

func("remove_translation") {
returns(GDvoid)
"translation"(GDTranslation)
}

func("set_locale") {
returns(GDvoid)
"locale"(GDString)
}

func("standardize_locale") {
returns(GDString)
"locale"(GDString)
}

func("translate") {
returns(GDStringName)
"message"(GDStringName)
"context"(GDStringName)
}

func("translate_plural") {
returns(GDStringName)
"message"(GDStringName)
"plural_message"(GDStringName)
"n"(GDint)
"context"(GDStringName)
}
}){

}