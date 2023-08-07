
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorVCSInterface: GDType("EditorVCSInterface", {


constructor { }

func("_checkout_branch") {
returns(GDbool)
"branch_name"(GDString)
}

func("_commit") {
returns(GDvoid)
"msg"(GDString)
}

func("_create_branch") {
returns(GDvoid)
"branch_name"(GDString)
}

func("_create_remote") {
returns(GDvoid)
"remote_name"(GDString)
"remote_url"(GDString)
}

func("_discard_file") {
returns(GDvoid)
"file_path"(GDString)
}

func("_fetch") {
returns(GDvoid)
"remote"(GDString)
}

func("_get_branch_list") {
returns(GDTypedArray(GDString::class))

}

func("_get_current_branch_name") {
returns(GDString)

}

func("_get_diff") {
returns(GDTypedArray(GDDictionary::class))
"identifier"(GDString)
"area"(GDint)
}

func("_get_line_diff") {
returns(GDTypedArray(GDDictionary::class))
"file_path"(GDString)
"text"(GDString)
}

func("_get_modified_files_data") {
returns(GDTypedArray(GDDictionary::class))

}

func("_get_previous_commits") {
returns(GDTypedArray(GDDictionary::class))
"max_commits"(GDint)
}

func("_get_remotes") {
returns(GDTypedArray(GDString::class))

}

func("_get_vcs_name") {
returns(GDString)

}

func("_initialize") {
returns(GDbool)
"project_path"(GDString)
}

func("_pull") {
returns(GDvoid)
"remote"(GDString)
}

func("_push") {
returns(GDvoid)
"remote"(GDString)
"force"(GDbool)
}

func("_remove_branch") {
returns(GDvoid)
"branch_name"(GDString)
}

func("_remove_remote") {
returns(GDvoid)
"remote_name"(GDString)
}

func("_set_credentials") {
returns(GDvoid)
"username"(GDString)
"password"(GDString)
"ssh_public_key_path"(GDString)
"ssh_private_key_path"(GDString)
"ssh_passphrase"(GDString)
}

func("_shut_down") {
returns(GDbool)

}

func("_stage_file") {
returns(GDvoid)
"file_path"(GDString)
}

func("_unstage_file") {
returns(GDvoid)
"file_path"(GDString)
}

func("add_diff_hunks_into_diff_file") {
returns(GDDictionary)
"diff_file"(GDDictionary)
"diff_hunks"(GDTypedArray(GDDictionary::class))
}

func("add_line_diffs_into_diff_hunk") {
returns(GDDictionary)
"diff_hunk"(GDDictionary)
"line_diffs"(GDTypedArray(GDDictionary::class))
}

func("create_commit") {
returns(GDDictionary)
"msg"(GDString)
"author"(GDString)
"id"(GDString)
"unix_timestamp"(GDint)
"offset_minutes"(GDint)
}

func("create_diff_file") {
returns(GDDictionary)
"new_file"(GDString)
"old_file"(GDString)
}

func("create_diff_hunk") {
returns(GDDictionary)
"old_start"(GDint)
"new_start"(GDint)
"old_lines"(GDint)
"new_lines"(GDint)
}

func("create_diff_line") {
returns(GDDictionary)
"new_line_no"(GDint)
"old_line_no"(GDint)
"content"(GDString)
"status"(GDString)
}

func("create_status_file") {
returns(GDDictionary)
"file_path"(GDString)
"change_type"(GDChangeType)
"area"(GDTreeArea)
}

func("popup_error") {
returns(GDvoid)
"msg"(GDString)
}
}){

}