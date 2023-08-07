
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorPlugin: GDType("EditorPlugin", {


constructor { }

func("_apply_changes") {
returns(GDvoid)

}

func("_build") {
returns(GDbool)

}

func("_clear") {
returns(GDvoid)

}

func("_disable_plugin") {
returns(GDvoid)

}

func("_edit") {
returns(GDvoid)
"object"(GDObject)
}

func("_enable_plugin") {
returns(GDvoid)

}

func("_forward_3d_draw_over_viewport") {
returns(GDvoid)
"viewport_control"(GDControl)
}

func("_forward_3d_force_draw_over_viewport") {
returns(GDvoid)
"viewport_control"(GDControl)
}

func("_forward_3d_gui_input") {
returns(GDint)
"viewport_camera"(GDCamera3D)
"event"(GDInputEvent)
}

func("_forward_canvas_draw_over_viewport") {
returns(GDvoid)
"viewport_control"(GDControl)
}

func("_forward_canvas_force_draw_over_viewport") {
returns(GDvoid)
"viewport_control"(GDControl)
}

func("_forward_canvas_gui_input") {
returns(GDbool)
"event"(GDInputEvent)
}

func("_get_breakpoints") {
returns(GDPackedStringArray)

}

func("_get_plugin_icon") {
returns(GDTexture2D)

}

func("_get_plugin_name") {
returns(GDString)

}

func("_get_state") {
returns(GDDictionary)

}

func("_get_window_layout") {
returns(GDvoid)
"configuration"(GDConfigFile)
}

func("_handles") {
returns(GDbool)
"object"(GDObject)
}

func("_has_main_screen") {
returns(GDbool)

}

func("_make_visible") {
returns(GDvoid)
"visible"(GDbool)
}

func("_save_external_data") {
returns(GDvoid)

}

func("_set_state") {
returns(GDvoid)
"state"(GDDictionary)
}

func("_set_window_layout") {
returns(GDvoid)
"configuration"(GDConfigFile)
}

func("add_autoload_singleton") {
returns(GDvoid)
"name"(GDString)
"path"(GDString)
}

func("add_control_to_bottom_panel") {
returns(GDButton)
"control"(GDControl)
"title"(GDString)
}

func("add_control_to_container") {
returns(GDvoid)
"container"(GDCustomControlContainer)
"control"(GDControl)
}

func("add_control_to_dock") {
returns(GDvoid)
"slot"(GDDockSlot)
"control"(GDControl)
}

func("add_custom_type") {
returns(GDvoid)
"type"(GDString)
"base"(GDString)
"script"(GDScript)
"icon"(GDTexture2D)
}

func("add_debugger_plugin") {
returns(GDvoid)
"script"(GDEditorDebuggerPlugin)
}

func("add_export_plugin") {
returns(GDvoid)
"plugin"(GDEditorExportPlugin)
}

func("add_import_plugin") {
returns(GDvoid)
"importer"(GDEditorImportPlugin)
"first_priority"(GDbool)
}

func("add_inspector_plugin") {
returns(GDvoid)
"plugin"(GDEditorInspectorPlugin)
}

func("add_node_3d_gizmo_plugin") {
returns(GDvoid)
"plugin"(GDEditorNode3DGizmoPlugin)
}

func("add_resource_conversion_plugin") {
returns(GDvoid)
"plugin"(GDEditorResourceConversionPlugin)
}

func("add_scene_format_importer_plugin") {
returns(GDvoid)
"scene_format_importer"(GDEditorSceneFormatImporter)
"first_priority"(GDbool)
}

func("add_scene_post_import_plugin") {
returns(GDvoid)
"scene_import_plugin"(GDEditorScenePostImportPlugin)
"first_priority"(GDbool)
}

func("add_tool_menu_item") {
returns(GDvoid)
"name"(GDString)
"callable"(GDCallable)
}

func("add_tool_submenu_item") {
returns(GDvoid)
"name"(GDString)
"submenu"(GDPopupMenu)
}

func("add_translation_parser_plugin") {
returns(GDvoid)
"parser"(GDEditorTranslationParserPlugin)
}

func("add_undo_redo_inspector_hook_callback") {
returns(GDvoid)
"callable"(GDCallable)
}

func("get_editor_interface") {
returns(GDEditorInterface)

}

func("get_export_as_menu") {
returns(GDPopupMenu)

}

func("get_script_create_dialog") {
returns(GDScriptCreateDialog)

}

func("get_undo_redo") {
returns(GDEditorUndoRedoManager)

}

func("hide_bottom_panel") {
returns(GDvoid)

}

func("make_bottom_panel_item_visible") {
returns(GDvoid)
"item"(GDControl)
}

func("queue_save_layout") {
returns(GDvoid)

}

func("remove_autoload_singleton") {
returns(GDvoid)
"name"(GDString)
}

func("remove_control_from_bottom_panel") {
returns(GDvoid)
"control"(GDControl)
}

func("remove_control_from_container") {
returns(GDvoid)
"container"(GDCustomControlContainer)
"control"(GDControl)
}

func("remove_control_from_docks") {
returns(GDvoid)
"control"(GDControl)
}

func("remove_custom_type") {
returns(GDvoid)
"type"(GDString)
}

func("remove_debugger_plugin") {
returns(GDvoid)
"script"(GDEditorDebuggerPlugin)
}

func("remove_export_plugin") {
returns(GDvoid)
"plugin"(GDEditorExportPlugin)
}

func("remove_import_plugin") {
returns(GDvoid)
"importer"(GDEditorImportPlugin)
}

func("remove_inspector_plugin") {
returns(GDvoid)
"plugin"(GDEditorInspectorPlugin)
}

func("remove_node_3d_gizmo_plugin") {
returns(GDvoid)
"plugin"(GDEditorNode3DGizmoPlugin)
}

func("remove_resource_conversion_plugin") {
returns(GDvoid)
"plugin"(GDEditorResourceConversionPlugin)
}

func("remove_scene_format_importer_plugin") {
returns(GDvoid)
"scene_format_importer"(GDEditorSceneFormatImporter)
}

func("remove_scene_post_import_plugin") {
returns(GDvoid)
"scene_import_plugin"(GDEditorScenePostImportPlugin)
}

func("remove_tool_menu_item") {
returns(GDvoid)
"name"(GDString)
}

func("remove_translation_parser_plugin") {
returns(GDvoid)
"parser"(GDEditorTranslationParserPlugin)
}

func("remove_undo_redo_inspector_hook_callback") {
returns(GDvoid)
"callable"(GDCallable)
}

func("set_force_draw_over_forwarding_enabled") {
returns(GDvoid)

}

func("set_input_event_forwarding_always_enabled") {
returns(GDvoid)

}

func("update_overlays") {
returns(GDint)

}
}){

}