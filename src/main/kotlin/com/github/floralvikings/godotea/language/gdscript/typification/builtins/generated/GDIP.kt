
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDIP: GDType("IP", {


constructor { }

func("clear_cache") {
returns(GDvoid)
"hostname"(GDString)
}

func("erase_resolve_item") {
returns(GDvoid)
"id"(GDint)
}

func("get_local_addresses") {
returns(GDPackedStringArray)

}

func("get_local_interfaces") {
returns(GDTypedArray(GDDictionary::class))

}

func("get_resolve_item_address") {
returns(GDString)
"id"(GDint)
}

func("get_resolve_item_addresses") {
returns(GDArray)
"id"(GDint)
}

func("get_resolve_item_status") {
returns(GDResolverStatus)
"id"(GDint)
}

func("resolve_hostname") {
returns(GDString)
"host"(GDString)
"ip_type"(GDTypeEnum)
}

func("resolve_hostname_addresses") {
returns(GDPackedStringArray)
"host"(GDString)
"ip_type"(GDTypeEnum)
}

func("resolve_hostname_queue_item") {
returns(GDint)
"host"(GDString)
"ip_type"(GDTypeEnum)
}
}){

}