
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDJavaScriptBridge: GDType("JavaScriptBridge", {


constructor { }

func("create_callback") {
returns(GDJavaScriptObject)
"callable"(GDCallable)
}

func("create_object") {
returns(GDVariant)
"object"(GDString)
}

func("download_buffer") {
returns(GDvoid)
"buffer"(GDPackedByteArray)
"name"(GDString)
"mime"(GDString)
}

func("eval") {
returns(GDVariant)
"code"(GDString)
"use_global_execution_context"(GDbool)
}

func("force_fs_sync") {
returns(GDvoid)

}

func("get_interface") {
returns(GDJavaScriptObject)
"interface"(GDString)
}

func("pwa_needs_update") {
returns(GDbool)

}

func("pwa_update") {
returns(GDError)

}
}){

}