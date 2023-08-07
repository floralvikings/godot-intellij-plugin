
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDInputMap: GDType("InputMap", {


constructor { }

func("action_add_event") {
returns(GDvoid)
"action"(GDStringName)
"event"(GDInputEvent)
}

func("action_erase_event") {
returns(GDvoid)
"action"(GDStringName)
"event"(GDInputEvent)
}

func("action_erase_events") {
returns(GDvoid)
"action"(GDStringName)
}

func("action_get_deadzone") {
returns(GDfloat)
"action"(GDStringName)
}

func("action_get_events") {
returns(GDTypedArray(GDInputEvent::class))
"action"(GDStringName)
}

func("action_has_event") {
returns(GDbool)
"action"(GDStringName)
"event"(GDInputEvent)
}

func("action_set_deadzone") {
returns(GDvoid)
"action"(GDStringName)
"deadzone"(GDfloat)
}

func("add_action") {
returns(GDvoid)
"action"(GDStringName)
"deadzone"(GDfloat)
}

func("erase_action") {
returns(GDvoid)
"action"(GDStringName)
}

func("event_is_action") {
returns(GDbool)
"event"(GDInputEvent)
"action"(GDStringName)
"exact_match"(GDbool)
}

func("get_actions") {
returns(GDTypedArray(GDStringName::class))

}

func("has_action") {
returns(GDbool)
"action"(GDStringName)
}

func("load_from_project_settings") {
returns(GDvoid)

}
}){

}