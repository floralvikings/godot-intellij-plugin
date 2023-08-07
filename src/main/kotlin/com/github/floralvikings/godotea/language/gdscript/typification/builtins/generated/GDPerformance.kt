
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPerformance: GDType("Performance", {


constructor { }

func("add_custom_monitor") {
returns(GDvoid)
"id"(GDStringName)
"callable"(GDCallable)
"arguments"(GDArray)
}

func("get_custom_monitor") {
returns(GDVariant)
"id"(GDStringName)
}

func("get_custom_monitor_names") {
returns(GDTypedArray(GDStringName::class))

}

func("get_monitor") {
returns(GDfloat)
"monitor"(GDMonitor)
}

func("get_monitor_modification_time") {
returns(GDint)

}

func("has_custom_monitor") {
returns(GDbool)
"id"(GDStringName)
}

func("remove_custom_monitor") {
returns(GDvoid)
"id"(GDStringName)
}
}){

}