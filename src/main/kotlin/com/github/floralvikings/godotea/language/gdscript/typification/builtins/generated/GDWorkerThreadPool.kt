
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDWorkerThreadPool: GDType("WorkerThreadPool", {


constructor { }

func("add_group_task") {
returns(GDint)
"action"(GDCallable)
"elements"(GDint)
"tasks_needed"(GDint)
"high_priority"(GDbool)
"description"(GDString)
}

func("add_task") {
returns(GDint)
"action"(GDCallable)
"high_priority"(GDbool)
"description"(GDString)
}

func("get_group_processed_element_count") {
returns(GDint)
"group_id"(GDint)
}

func("is_group_task_completed") {
returns(GDbool)
"group_id"(GDint)
}

func("is_task_completed") {
returns(GDbool)
"task_id"(GDint)
}

func("wait_for_group_task_completion") {
returns(GDvoid)
"group_id"(GDint)
}

func("wait_for_task_completion") {
returns(GDError)
"task_id"(GDint)
}
}){

}