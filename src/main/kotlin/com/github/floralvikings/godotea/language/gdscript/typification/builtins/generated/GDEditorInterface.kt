
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorInterface: GDType("EditorInterface", {

"distraction_free_mode"(GDbool)
"movie_maker_enabled"(GDbool)
constructor { }

func("edit_node") {
returns(GDvoid)
"node"(GDNode)
}

func("edit_resource") {
returns(GDvoid)
"resource"(GDResource)
}

func("edit_script") {
returns(GDvoid)
"script"(GDScript)
"line"(GDint)
"column"(GDint)
"grab_focus"(GDbool)
}

func("get_base_control") {
returns(GDControl)

}

func("get_command_palette") {
returns(GDEditorCommandPalette)

}

func("get_current_directory") {
returns(GDString)

}

func("get_current_path") {
returns(GDString)

}

func("get_edited_scene_root") {
returns(GDNode)

}

func("get_editor_main_screen") {
returns(GDVBoxContainer)

}

func("get_editor_paths") {
returns(GDEditorPaths)

}

func("get_editor_scale") {
returns(GDfloat)

}

func("get_editor_settings") {
returns(GDEditorSettings)

}

func("get_file_system_dock") {
returns(GDFileSystemDock)

}

func("get_inspector") {
returns(GDEditorInspector)

}

func("get_open_scenes") {
returns(GDPackedStringArray)

}

func("get_playing_scene") {
returns(GDString)

}

func("get_resource_filesystem") {
returns(GDEditorFileSystem)

}

func("get_resource_previewer") {
returns(GDEditorResourcePreview)

}

func("get_script_editor") {
returns(GDScriptEditor)

}

func("get_selected_paths") {
returns(GDPackedStringArray)

}

func("get_selection") {
returns(GDEditorSelection)

}

func("inspect_object") {
returns(GDvoid)
"object"(GDObject)
"for_property"(GDString)
"inspector_only"(GDbool)
}

func("is_playing_scene") {
returns(GDbool)

}

func("is_plugin_enabled") {
returns(GDbool)
"plugin"(GDString)
}

func("make_mesh_previews") {
returns(GDTypedArray(GDTexture2D::class))
"meshes"(GDTypedArray(GDMesh::class))
"preview_size"(GDint)
}

func("mark_scene_as_unsaved") {
returns(GDvoid)

}

func("open_scene_from_path") {
returns(GDvoid)
"scene_filepath"(GDString)
}

func("play_current_scene") {
returns(GDvoid)

}

func("play_custom_scene") {
returns(GDvoid)
"scene_filepath"(GDString)
}

func("play_main_scene") {
returns(GDvoid)

}

func("popup_dialog") {
returns(GDvoid)
"dialog"(GDWindow)
"rect"(GDRect2i)
}

func("popup_dialog_centered") {
returns(GDvoid)
"dialog"(GDWindow)
"minsize"(GDVector2i)
}

func("popup_dialog_centered_clamped") {
returns(GDvoid)
"dialog"(GDWindow)
"minsize"(GDVector2i)
"fallback_ratio"(GDfloat)
}

func("popup_dialog_centered_ratio") {
returns(GDvoid)
"dialog"(GDWindow)
"ratio"(GDfloat)
}

func("reload_scene_from_path") {
returns(GDvoid)
"scene_filepath"(GDString)
}

func("restart_editor") {
returns(GDvoid)
"save"(GDbool)
}

func("save_scene") {
returns(GDError)

}

func("save_scene_as") {
returns(GDvoid)
"path"(GDString)
"with_preview"(GDbool)
}

func("select_file") {
returns(GDvoid)
"file"(GDString)
}

func("set_main_screen_editor") {
returns(GDvoid)
"name"(GDString)
}

func("set_plugin_enabled") {
returns(GDvoid)
"plugin"(GDString)
"enabled"(GDbool)
}

func("stop_playing_scene") {
returns(GDvoid)

}
}){

}