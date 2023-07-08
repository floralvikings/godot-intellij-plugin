package com.github.floralvikings.godotintellijplugin.language.gdscript

import com.github.floralvikings.godotintellijplugin.GodotIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class GDScriptFileType : LanguageFileType(GDScriptLanguage.INSTANCE) {
    companion object {
        val INSTANCE = GDScriptFileType()
    }

    override fun getName(): String = "GDScript File"

    override fun getDescription(): String = "Godot script file"

    override fun getDefaultExtension(): String = "gd"

    override fun getIcon(): Icon {
        return GodotIcons.GD_SCRIPT_FILE;
    }
}