
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDFileSystemDock: GDType("FileSystemDock", {


constructor { }

func("add_resource_tooltip_plugin") {
returns(GDvoid)
"plugin"(GDEditorResourceTooltipPlugin)
}

func("navigate_to_path") {
returns(GDvoid)
"path"(GDString)
}

func("remove_resource_tooltip_plugin") {
returns(GDvoid)
"plugin"(GDEditorResourceTooltipPlugin)
}
}){

}