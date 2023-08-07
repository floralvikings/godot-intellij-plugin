
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDResourceLoader: GDType("ResourceLoader", {


constructor { }

func("add_resource_format_loader") {
returns(GDvoid)
"format_loader"(GDResourceFormatLoader)
"at_front"(GDbool)
}

func("exists") {
returns(GDbool)
"path"(GDString)
"type_hint"(GDString)
}

func("get_dependencies") {
returns(GDPackedStringArray)
"path"(GDString)
}

func("get_recognized_extensions_for_type") {
returns(GDPackedStringArray)
"type"(GDString)
}

func("get_resource_uid") {
returns(GDint)
"path"(GDString)
}

func("has_cached") {
returns(GDbool)
"path"(GDString)
}

func("load") {
returns(GDResource)
"path"(GDString)
"type_hint"(GDString)
"cache_mode"(GDCacheMode)
}

func("load_threaded_get") {
returns(GDResource)
"path"(GDString)
}

func("load_threaded_get_status") {
returns(GDThreadLoadStatus)
"path"(GDString)
"progress"(GDArray)
}

func("load_threaded_request") {
returns(GDError)
"path"(GDString)
"type_hint"(GDString)
"use_sub_threads"(GDbool)
"cache_mode"(GDCacheMode)
}

func("remove_resource_format_loader") {
returns(GDvoid)
"format_loader"(GDResourceFormatLoader)
}

func("set_abort_on_missing_resources") {
returns(GDvoid)
"abort"(GDbool)
}
}){

}