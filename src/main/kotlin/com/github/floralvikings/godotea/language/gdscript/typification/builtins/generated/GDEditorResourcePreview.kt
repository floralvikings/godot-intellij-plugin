
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorResourcePreview: GDType("EditorResourcePreview", {


constructor { }

func("add_preview_generator") {
returns(GDvoid)
"generator"(GDEditorResourcePreviewGenerator)
}

func("check_for_invalidation") {
returns(GDvoid)
"path"(GDString)
}

func("queue_edited_resource_preview") {
returns(GDvoid)
"resource"(GDResource)
"receiver"(GDObject)
"receiver_func"(GDStringName)
"userdata"(GDVariant)
}

func("queue_resource_preview") {
returns(GDvoid)
"path"(GDString)
"receiver"(GDObject)
"receiver_func"(GDStringName)
"userdata"(GDVariant)
}

func("remove_preview_generator") {
returns(GDvoid)
"generator"(GDEditorResourcePreviewGenerator)
}
}){

}