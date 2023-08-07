
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDTranslation: GDType("Translation", {

"locale"(GDString)
constructor { }

func("_get_message") {
returns(GDStringName)
"src_message"(GDStringName)
"context"(GDStringName)
}

func("_get_plural_message") {
returns(GDStringName)
"src_message"(GDStringName)
"src_plural_message"(GDStringName)
"n"(GDint)
"context"(GDStringName)
}

func("add_message") {
returns(GDvoid)
"src_message"(GDStringName)
"xlated_message"(GDStringName)
"context"(GDStringName)
}

func("add_plural_message") {
returns(GDvoid)
"src_message"(GDStringName)
"xlated_messages"(GDPackedStringArray)
"context"(GDStringName)
}

func("erase_message") {
returns(GDvoid)
"src_message"(GDStringName)
"context"(GDStringName)
}

func("get_message") {
returns(GDStringName)
"src_message"(GDStringName)
"context"(GDStringName)
}

func("get_message_count") {
returns(GDint)

}

func("get_message_list") {
returns(GDPackedStringArray)

}

func("get_plural_message") {
returns(GDStringName)
"src_message"(GDStringName)
"src_plural_message"(GDStringName)
"n"(GDint)
"context"(GDStringName)
}

func("get_translated_message_list") {
returns(GDPackedStringArray)

}
}){

}